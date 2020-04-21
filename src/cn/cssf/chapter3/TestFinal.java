package cn.cssf.chapter3;

public class TestFinal {
	public static void main(String[] args) {
		T t = new T();
		//t.i = 8;
	}
}

final class T1 {
	final int i = 8;
	public final void m() {
		//j = 9;
	}
}

//class TT extends T1 {
//
//}