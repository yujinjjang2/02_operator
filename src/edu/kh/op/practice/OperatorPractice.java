package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		int result1 = candy / people;
		int result2 = candy % people;
		
		System.out.printf("1인당 사탕 개수 : %d\n", result1);
		System.out.printf("남는 사탕 개수 : %d\n", result2);
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int group = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, group, number, name, gender, score);
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math; // 합계
		double avg = sum / 3; // 평균
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
		// 아니라면 불합격을 출력하세요.
		
		boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		
		System.out.println(result ? "합격" : "불합격");
	}

}
