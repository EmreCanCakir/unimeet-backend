package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Comment;
import edu.unimeet.entities.Like;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LikeCreateDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private UserViewDTO users;
	private PostViewDTO posts;

	
	public static LikeCreateDTO of(Like like) {
		if(like == null) {
			return null;}
		else {
        return new LikeCreateDTO(UserViewDTO.of(like.getUsers()),PostViewDTO.of(like.getPost()));

    }
	

}}
