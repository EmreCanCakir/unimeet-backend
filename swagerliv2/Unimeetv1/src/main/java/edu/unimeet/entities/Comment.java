package edu.unimeet.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.unimeet.dto.CommentViewDTO;
import edu.unimeet.dto.UserViewDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "comments")
public class Comment {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "CommentID")
	    private Integer commentId;
	    
	    @Column(name = "Content")
	    private String content;

	 

	    @ManyToOne
	    @JoinColumn(name="user_id")
	    private User users;


	    public Comment(String content, User users, Post post) {
			super();
			this.content = content;
			this.users = users;
			this.post = post;
		}


		@ManyToOne
	    @JoinColumn(name="post_id")
	    private Post post;
		
		
		
		public static Comment of(CommentViewDTO commentViewDTO) {
	    	

	        return new Comment(commentViewDTO.getContent(),User.of(commentViewDTO.getUsers()),Post.ofCreate(commentViewDTO.getPosts()));

	    }
	 
	
		
		

}
