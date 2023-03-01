package com.factoryreset;

public class FactoryrestEx1 {
	public static void main(String[] args) {
		ObjectFactory of=new ObjectFactory();
		Animals an=of.getAnimals("cat");
		an.sound();
		
	}
}
