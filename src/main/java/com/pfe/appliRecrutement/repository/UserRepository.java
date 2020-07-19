package com.pfe.appliRecrutement.repository;

import java.util.Optional;

import com.pfe.appliRecrutement.repositoryCustom.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.appliRecrutement.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

	Optional<User> findByPseudo(String pseudo);

	Boolean existsByPseudo(String pseudo);

}
