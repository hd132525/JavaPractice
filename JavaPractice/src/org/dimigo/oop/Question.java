/**
 * <pre>
 * org.dimigo.oop
 *   _ Question
 * 
 * About :
 * Date : 2015. 5. 11.
 * </pre>
 *
 * @author	: tamiflus
 * @version : 1.0
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * @author tamiflus
 *
 */
public class Question {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int res = 0;
		
		System.out.println("페북에서 매우 핫한 설명충은?");
		String answer;
		try { answer = s.nextLine(); }
		catch (Exception e) { throw e; }
		if(answer.equals("스피드웨건")){
			System.out.println("정답입니다!");
			res++;
		} else {
			System.out.println("오답입니다ㅠㅠ");
		}
		
		System.out.println("디미고 공식 로동자는?");
		try { answer = s.nextLine(); }
		catch (Exception e) { throw e; }
		if(answer.equals("양상현")){
			System.out.println("정답입니다!");
			res++;
		} else {
			System.out.println("오답입니다ㅠㅠ");
		}
		
		System.out.println("슈퍼스타K에서 유승우가 부른 석봉아의 원곡가수는?");
		try { answer = s.nextLine(); }
		catch (Exception e) { throw e; }
		if(answer.equals("불나방스타소세지클럽")){
			System.out.println("정답입니다!");
			res++;
		} else {
			System.out.println("오답입니다ㅠㅠ");
		}
		
		s.close();
		System.out.println("정답" + res +"/3");
	}
}
