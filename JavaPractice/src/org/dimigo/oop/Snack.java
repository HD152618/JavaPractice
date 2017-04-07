/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Snack
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author      : Jaemin Shim
 * @version      : 1.0
 */
public class Snack {
		private String name;
		private String company;
		private int price;
		private int number;
		public Snack(){
			
		}
		
		public Snack(String name, String company, int price, int number){
			this.name=name;
			this.company=company;
			this.price=price;
			this.number=number;
		}
		public String getName(){
			return name;
		}
		public String getCompany(){
			return company;
		}
		public int getPrice(){
			return price;
		}
		public int getNumber(){
			return number;
		}
		public void setName(String newName){
			name=newName;
		}
		public void setCompany(String newCompany){
			company=newCompany;
		}
		public void setPrice(int newPrice){
			price=newPrice;
		}
		public void setNumber(int newNumber){
			number=newNumber;
		}
		public static int calcPrice(Snack[] snacks){
			int sum=0;
			sum=snacks[0].getPrice()*snacks[0].getNumber()+snacks[1].getPrice()*snacks[1].getNumber()+snacks[2].getPrice()*snacks[2].getNumber();
			return sum;
			
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
}
