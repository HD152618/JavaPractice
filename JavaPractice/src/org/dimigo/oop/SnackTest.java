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
		toString(snacks);
		System.out.printf("총 구매 금액 : %,d원",calcPrice(snacks));
	}
	public static void toString(Snack[] snacks){
		for(int i = 0;i<3;i++){
			System.out.println("이름 : "+snacks[i].getName());
			System.out.println("제조사 : "+snacks[i].getCompany());
			System.out.printf("가격 : %,d원\n",snacks[i].getPrice());
			System.out.println("개수 : "+snacks[i].getNumber()+"개");
			System.out.println();
		}
	}
	public static int calcPrice(Snack[] snacks){
		int sum=0;
		sum=snacks[0].getPrice()*snacks[0].getNumber()+snacks[1].getPrice()*snacks[1].getNumber()+snacks[2].getPrice()*snacks[2].getNumber();
		return sum;
		
	}

}
