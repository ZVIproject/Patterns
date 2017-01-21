package com.zviproject.patterns;

public final class SingletonLazyInit {
	private static SingletonLazyInit instance = new SingletonLazyInit();

	private SingletonLazyInit() {
	}

	public static synchronized SingletonLazyInit getInstance() {
		return instance;
	}

}
