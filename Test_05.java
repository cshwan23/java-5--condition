


	package com.daum.erp;

	public class Test_05 {
 
		public static void main(String[] args) {
	
//# 중요 #ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
			//국어점수 95, 영어점수 88, 수학 77
			int kor = 90;
			int eng = 84;
			int mat = 90;
			
			//총점
			int tot = kor + eng + mat;
			
			//평균***************시팔.. 자바..
			double avg = (double)tot/3;
			// cast 연산자.
			// 왜 double로 타입 캐스팅을 해야하는가!?
			//
			
			System.out.println(avg);
//# 중요 #ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			
			String hakjum = ""; 
			//(""길이가 없는 문자 데이터.)(" "공백도 데이터다.)
			//나중에 갱신하자는 의미
					
				if (avg >= 90 && avg <= 100 ) {					
					hakjum = "a";					
				}

				else if (80 <= avg && avg < 90 ) {    	
					hakjum = "b";    	
				}
	
				else if (70 <= avg && avg < 80 ) {    	
					hakjum = "c";    	
				}

				else if (60 <= avg && avg < 70 ) {	
					hakjum = "d";	
				}  
				else if (0 <= avg && avg < 60 ) {	
					hakjum = "f";	
				} else {
					hakjum = "학점 정보 없음";
				}
        
				System.out.println(hakjum);	
				//초기화 안됐는데 왜
				//프로그램 입장에서 100 넘어가면 조건문에 속해지지 않는데
				//데이터가 없는데 그걸 찍으라고?
				//지역변수는 일단 아무런 값이라도 집어넣고 시작해라. 
				//그래야 뒤탈이 없다.
				
				//조건문에 무조건 걸리게 하면 
				//조건이 겹치면 if/else if의 순서를 조심해야한다.
				
				
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				
				
				if (avg >= 90 && avg <= 100 ) {					
					hakjum = "a";					
				}

				else if (60 <= avg ) {	
					hakjum = "d";	
				}
				
				else if (80 <= avg) {    	
					hakjum = "b";    	
				}
	
				else if (70 <= avg ) {    	
					hakjum = "c";    	
				}

  
				else if (0 <= avg && avg < 60 ) {	
					hakjum = "f";	
				} else {
					hakjum = "학점 정보 없음";
				}
        
				System.out.println(hakjum);	
	
/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		평균이 80이 넘으면 "합격"을 출력하고
		평균이 80 미만이면 "불합격"을 출력하세요					
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
				
				
			int sbj1 = 80;
			int sbj2 = 91;
			int sbj3 = 90;
			int sbj4 = 95;
			int sbj5 = 90;
			
			int total = sbj1 + sbj2 + sbj3 + sbj4 + sbj5;
			double avarage = (double)total/5;
			
			
			String result = "";
			
			if (avarage > 80) 
					result = "합격";
			 else 
					result = "불합격";
			
			//조건에 걸리는 명령의 식이 단 하나일 때 블럭{}은 생략가능

			//합격불합격 변수 하나 만들자.
			//추후에 또 사용할 수 있기 때문에 
			// result라는 변수를 하나 만들어서 집어 넣자			
			
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			//삼항연산자
			result = ( avarage > 80) ? "합격" : "불합격";
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			
			System.out.println(result);	
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 아래 조건을 만족하면 "합격" 만족하지못하면 "불합격"
	// 조건은 평균 60이상, 각 과목이 40이상 
	// 국영수
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			
			int kor1 = 10;
			int mat1 = 95;
			int eng1 = 80;
			
			int tot1 = kor1 + mat1 + eng1;
			
			double avg1 = (double)tot1/3;
			
			String result1 = "";
			
			//과락 변수 만들기.
			
//			if (avg1 < 60 || mat1 < 40 || eng1 < 40 || kor1 < 40) {
//	
//				result1 = "불합격";
//	
//			}else {
//				result1 = "합격";
//			}
//
			if(avg1 < 60) {
				
				result1 = "불합격";
				
			}else if (kor1 < 40){
				
				result1 = "불합격";
				
			}else if (mat1 < 40) {
				
				result1 = "불합격";
				
			}else if (eng1 < 40) {
				
				result1 = "불합격";
				
			}else {
				
				result1 = "합격";
				
			}
			
			
			if (avg1<60) {
				result1 = "불합격";
			}else if (kor1<40) {
				result1 = "불합격";
			}else if (mat1<40) {
				result1 = "불합격";
			}else if (eng1<40) {
				result1 = "불합격";
			}else {
				result1 = "합격";
			}
			
			result = (avg1 >= 60) ? "합격":"불합격";
			
			
			//<정답>
			//트루아니면 폴스를 그순간만쓰고안쓸때 플래그 깃발이라는 표현의 관용어 flag
			boolean flag = avg>=60 && kor>=40 && eng>=40 && mat >=40;
			
			if (flag) {
				result1 = "합격";
			}else {
				result1 = "합격";
			}
			
			//변수로 빼주면. 좋은점
			boolean is_pass1 = avg>=60 ;
			boolean is_pass2 = kor>=40 && eng>=40 && mat >=40;
			
			if (is_pass1 && is_pass2 ) {
				result1 = "합격";
			}else {
				result1 = "합격";
			}
			
			
			System.out.println("국어 점수 = " + kor1);
			System.out.println("수학 점수 = " + mat1);
			System.out.println("영어 점수 = " + eng1);
			System.out.println("과목 평균 = " + avg1);
			System.out.println("시험 결과 = " + result1);
			
			
//조건 1. 평균 60이상
//조건2. 두과목 70이상
			
			int kor11 = 90;
			int eng11 = 30;
			int mat11 = 40;
			
			int tot11 = kor11 + eng11 + mat11;
			double avg11 = (double)tot11/3;
			
			String result11 = "";
			String result12 = "";
			
//정답1.
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

				result11 = "불합격";
				
			}
//정답2.
//연산이여러개가 나왔을때 나눠서 먼저 계산할 연산이 있다면 ( ) 괄호를 씌워주자 
			if (avg11 >= 60 &&
			(kor11 >= 70 && eng11 >= 70 || kor11 >= 70 && mat11 >= 70 || mat11 >= 70 && eng11 >= 70)) {
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
			
			int count = 0;
			
			if (kor11>=70 && mat11>=70) {count++;}
			if (kor11>=70 && eng11>=70) {count++;}
			if (eng11>=70 && mat11>=70) {count++;}
			
			if (avg11>=60 && count > 0) {
				result14 = "합격"; 
			}else {
				result14 = "불합격";
			}
			
//정답5
			String result15 = "";
			
			int cnt1 = 0;
			//cnt1 변수 안의 데이터 0을 입력하기
			if (kor11>=70) {cnt1++;}
			// 만약에 kor11이 70 미만이면 cnt 변수 안의 데이터 1 증가하기
			if (mat11>=70) {cnt1++;}
			// 만약에 mat11이 70 미만이면 cnt 변수 안의 데이터 1 증가하기
			if (eng11>=70) {cnt1++;}
			// 만약에 eng11이 70 미만이면 cnt 변수 안의 데이터 1 증가하기
			
			if (avg11>=60 && cnt1 > 1) {
			// 만약에 avg11 가 60 이상이고, cnt 변수 안의 데이터가  1이상이면
			// result15에 "합격" 입력하기

				result15 = "합격"; 
			}else {
				
			// 그외 경우에는 result15에 "불합격"저장하기
			
				result15 = "불합격";
				
			}

//Switch 구문(드러운 스위치 구문)
//같거나 큰 부호를 쓸수가 없다.
//같은자료만 사용
//더블안되고 int char long 만사용가능
			String result22 = "";
			int xxx = (int)avg11;
			
//			switch (변수명)
//			변수의 자료형이 byte short int long 범위 밖에 안된다
//			double,float는 안된다.
//			break; 용도 : 같다면 멈추고 스위치 밖으로 빠져나간다.
//<시험문제>	*break가 없으면 그 구간에 같더라도 다음 케이스로 넘어가는데
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
			// xxx2변수 선언하고 avg11 변수안의 데이터를 정수로 바꾸고 10으로 나눈후 저장하기.
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
//			switch 구문의 장점.
//
//			화면을 벗어날 정도로 길어져도
//
//			switch 구문인지 알수있다. 
//
//			case가 앞에 계속 붙기때문에	

			System.out.println("3과목 평균 = " + avg11);
			System.out.println("11시험 결과 = " + result11);
			System.out.println("12시험 결과 = " + result12);
			System.out.println("13시험 결과 = " + result13);
			System.out.println("14시험 결과 = " + result14);
			System.out.println("15시험 결과 = " + result15);
			System.out.println("switch1 결과 = " + xxx);
			System.out.println("switch2 결과 = " + result23);
			System.out.println("switch2 결과 = " + result24);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	

}
