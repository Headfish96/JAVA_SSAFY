/*
 * 접근 제한자에는 총 4가지가 있다.
 * public, protected, default, private
 * 
 * class
 *     - 변수
 *     |
 *     - 메서드
 * 
 * public: 누구나 쓰도록
 * private: 나 혼자 쓰도록
 * protected: 
 * 
 * 클래스를 변수 같은 개념으로 사용할 때는 private, protected 도 쓸 수 있다.
 * 
 * private class BoardUI //에서
 * protected class //에러
 * 
 * 클래스 안에는 4가지 다 가능함
 * 
 * public class BoardUI {
	public // 여기는 4가지 전부 다 가능함 
}
 * 
 * 
 */

package com.ssafy.board.step01;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.media.sound.SoftTuning;

class BoardUI {
	Scanner sc = new Scanner(System.in);
	Board[] list = new Board[2];
	int pos = 0; // 배열의 크기와 입력될 위치
	void start() {
		
		System.out.println("게시판 관리 프로그램 V1");
		outer:
		while (true) {
			
			switch (menu()) {
			case 1:
				list();		
				break;
				
			case 2:
				write();
				break;
				
			case 0:
				quit();
				return;
			}
		}
	}

	private void quit() {
		System.out.println("종료 메뉴 선택");
	}

	private void write() {
		//배열의 크기와 pos 값이 같으면 꽉 찬거고 그때 늘려주면 된다.
		//배열의 크기가 꽉 찬 상태라면 배열의 크기를 늘려주자.
		if (list.length == pos) {
			list = Arrays.copyOf(list, pos*2);
			/*
			//배열의 크기를 두배 늘려주는 작업이 필요함.
			Board[] temp = new Board[pos*2];
			System.arraycopy(list, 0, temp, 0, pos); //srcPos는 list배열에 몇번째부터 옮길려고 하는지
			// 리스트 배열의 0번째부터 temp배열의 0번째까지
			
			for (int i = 0; i < pos; i++) {
				temp[i] = list[i]; //이후 리스트의 주소 값을 새로운 배열을 바라보도록 바꿔야한다.
			}
			*/
			//list = temp;
		}
		System.out.print("글쓴이 : ");
		String writer = sc.nextLine();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board b = new Board(writer, title, content); //객체를 만든 다음에 그 객체 안에 하나씩  넣어주었다.
		b.no = Sequence.nextVal();
		list[pos++] = b;
		
		System.out.println("등록되었습니다.");
		//list[pos]; p++; 와 같다.
		
	}

	private void list() {
		System.out.println("--------------------------------------");
		System.out.println("글번호\t제목\t글쓴이");
		System.out.println("--------------------------------------");
		if (pos == 0) {
			System.out.println("등록된 게시글이 존재하지 않습니다.");
		}
		for (int i = pos - 1; i >= 0; --i) {
			Board b = list[i];
			System.out.println(b.no + "\t" + b.title + "\t" + b.writer);
		}
		System.out.println("--------------------------------------");
		System.out.println("목록 메뉴 선택");
	}
	
	//메뉴메소드는 클래스 안에서 start안에서만 사용한다
	// -> private으로 생성 가능
	private int menu() {
		System.out.println("---------------------------------------");
		System.out.println("1. 목록");
		System.out.println("2. 등록");
		System.out.println("0. 종료");
		System.out.println("---------------------------------------");
		System.out.print("메뉴(번호) : ");
		return Integer.parseInt(sc.nextLine());
	}
}
