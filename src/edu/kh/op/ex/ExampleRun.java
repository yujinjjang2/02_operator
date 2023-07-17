package edu.kh.op.ex;

public class ExampleRun { // 코드 실행용 클래스

	// 메인메서드 필수 작성
	public static void main(String[] args) {
		
		// OpExample 생성
		//Scanner의 경우 다른 패키지에 있기 때문에 import를 해야함
		//Scanner sc = new Scanner(System.in);
		
		OpExample ex = new OpExample();
		// 같은 패키지 (edu.kh.op.ex) 안에 있는 클래스는
		// import를 하지 않아도 불러다 쓸 수 있다 (에러 X)
		
		ex.ex1(); // ex가 가지고 있는 ex1() 메서드 실행
		
		// 파일 저장 후 ctrl + f11 실행시 하단문구 수행
		// OpExample 클래스에 ex1() 기능 수행
		// 클래스 분리 테스트
		// println 자동완성도 배웠어요~
		// ctrl + 마우스 커서 올리기 : 추적연습 많이 하기
		
		
		
		
	}

}
