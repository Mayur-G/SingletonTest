package com.test;

public class CloneSingleton implements Cloneable{
	
	private static CloneSingleton instance;
	
	private CloneSingleton() {
		
		
	}
	
	public static CloneSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new CloneSingleton();	
		}		
		return instance;
	}
	
	//fix , throw new CloneNotSupportedException
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();   
		
		throw new CloneNotSupportedException();  //comment to check breaking part 
	}
	
}
