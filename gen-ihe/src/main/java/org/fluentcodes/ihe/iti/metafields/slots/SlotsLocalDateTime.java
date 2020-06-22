package org.fluentcodes.ihe.iti.metafields.slots;

import org.fluentcodes.ihe.ebrs.metafields.registry.RegistryObject;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotMetaCommon;
import org.fluentcodes.ihe.ebrs.metafields.slots.SlotWrapper;
import org.fluentcodes.ihe.iti.exceptions.IheRuntimeException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SlotsLocalDateTime extends SlotMetaCommon<LocalDateTime> {
    private static final DateTimeFormatter localDateTimeFormatter8 = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter localDateTimeFormatter10 = DateTimeFormatter.ofPattern("yyyyMMddHH");
    private static final DateTimeFormatter localDateTimeFormatter12 = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
    private static final DateTimeFormatter localDateTimeFormatter14 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    public SlotsLocalDateTime(final RegistryObject parentRO) {
        super(parentRO);
    }

    public LocalDateTime get() {
        return convertSlotToLocalDateTime(getFirstValue());
    }
    public void set(final LocalDateTime dateTime) {
        reset();
        add(new SlotWrapper(getIdentifier(), convertLocalDateTimeToSlot(dateTime)));
    }

    public static LocalDateTime convertSlotToLocalDateTime(final String value) {
        if (value==null|| value.isEmpty()) {
            return null;
        }
        if (value.replaceAll("\\d", "").length() != 0) {
            throw new IheRuntimeException("Value should only contain digits! '" + value + "'");
        }
        if (value.length() < 8) {
            throw new IheRuntimeException("Value should have at least 10 digits! '" + value + "'");
        }
        else if (value.length() == 8) {
            return LocalDateTime.parse(value, localDateTimeFormatter8);
        }
        else if (value.length() == 10) {
            return LocalDateTime.parse(value, localDateTimeFormatter10);
        }
        else if (value.length() == 12) {
            return LocalDateTime.parse(value, localDateTimeFormatter12);
        }
        else if (value.length() == 14) {
            return LocalDateTime.parse(value, localDateTimeFormatter14);
        }
        throw new IheRuntimeException(" slot is not parsable '" + value + "'");
    }

    public static String convertLocalDateTimeToSlot(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        StringBuilder value = new StringBuilder();
        add(value, 4, dateTime.getYear());
        add(value, 2, dateTime.getMonthValue());
        add(value, 2, dateTime.getDayOfMonth());
        add(value, 2, dateTime.getHour());
        add(value, 2, dateTime.getMinute());
        add(value, 2, dateTime.getSecond());
        return value.toString();
    }

    private static void add(StringBuilder builder, int size, int value) {
        for (int j = Integer.valueOf(value).toString().length(); j < size; j++) {
            builder.append("0");
        }
        builder.append(value);
    }


}
