package cz.helgroup.bazen.exception;

/**
 * Exception thrown when a user attempts to perform an action they are not authorized to do.
 * This should be thrown from the service layer when authorization checks fail.
 */
public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException(String message) {
        super(message);
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
}