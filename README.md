# FastCampus 10개 프로젝트로 완성하는 백엔드 웹개발(Java/Spring) 초격차 패키지 Online
## Part1. 나만의 MVC 프레임워크 만들기
### Ch06. MVC 프레임워크 만들기
#### 1. 리플렉션 API 개념 소개 및 실습
- 힙 영역에 로드돼 있는 클래스 타입의 객체를 통해 필드/메소드/생성자를 접근 제어자와 상관 없이 사용할 수 있도록 지원하는 API
- 컴파일 시점이 아닌 런타임 시점에 동적으로 특정 클래스의 정보를 추출해낼 수 있는 프로그래밍 기법
- 주로 프레임워크 또는 라이브러리 개발 시 사용됨 (ex. Spring프레임워크의 DI, Test프레임워크의 JUnit, Jackson 등)
#### 2. 프런트 컨트롤러 개념 소개 및 실습
##### 프런트 컨트롤러 패턴
- 모든 요청을 단일 handler(처리기)에서 처리하도록 하는 패턴
- 스프링 웹 MVC 프레임워크의 DispatcherServlet(프런트 컨트롤러 역할)이 프런트 컨트롤러 패턴으로 구현돼 있음
##### Forward
- 서블릿에서 클라이언트(웹 브라우저)를 거치지 않고 바로 다른 서블릿(또는 JSP)에게 요청하는 방식
- Forward 방식은 서버 내부에서 일어나는 요청이기 때문에 HttpServletRequest, HttpServletResponse객체가 새롭게 생성되지 않음(공유됨)
##### Redirect
- 서블릿이 클라이언트(웹 브라우저)를 다시 거쳐 다른 서블릿(또는 JSP)에게 요청하는 방식
- Redirect 방식은 클라이언트로부터 새로운 요청이기 때문에 새로운 HttpServletRequest, HttpServletResponse 객체가 생성됨
#### 3. MVC 프레임워크 만들기
<img width="497" alt="image" src="https://user-images.githubusercontent.com/106790381/226847384-8f5aeec8-383e-4124-99c2-8e323a0d84d0.png">  
- DispatcherServlet에서 request를 받음
- 요청된 경로를 통해서 적절한 handler를 받아옴
- handler에 맞는 adapter를 찾음
- adapter내부에서 handler 실행 -> model and view return
- view resolver에서 view를 선택한 후 rendering
- view를 response
