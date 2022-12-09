package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	/* for문(~동안에)
	 * 끝이 정해져있는(횟수가 정해져있는) 반복문
	 * 조건에 따라 한번도 수행되지 않을 수 있음
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 *			반복 수행할 코드
	 * }
	 * 
	 * 초기식: for문을 제어하는 용도의 변수 선언
	 * 조건식: for문의 반복여부를 지정하는 식 (다음 반복 진행해?)
	 * 		보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	 * 증감식: 초기식에 사용된 변수를 
	 * 		for문이 끝날 때 마다 증가 또는 감소 시켜 조건식의 결과를 변하게 하는 식 
	 *
	 */
	
	public void ex1() {
		//1~10 출력하기
		//1부터 10까지 1씩 증가하며 출력하면 되겠지
		
		for(int i = 1; i <= 10; i++ ) {
			
			System.out.println("i : " + i);
			
		}
		
	}

	public void ex2() {
		//3에서 7까지 1씩 증가하여 출력
		//3 4 5 6 7
		
		for(int i = 3; i <=7; i++) {
			
			System.out.println(i);
		}
		
	}

	public void ex3() {
		//1부터 입력받은 수 까지 1씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i= 1; i <= input; i++ ) {
			
			System.out.println(i);
		
		}
		
	}
	
	public void ex4() {
		//1.0부터 입력받은 실수 까지 0.5씩 증가하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		double input = sc.nextDouble();
		
		for(double i= 1.0; i <= input; i += 0.5 ) {
			
			System.out.println(i);	
		}
		
	}

	public void ex5() {
		// 영어 알파벳 A부터 Z까지 한줄로 출력
		// char 자료형은? 유니코드 
		
		// 방법1
		for(char i = 'A' ; i <='Z'; i++) { 
			
			System.out.print(i);
			
		}
		
		// 방법2
		/* 
		 * for(int = 'A'; i <= Z; i++){
		 * 	
		 * System.out.print((char)i);
		 * 
		 * }
		 * 
		 */
		
		
	}

	public void ex6() {
		//응용문제!
		//1부터 10까지 모든 정수의 합 구하기
		
		int sum = 0; //반복되어 증가되는 i 값의 합계를 저장할 변수
					// 0으로 시작하는 이유: 아무것도 더하지 않음으로 정확히 결과를 도출 할 수 있기 때문!
				
		for(int i = 1; i <= 10; i++) {
			
			sum += i;  			
		}
		
		System.out.println("합계 : " + sum);
		
	}

	public void ex7() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의배수에 ()를 붙여서 출력 --> 조건식
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11...
		
		for(int i =1; i <= 20; i++) {		
			if(i%5 == 0) {
				System.out.println("(" + i + ")");
			} else {
				System.out.println(i);
			}			
		}
	}

	
	// ********중첩 반복문**********
	
	public void ex8() {
		
		//구구단 모두 출력하기
		
		for(int dan = 2; dan < 10; dan++) { //2단 ~ 9단 까지 차례대로 증가
			
			for(int su = 1; su < 10; su++) { // 각 단에 곱해질 수 1~9까지 차례대로 증가
				
				System.out.printf("%2d X%2d=%2d", dan, su, dan * su); 
				// %2d : 두자리 확보(두자리 수도 있으니까)
			}
			System.out.println();
		}
		
	}
	
	public void ex9() { 
		//구구단 역순출력
		//곱해지는 수는 1~9 순서
		
		for(int dan = 9; dan >= 2; dan--) { //2단 ~ 9단 까지 차례대로 증가
			
			for(int su = 1; su < 10; su++) { // 각 단에 곱해질 수 1~9까지 차례대로 증가
				
				System.out.printf("%2d X%2d=%2d", dan, su, dan * su); 
				// %2d : 두자리 확보(두자리 수도 있으니까)
			}
			System.out.println();
		}
	}

	public void ex10() {
		//12345
		//12345
		//12345
		//12345
		//12345
		
		for(int a=1; a <= 5; a++) { // 5바퀴 반복하는 for문
			for(int b = 1; b <= 5; b++ ) {// 12345 한 줄 출력하는 for문
				System.out.print(b);
			}
			System.out.println();
		}
				
	}

	public void ex11() {
		//54321
		//54321
		//54321
		
		for(int a=1; a <= 3; a++) {
			for(int b = 5; b >= 1; b--) {
				System.out.print(b);
			}
			System.out.println();
		}			
	}
	
	public void ex12() {
		
		//1
		//12
		//123
		//1234
		//===================
		//4321
		//321
		//21
		//1
		
		for(int a = 1; a <= 4; a++){
		
			for(int b = 1; b <= a; b++) {
				System.out.print(b);						
			}
			
			System.out.println();	
	}
		
		System.out.println("=====================");
		
		
		for(int x = 4; x >= 1; x--){
			
			for(int i = x; i >= 1; i--) {  
				System.out.print(i);	
			}
			System.out.println();	
	}	
				}
}
