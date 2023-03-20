# shopproject

알엠소프트 지원자 정은지

---
### 사용언어   : Java
### 프레임워크 : Spring Boot(STS4)
### db : mysql 8.0
---

# 프로젝트 생성<br>
![image](https://user-images.githubusercontent.com/109579667/226466080-ad8c8c0c-030c-4112-b93f-5763df468246.png)<br>
스프링부트의 스타트 패키지를 생성하고, 의존성엔 spring web 을 추가하였습니다.<br>

# 프로젝트 초기 설정<br>
|이미지|설명|
|--|--|
|![image](https://user-images.githubusercontent.com/109579667/226468254-f4fa2e16-a137-4fd3-b539-9f0bddc825cb.png)|db와의 연결을 위한 의존성 추가|
|![image](https://user-images.githubusercontent.com/109579667/226469024-1b22b827-c3bf-42eb-9a84-76b4e9cf4aa0.png)|마이바티스 의존성 추가|
|![image](https://user-images.githubusercontent.com/109579667/226468802-8529f50d-1f90-4702-b2d2-806b10fa5781.png)|타임리프 의존성 추가|
|![image](https://user-images.githubusercontent.com/109579667/226468863-1b0dcd6f-38ab-413b-a2d0-5e2a77acde44.png)|롬복 의존성 추가|
|![image](https://user-images.githubusercontent.com/109579667/226468947-d8978227-9847-4cc1-8e2a-0adfa0bda631.png)|테스트 코드를 이용하기 위한 의존성 추가|

### application.yml 

|![image](https://user-images.githubusercontent.com/109579667/226469393-936c1778-00a4-4d7d-b78d-8a1257d927e0.png)|서버포트는 8080, 인코딩을 설정해주었습니다.|
|![image](https://user-images.githubusercontent.com/109579667/226470181-ae0cbe34-0ad6-4e8c-82ed-284a7def061b.png)|데이터베이스에 접근할 수 있도록 작성하였습니다. 첫 번째는 호스트DB접근, 두 번째는 호스트pc에서 mysql컨테이너 DB로 접근, 세 번째는 같은 네트워크에 있는 web컨테이너에서의 mysql컨테이너 접근 명령어입니다.|
|Cell1|Cell2|
|Cell1|Cell2|


