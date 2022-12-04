package edu.unimeet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.unimeet.entities.Post;
import edu.unimeet.entities.User;

@Repository
public interface  PostRepository extends JpaRepository<Post, Integer> {
	
	
	

}
