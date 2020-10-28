# java-5--condition
조건문


10:00-10:05

#1. ! 연산자 쓰는 이유(반전 연산자)

 

<정의>

: 반전 연산자

 

<부연설명>

1. 반대코드를 모를때 원래코드에 !를 붙여주면 반전된다

2. 조건을 모르진 않지만, 짧은걸 써놓고 반전하면 코딩이 짧아진다.

 

<예시>

밥먹고가라 -> 굶지 마라

 

10:05-10:10

#2. if - if else

 

정의,

부연설명,

 

true 하나만 걸리면 if문빠져 나온다. 

예시

 

10:10 10:15

"result = "불합격 " 미리 선언해놓으면 굳이 반복적으로

리턴 값 안써도 된다."

 

if () {

 연달아 계속 쓸 수 있다.

}else{

return이 불합격이 반복되는경우

}

겹겹이 들어갈때는 어느쪽에 포함되는지 헷갈릴때가있다.

종이에 써가면서 찾아갈 수 있다.

 

10:38 10:41

#3 삼항연산자.

조건이 두가지로 갈린다. n개면 못쓴다.

조건이 단 두개일 때만 간단하게 쓰는 용도

예) result = ( avg >= 60) ? "합격" : "불합격"

 

 

 

10:42 10:47

조건에 걸리는 명령의 식이 단 하나일 때 블럭{}은 생략가능

if (avarage > 80) 
result = "합격";
 else 
result = "불합격";
result = "합격";   <-- 두개는 안된다.

 

이런식으로 생략가능.

 

10:45 10:52

//<긴 조건식을 변수로  뺄수 있다>
//트루아니면 폴스를 그순간만쓰고안쓸때 플래그 깃발이라는 표현의 관용어 flag

 

boolean flag = avg>=60 && kor>=40 && eng>=40 && mat >=40;

if (flag) {
result1 = "합격";
}else {
result1 = "합격";
}

 

10:53 10:55

변수로 빼주면. 좋은점

의미있게 변수를 관리하여 추후에 알아보기 편하다.

관리하기도 편하다.

 

boolean is_pass1 = avg>=60 ;
boolean is_pass2 = kor>=40 && eng>=40 && mat >=40;

if (is_pass1 && is_pass2 ) {
result1 = "합격";
}else {
result1 = "합격";
}

 

10:56 12:40

조건 1. 평균 60이상
조건2. 두과목 70이상

 

<정답1>
int kor11 = 90;
int eng11 = 30;
int mat11 = 80;

int tot11 = kor11 + eng11 + mat11;
double avg11 = (double)tot11/3;

String result11 = "";

if (avg11 >= 60) {

     if (kor11 >= 70) {

          if (eng11 >= 70 || mat11 >= 70 ) {
                   result11 = "합격";
          }else {
                    result11 = "불합격";
          }

     }else if(eng11 >= 70 && mat11 >=70 ){

               result11 = "합격";

     }else{
              result11 = "불합격";
     }

}else {
     평균60 안됨.
     result11 = "불합격";

}

 

<정답2>

연산이여러개가 나왔을때 나눠서 먼저 계산할 연산이 있다면 

( ) 괄호를 씌워주자

 
if (avg11 >= 60 &&
(kor11 >= 70 && eng11 >= 70 || 

 kor11 >= 70 && mat11 >= 70 || 

 mat11 >= 70 && eng11 >= 70)) {
result12 = "합격";
}else {
result12 = "불합격";
}

 

//정답3
String result13 = "";
boolean kor_eng_pass = kor11 >= 70 && eng11 >= 70;
boolean kor_mat_pass = kor11 >= 70 && mat11 >= 70;
boolean mat_eng_pass = mat11 >= 70 && eng11 >= 70;

if (avg11 >= 60) {

if (kor_eng_pass) {
result13 = "합격";
}else if (kor_mat_pass) {
result13 = "합격";
}else if (mat_eng_pass) {
result13 = "합격";
}else {
result13 = "불합격";
}

}else {
result13 = "불합격";
}

//정답4
//키운트 변수count = cnt
String result14 = "";

int cnt = 0;

if (kor11>=70 && mat11>=70) {cnt++;}
if (kor11>=70 && eng11>=70) {cnt++;}
if (eng11>=70 && mat11>=70) {cnt++;}

if (avg11>=60 && cnt > 0) {
result14 = "합격"; 
}else {
result14 = "불합격";
}

//정답5
String result15 = "";

int cnt1 = 0;

if (kor11>=70) {cnt1++;}
if (mat11>=70) {cnt1++;}
if (eng11>=70) {cnt1++;}

if (avg11>=60 && cnt1 > 1) {
result15 = "합격"; 
}else {
result15 = "불합격";
}

 

12:40 1:20

<Switch 구문>

 

//Switch 구문(드러운 스위치 구문)
//같거나 큰 부호를 쓸수가 없다.
//같은자료만 사용
//더블안되고 int char long 만사용가능
String result22 = "";
int xxx = (int)avg11;

// switch (변수명)
// 변수의 자료형이 byte short int long 범위 밖에 안된다
// double,float는 안된다.
// break; 용도 : 같다면 멈추고 스위치 밖으로 빠져나간다.
//<시험문제> *break가 없으면 그 구간에 같더라도 다음 케이스로 넘어가는데
switch (xxx) {

case 100 : result22 = "A"; break;
case 99 : result22 = "A"; break;
case 98 : result22 = "A"; break;
case 97 : result22 = "A"; break;
case 96 : result22 = "A"; break;
case 95 : result22 = "A"; break;

}

//숫자를 줄이는 방법
String result23 = "";
int xxx1 = (int)avg11/10;

switch (xxx1) {

case 10 : result23 = "A"; break;
case 9 : result23 = "A"; break;
case 8 : result23 = "B"; break;
case 7 : result23 = "C"; break;
case 6 : result23 = "D"; break;
case 5 : result23 = "E"; break;
case 4 : result23 = "F"; break;
case 3 : result23 = "G"; break;
case 2 : result23 = "H"; break;
case 1 : result23 = "I"; break;

}
//break; 
//break가 없다면 그다음 case 문으로 넘어가는데 case문의 조건을 무시하고
//뚫고 들어가서 다음 break 앞에서 멈추고 그결과값으로 나온다.
//default 는 if문의 else와같고 그 외라고 했으니 0이 아니라면 - 값이 될것이다.

 

 


String result24 = "";
int xxx2 = (int)avg11/10;
//xxx2변수 선언하고 avg11 변수안의 데이터를 정수로 바꾸고 10으로 나눈후 저장하기.
switch (xxx2) {

// 만약에 xxx2 변수안의 데이터가 10이면 : 오른쪽 실행하기
// 실행문 마지막에 break가 없으면 다음 case 조건에 상관없이
// 다음 case 조건의 실행구문을 무조건 실행.

case 10 : result24 = "A"; break;

// 만약에 xxx2변수안의 데이터가 9면 콜론:오른쪽에 실행하기.
// 실행문 마지막에 break가 없으면 다음 case 조건에 상관없이
// 다음 case 조건의 실행구문을 무조건 실행한다.
// 실행문 마지막에 break가 있으면 멈추고 switch 구문을 탈출한다.
case 9 : result24 = "A"; break;
case 8 : result24 = "B"; break;
case 7 : result24 = "C"; break;
case 6 : result24 = "D"; break;
case 5 : 
case 4 : 
case 3 : 
case 2 :
case 1 :
case 0 : result24 = "F"; break;

// 위에 나온 경우가 아닌 모든 경우에는
// default 콜론(:) 오른쪽 실행하기.
default : result24 = "점수 없음"; break;
}

 

14:40

switch 구문의 장점.

화면을 벗어날 정도로 길어져도

switch 구문인지 알수있다. 

case가 앞에 계속 붙기때문에

 


 

 
