package com.github.bodzso.swaggernullabletest;

import io.swagger.v3.oas.annotations.media.Schema;

public class Pet {
  @Schema(example = "null", defaultValue = "null")
  private String name;
  @Schema(example = "null", defaultValue = "null")
  private Integer age;

  //region Getters, setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
  //endregion
}
