package edu.unimeet.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import edu.unimeet.dto.PostCreateDTO;
import edu.unimeet.dto.PostViewDTO;
import edu.unimeet.dto.UniDeptViewDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "content")
    private String content;
    @OneToOne
    @JoinColumn(name = "user_fk_id")
    private User user;
    
    @OneToMany(mappedBy = "post")
    @Cascade(CascadeType.ALL)
    private List<Comment> comment;
    
    @OneToMany(mappedBy = "post")
    @Cascade(CascadeType.ALL)
    private List<Like> like;
    
    
	public Post(String content,User user) {
		this.content = content;
		this.user=user;
	}
	 public static Post of(PostCreateDTO postCreateDTO) {
	    	

	        return new Post(postCreateDTO.getContent(),User.of(postCreateDTO.getUser()));

	    }
	 
	 public static Post ofCreate(PostViewDTO PostViewDTO) {
	    	

	        return new Post(PostViewDTO.getPost_id(),PostViewDTO.getContent(),User.ofCreate(PostViewDTO.getUser()));

	    }
	public Post(Integer postId, String content, User user) {
		super();
		this.postId = postId;
		this.content = content;
		this.user = user;
	}
	

}
