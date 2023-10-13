package com.ict01.thprj.thymeleafproject.dto;

import lombok.Data;

@Data // Lombok의 @Data 어노테이션: getter, setter, toString, equals, hashCode 메서드를 자동으로 생성
public class StudentDTO {

  private int id; // 학생의 고유 ID
  private String name; // 학생의 이름
  private String email; // 학생의 이메일 주소
  private String address; // 학생의 주소

  // 생성자: 객체를 생성할 때 필요한 값을 초기화
  public StudentDTO(int id, String name, String email, String address) {
    this.id = id; // 학생 ID 초기화
    this.name = name; // 학생 이름 초기화
    this.email = email; // 학생 이메일 초기화
    this.address = address; // 학생 주소 초기화
  }
}
