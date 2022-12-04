package edu.unimeet.dto;

import edu.unimeet.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCreateDTO {


    private String firstName;

    private String lastName;

    private String userName;

    private String gender;

    private String email;

    private String phoneNumber;

    private String userBio;



	private String userPassword;
    
    private UniDeptViewDto uniDeptViewDto;
    
    public static UserCreateDTO of(User user) {

        return new UserCreateDTO(user.getFirstName(), user.getLastName(), user.getUserName(), user.getGender(),
                user.getEmail(), user.getPhoneNumber(), user.getUserBio(),user.getUserPassword(),UniDeptViewDto.of(user.getUniDept()));

    }


}
