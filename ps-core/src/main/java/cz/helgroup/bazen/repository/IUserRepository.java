package cz.helgroup.bazen.repository;

import cz.helgroup.bazen.domain.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Repository interface for managing {@link User} entities.
 * @author Daniel Vodicka
 */
public interface IUserRepository {

    /**
     * Stores the given user entity.
     * @param user the user to store
     */
    void store(User user);

//todo
}
