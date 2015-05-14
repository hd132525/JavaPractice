/**
 * <pre>
 * org.dimigo.oop
 *   _ Score
 * 
 * About :
 * Date : 2015. 5. 14.
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
public class Score {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int kor, eng, math;
		System.out.print("국어 점수 입력 => ");
		kor = s.nextInt();
		System.out.print("수학 점수 입력 => ");
		math = s.nextInt();
		System.out.print("영어 점수 입력 => ");
		eng = s.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)(sum) / 3d;
		
		StringBuilder sb = new StringBuilder();
		sb.append("<< 점수 출력>>\n")
		.append("국어 점수 : ")
		.append(kor)
		.append("점\n")
		.append("수학 점수 : ")
		.append(math)
		.append("점\n")
		.append("영어 점수 : ")
		.append(eng)
		.append("점\n")
		.append("총점 : ")
		.append(sum)
		.append("점\n")
		.append("평균 : ")
		.append(String.format("%.1f", avg))
		.append("점\n");
		
		System.out.println(sb.toString());
		s.close();
	}
}
