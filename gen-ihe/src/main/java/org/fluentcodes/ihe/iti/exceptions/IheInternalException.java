package org.fluentcodes.ihe.iti.exceptions;

public class IheInternalException extends RuntimeException {
    public IheInternalException(final Exception e) {
        super(e);
    }
    public IheInternalException(final String message, final Exception e) {
        super(message, e);
    }
    public IheInternalException(final String message) {
        super(message);
    }
}
