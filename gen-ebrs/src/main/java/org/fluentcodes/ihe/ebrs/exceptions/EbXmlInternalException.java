package org.fluentcodes.ihe.ebrs.exceptions;

public class EbXmlInternalException extends RuntimeException {
    public EbXmlInternalException(final Exception e) {
        super(e);
    }
    public EbXmlInternalException(final String message, final Exception e) {
        super(message, e);
    }
    public EbXmlInternalException(final String message) {
        super(message);
    }
}
