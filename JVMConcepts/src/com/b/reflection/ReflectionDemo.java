package com.b.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {

	public static void main(String[] args) {
			MountainBike mountainBike = new MountainBike(20, 10, 1);
			Class<? extends MountainBike> object = mountainBike.getClass();
			getObjectName(object);
			getParentClass(object);
			getMethods(object);
			manipulateFields(mountainBike, object);
		
	}

	private static void manipulateFields(MountainBike mountainBike, Class<? extends MountainBike> object) {
		Field field = null;
		try {
			field = object.getField("seatHeight");
			field.set(mountainBike, 50);
			System.out.println("new value of seatHeight is: "+ field.get(mountainBike));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void getMethods(Class<? extends MountainBike> object) {
		Method[] declaredMethods = object.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println("name of the method is: "+ method.getName());
				int accessModifiers = method.getModifiers();
				System.out.println("Access modifier of the method is: "+ Modifier.toString(accessModifiers));
				System.out.println("Return Type of the method is: "+ method.getReturnType());
				System.out.println();
		}
	}

	private static void getParentClass(Class<? extends MountainBike> object) {
		Class<?> parent = object.getSuperclass();
		System.out.println("Parent class: "+parent.getName());
	}

	private static void getObjectName(Class<? extends MountainBike> object) {
		String objName  = object.getName();
		System.out.println("Name of MountainBike objecr is: "+ objName);
	}
	
	

}
