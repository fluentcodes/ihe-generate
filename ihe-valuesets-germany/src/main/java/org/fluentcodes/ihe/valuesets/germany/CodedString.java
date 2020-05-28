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

public class CodedString {
    private static final String ISO = "ISO";
    private static final String ISO_POST_FIX = "^^^";
    private final String code;
    private final String codeSystem;
    private String displayName;
    private String error;
    private final boolean iso;

    public CodedString(final CodedValueStatic valueSet, boolean iso) {
        this.iso = iso;
        this.code = valueSet.getCode();
        this.codeSystem = valueSet.getCodeSystem();
        this.displayName = valueSet.getDisplayName();
    }

    public CodedString(final String codedString, boolean iso) {
        this.iso = iso;
        if (codedString == null) {
            error = "Null input for coded String.";
            this.code = codedString;
            this.codeSystem = null;
            return;
        }
        if (iso) {
            /*A coded value data type that can be communicated in one string. It
            combines a Code and a Code System ID in the following form:
            Code^^^&CodeSystemID&ISO
            The Code is a character sequence defined by the Code System.
                    The CodeSystemID is a unique identifier for the code system, using the ISO
            Object Identifier format (see OID below).
                    This data type shall be treated according to HL7 encoding rules described
            above.
                    Note that the '&' character must be properly encoded in the XML content.*/
            String[] splitted = codedString.split("&");
            if (splitted.length == 1) {
                this.code = splitted[0];
                this.codeSystem = null;
            }
            else if (splitted.length == 3) {

                if (!splitted[0].endsWith(ISO_POST_FIX)) {
                    error = "Code does not end with '" + ISO_POST_FIX + "'" + codedString;
                }
                if (!splitted[2].equals(ISO)) {
                    error = "Code String does not end with'\" + ISO + \"'" + codedString;
                }
                this.codeSystem = splitted[1];
                this.code = splitted[0].replaceAll("\\^\\^\\^$", "");
            }
            else {
                this.code = codedString;
                this.codeSystem = null;
                error = "Problem to get iso codingScheme from input '" + codeSystem + "'";
            }
        }
        else {
            /**
             * 3.18.4.1.2.3.4 Coding of Code/Code-Scheme
             * When specifying a coded value parameter, an abbreviated form of the HL7 V2.5 CE format shall
             * be used. Only the first (identifier) and third (coding scheme) elements shall be specified. Both
             * are required. The second element shall be empty. The HL7 V2.5 length limits shall not apply.
             * The ebRIM limit on Slot Value size does apply. An example of this format is:
             * code^^coding-scheme
             * This style parameter always accepts multiple values so example codings in context look like:
             * <Value>('code1^^coding-scheme1')</Value>
             * or
             * <Value>('code1^^coding-scheme1','code2^^coding-scheme2')</Value>
             * within the parameter Slot.
             */
            String[] splitted = codedString.replaceAll("\\^+$","").split("\\^\\^");
            if (splitted.length == 1) {
                this.code = splitted[0];
                this.codeSystem = null;
            } else if (splitted.length == 2) {
                this.code = splitted[0];
                this.codeSystem = splitted[1];
            } else {
                this.code = codedString;
                this.codeSystem = null;
                error = "Problem to get codingScheme from input '" + codedString + "'";
            }
        }
    }

    public CodedString(final String code, final String scheme, boolean iso) {
        this.iso = iso;
        this.code = code;
        this.codeSystem = scheme;
    }

    public String getError() {
        return error;
    }
    public boolean hasError() {
        return error!=null && !error.isEmpty();
    }

    protected CodedString setError(final String error) {
        this.error = error;
        return this;
    }

    public String getCode() {
        return code;
    }

    public String getCodeSystem() {
        return codeSystem;
    }

    public boolean hasCodeSystem() {
        return codeSystem != null && !codeSystem.isEmpty();
    }

    public String getDisplayName() {
        return displayName;
    }

    public String toHl7() {
        if (code == null || code.isEmpty()) {
            return "";
        }
        if (hasCodeSystem()) {
            if (iso) {
                return code + ISO_POST_FIX + "&" + codeSystem + "&" + ISO;
            }
            else {
                return code + "^^" + codeSystem;
            }
        }
        return code;
    }

    public String toHl7Quoted() {
        return "'" + toHl7() + "'";
    }

    @Override
    public String toString() {
        return toHl7();
    }
}
