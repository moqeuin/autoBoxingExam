package autoBoxingExam;

import java.util.ArrayList;

public class AutoBoxingExam {

	public static void main(String[] args) {

		// 오토박싱 : 기본형 -> 래퍼 클래스 객체 변환
		// 언박싱 : 래퍼클래스 객체 -> 기본형
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3); // 오토박싱
		int value = list.get(0); // 언박싱
		
		int i  = 30;
		// 오토박싱
		Object obj = i; //(Object)는 생략가능하므로 생략
		Integer itg = i;
		
		int sum = i + itg; // 참조와 기본형 간에 연산가능
		i = (int)itg; // 참조형을 기본형으로 형변환이 가능하다.(int)생략불가능
	}

}
