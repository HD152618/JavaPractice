/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author      : Jaemin Shim
 * @version      : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack[] snacks=null;
		snacks=new Snack[3];
		snacks[0]=new Snack("새우깡","농심",1100,2);
		snacks[1]=new Snack("콘칲","크라운",1200,1);
		snacks[2]=new Snack("허니버터칩","해태",1500,4);
		Snack.toString(snacks);
		System.out.printf("총 구매 금액 : %,d원",Snack.calcPrice(snacks));
	}
	
	
	

}
