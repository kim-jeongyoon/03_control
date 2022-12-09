package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	
	/* while 반복문
	 * 별도의 초기, 증감식이 존재하지 않고 반복 종료 조건을 자유롭게 설정하는 반목문
	 * 
	 * 확실히 언제 반복이 끝날지는 모르지만 언젠가 조건식이 false가 나와 끝나도록 해라
	 * 
	 * [작성법]
	 * while( 조건식 ){
	 * 
	 * 		조건식이 true일 동안 반복 수행될 구문
	 * 		[증감식 or 분기문]
	 * }
	 */

	public void ex1() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		while(input !=9) { //사용자가 9를 누르기 전까지는 계속 반복! 
			
			System.out.println("==========키오스크==========");
			System.out.println("==========메뉴선택==========");
			System.out.println("1. 짜장면 ");
			System.out.println("2. 짬뽕 ");
			System.out.println("3. 탕수육 ");
			System.out.println("9. 종료");
			
			System.out.println("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(" 짜장면 주문 완료! "); break;
			case 2 : System.out.println(" 짬뽕 주문 완료! "); break;
			case 3 : System.out.println(" 탕수육 주문 완료! "); break;
			case 9 : System.out.println(" 키오스크를 종료합니다."); break;
			default : System.out.println("잘못입력했습니다."); 
			}
			
		}
	}

	public void ex2() {
		//입력되는 모든 정수의 합 구하기
		//단, 0이 입력되면 반복 종료 후 결과 출력 --> 0이 입력되지 않으면 계속 반복
		
		Scanner sc = new Scanner(System.in);
		int input = 1;
		int sum = 0;
		
		while(input !=0) { 
			
			System.out.print("숫자를 입력하시오: ");
			input = sc.nextInt();
		
			sum += input;
					
			}
		System.out.println("합계 : " + sum);
	}	
	
	public void ex3() {
		// 1부터 입력한 값의 합
		// 단, 0을 초과한 숫자 입력
		// => 0이하의 숫자를 입력할 시 "1이상의 숫자를 입력해주세요" 문구 출력
		// ex) 입력값: 5
		// => 1 + 2 + 3 + 4 + 5 = 출력해야하는 값
		// ex) 입력값: 10
		// => 1 + 2 + 3 .......+ 10 = 출력해야하는 값 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오: ");
		int input = sc.nextInt();
		int sum = 0;
		
		if(input > 0) {
			
			int i = 1;
			
			while(i <= input) {
				sum += i;
				i++;
			}	
			System.out.println("1부터" + input + "까지의 합은" + sum + "입니다.");
			}else {
				System.out.println("1이상의 숫자를 입력하세요.");	
			}
	}

	public void ex4() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		
		//do ~ while 문
		//최소 한번은 수행하는 반복문
		
		do {
			
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			sum += input;
			
		} while(input != 0);{
			
			System.out.println("합계 : " + sum);
		}
	}
}
		
		
