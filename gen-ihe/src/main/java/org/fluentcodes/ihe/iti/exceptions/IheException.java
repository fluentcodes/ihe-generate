package org.fluentcodes.ihe.iti.exceptions;

public class IheException extends RuntimeException {
    public IheException(final Exception e) {
        super(e);
    }
    public IheException(final String message, final Exception e) {
        super(message, e);
    }
    public IheException(final String message) {
        super(message);
    }
}
