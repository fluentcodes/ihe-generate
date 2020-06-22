package org.fluentcodes.ihe.iti;

import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import org.fluentcodes.ihe.iti.exceptions.IheException;

import java.util.*;

public class IheHelperSlots {
    public static Set<String> concatQueryList(final List<List<String>> values)
    {
        Set<String> result = new LinkedHashSet<>();
        if (values == null) {
            return result;
        }
        for (List<String> row: values) {
            result.add(concatQueryRow(row));
        }
        return result;
    }

    public static final String quote(final String toQuote)
    {
        if (!toQuote.startsWith("'") && !toQuote.endsWith("'")) {
            return "'" + toQuote + "'";
        }
        else if (toQuote.startsWith("'") && toQuote.endsWith("'")) {
            return toQuote;
        }
        else if (toQuote.startsWith("'") ) {
            return toQuote + "'";
        }
        else {
            return "'" + toQuote;
        }
    }

    public static String concatQueryRow(final Collection<String> row)
    {
        final StringBuilder slotValue = new StringBuilder();
        if (row == null) {
            return slotValue.toString();
        }
        for (String entry: row) {
            slotValue.append("'");
            slotValue.append(entry);
            slotValue.append("',");
        }
        return slotValue.toString().replaceAll(",$", "");
    }


    public static final List<List<String>> scanForStrippedIheStrings(Collection<String> rows) {
        List<List<String>> stripped = new ArrayList<>();
        if (rows == null) {
            return stripped;
        }
        for (String row : rows) {
            stripped.add(scanForIheStrings(row));
        }
        return stripped;
    }

    public static final List<List<String>> scanForStrippedStrings(Collection<String> rows) {
        List<List<String>> stripped = new ArrayList<>();
        if (rows == null) {
            return stripped;
        }
        for (final String row : rows) {
            stripped.add(scanForStrings(row));
        }
        return stripped;
    }

    public static List<String> scanForIheStrings(final String row) {
        return scanForIheStrings(row, true);
    }

    public static List<String> scanForIheStrings(final String row, final boolean multiple) {
        List<String> result = new ArrayList<>();
        if (row == null) {
            return result;
        }
        if (multiple) {
            if (!row.startsWith("(")) {
                throw new IheException("Query slots have to start with a bracket but is " + row);
            }
            if (!row.endsWith(")")) {
                throw new IheException("Query slots have to end with a bracket but is " + row);
            }
        }

        String[] entries = row.
                replaceAll("^\\(","")
                .replaceAll("\\)$","")
                .split(",");
        StringBuffer buffer = new StringBuffer();
        for (String entry:entries) {
            if (!entry.matches("^[\\s]*'.*")) {
                if (buffer.length() == 0) {
                    throw new IheException("Strings should start with a single quote + '" + entry + "': " + row);
                }
            }
            entry = entry.replaceAll("^[\\s]*'", "");
            if (entry.matches(".*'[\\s]*$")) {
                result.add(buffer.toString() + entry.replaceAll("'[\\s]*$", ""));
                buffer = new StringBuffer();
                continue;
            }
            buffer.append(entry);
            buffer.append(",");
        }
        if (buffer.length()> 0) {
            throw new IheException("No closing single quote found '" + buffer + "':" + row);
        }
        return result;
    }

    public static List<String> scanForStrings(final String row) {
        List<String> result = new ArrayList<>();
        if (row == null) {
            return result;
        }
        String[] entries = row.
                replaceAll("^\\(","")
                .replaceAll("\\)$","")
                .split(",");
        StringBuffer buffer = new StringBuffer();
        for (String entry:entries) {
            if (entry.matches("^[\\s]*'.*") && buffer.length() == 0) {
                entry = entry.replaceAll("^[\\s]*'", "");
                if (entry.matches(".*'[\\s]*$")) {
                    entry = entry.replaceAll("'[\\s]*$", "");
                    result.add(entry);
                    continue;
                }
                buffer.append(entry);
                buffer.append(",");
                continue;
            }
            if (entry.matches(".*'[\\s]*$")) {
                if (buffer.length() > 0) {
                    entry = entry.replaceAll("'[\\s]*$", "");
                } else {
                    throw new IheException("No closing single quote found '" + buffer + "':" + row);
                }
            }
            else {
                if (buffer.length() > 0) {
                    buffer.append(entry);
                    buffer.append(",");
                }
            }
            result.add(buffer.toString() + entry);
            buffer = new StringBuffer();
        }
        if (buffer.length()> 0) {
                throw new IheException("No closing single quote found '" + buffer + "':" + row);
        }
        return result;
    }

    public static List<List<String>> findSlotList(RegistryObjectType parentType, String slotName) {
        final List<List<String>> slotValues = new ArrayList<>();
        if (parentType.getSlot() == null) {
            return slotValues;
        }
        for (SlotType1 slot : parentType.getSlot()) {
            if (slot == null || slot.getName() == null) {
                continue;
            }
            if ( !slotName.equals(slot.getName()))  {
                continue;
            }
            if ( slot.getValueList() == null || slot.getValueList().getValue() == null || slot.getValueList().getValue()
                    .isEmpty()) {
                continue;
            }
            slotValues.add(slot.getValueList().getValue());
        }
        return slotValues;
    }
}
