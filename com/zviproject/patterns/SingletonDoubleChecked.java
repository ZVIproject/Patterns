package com.zviproject.patterns;

public final class SingletonDoubleChecked {
	private static volatile SingletonDoubleChecked instance;

	private SingletonDoubleChecked() {
	}

	public static synchronized SingletonDoubleChecked getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleChecked.class) {
				if (instance == null) {
					instance = new SingletonDoubleChecked();
				}
			}
		}

		return instance;
	}

}
