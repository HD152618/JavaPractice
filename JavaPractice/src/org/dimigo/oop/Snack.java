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
		public int calcPrice(){
			return price*number;
			
		}
		public String toString(){
			return "이름 : "+name+"\n"+
			    "제조사 : "+company+"\n"+
		            "가격 : "+String.format("%,d",price)+"원\n"+
		            "개수 : "+String.format("%,d",number)+"개\n";

			}
		}
