package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Comment;
import edu.unimeet.entities.Like;
import lombok.Getter;
@Getter
public class LikeViewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer like_id;
	private UserViewDTO users;
	private PostViewDTO posts;
	public LikeViewDTO(UserViewDTO users, PostViewDTO posts,Integer like_id) {
		
		this.users = users;
		this.posts = posts;
		this.like_id = like_id;
	}
	
	public static LikeViewDTO of(Like like) {
		if(like == null) {
			return null;}
		else {
        return new LikeViewDTO(UserViewDTO.of(like.getUsers()),PostViewDTO.of(like.getPost()),like.getLikeId());}

    }

}
