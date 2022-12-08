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
}
