package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		for(int i =1; i <= num; i++ ) {
			
			System.out.print(i + " ");	
			
		}
		
		if(num <= 0) {
			
			System.out.println(" 1 이상의 숫자를 입력해주세요.");
	
		}
		
	}		

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			
			System.out.print(i + " ");			
			
		}
		
	if(num <= 0) {
			
			System.out.println(" 1 이상의 숫자를 입력해주세요.");
	
		}
		
		
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			
			sum += i;
			
		}
		
		System.out.printf("1부터 %d까지 정수들의 합은 %d입니다",num,sum);
		
	}

	public void practice4() {
		
		/* 메소드 명 : public void practice4(){}
         *사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
         *만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 >0) {

			if(num1 < num2) {
			
				for(int i = num1; i <= num2; i++ ) {	
					System.out.print(i + " ");			
				}
			} else if(num1 > num2) {
				for(int i = num2; i <= num1; i++ ) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}

	public void practice5() {
		
		/*메소드 명 : public void practice5(){}
		 *사용자로부터 입력 받은 숫자의 단을 출력하세요. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int mul = 0;
		
		System.out.printf("========%d 단 ========\n", num);
		
		for(int i =1; i <= 9; i++) {
			mul = num * i;
			System.out.printf("%d * %d = %d\n", num, i, mul);
		}
		
	}
	
	public void practice6() {
		
		/*메소드 명 : public void practice6(){}
		 *사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 *단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요. 
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		int mul = 0;
		
		if(num >= 2 && num <= 9) {
			
			for(int dan = num; dan <= 9; dan++) {
				
				System.out.printf("========%d 단 ========\n" ,dan);
				
				for(int su = 1; su <= 9; su++) {
					
					mul = dan * su;
					System.out.printf("%d * %d = %d \n", dan, su, mul);
				}	
			}			
		} else {
			System.out.println("2~9 사이 숫자 입력하세요.");
		}
		
				
	}

	public void practice7() {
		
		/*메소드 명 : public void practice7(){}
		 *다음과 같은 실행 예제를 구현하세요. 
		 *ex.	정수 입력 : 4
		 		*
		 		**
		 		***
		 		****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		
		for(int a = 1; a <= num; a++) {
			
			for(int b = 1; b <= a; b++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
	}

	public void practice8() {
		/*메소드 명 : public void practice8(){}
         *다음과 같은 실행 예제를 구현하세요.
         * 
         * ex.
				정수 입력 : 4
		 		****
		 		***
		 		**
		 		*
		 */
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		
		for(int a = num; a >= 1; a--) {
			
			for(int b = 1; b <= a; b++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

	public void practice9() {
		/*메소드 명 : public void practice9(){}
		 *다음과 같은 실행 예제를 구현하세요.

			ex.
				정수 입력 : 4
		 		    *
		 		   **
		 		  ***
		 		 ****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
	
		for(int a = num; a >= 1; a--) {
			for(int b = 1; b < a; b++ ) {
				
				System.out.print(" ");
			}
			for(int c = a; c <= num; c++) {
			System.out.print("*");
			}
			System.out.println();
		} 
	}

	public void practice10() {
		
		/*메소드 명 : public void practice10(){}
		 *다음과 같은 실행 예제를 구현하세요.

			ex.
				정수 입력 : 3
		 		*
		 		**
		 		***
		 		**
		 		*
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
	
		for(int a = 1; a <= num; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
		for(int a = 1; a <=num; a++) {
			for(int b = num; b > a; b--) {
				System.out.print("*");
			}
			System.out.println();
		} 
	
	}
	
	public void practice11() {
		
		/*메소드 명 : public void practice11(){}
			다음과 같은 실행 예제를 구현하세요.

			ex.
				정수 입력 : 4
		 		 *
		 		***
		 	   *****
              *******  -> input *2 -1
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
						// 1) 1 <= 4
		for(int row = 1 ; row <= input ; row++ ) {
	
			// if문을 이용한 풀이   1 <= 4 * 2 - 1;
			for(int col = 1 ; col <= input * 2 - 1; col++) {
				// 마지막 줄의 별 갯수: input에 2를 곱한값의 -1
				//		row	  col ||      row  col
				//1)  4 - 1 >= 1  ||  4 + 1 <= 1  true
				//2)  4 - 1 >= 2  ||  4 + 1 <= 2  true
				//3)  4 - 1 >= 3  ||  4 + 1 <= 3  true
				//4)  4 - 1 >= 4  ||  4 + 1 <= 4  false
				if( input-row>=col || input+row<=col) {
					System.out.print(" ");
					
				}else{
					System.out.print("*");
				}
			}
			
			System.out.println(); // 줄바꿈
		}
		
	
		
		
	}

	public void practice12() {
		/*메소드 명 : public void practice12(){}
		 *다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 5
		 	*****
		 	*   *
		 	*   *
		 	*   *
		 	*****
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		for(int row =1; row <= input; row++) {
			for(int col = 1; col <= input; col++) {
				
				if(row ==1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	
	public void practice13() {
		
		/*메소드 명 : public void practice13(){}
		*1부터 사용자에게 입력 받은 수까지 중에서
		*1) 2와 3의 배수를 모두 출력하고  --> 2나 3으로 나누었을때 나머지 0
		*2) 2와 3의 공배수의 개수를 출력하세요. --> 6의 배수
		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
			모두 나머지가 0이 나오는 수

			ex.
				자연수 하나를 입력하세요 : 15
				2 3 4 6 8 9 10 12 14 15
				count : 2
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				if(i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		
		System.out.println("\ncount : " + count);
	
	}
}

