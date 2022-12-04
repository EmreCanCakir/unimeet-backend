package edu.unimeet.entities;

import lombok.*;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import edu.unimeet.dto.UniDeptViewDto;
import edu.unimeet.dto.UserCreateDTO;
import edu.unimeet.dto.UserViewDTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer userId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "tx_userName")
    private String userName;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "UserBio")
    private String userBio;

    @Column(name = "UserPassword")
    private String userPassword;

    @ManyToOne
    @JoinColumn(name = "uniDeptID")
    private UniDept uniDept;
    
    @OneToMany(mappedBy = "users")
    @Cascade(CascadeType.ALL)
    private List<Comment> comment;
    
    @OneToMany(mappedBy = "users")
    @Cascade(CascadeType.ALL)
    private List<Like> like;

    public User(String firstName, String lastName, String userName, String gender, String email, String phoneNumber,
                String userBio, String userPassword,UniDept uniDept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userBio = userBio;
        this.userPassword = userPassword;
        this.uniDept = uniDept;
    }
    
 public static User of(UserViewDTO userViewDTO) {
    	

        return new User(userViewDTO.getFirstName(),userViewDTO.getLastName(),userViewDTO.getUserName(),userViewDTO.getGender()
        		,userViewDTO.getEmail(),userViewDTO.getPhoneNumber(),userViewDTO.getUserBio(),userViewDTO.getPassword(),UniDept.of(userViewDTO.getUniDept()));

    }
 
 public static User ofCreate(UserViewDTO userViewDTO) {
 	

     return new User(userViewDTO.getUser_id(),userViewDTO.getFirstName(),userViewDTO.getLastName(),userViewDTO.getUserName(),userViewDTO.getGender()
     		,userViewDTO.getEmail(),userViewDTO.getPhoneNumber(),userViewDTO.getUserBio(),userViewDTO.getPassword(),UniDept.of(userViewDTO.getUniDept()));

 }
 

public User(Integer userId, String firstName, String lastName, String userName, String gender, String email,
		String phoneNumber, String userBio, String userPassword, UniDept uniDept) {
	super();
	this.userId = userId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.gender = gender;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.userBio = userBio;
	this.userPassword = userPassword;
	this.uniDept = uniDept;
}
    


}