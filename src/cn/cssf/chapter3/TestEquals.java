package cn.cssf.chapter3;

public class TestEquals {
	public static void main(String[] args) {
		Cat2 c1 = new Cat2(1, 2, 3);
		Cat2 c2 = new Cat2(1, 2, 6);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); 
	}
}

class Cat2 {
	int color;
	int height, weight;
	
	public Cat2(int color, int height, int weight) {
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		else {
			if(obj instanceof Cat2) {
				Cat2 c = (Cat2)obj;
				if(c.color == this.color && c.height == this.height && c.weight == this.weight) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}