package cn.cssf.chapter3;

class Person4 {
  private String name;
  private String location;

  Person4(String name) {
    this.name = name;
    location = "beijing";
  }
  
  Person4(String name,String location) {
    this.name = name;
    this.location = location;
  }
  
  public String info() {
    return 
      "name: "+name+
      " location: "+location;
  }
}

class Teacher extends Person4 {
	private String capital;
	
	Teacher(String name, String capital) {
		this(name, "beijing", capital);
	}
	
	Teacher(String n, String l, String capital) {
		super(n, l);
		this.capital = capital;
	}
	
	public String info() {
		return super.info() + "capital " + capital;
	} 
}

class Student3 extends Person4 {
    private String school;
    Student3(String name,
		String school) {
        this(name,"beijing", school);
    }
    Student3(String n,String l
	,String school) {
        super(n,l);
        this.school = school;
    }
    public String info() {
        return super.info()+
	  " school: "+school;
    }
}

public class TestTeacher {
    public static void main(String[] args) {
        Person4 p1 = new Person4("A");
        Person4 p2 = new Person4("B","shanghai");
        Student3 s1 = new Student3("C","S1");
        Student3 s2 =
            new Student3("C","shanhai","S2");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());
        
        Teacher t1 = new Teacher("D", "Professor");
        System.out.println(t1.info());
    }
}
