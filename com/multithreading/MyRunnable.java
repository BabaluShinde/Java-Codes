//way to create threads
//Implementing the Runnable interface

package com.multithreading;

//Create a class that implements Runnable.
//Implement the run() method.
//Pass an instance of the class to a Thread object and call start().

// Allows extending another class while still creating a thread.
//Requires creating an extra Thread object to start execution.

public class MyRunnable implements Runnable{
	public void run() {
		System.out.println("This method executes from the Runnable implemented interface for thread running. ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new Thread(new MyRunnable());
		t2.start();

	}

}
