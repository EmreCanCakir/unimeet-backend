package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Comment;
import edu.unimeet.entities.Post;
import edu.unimeet.entities.UniDept;
import edu.unimeet.entities.User;
import lombok.Getter;

@Getter
public class CommentViewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer commentId;
	
	private UserViewDTO users;
	private PostViewDTO posts;
	private String content;
	public CommentViewDTO(UserViewDTO users, PostViewDTO posts, String content,Integer commentId) {
		
		this.users = users;
		this.posts = posts;
		this.content = content;
		this.commentId = commentId;
	}
	
	public static CommentViewDTO of(Comment comment) {
		if(comment == null) {
			return null;}
		else {
        return new CommentViewDTO(UserViewDTO.of(comment.getUsers()),PostViewDTO.of(comment.getPost()),comment.getContent(),comment.getCommentId());}

    }

}
