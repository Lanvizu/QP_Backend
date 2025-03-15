# QuestPartner
함께 공부할 스터디 팀원을 모집하는 웹 서비스

![image](https://github.com/StudyHunter/Frontend/assets/77632032/009439b7-d824-47c8-89d5-86e6270322bf)

| | |
|------|---|
|![회고영상4](https://github.com/StudyHunter/Frontend/assets/77632032/f8365451-fc7a-42f1-9a67-6daf16273699)|![회고영상5](https://github.com/StudyHunter/Frontend/assets/77632032/11d0c3d8-e737-4897-b787-18272198c84f)|
|![회고영상2](https://github.com/StudyHunter/Frontend/assets/77632032/e7215a90-242d-4013-9864-35482f4f9aa7)|![회고영상3](https://github.com/StudyHunter/Frontend/assets/77632032/33b3e514-ed8b-4cdc-9ea2-21ec6a4da78a)|

## 사용 기술
#### Backend
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">


Spring Data JPA, QueryDSL, Gradle, JWT, Websocket, STOMP

#### Frontend

<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white"> <img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white">


#### Server
NAVER CLOUD PLATFORM

## 페이지별 기능
### 회원가입
서비스를 이용하기 위해서, 먼저 회원가입이 필요하다. <br> 웹 url에 들어왔을 때 비회원은 먼저 회원가입하도록 설정했다.
![올바른 회원입력](https://github.com/Kim-Gyuri/studying_programming_archive/assets/57389368/d382530a-416c-42eb-97bc-8a30ab9de9f3)

<br><br>

### 로그인
로그인은 아래와 같이 아이디, 비밀번호를 올바르게 입력해야 한다.
![로그인](https://github.com/Kim-Gyuri/studying_programming_archive/assets/57389368/e225718b-3cbc-4dcd-b670-692815de7ef2)

<br><br>

### 메인 페이지
메인 페이지로 들어가면, 모집 중인 스터디방 리스트를 확인할 수 있다. <br>
화면에 회원 프로필, 전체 메뉴, 명언 등등 단순한 디자인으로 구성하였다.
![메인 페이지](https://github.com/Kim-Gyuri/studying_programming_archive/assets/57389368/65d13aa8-b654-4f16-8fa6-f104cc65cc02)

<br><br>

### 방 생성
스터디 방을 개설할 수 있는데, 방제목, 인원 수, 방 태그, 썸네일 등등 설정할 수 있다. <br>
방 태그, 방 썸네일은 주어진 테마 리스트에서 선택하도록 구성했다.
![방 생성](https://github.com/Kim-Gyuri/studying_programming_archive/assets/57389368/53e56466-7cc7-4180-8e86-d872ef477b94)

<br><br>

### 스터디 방
스터디 방 디자인은 참여한 유저의 간단한 프로필과 스터디에 관련된 타이머, 채팅창으로 구성했다. <br>
채팅창을 통해 소통할 수 있고, 스터디 타이머를 통해 코인을 획득할 수 있다. <br>
(획득한 코인을 통해 트리 꾸미기 이벤트를 구성하려고 했는데 이 부분은 시간상 만들지 못했다.)
![스터디 방 내부](https://github.com/Kim-Gyuri/studying_programming_archive/assets/57389368/e0c1623e-8eb7-41da-b412-233ffa6d5eba)

<br><br>

### 스터디 타이머
방장이 타이머를 누르면 스터디가 시작되는데, '스터디 종료' 버튼을 눌러 스터디를 끝낼 수 있다.  <br>
스터디 누적시간에 따라 코인을 얻을 수 있다. <br>
![스터디 종료](https://github.com/Kim-Gyuri/studying_programming_archive/assets/57389368/61ccb59c-818a-41ca-b941-412ff9040493)
    
## 팀원 소개
#### Backend <br>
__김규리__ | 테이블 설계 참여 (ERD 설계, API 문서 작성), 태그로 강의 검색 구현, 채팅 구현, JWT를 이용하여 로그인 구현 <br>
__이준호__ | 네이버 클라우드를 통해 서버 구성, MySQL 구현, putty를 통한 SpringBoot와 MySql, 프론트엔드 연동 <br>
__최호희__ | 스터디 방 생성, 스터디 명언 조회 <br> 
<br>

## 프로젝트 기간
__시작__ | &nbsp; 2024년 1월 8일 <br>
__종료__ | &nbsp; 2024년 2월 28일 (약 2개월)
<br>

## ERD 

![image](https://github.com/user-attachments/assets/d0a328b9-517b-44fd-8095-ed6001642fa5)

![image](https://github.com/user-attachments/assets/17a7d3fc-f4a2-4c3f-ade9-22d41c3f2980)

## 요구사항 정의서
<details>
    <summary>자세히</summary>

![image](https://github.com/StudyHunter/Backend/assets/121706341/a54e4954-e2e0-45f3-9937-3005b27e6944)
![image](https://github.com/StudyHunter/Backend/assets/121706341/11ac71d4-0c99-4cf3-96ab-2c14e3ca2eb2)
![image](https://github.com/StudyHunter/Backend/assets/121706341/dc8d5872-2434-4fc6-80cd-9e716657d072)
![image](https://github.com/StudyHunter/Backend/assets/121706341/64e75a8c-4e45-4c44-ae5c-2846625fa95f)

</details>
<br>

## API 명세서
<details>
    <summary>자세히</summary>

![image](https://github.com/StudyHunter/Backend/assets/121706341/91084e89-68ef-42c7-be01-fa4f4c4d7aa6)
</details>

> API 명세서는 [NOTION](https://www.notion.so/API-12ecc93b83de4c9d87c3f2b8b2e86e19?pvs=4)에서 볼 수 있다.
