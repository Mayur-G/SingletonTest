package com.test;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {

	}
	
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			//fix multiple threads
			synchronized (Singleton.class) {
				if(instance == null)
				{
					instance = new Singleton();
				}
			}
		}		
		return instance;
	}
	
	
	
}
