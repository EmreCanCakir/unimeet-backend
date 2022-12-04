package edu.unimeet.dto;

import edu.unimeet.entities.UniDept;
import edu.unimeet.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserViewDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private  Integer user_id ;
    private  String firstName;

    private  String lastName;

    private  String userName;

    private  String gender;

    private  String email;

    private  String phoneNumber;

    private  String userBio;
    private  String password;

    private UniDeptViewDto uniDept;



    public static UserViewDTO of(User user) {

        return new UserViewDTO(user.getUserId(),user.getFirstName(), user.getLastName(), user.getUserName(), user.getGender(),
                user.getEmail(), user.getPhoneNumber(), user.getUserBio(),user.getUserPassword(),UniDeptViewDto.of(user.getUniDept()));

    }


}
