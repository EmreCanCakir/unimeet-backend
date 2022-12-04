package edu.unimeet.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;



import edu.unimeet.dto.UserCreateDTO;
import edu.unimeet.dto.UserUpdateDTO;
import edu.unimeet.dto.UserViewDTO;

public interface UserService {

    UserViewDTO getUserById(int id);
    
	UserViewDTO findStudentByEmail(String email);

    UserCreateDTO createUser(UserCreateDTO userCreateDTO);

    List<UserViewDTO> getAll();

    UserViewDTO updateUser(int id, UserUpdateDTO userUpdateDTO);

    void deleteUser(int id);

}
