package com.kh.inheriance.animal;

public class Dog extends Animal{
	public Dog(String name) {
		// »óÀ§ Å¬·¡½º(Animal)ÀÇ ¸É¹ö¿¡ Á¢±ÙÇÏ´Â µ¥ »ç¿ë
		super(name);
		
		
//		public void makeSound() {
//			System.out.println(super.name + "¸Û¸Û!! Â¢½À´Ï´Ù");
//		}
	}
	
	public void speak() {
		System.out.println(getName() + "¸Û¸Û");
	}

}
