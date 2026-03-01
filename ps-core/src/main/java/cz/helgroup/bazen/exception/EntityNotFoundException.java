package cz.helgroup.bazen.exception;

/**
 * Exception thrown when a requested entity is not found.
 * This should be thrown from the service layer when an entity lookup fails.
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}