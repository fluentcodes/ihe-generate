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

package org.fluentcodes.ihe.iti.metafields.valuesets;

public class CodedValueStatic {
    private final String code;
    private final String codeSystem;
    private final String displayName;

    protected CodedValueStatic(final CodedValueType dto) {
        this.code = dto.getCode();
        this.codeSystem = dto.getCodeSystem();
        this.displayName = dto.getDisplayName();
    }

    public String getCode() {
        return code;
    }

    public String getCodeSystem() {
        return codeSystem;
    }
    public String getDisplayName() {
        return displayName;
    }
}
