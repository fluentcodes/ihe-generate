package org.fluentcodes.ihe.ebrs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.UUID;

public class IheHelper {
    private static final Logger LOG = LogManager.getLogger(IheHelper.class);
    public static final oasis.names.tc.ebxml_regrep.xsd.lcm._3.ObjectFactory OF_LCM
            = new oasis.names.tc.ebxml_regrep.xsd.lcm._3.ObjectFactory();
    public static final oasis.names.tc.ebxml_regrep.xsd.query._3.ObjectFactory OF_QUERY
            = new oasis.names.tc.ebxml_regrep.xsd.query._3.ObjectFactory();
    public static final oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory OF_RIM
            = new oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory();
    public static final oasis.names.tc.ebxml_regrep.xsd.rs._3.ObjectFactory OF_RS
            = new oasis.names.tc.ebxml_regrep.xsd.rs._3.ObjectFactory();
    //public static final ihe.iti.xds_b._2007.ObjectFactory OF_XDS = new ihe.iti.xds_b._2007.ObjectFactory();

    public static final String UUID_PREFIX = "urn:uuid:";

    private IheHelper() {}

    public final static String createUUID() {
        return UUID_PREFIX + createUUIDWithoutPrefix();
    }
    public final static String createUUIDWithoutPrefix() {
        return UUID.randomUUID().toString();
    }
    public final static String createUUIDWithName(final String name) {
        return UUID_PREFIX + createUUIDWithoutPrefix(name);
    }
    public final static String createUUIDWithoutPrefix(final String name) {
        return  UUID.nameUUIDFromBytes(name.getBytes()).toString();
    }

    public static boolean isUuid(final String uniqueId) {
        if (uniqueId == null) {
            return false;
        }
        try {
            UUID uuid = UUID.fromString(uniqueId.replaceAll(UUID_PREFIX, ""));
            return true;
        } catch (IllegalArgumentException e) {
            LOG.debug("Problem that " + uniqueId + " is not a valid uniqueId! " + e.getMessage());
            return false;
        }
    }

    public static void checkUniqueId(final String uniqueId) {
        if (isUuid(uniqueId)) {
            return;
        }
        checkOID(uniqueId, -1);
    }

    public static void checkOID(final String oid, int maxLength) {
        if (oid == null || oid.isEmpty()) {
            throw new IheException("empty value for ");
        }
        String[] values = oid.split(".");
        if (maxLength > 0 && values.length != maxLength) {
            throw new IheException("OID '" + oid + " has not the length 6 but " + values.length);
        }
        for (String part: values) {
            try {
                Integer.parseInt(part);
            }
            catch (final Exception e) {
                throw new IheException("OID has a nonparsable part for " + oid + ": ", e);
            }
        }
    }

    public static void checkOID(final String oid) {
        checkOID(oid, -1);
    }

    public static void checkOID2(final String oid){
        String value = oid
                .replace("urn:oid:","");
        if (value.length()>64) {
            throw new IheException("Value is not a valid oid: '" + value + "'!");
        }
        value = value
                .replaceAll("[0123456789.]","");
        if (!value.isEmpty()) {
            throw new IheException("Value is not a valid oid: '" + value + "'!");
        }
    }
}
