## ThymeleafProject


이 프로젝트는 Thymeleaf 템플릿 엔진을 사용하여 웹 애플리케이션을 구현한 실습 프로젝트입니다.

## 주요 기능

1. **testList**: 사용자에게 Thymeleaf 환영 메시지와 정보통신학부 환영 메시지를 보여줍니다.
   ![testList](/img/testList.png)

2. **operTest**: 기본 연산을 테스트하는 페이지입니다.
   ![operTest](/img/operTest.png)

3. **formTest**: 사용자로부터 입력을 받는 폼을 제공하며, 입력된 데이터를 서버에 전송합니다.
   ![formTest](/img/formTest.png)

4. **loopTest**: 여러 학생의 정보를 리스트 형태로 보여주는 페이지입니다.
   ![loopTest](/img/loopTest.png)

## 컨트롤러 구조

`ThmeleafTestController`는 다음과 같은 메서드로 구성되어 있습니다:

- `testList()`: Thymeleaf 환영 메시지와 정보통신학부 환영 메시지를 뷰에 전달합니다.
- `oprTest()`: 기본 연산을 테스트하는 뷰를 반환합니다.
- `formTest()`: 사용자 입력 폼을 제공하는 뷰를 반환합니다.
- `runForestTest()`: 폼에서 전송된 데이터를 처리하고 결과를 콘솔에 출력합니다.
- `loopTest()`: 여러 학생의 정보를 리스트 형태로 뷰에 전달합니다.

## Using Teck

- **Thymeleaf**: 모던 서버사이드 Java 템플릿 엔진으로, 웹 및 독립형 환경에서 사용됩니다.
- **Spring Boot**: 이 프로젝트의 기본 프레임워크로 사용되었습니다.

