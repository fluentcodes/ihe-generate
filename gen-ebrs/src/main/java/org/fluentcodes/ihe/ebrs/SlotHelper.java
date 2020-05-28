package org.fluentcodes.ihe.ebrs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class SlotHelper {
    private static final Logger LOG = LogManager.getLogger(SlotHelper.class);
    public static String getString(SlotWrapper slots) {
        List<String> row = getList(slots);
        if (row.isEmpty()) {
            return "";
        }
        return row.get(0);
    }

    public static List<String> getList(SlotWrapper slots) {
        if (slots.isEmpty()) {
            return new ArrayList<>();
        }
        if (slots.getValues() == null || slots.getValues().isEmpty()) {
            return new ArrayList<>();
        }
        if (slots.getValues().get(0) == null) {
            return new ArrayList<>();
        }
        return slots.getValues().get(0);
    }
    
    public static Set<String> getSet(SlotWrapper slots) {
        Set<String> result = new LinkedHashSet<>();
        for (String value: getList(slots)) {
            result.add(value);
        }
        return result;
    }
}
