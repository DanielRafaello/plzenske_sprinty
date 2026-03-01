package cz.helgroup.bazen.exception;

/**
 * Exception thrown when an operation cannot be performed due to invalid entity state.
 * For example, trying to approve a project that is not in COMPLETED state.
 */
public class InvalidStateException extends RuntimeException {

    public InvalidStateException(String message) {
        super(message);
    }

    public InvalidStateException(String message, Throwable cause) {
        super(message, cause);
    }
}