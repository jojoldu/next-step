# 박재성님의 next step 교재를 통한 스터디

* 교재의 요구사항(문제)의 난이도를 자체적으로 변경
  - 쉽게 느껴지는 경우엔 Java8 문법으로 코드 작성할 것
* 인텔리J를 연습
  - 커뮤니티 에디션의 경우 스프링/톰캣을 사용하지 못하므로 Java, Junit 챕터이후부터는 이클립스로 진행

### 2017.02.04 - 1주차
**2장**  

* 테스트 사전 작업을 필드구현이 아닌 @before 메소드를 사용하는 이유는 각 테스트마다 초기화된 사전 작업을 갖기 위함이다.
  - 필드 선언으로 사용할 경우 이전 테스트가 필드값을 변경해버리면 다음 테스트가 변경된 필드 값을 토대로 테스트를 진행하기 때문에 올바른 테스트가 수행되지 않는다.

* 읽기 좋은 코드란, 세부구현에 집중하도록 하지 않고 **논리적인 로직을 쉽게 파악**할수 있도록 구현되어 있는 코드를 말한다.
  - 이를 위해 메소드이름, 변수이름도 명확하게 생성/변경해야 한다.
  - 마찬가지로 비지니스 로직이 변경될 경우 그에 따라 메소드이름, 변수이름도 변경되어야 한다.

**3장**  

* 배포서버 구축은 맥은 [도커](https://docs.docker.com/docker-for-mac/)를, 윈도우는 [VirtualBox](http://webdevnovice.tistory.com/2) (윈도우의 경우 윈도우10 Pro버전에서만 도커가 설치되기 때문)를 이용합니다.  
* p.92 : try with resources 찾아보기
* p.93 : Thread 클래스와 멀티쓰레드 환경에 대해 찾아보기
* ```e.getMessage```는 exception에 담긴 메세지만 출력된다. ```printstacktrace```처럼 exception 로그를 전부 남기려면 어떻게 해야하는가?
* 운영 단계에서 출력되지 않은 로그라도 문자열 연산이 들어갈 경우 성능저하를 유발하기 때문에 SLF4J에선 다음과 같은 동적메세지 생성을 권장한다.

```
log.debug("Client IP : "+connection.getInetAddress()+", Port: "+connection.getPort());

=>
log.debug("Client IP : {}, Port: ", connection.getInetAddress(), connection.getPort());

```   
* git 설치 및 github 업로드 해볼 것 ([Java & SourceTree 사용시 참고](http://jojoldu.tistory.com/16))

**4장**  

* 크롬 브라우저의 개발자 도구 -> network탭을 이용하여 웹서버와 브라우저간 통신 과정과 결과 확인해볼 것
* p.132 : 각 상태 코드(status code) 읽어볼 것
* 클라이언트와 서버는 상태를 공유할 수 없기 때문에 **쿠키**를 이용하여 매 전송마다 request header에 공유할 데이터를 같이 전송한다. ([추가 설명 참고](http://jojoldu.tistory.com/118))
* 현재 접속한 사이트에서 쿠키정보 확인하는 법 익히기
   * 가능하면 IE, 크롬 둘다 확인할 것
* private 메소드를 테스트하려면 private 메소드의 코드를 가진 새로운 클래스를 생성하여 하는 것이 효과적

**5장**  
