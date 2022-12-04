package edu.unimeet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "likes")
public class Like {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "LikeID")
	    private Integer likeId;
	    
	    @ManyToOne
	    @JoinColumn(name="user_id")
	    private User users;


	    public Like(User users, Post post) {
			super();
			this.users = users;
			this.post = post;
		}


		@ManyToOne
	    @JoinColumn(name="post_id")
	    private Post post;
	

}
