package edu.unimeet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimeet.entities.Comment;
import edu.unimeet.entities.Department;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
	

}
