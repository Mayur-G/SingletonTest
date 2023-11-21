package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 : "+s1.hashCode());
		System.out.println("s2 : "+s2.hashCode());
		
		//breaking by Serialization
//		LazySingleton s3 = LazySingleton.getInstance();
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("obj"));
//		objectOutputStream.writeObject(s3);
//		objectOutputStream.close();
//		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("obj"));
//		LazySingleton s4 = (LazySingleton) objectInputStream.readObject();
//		objectInputStream.close();
//		System.out.println("Serializable==============");
//		System.out.println("s3 : "+s3.hashCode());
//		System.out.println("s4 : "+s4.hashCode());
//		System.out.println("Serializable==============");
		
		//Serialization Fix 
//		SerializableSingleton s3 = SerializableSingleton.getInstance();
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("obj"));
//		objectOutputStream.writeObject(s3);
//		objectOutputStream.close();
//		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("obj"));
//		SerializableSingleton s4 = (SerializableSingleton) objectInputStream.readObject();
//		objectInputStream.close();
//		System.out.println("Serializable fix ==============");
//		System.out.println("s3 : "+s3.hashCode());
//		System.out.println("s4 : "+s4.hashCode());
//		System.out.println("Serializable fix ==============");
		
		//breaking by Reflection
//		Singleton s3 = Singleton.getInstance();
//		Constructor[] constr = Singleton.class.getDeclaredConstructors();
//		Constructor constructor = constr[0];
//		constructor.setAccessible(true);
//		Singleton s4 = (Singleton) constructor.newInstance();
//		System.out.println("Reflection ==============");
//		System.out.println("s3 : "+s3.hashCode());
//		System.out.println("s4 : "+s4.hashCode());
//		System.out.println("Reflection ==============");
		
//		ReflSingleton s3 = ReflSingleton.getInstance();
//		Constructor[] constr = ReflSingleton.class.getDeclaredConstructors();
//		Constructor constructor = constr[0];
//		constructor.setAccessible(true);
//		ReflSingleton s4 = (ReflSingleton) constructor.newInstance();
//		System.out.println("Reflection fix ==============");
//		System.out.println("s3 : "+s3.hashCode());
//		System.out.println("s4 : "+s4.hashCode());
//		System.out.println("Reflection fix ==============");
		
		//breaking by Cloning
//		CloneSingleton s3 = CloneSingleton.getInstance();
//		CloneSingleton s4 = (CloneSingleton) s3.clone();		
//		System.out.println("Cloning ==============");
//		System.out.println("s3 : "+s3.hashCode());
//		System.out.println("s4 : "+s4.hashCode());
//		System.out.println("Cloning  ==============");
		
		
	}
	
	
}
