//		String result = ""; // 변수 이름을 그대로 사용하고 싶은 경우
							// 변수의 사용되는 영역을 지정해주면 된다.
							// 중괄호 {} 사용하면 된다.

package com.ssafy.startcamp;

public class Test2_switch {
	public static void main(String[] args){
		/*
		 * 수식 자리에 올 수 있는 것들
		 * 1.4 버전까지 : int로 자동 형변환 되는 것들(byte, short, char, int)
		 * 1.5 버전 추가 : enum
		 * 1.7 버전 추가: String을 switch문에 사용할 수 있다.
		 * 버전별로 특징을 숙지해야 기업에 취업 후 그에 맞게 일을 할 수 있다.
		 * 
		 * 
		 * switch(수식) {
		 * 
		 * 	case 값:
		 * 		처리할일;
		 * 		break;(선택)
		 * 	case 값:
		 * 		처리할일;
		 * 		break;(선택)
		 * 	....
		 * 
		 * 	default:
		 * 		처리할일;
		 * }
		 */
		
		{
			System.out.println("1.4확인");
			int num = 3;
			int result = 0;
			switch (num) {
			// 줄 복사 방법: ctrl + alt + 아래방향키
			case 1:
				System.out.println("case 1");
				result += 1;
			case 2:
				System.out.println("case 2");
				result += 2;
				break;
			default: 
				System.out.println("defalut");
				result += -1;
			case 3:
				System.out.println("case 3");
				result += 3;
				//default는 항상 마지막에 가져다 놓을 것
			}
			System.out.println(result); // num이 4인 경우 -1 출력 
										// num이 1인경우 5출력(break가 없는 경우)
		}
		{
			String result = "";
			System.out.println("1.7 String 확인");
			final String SEASON = "summer";
			switch (SEASON) { //1.7부터 문자열 입력 가능
			case "spring":
				result = "새싹이 나오기 시작";
			case "summer":
				result = "2010년 이후로 사람들이 가장 싫어하는 계절";
				break;
			case "fall":
				result = "단풍이 지는 계절";
			case "winter":
				result = "방전이 잘되는 계절";
				//default는 항상 마지막에 가져다 놓을 것
			default:
				result = "잘못된 입력";
			}
			System.out.println(result);
		}
		{
			String result = "";
			System.out.println("1.5 enum 확인");
			Season season = Season.SUMMER;
			// 위에 문장은 클래스 이름으로 직접 접근했는데 이는 static밖에 안된다
			// 디폴트로 static 키워드가 붙어있다 여기에는
			switch (season) { //1.7부터 문자열 입력 가능
			case SPRING:
				result = "새싹이 나오기 시작";
				break;
			case SUMMER:
				result = "2010년 이후로 사람들이 가장 싫어하는 계절";
				break;
			case FALL:
				result = "단풍이 지는 계절";
				break;
			case WINTER:
				result = "방전이 잘되는 계절";
				break;
				//default는 항상 마지막에 가져다 놓을 것
			default:
				result = "잘못된 입력";
			}
			System.out.println(result);
		}

	}
	//enum을 사용하기 위한 정의
	enum Season {
		SPRING, SUMMER, FALL, WINTER //enum은 상수형태로 쓰기에 대문자가 표준 사용임
	}
}
