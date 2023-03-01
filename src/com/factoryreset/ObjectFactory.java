package com.factoryreset;

public class ObjectFactory {
	public Animals getAnimals(String str) {
		
		if(str=="Dog") {
			return new Dogs();
		}
		else if(str=="cat") {
			return new Cats();
		}
		else {
			return new Hourse();
		}
		
	}

}
