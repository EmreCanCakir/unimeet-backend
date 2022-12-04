package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommentCreateDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private UserViewDTO users;
	private PostViewDTO posts;
	private String content;

	public static CommentCreateDTO of(Comment comment) {
		if(comment == null) {
			return null;}
		else {
        return new CommentCreateDTO(UserViewDTO.of(comment.getUsers()),PostViewDTO.of(comment.getPost()),comment.getContent());}

    }

}
