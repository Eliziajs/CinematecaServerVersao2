package br.com.appcinemateca.api.repositories;

import br.com.appcinemateca.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    User findByUserName(String username);

    /**@Query("SELECT U FROM User WHERE u.userName =:userName ")
    User findByUserName(@Param("userName") String userName);**/
}

