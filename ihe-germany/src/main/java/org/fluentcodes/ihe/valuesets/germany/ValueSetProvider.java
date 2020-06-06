/*
 * Copyright (c) 2019 gematik - Gesellschaft für Telematikanwendungen der Gesundheitskarte mbH
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fluentcodes.ihe.valuesets.germany;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory;
import org.fluentcodes.ihe.ebrs.ihe.FormatCodeClassification;
import org.fluentcodes.tools.xpect.IOJsonJackson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ValueSetProvider {
    private static final Logger LOG = LoggerFactory.getLogger(ValueSetProvider.class);
    private static final ObjectFactory OF_RIM = new ObjectFactory();
    private final Map<String, List<CodedValueStatic>> valueSetMap;
    private final String valueKey;
    private final boolean iso;

    protected ValueSetProvider(final String valueKey, boolean iso)
    {
        this.valueKey = valueKey;
        this.iso = iso;
        valueSetMap = new HashMap<>();
        try {
            List<CodedValueDto> readedFromJson = (List<CodedValueDto>)new IOJsonJackson<List<CodedValueDto>>()
                .setMappingClasses(List.of(List.class, CodedValueDto.class))
                    .setFileName(valueKey + ".json")
                        .read();
            for (CodedValueDto value : readedFromJson) {
                final String code = value.getCode();
                if (!valueSetMap.containsKey(code)) {
                    valueSetMap.put(code, new ArrayList<>());
                }
                valueSetMap.get(code).add(new CodedValueStatic(value));
            }
        }
        catch (Exception e) {
            LOG.error("Problem loading " + valueKey, e);
            return;
        }
    }

    public CodedString findValueSet(final String code, boolean strict) {
        CodedString codedString = new CodedString(code, iso);
        if (codedString.hasError()) {
            return codedString;
        }
        if (!valueSetMap.containsKey(codedString.getCode())) {
            return new CodedString(code, iso).setError("Could not find code '" + code + "' in valueSet ");
        }
        final CodedString firstValueSet = new CodedString(valueSetMap.get(codedString.getCode()).get(0), iso);
        final String scheme = codedString.getCodeSystem();
        if (!strict && scheme == null) {
            return firstValueSet;
        }
        if (strict && scheme == null) {
            return firstValueSet.setError("With strict setting the scheme must be set but is null for code '" + code + "'.");
        }

        if (valueSetMap.get(codedString.getCode()).size() == 1) {
            if (firstValueSet.getCodeSystem().equals(scheme)) {
                return firstValueSet;
            }
            else {
                return firstValueSet.setError("Different scheme values for scheme. It should be '" + firstValueSet.getCodeSystem() + "' but is '" + scheme + "' for code '" + code + "'.");
            }
        }
        if (scheme == null||scheme.isEmpty()) {
            return firstValueSet.setError("Several entries needed, so scheme is required '" + code + "'.");
        }
        for (CodedValueStatic valueSet : valueSetMap.get(codedString.getCode()))  {
            if (valueSet.getCodeSystem().equals(scheme)) {
                return new CodedString(valueSet, iso);
            }
        }
        return firstValueSet.setError("Could not find scheme '" + scheme + "' for code '" + code + "'.");
    }

    public ClassificationType createCodeClassifcation(final String code) {
        CodedString codedString = findValueSet(code, false);
        FormatCodeClassification formatCode = new FormatCodeClassification(codedString);
        return formatCode.createType();
    }
}
