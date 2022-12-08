package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	

	public void ex1() {
		
		//if문
		//조건식이 true 일 때만 내부 코드 수행
		/* 작성법
		 
		 if(조건식){
		 	조건식이 true일 때 수행될 코드
		 		 } 
		 */
		
		//if-else문
		//조건식 결과가 true면 if문, false면 else 수행
		/*작성법
		 *if(조건식) { 
		 	조건식이 true일 때 수행코드
		 }
		 else{
		 	조건식이 false일 때 수행코드
		 }
		 */
		
		Scanner sc = new Scanner(System.in); // import java.util.Scanner; 작성해야 에러안남
		
		System.out.print("정수 입력: " );
		int input = sc.nextInt();
		
		//입력된 정수가 양수인지 검사
		if(input > 0) {
			
			System.out.println("양수입니다.");
			
		} else { 
			System.out.println("양수가 아닙니다.");
			
		}
		
		/*if(input <= 0) { 
			System.out.println("양수 아닙니다."); 
			
		}*/
		
	
	}
	
	public void ex2() {
		
		//홀짝검사
		//입력받은 값이 홀인지 짝인지 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: " );
		int input = sc.nextInt();
		
		if(input % 2 == 0) {
			System.out.println("짝수입니다.");
					}
		else {
			
			System.out.println("홀수입니다.");	
					}
	}

	public void ex3() {
		// month를 입력받아 해당 계절 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 달을 받음
		System.out.print("Month 입력: ");
		int month = sc.nextInt();
		
		// 사용자에게 온도를 받음
		System.out.println("온도 입력: ");
		int temperature = sc.nextInt(); 
		
		String season; // 선언만, 초기화X
		
		//봄: 3,4,5
		//여름: 6,7,8
		//가을: 9,10,11
		//겨울: 12,1,2

		if(month == 3 || month == 4 || month == 5) {
				season = "봄";
			} else if(month >= 6 && month <= 8) {
				season = "여름";
				
				if(temperature >= 35) {
					season += "폭염경보";
				} else if(temperature >= 33) {
					season += "폭염 주의보";
					}
				} else if(month>=9 && month <= 11) {
				season = "가을";
				} else if(month == 12 || month == 1 || month ==2) {
				season = "겨울";
			} else {
				season = "해당하는 계절이 없습니다.";
			}
		System.out.println(season);		
			}

	public void ex4() {
		//나이를 입력 받아
		//13세 이하면 "어린이 입니다."
		//13세 초과 19세 이하면 "청소년 입니다."
		//19세 초과하면 "성인입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		String person;
		
		if(age <= 13) { 
			
			person = "어린이 입니다.";
			
		} else if(age >19) {
			
			person = "성인 입니다.";			
			
		} else {
			
			person = "청소년 입니다.";
		}
		
		System.out.println(person);		
	}

	public void ex5() {
		//점수(100점 만점)을 입력 받아 
		//90점 이상: A
		//80점 이상 90점 미만: B
		//70점 이상 80점 미만: C
		//60점 이상 70점 미만: D
		//60점 미만: F
		//0점 미만, 100점 초과 : 잘못 입력하였습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		double score = sc.nextDouble();
		String result;
		
		/* 내코드 if(score >= 90 && score <=100) {
			result = "A";
		} else if(score >= 80 && score < 90) {
			result = "B";
		} else if(score >= 70 && score < 80) {
			result = "C";
		} else if(score >= 60 && score < 70) {
			result = "D";	
		} else if(score >= 0 && score < 60 ) {
			result = "F";
		} else {
			result = "잘못 입력하였습니다.";
		}
		
		System.out.println(result); */
		
		if(score < 0 || score >100) {
			result ="잘못 입력";
		} else if(score >= 90) {
			result = "A";
		} else if(score >= 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else if(score >= 70) {
			result = "D";
		} else {
			result = "F";
		}
		
		System.out.println(result);
	}

	public void ex6() {
		
		//놀이기구 탑승 제한 검사 프로그램
		//조건: 나이 12세 이상
		//     키 140.0cm 이상
		
		//나이를 0~100세 사이로 입력하지 않은 경우: 나이를 잘못 입력 하였습니다.
		//키를 0~250.0cm 사이로 입력하지 않은 경우: 키를 잘못 입력 하였습니다.
		//--> 입력이 되자마자 검사를 진행하여 잘못된 경우 프로그램 종료
		
		//나이O, 키X : 나이는 적절하나, 키가 적절하지 않습니다. 
		//나이X, 키O : 키는 적절하나, 나이가 적절하지 않습니다. 
		//나이X, 키X : 나이와 키 모두 적절하지 않습니다.
		//나이O, 키O : 탑승 가능합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		String result; // 결과 담을 변수 선언, 초기화X
		
		if(age < 0 || age > 100) { 
			result = "나이 잘못 입력했어요.";
		} else {
			
			System.out.print("키 입력: ");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250) {
				result = "키 잘못 입력";
			} else {
				if(age < 12 && height >= 140.0) {//나이X, 키O
					result = "키는 적절하나, 나이는 적절하지 않음";
				} else if(age >= 12 && height <= 140.0) { //나이O,키X 
					result = "나이는 적절하나, 키가 적절하지 않음";
				} else if(age < 12 && height < 140.0) {//나이X 키X
					result = "나이와 키 모두 적절하지 않음";					
				} else { 
					result = "탑승 가능합니다.";
				}
				
			}
			
		}
	
		System.out.println(result);
			
	}
}
