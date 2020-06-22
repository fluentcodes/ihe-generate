package org.fluentcodes.ihe.ebrs.exceptions;

public class EbXmlException extends RuntimeException {
    public EbXmlException(final Exception e) {
        super(e);
    }
    public EbXmlException(final String message, final Exception e) {
        super(message, e);
    }
    public EbXmlException(final String message) {
        super(message);
    }
}
