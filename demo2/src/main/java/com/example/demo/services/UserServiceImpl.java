package com.example.demo.services;

import com.example.demo.dao.UserRepository;
import com.example.demo.dto.UserDto;
import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

//  private final UserDao userDao;

//  @Autowired
//  public UserServiceImpl(UserDao userDao) {
//    this.userDao = userDao;
//  }

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto saveUser(UserDto userDto) {

        if (Objects.isNull(userDto)) {
            throw new RuntimeException("user cant be null");
        }
        List<User> allByAgeGreaterThan = userRepository.findAllByAgeGreaterThan(2);
        User user = fromDto(userDto);
        User user1 = fromDto(userDto);
        user = userRepository.save(user);
        userRepository.deleteById(1L);
        return toDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> all = userRepository.findAll();
        return all.stream().map(this::toDto).collect(Collectors.toList());
    }

    private User fromDto(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setAge(userDto.getAge());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        return user;
    }

    private UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setAge(user.getAge());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }

}
