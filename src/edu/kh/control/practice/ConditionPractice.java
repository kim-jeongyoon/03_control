package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	
	public void practice1() {
		
		/* 메소드 명 : public void practice1(){}
	    키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		짝수가 아니면 “홀수입니다.“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		[실행 화면 1]
		숫자를 한 개 입력하세요 : 8
		짝수입니다.

		[실행 화면 2]
		숫자를 한 개 입력하세요 : 17
		홀수입니다. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 :  ");
		
		int num = sc.nextInt();
		String result;
		
		if(num > 0 && num % 2 == 0) {
			result = "짝수입니다.";		
		} else if(num > 0 && num % 2 == 1) {
			result = "홀수입니다.";
			} else {
			result = "양수만 입력해주세요.";
			}
		
		System.out.println(result);		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		
		
		
		/*메소드 명 : public void practice2(){}
		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요. */
		
		/*출력예시
		 [실행화면 1] 	[실행화면 2]
		국어점수 : 88 	국어점수 : 88
		수학점수 : 50 	수학점수 : 50
		영어점수 : 40 	영어점수 : 45
		불합격입니다.  	국어 : 88
						수학 : 50
						영어 : 45
						합계 : 183
						평균 : 61.0
						축하합니다, 합격입니다!
		 */
	}





}
