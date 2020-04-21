package cn.cssf.chapter9;
/*	范例名称：生产者--消费者问题
 * 	源文件名称：SyncTest.java
 *	要  点：
 *		1. 共享数据的不一致性/临界资源的保护
 *		2. Java对象锁的概念
 *		3. synchronized关键字/wait()及notify()方法
 */


public class SyncTest {
    public static void main(String args[]){
			SyncStack2 stack = new SyncStack2();
			Runnable p=new Producer2(stack);
			Runnable c = new Consumer2(stack);
			Thread t1 = new Thread(p);
			Thread t2 = new Thread(c);
			t1.start();
			t2.start();
    }
}


class SyncStack2{  //支持多线程同步操作的堆栈的实现
	private int index = 0;
	private char []data = new char[6];	
	public synchronized void push(char c){
		if(index == data.length){
		try{
				this.wait();
		}catch(InterruptedException e){}
		}
		this.notify();
		data[index] = c;
		index++;
	}
	public synchronized char pop(){
		if(index ==0){
			try{
				this.wait();
			}catch(InterruptedException e){}
		}
		this.notify();
		index--;
		return data[index];
	}
}


class  Producer2 implements Runnable{
	SyncStack2 stack;
	public Producer2(SyncStack2 s){
		stack = s;
	}
	public void run(){
		for(int i=0; i<20; i++){
			char c =(char)(Math.random()*26+'A');
			stack.push(c);
			System.out.println("produced："+c);
			try{							        
				Thread.sleep((int)(Math.random()*1000)); 
			}catch(InterruptedException e){
			}
		}
	}
}


class Consumer2 implements Runnable{
	SyncStack2 stack;
	public Consumer2(SyncStack2 s){
		stack = s;
	}
	public void run(){
		for(int i=0;i<20;i++){
			char c = stack.pop();
			System.out.println("消费："+c);
			try{							           
				Thread.sleep((int)(Math.random()*1000));
			}catch(InterruptedException e){
			}
		}
	}
}

