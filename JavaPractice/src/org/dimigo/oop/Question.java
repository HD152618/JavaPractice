/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author      : Jaemin Shim
 * @version      : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String[] questions={"가장 좋아하는 가수는?","가장 좋아하는 배우는?","가장 좋아하는 과목은?"};
		String[] answers={"한동근","로버트 다우니 주니어","체육"};
		for(int i=0;i<3;i++){
			System.out.printf("%d.%s\n",i+1,questions[i]);
			String answer=scanner.nextLine();
			if(answer.equals(answers[i])){
				System.out.println("정답입니다!");
			}else
				System.out.println("틀렸습니다!");
		}
		StringBuilder sb=new StringBuilder("<<결과 출력>>\n");
		for(int i=0;i<3;i++){
			sb.append(questions[i]).append(answers[i]).append("입니다.\n");
		}
		System.out.println(sb);
	}

}
