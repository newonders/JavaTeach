package cn.cssf.chapter3;

public class TestInterface {
	PetCarer pc = new Worker();
//	pc.feed();
}

interface PetCarer {
	void feed();
	void playWithPet();
}

class Worker implements PetCarer {
	public void feed() {
		System.out.println("Worker feed ... ");
	}
	public void playWithPet() {
		System.out.println("Worker play with pet ... ");
	}
}

