package com.example.demo.dao;

import com.example.demo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {

  @Autowired
  private EntityManager entityManager;

  @Transactional
  public UserDto saveUserInDB(UserDto userDto) {
//    String firstName = userDto.getFirstName();
//    String password = userDto.getPassword();
//    Query nativeQuery = entityManager.createNativeQuery("insert into users(name, password) value (?,?)");
//    nativeQuery.setParameter(1, firstName);
//    nativeQuery.setParameter(2, password);
//    nativeQuery.executeUpdate();
    entityManager.persist(userDto);
    return userDto;
  }

  public List<UserDto> getAll() {
//    List<UserDto> result = new ArrayList<>();
    Query nativeQuery = entityManager.createNativeQuery("select * from users", UserDto.class);
    List<UserDto> resultList = nativeQuery.getResultList();
//    for (int i = 0; i < resultList.size(); i++) {
//      UserDto userDto = new UserDto();
//      String name = (String) resultList.get(i)[0];
//      String password = (String) resultList.get(i)[1];
//      userDto.setName(name);
//      userDto.setPassword(password);
//      result.add(userDto);
//    }
    return resultList;
  }

}
