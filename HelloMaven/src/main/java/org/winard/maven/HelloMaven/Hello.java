package org.winard.maven.HelloMaven;

public class Hello {

	public static void main(String[] args) {
		greetings("Winard");
	}
	
	private static void greetings(String name) {
		System.out.println( "Hello Maven from " + name);
	}

}
