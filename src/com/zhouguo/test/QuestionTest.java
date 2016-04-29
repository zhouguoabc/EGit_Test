package com.zhouguo.test;

class Singlton{
	
	private static Singlton instance = null;
	Singlton(){ }
	{
		if(instance == null){
			instance = new Singlton();
		}
	}
	public static Singlton getInstance(){
		return instance;
	}
}

class SingltonTest{
	public static void main(String[] args) {
		Singlton s1 = new Singlton();
		Singlton s2 = new Singlton();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

