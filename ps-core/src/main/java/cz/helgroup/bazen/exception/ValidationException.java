package cz.helgroup.bazen.exception;

/**
 * Exception thrown when input validation fails.
 * Should be thrown from the service layer when business validation rules are violated.
 */
public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}