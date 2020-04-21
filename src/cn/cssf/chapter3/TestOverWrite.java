package cn.cssf.chapter3;

class Person3 {
    private String name;
    private int age;
    public void setName(String name){this.name=name;}
    public void setAge(int age) {this.age=age;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getInfo() {
          return "Name: "+ name + "\n" +"age: "+ age;
  }
}

class Student2 extends Person3 {
    private String school;
    public String getSchool() {return school;}
    public void setSchool(String school)
    {this.school =school;}
    public String getInfo() {
      return  "Name: "+ getName() + "\nage: "+ getAge() 
                    + "\nschool: "+ school;
		}
}

public class TestOverWrite {
public static void main(String arg[]){
        Student2 student = new Student2();
        Person3 person = new Person3();
        person.setName("none");
        person.setAge(1000);
        student.setName("John");    
        student.setAge(18);
        student.setSchool("SCH");
        System.out.println(person.getInfo());
        System.out.println(student.getInfo());
    }
}
