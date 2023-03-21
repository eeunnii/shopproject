# shopproject
<br>


>### 사용언어   : Java
>### 프레임워크 : Spring Boot(STS4)
>### db : mysql 8.0

<br>

## 프로젝트 생성<br>
![image](https://user-images.githubusercontent.com/109579667/226466080-ad8c8c0c-030c-4112-b93f-5763df468246.png)
스프링부트의 스타트 패키지를 생성하고, 의존성엔 spring web 을 추가하였습니다.<br>
<br>
## 프로젝트 초기 설정<br>

+ DB연결을 위한 셋팅

|이미지|설명|
|--|--|
|![image](https://user-images.githubusercontent.com/109579667/226468254-f4fa2e16-a137-4fd3-b539-9f0bddc825cb.png)|pom.xml에 mysql의존성 추가|
|![image](https://user-images.githubusercontent.com/109579667/226469024-1b22b827-c3bf-42eb-9a84-76b4e9cf4aa0.png)|pom.xml에 마이바티스 의존성 추가|
|![image](https://user-images.githubusercontent.com/109579667/226479584-c1f8f21a-0319-464a-9288-91b78c5fba2c.png)|application.yml 작성, hikari pool사용했습니다.<br> mybayis config의 위치와 mapper.xml의 위치를 명시해주었습니다.|
|![image](https://user-images.githubusercontent.com/109579667/226480584-ad66657f-b57f-4dae-9333-45bbd1db93b5.png)| config패키지 생성 후, DBconfig.java 생성|
|![image](https://user-images.githubusercontent.com/109579667/226480893-630f9089-3227-489c-b9c7-735ddadbf10e.png)| application.yml에서 명시한 config위치에 mybayis-config.xml을 추가하였습니다.|

+ pom.xml에서의 기타 셋팅<br>
>1.pom.xml에 타임리프, 롬복 의존성을 추가해두었습니다.<br>
>2.host에서 mysql comtainer DB 연결 시 test코드로 인한 오류가 발생하여 maven build시 test를 스킵할 수 있도록 <properties> 태그안에 조건을 추가하였습니다.
  
    <maven.test.skip>true</maven.test.skip>
  
 + application.yml에서의 기타 셋팅<br>
  > 1. 서버 포트를 지정하고, encoding을 설정하였습니다.
  
  ```
  server:
  port: 8080
  servlet:
    encoding:
      charset: UTF-8
      enabled: true
      force: true
    session:
      timeout: 1800
  ```
  
  
<br>

## 사용한 패키지<br>
![image](https://user-images.githubusercontent.com/109579667/226475783-c079cbce-ca09-4d9c-8670-9ce6c50cc48b.png) <br>
   >MVC2패턴을 사용하여패키지를 구성하였습니다.<br>
   >config, controller, domain, mapper, service 패키지가 있습니다. 
  
  ![image](https://user-images.githubusercontent.com/109579667/226574337-540e10be-5d21-4be7-9b3c-b10419025ac7.png)<br>
  >test 패키지의 class에는 테스트코드를 작성해두었습니다.<br>

<br>
  
  
  
## 테스트<br>
  
  기초 데이터 상태<br>
  >docker compse up하였을 때 생성되는 mysqldb컨테이너에도 동일한 데이터가 생성됩니다.<br>
  
  |이미지|테이블명|
  |--|--|
  |![image](https://user-images.githubusercontent.com/109579667/226484581-b05cc4ed-e826-4933-8ef7-2f877456418f.png)|상품 테이블|
  |![image](https://user-images.githubusercontent.com/109579667/226557900-31234f8c-c06d-4e86-ac47-db9ff83aa073.png)|구매자 테이블|
  |![image](https://user-images.githubusercontent.com/109579667/226484692-a286da95-8199-409c-9d55-0cb76c3aa9d7.png)|등록업체 테이블|
  |![image](https://user-images.githubusercontent.com/109579667/226484720-002585d6-90ab-4fe4-b8b7-4158184afe11.png)|구매정보 테이블| 
  
  <br>
  
  test코드 실행<br>
  > junit test를 사용하였습니다.
  
  ![image](https://user-images.githubusercontent.com/109579667/226485172-e7b3b336-1992-4341-8175-2ba3eee2b6b8.png)

  <br>
  리스트 조회, 각 테이블마다 insert 정상 실행됩니다.<br>
  
  ![image](https://user-images.githubusercontent.com/109579667/226485492-193290af-3df1-438d-87ea-7d517d796351.png)

  <br>
  테스트 후 테이블 데이터 확인
  
  |전|후|
  |--|--|
  |![image](https://user-images.githubusercontent.com/109579667/226484581-b05cc4ed-e826-4933-8ef7-2f877456418f.png)|![image](https://user-images.githubusercontent.com/109579667/226485843-641059f8-6c24-4c16-9ebd-85f58826e27b.png)|
  |![image](https://user-images.githubusercontent.com/109579667/226557938-c1aa2408-f4e9-44bd-842c-825eacd4ebd5.png)|![image](https://user-images.githubusercontent.com/109579667/226569178-2cbad2b0-31a9-446d-9723-21545ccba668.png)|
  |![image](https://user-images.githubusercontent.com/109579667/226484692-a286da95-8199-409c-9d55-0cb76c3aa9d7.png)|![image](https://user-images.githubusercontent.com/109579667/226486036-d0581234-3832-45fa-ba9a-6c1590a0273f.png)|
  |![image](https://user-images.githubusercontent.com/109579667/226484720-002585d6-90ab-4fe4-b8b7-4158184afe11.png)|![image](https://user-images.githubusercontent.com/109579667/226486069-1da96139-d185-41f8-be4c-2ca53ccce074.png)| 
<br>
<br>
<br>

---
## localhost 접속 시
![image](https://user-images.githubusercontent.com/109579667/226486901-1f135ea1-88e3-4d04-a371-feb483995c61.png)
>간단한 페이지를 제작하였습니다. 각 링크로 접속 시 리스트를 확인할 수 있습니다<br>

![image](https://user-images.githubusercontent.com/109579667/226487023-ce69a92b-2932-4c87-ae02-dad133699e4f.png)
>dataType : JSON 을 클릭하면 json데이터를 받아올 수 있습니다. <br>
![image](https://user-images.githubusercontent.com/109579667/226487157-d36782db-57f2-4fdf-9c68-024bf6bd9c6c.png)
<br>

---

## postman 사용

![image](https://user-images.githubusercontent.com/109579667/226599890-8d4a151c-0e22-41af-bfac-6866e0bf6b28.png)<br>

```
/product/list
/company/list
/customer/list
/buyingInfo/list
```

postman에서 해당 매핑값으로 접근하여 json데이터를 받을 수 있습니다. get방식으로 접근해야합니다.
    
<br>
<br>
<br>


## docker compose up
mysqldb 컨테이너는 정상적으로 생성,실행되지만, web컨테이너와 연결에서 오류가 발생합니다. 해당오류는 제한기간내에 해결하지 못했습니다.
