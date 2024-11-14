package co.in.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.in.firstproject.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}


