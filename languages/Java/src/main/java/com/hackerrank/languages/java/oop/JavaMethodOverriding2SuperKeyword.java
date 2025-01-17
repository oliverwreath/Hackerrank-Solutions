/**
 * 
 */
package com.hackerrank.languages.java.oop;

/**
 * @author Kanahaiya Gupta
 *
 */

class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());
		String temp = super.define_me(); // Fix this line
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}

public class JavaMethodOverriding2SuperKeyword {
	public static void main(String[] args) {
	 new MotorCycle();
	}
}
