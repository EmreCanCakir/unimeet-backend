package edu.unimeet.repository;

import edu.unimeet.dto.UserViewDTO;
import edu.unimeet.entities.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	   @Query(value="SELECT * FROM tb_users  WHERE email=?1",nativeQuery = true)
	   User findStudentByEmail(String email);

}
