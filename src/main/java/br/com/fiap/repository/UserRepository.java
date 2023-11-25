package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
