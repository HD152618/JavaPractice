/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author      : Jaemin Shim
 * @version      : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      String[] names={"아빠","엄마","나","남동생","나"};
		      FamilyMember[] family={null,null,null,null};
		      for(int i=0;i<4;i++)
		         family[i]=new FamilyMember(names[i]);
		      FamilyMember.printMemberCnt();
		      int[] amounts={10000,5000,2000,1000,1000};
		      for(int i=0;i<4;i++){
		         PiggyBank.putMoney(family[i], amounts[i]);
		      }
		      PiggyBank.printBalance();
		      PiggyBank.putMoney(family[2], amounts[4]);
		      PiggyBank.printBalance();
		   }
	}
