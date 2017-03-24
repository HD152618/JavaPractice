/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author      : Jaemin Shim
 * @version      : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car=new Car();
		System.out.println("<<자동차 목록>>");
		car.setCompany("현대자동차");
		car.setModel("제네시스");
		car.setColor("검정색");
		car.setMaxSpeed(225);
		car.setPrice(50000000);
		System.out.println("제조사명: "+car.getCompany());
		System.out.println("모델명: "+car.getModel());
		System.out.println("색상: "+car.getColor());
		System.out.println("최대속도: "+car.getMaxSpeed()+"km");
		System.out.printf("가격: %,d원\n\n",car.getPrice());
		car.setCompany("기아자동차");
		car.setModel("K7");
		car.setColor("흰색");
		car.setMaxSpeed(246);
		car.setPrice(40000000);
		System.out.println("제조사명: "+car.getCompany());
		System.out.println("모델명: "+car.getModel());
		System.out.println("색상: "+car.getColor());
		System.out.println("최대속도: "+car.getMaxSpeed()+"km");
		System.out.printf("가격: %,d원\n\n",car.getPrice());
		car.setCompany("삼성자동차");
		car.setModel("SM7");
		car.setColor("회색");
		car.setMaxSpeed(200);
		car.setPrice(38000000);
		System.out.println("제조사명: "+car.getCompany());
		System.out.println("모델명: "+car.getModel());
		System.out.println("색상: "+car.getColor());
		System.out.println("최대속도: "+car.getMaxSpeed()+"km");
		System.out.printf("가격: %,d원\n\n",car.getPrice());
	
	}

}
