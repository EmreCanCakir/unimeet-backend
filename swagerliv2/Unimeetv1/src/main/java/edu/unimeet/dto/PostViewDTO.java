package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Post;
import edu.unimeet.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostViewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer post_id;
	private String content;
	private UserViewDTO user;
	
	public static PostViewDTO of(Post post) {
	

        return new PostViewDTO(post.getPostId(),post.getContent(),UserViewDTO.of(post.getUser()));

    }
	
	

}
