## Java 스터디 
## 오버로딩 vs 오버라이딩

### 오버로딩(과적)

   1. 파라미터를 제외한 모든게 똑같다.
   2. 과적 즉 계속 짐을 쌓아 올리는 모양과 같이 똑같은 메소드가(파라미터 만 다른) 계속 생성한다.
   3. 대표적인 예시로는 println 구문이 있다.

  <strong> 왜 사용할까? </strong>

   똑같은 기능(메소드)을 파라미터만 다르게 다양하게 사용하고 싶은 니즈가 발생해서
   
### 예시
   
   1. 클래스 & 오버로딩 된 메소드
   <center><img src="https://user-images.githubusercontent.com/52439116/162126904-14d9510a-275a-4721-9673-13df66cea2d3.png" width="800" height="300"></center>
   
   2. 실행
   <center><img src="https://user-images.githubusercontent.com/52439116/162127060-b4666e69-7139-4854-a197-c0eaf8e12f54.png" width="800" height="300"></center>
   
   3. 결과값
   <center><img src="https://user-images.githubusercontent.com/52439116/162127112-8c3b2ade-1621-4f1c-8381-c2047937e2c3.png" width="800" height="200"></center>
   
   
   
   결과로 파라미터만 다른 메소드들을 실행하는데 제약이 없다.


### 오버 라이딩(재정의, 덮어쓰기)

   1. 부모 클래스에서 상속(extends)을 받고 메소드를 재정의 해서 쓰는 과정을 말한다.
   
   <strong> 왜 사용할까? </strong>
   
   부모 클래스의 기능(메소드)를 틀만 빌려쓰고 알맹이는 새롭게 내가 커스텀 하고 싶어서
   틀의 유지는 다른 개발자들과의 약속이기 때문에 그리고 코드의 간결성이 높아지기 때문에 지켜야 되는 규칙이다.

### 예시 
   1. 부모 클래스
   <center><img src="https://user-images.githubusercontent.com/52439116/162132776-8041e914-3783-43c7-a87a-1c004629f963.png" width="800" height="300"></center>
   
   2. 자식 클래스
   <center><img src="https://user-images.githubusercontent.com/52439116/162132811-392b9fac-1d6c-48d5-992d-06588bc13755.png" width="800" height="300"></center>
   
   3. 메인 클래스에서 실행
   <center><img src="https://user-images.githubusercontent.com/52439116/162132838-d824e0f1-c70e-4382-bb65-6ef335f6bed2.png" width="800" height="400"></center>
   
   4. 결과값
   <center><img src="https://user-images.githubusercontent.com/52439116/162132860-0d8631ad-55fa-42e6-a406-1d41fda5ada3.png" width="800" height="300"></center>

   
