package org.fluentcodes.ihe.iti;

public class IheRuntimeException extends RuntimeException{
    public IheRuntimeException(final Exception e) {
        super(e);
    }
    public IheRuntimeException(final String message) {
        super(message);
    }
    public IheRuntimeException(final String message, final Exception e) {
        super(message, e);
    }
}
