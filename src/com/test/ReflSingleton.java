package com.test;

public class ReflSingleton {
	
private static ReflSingleton instance;
	
	private ReflSingleton() {
		if(instance != null)
		{
			throw new IllegalArgumentException("cannot create obj through Reflection ");
		}
		
	}
	
	public static ReflSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new ReflSingleton();	
		}		
		return instance;
	}
}
