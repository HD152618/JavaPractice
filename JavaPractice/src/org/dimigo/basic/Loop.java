/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author      : Jaemin Shim
 * @version      : 1.0
 */
import java.util.Scanner;
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a,attack=100;
		
		String[] cla={"마법사","영주","기사","농민"};
		do{
			int num= new Random().nextInt(3);
		System.out.println("--------------------");
		System.out.println("<<게임 메뉴>>");
		System.out.println("1. 공격력 증가");
		System.out.println("2. 공격력 감소");
		System.out.println("3. 캐릭터 설정");
		System.out.println("9. 종료");
		System.out.println("--------------------");
		a=scanner.nextInt();
		if(a==1){
			attack+=10;
			System.out.println("메뉴입력 => 1");
			System.out.printf("공격력이 증가되었습니다. 현재 공격력: %d\n",attack);
		}else if(a==2){
			attack-=10;
			System.out.println("메뉴입력 => 2");
			System.out.printf("공격력이 감소되었습니다. 현재 공격력: %d",attack);
			System.out.println("--------------------");
		}else if(a==3){
				System.out.println("메뉴입력 =>3");
				switch(num){
				case 0: System.out.printf("%s(으)로 설정되었습니다.\n--------------------",cla[num+1]);
				break;
				case 1: System.out.printf("%s(으)로 설정되었습니다.\n--------------------",cla[num+1]);
				break;
				case 2: System.out.printf("%s(으)로 설정되었습니다.\n--------------------",cla[num+1]);
				break;
				case 3: System.out.printf("%s(으)로 설정되었습니다.\n--------------------",cla[num+1]);
				break;
				default:
				}
		}
		}while(a!=9);
		System.out.println("이제 공부하세요!");
	}

}
