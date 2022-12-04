package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostCreateDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String content;
	
	private UserViewDTO user;


	
	public static PostCreateDTO of(Post post) {
		

        return new PostCreateDTO(post.getContent(),UserViewDTO.of(post.getUser()));

    }

}
