package edu.unimeet.business.service;

import java.util.List;

import edu.unimeet.dto.PostCreateDTO;
import edu.unimeet.dto.PostViewDTO;
import edu.unimeet.dto.UserCreateDTO;
import edu.unimeet.dto.UserViewDTO;

public interface PostService {
	PostViewDTO getPostById(int id);

	PostViewDTO createPost(PostCreateDTO postCreateDTO);

	    List<PostViewDTO> getAll();
	    
	    List<PostViewDTO> getPostByUsername(String username);

}
