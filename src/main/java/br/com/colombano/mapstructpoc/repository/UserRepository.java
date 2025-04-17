package br.com.colombano.mapstructpoc.repository;

import br.com.colombano.mapstructpoc.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}