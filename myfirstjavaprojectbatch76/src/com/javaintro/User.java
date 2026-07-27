package com.javaintro;

public class User {
	
	int a = 100;
	
	void hello(){
		System.out.println("good monring !! Have a nice day !!");
		User u = new User();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized invoked !");
	}

	public static void main(String[] args) {

		User u1 = new User();
		User u2 = new User();
		User u3 = new User();

//		Nullifying the Objects
		u1 = null;

//		Re-assigining the Object
		User u4 = new User();
		u2 = u4;
		
//		Anonymous Object 
//		Method inside(Local) objects
		new User().hello();

		System.gc();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);

	}

}
