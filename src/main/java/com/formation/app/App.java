package com.formation.app;

public class App {
	
	private final String message = "Hello World of docker!";
	
	    public App() {}
	
	    public static void main(String[] args) {
	
	        System.out.println(new App().getMessage());
	
	    }
	
	    private final String getMessage() {
	
	        return message;
	
	    }

}
