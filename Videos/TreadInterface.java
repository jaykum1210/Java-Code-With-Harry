	class MyThread11 implements Runnable{
	public void run() {
		int i = 0;
		while(i<10) {
			System.out.println(i++);
		}
	}
}

class MyThread21 implements Runnable{
	char ch = 'A';
	public void run() {
		while((ch-'A')<10) {
			System.out.println(ch++);
		}
	}
}

public class TreadInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread11 r1 = new MyThread11();
		Thread t1 = new Thread(r1);
		
		MyThread21 r2 = new MyThread21();
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start(); 
	}

}
