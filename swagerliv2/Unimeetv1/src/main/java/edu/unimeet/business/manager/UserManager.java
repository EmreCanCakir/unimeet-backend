package edu.unimeet.business.manager;

import edu.unimeet.business.service.UserService;
import edu.unimeet.dto.UserCreateDTO;
import edu.unimeet.dto.UserUpdateDTO;
import edu.unimeet.dto.UserViewDTO;
import edu.unimeet.entities.UniDept;
import edu.unimeet.entities.User;
import edu.unimeet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public UserViewDTO getUserById(int id) {
        final User user = userRepository.findById(id).orElseThrow();
        return UserViewDTO.of(user);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<UserViewDTO> getAll() {
        return userRepository.findAll().stream().map(UserViewDTO::of).collect(Collectors.toList());
    }

    @Override
    public UserCreateDTO createUser(UserCreateDTO userCreateDTO) {
        final User user = new User(userCreateDTO.getFirstName(), userCreateDTO.getLastName(), userCreateDTO.getUserName(), userCreateDTO.getGender(),
                userCreateDTO.getEmail(), userCreateDTO.getPhoneNumber(), userCreateDTO.getUserBio(), userCreateDTO.getUserPassword(),UniDept.of(userCreateDTO.getUniDeptViewDto()));

        userRepository.save(user);
        return UserCreateDTO.of(user);
    }

    @Transactional
    public UserViewDTO updateUser(int id, UserUpdateDTO userUpdateDTO) {
        User user = userRepository.findById(id).orElseThrow();
        user.setFirstName(userUpdateDTO.getFirstName());
        user.setLastName(userUpdateDTO.getLastName());
        user.setUserName(userUpdateDTO.getUserName());
        user.setGender(userUpdateDTO.getGender());
        user.setEmail(userUpdateDTO.getEmail());
        user.setPhoneNumber(userUpdateDTO.getPhoneNumber());
        user.setUserBio(userUpdateDTO.getUserBio());

        final User updatedUser = userRepository.save(user);

        return UserViewDTO.of(updatedUser);
    }

    @Override
    public void deleteUser(int id) {
        final User user = userRepository.findById(id).orElseThrow();
        userRepository.deleteById(user.getUserId());

    }

	@Override
	public UserViewDTO findStudentByEmail(String email) {
		User user = userRepository.findStudentByEmail(email);
		UserViewDTO userViewDTO = UserViewDTO.of(user);
		return userViewDTO;
	}


}
