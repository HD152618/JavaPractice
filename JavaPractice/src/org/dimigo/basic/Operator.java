/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author      : Jaemin Shim
 * @version      : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long money=1700000;
		int number=3;
		int gae=1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %,d원\n",money);
		System.out.printf("점포 내 직원 수 : %d명\n",number);
		System.out.printf("점포 수 : %,d개\n\n\n",gae);
		System.out.printf("연간 인건비 : %,d원",money*12*number*gae);
		
	}
}
