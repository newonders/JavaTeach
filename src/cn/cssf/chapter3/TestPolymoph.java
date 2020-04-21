package cn.cssf.chapter3;

abstract class Animal {
  private String name;
  Animal(String name) {this.name = name;}
  /*
  public void enjoy(){
    System.out.println("����......");
  }
  */
  public abstract void enjoy();
}

class Cat3 extends Animal {
  private String eyesColor;
  Cat3(String n,String c) {super(n); eyesColor = c;}

  public void enjoy() {
    System.out.println("cat enjoy......");
  }

  //public abstract void enjoy();
}

class Dog2 extends Animal {
  private String furColor;
  Dog2(String n,String c) {super(n); furColor = c;}
 
  public void enjoy() {
    System.out.println("dog enjoy......");
  }
}

class Bird extends Animal {
	 Bird() {
	 	 super("bird");
	 }
	 public void enjoy() {
    System.out.println("bird enjoy......");
  }
}

class Lady {
    private String name;
    private Animal pet;
    Lady(String name,Animal pet) {
        this.name = name; this.pet = pet;
    }
    public void myPetEnjoy(){pet.enjoy();}
}

public class TestPolymoph {
    public static void main(String args[]){
        Cat3 c = new Cat3("catname","blue");
        Dog2 d = new Dog2("dogname","black");
        Bird b = new Bird();
        //Lady l1 = new Lady("l1",c);
        Lady l2 = new Lady("l2",d);
        Lady l3 = new Lady("l3",b);
       //l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
    }
}
