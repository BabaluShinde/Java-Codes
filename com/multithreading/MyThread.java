//way to create threads
//Extending the Thread class

package com.multithreading;

//Create a class that extends Thread.
//Override the run() method.
//Create an instance of the class and call start() to execute the thread.

//Since Java doesn't support multiple inheritance, extending Thread restricts the ability to extend another class.

class MyThread extends Thread{
	public void run(){
		System.out.println("This method executes under the Run method of  the extended Thread class for thread running. ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		t1.start();
	
	}

}
