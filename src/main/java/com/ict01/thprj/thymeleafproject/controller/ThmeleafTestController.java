package com.ict01.thprj.thymeleafproject.controller;

import com.ict01.thprj.thymeleafproject.dto.StudentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller // Spring MVC의 컨트롤러로 선언
@RequestMapping("/ict01") // 이 컨트롤러의 기본 URL 경로 설정
public class ThmeleafTestController {

  // localhost:8080/ict01/testList로 접근 시 실행되는 메서드
  @GetMapping("/testList")
  public String testList(Model model) {
    model.addAttribute("msg", "Thmeleaf 환영합니다.."); // 뷰에 전달할 데이터 설정
    model.addAttribute("ict", "정보통신학부에 오신것을 환영합니다.");
    return "views/test01"; // views 폴더 내의 test01.html 뷰를 반환
  }
  // localhost:8080/ict01/operTest로 접근 시 실행되는 메서드
  @GetMapping("/operTest")
  public String oprTest() {
    return "views/test02"; // views 폴더 내의 test02.html 뷰를 반환
  }
  // localhost:8080/ict01/formTest로 접근 시 실행되는 메서드
  @GetMapping("/formTest")
  public String formTest(Model model) {
    model.addAttribute("ict", "smartIT"); // 뷰에 전달할 데이터 설정
    return "views/formTest"; // views 폴더 내의 formTest.html 뷰를 반환
  }

  @PostMapping("/formTest")
  public String runForestTest(Model model, String test1) {
    System.out.println("test1 ====> " + test1); // 콘솔에 test1의 값을 출력
    return "views/formTest"; // views 폴더 내의 formTest.html 뷰를 반환
  }

  @GetMapping("/loopTest")
  public String loopTest(Model model) {
    // 학생 정보 생성
    StudentDTO s1 = new StudentDTO(1, "ict01", "ict01@gmail.com","ict01Address");
    StudentDTO s2 = new StudentDTO(2, "ict02", "ict02@gmail.com","ict02Address");
    StudentDTO s3 = new StudentDTO(3, "ict03", "ict03@gmail.com","ict03Address");
    StudentDTO s4 = new StudentDTO(4, "ict04", "ict04@gmail.com","ict04Address");
    StudentDTO s5 = new StudentDTO(5, "ict05", "ict05@gmail.com","ict05Address");

    List<StudentDTO> list = new ArrayList<>(); // 학생 정보 리스트 생성
    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);
    list.add(s5);

    model.addAttribute("list", list); // 전체 학생 정보 리스트를 뷰에 전달
    model.addAttribute("student",3); // 특정 학생 정보를 뷰에 전달

    return "views/loopTest"; // views 폴더 내의 loopTest.html 뷰를 반환
  }
}
