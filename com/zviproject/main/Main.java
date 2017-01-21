package com.zviproject.main;

import com.zviproject.patterns.Singleton;
import com.zviproject.patterns.SingletonDoubleChecked;
import com.zviproject.patterns.SingletonLazyInit;

public class Main {
	public static void main(String[] args) {

		/**
		 * Realization singleton
		 */
		Singleton singleton = null;

		Singleton object01 = singleton.getInstance();
		Singleton object02 = singleton.getInstance();

		System.out.println("Object 01 " + object01);
		System.out.println("Object 02 " + object02);

		/**
		 * Realization singleton lazy initalization
		 */
		SingletonLazyInit singletonLazyInit = null;

		SingletonLazyInit object03 = singletonLazyInit.getInstance();
		SingletonLazyInit object04 = singletonLazyInit.getInstance();

		System.out.println("Object 03 " + object03);
		System.out.println("Object 04 " + object04);

		/**
		 * Realization singleton double-checked locking
		 */
		SingletonDoubleChecked singletonDC = null;

		SingletonDoubleChecked object05 = singletonDC.getInstance();
		SingletonDoubleChecked object06 = singletonDC.getInstance();

		System.out.println("Object 05 " + object05);
		System.out.println("Object 06 " + object06);

	}
}
