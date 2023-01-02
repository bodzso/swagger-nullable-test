package com.github.bodzso.swaggernullabletest;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

public class Person {
  @Schema(nullable = true, example = "null", defaultValue = "null")
  private String firstName;
  @Schema(nullable = true, example = " ", defaultValue = " ")
  private String lastName;
  @Schema(nullable = true, example = "'null'", defaultValue = "'null'")
  private String middleName;
  @Schema(nullable = true, example = "\"null\"", defaultValue = "\"null\"")
  private String nickName;
  @Schema(nullable = true, example = "null", defaultValue = "null")
  private Integer age;
  @Schema(nullable = true, example = "null", defaultValue = "null")
  private BigDecimal height;
  @Schema(nullable = true, example = "null", defaultValue = "null")
  private Boolean glasses;
  @Schema(example = "null", defaultValue = "null")
  private Pet pet;
  @Schema(example = "null", defaultValue = "null")
  private List<Person> friends;

  //region Getters, setters
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public Boolean getGlasses() {
    return glasses;
  }

  public void setGlasses(Boolean glasses) {
    this.glasses = glasses;
  }

  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

  public List<Person> getFriends() {
    return friends;
  }

  public void setFriends(List<Person> friends) {
    this.friends = friends;
  }
  //endregion
}
