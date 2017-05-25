/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ DBTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author      : Jaemin Shim
 * @version      : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IDBManager[] dbs={
				IDBManager.getDBObjecct(IDBManager.ORACLE_DATABASE),IDBManager.getDBObjecct(IDBManager.SYBASE_DATABASE)
		};
		System.out.println("<<변경 전>>");
		crud(dbs[1]);
		System.out.println();
		System.out.println("<<변경 후>>");
		crud(dbs[0]);
	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
