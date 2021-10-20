package com.example.demo.dto;


public class UserDto {

  private Long id;

  private String firstName;

  private String lastName;

  private Integer age;

  private String password;

  private String email;

  private String name;

  public UserDto() {
  }


  public Long getId() {
    return id;
  }

  public UserDto setId(Long id) {
    this.id = id;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public UserDto setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public UserDto setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public Integer getAge() {
    return age;
  }

  public UserDto setAge(Integer age) {
    this.age = age;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public UserDto setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserDto setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getName() {
    return name;
  }

  public UserDto setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    return "UserDto{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", password='" + password + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
