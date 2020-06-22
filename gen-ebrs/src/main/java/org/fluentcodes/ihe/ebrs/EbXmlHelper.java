package org.fluentcodes.ihe.ebrs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EbXmlHelper {
    private static final Logger LOG = LogManager.getLogger(EbXmlHelper.class);
    public static final oasis.names.tc.ebxml_regrep.xsd.lcm._3.ObjectFactory OF_LCM
            = new oasis.names.tc.ebxml_regrep.xsd.lcm._3.ObjectFactory();
    public static final oasis.names.tc.ebxml_regrep.xsd.query._3.ObjectFactory OF_QUERY
            = new oasis.names.tc.ebxml_regrep.xsd.query._3.ObjectFactory();
    public static final oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory OF_RIM
            = new oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory();
    public static final oasis.names.tc.ebxml_regrep.xsd.rs._3.ObjectFactory OF_RS
            = new oasis.names.tc.ebxml_regrep.xsd.rs._3.ObjectFactory();

    private EbXmlHelper() {}
}
