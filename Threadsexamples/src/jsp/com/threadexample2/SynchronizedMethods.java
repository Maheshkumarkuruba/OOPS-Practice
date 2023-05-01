package jsp.com.threadexample2;
class Task{
synchronized public void printAsc() {
			for(int i=0;i<5;i++) {
				System.out.println(i);
			}
		}
synchronized public void printDsc() {
			for(int i=5;i>=0;i--) {
				System.out.println(i);
			}
		}
	}
	class ThreadOne extends Thread{
		Task t1;
		public ThreadOne(Task t1) {
			this.t1=t1;
		}
		public void run() {
			synchronized(t1) {
		t1.printAsc();	
			}
		}
	}
	class ThreadTwo extends Thread{
		Task t2;
		public ThreadTwo(Task t2) {
			this.t2=t2;
		}
		public void run() {
			synchronized(t2) {
		t2.printDsc();	
			}
		}
	}

public class SynchronizedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task t=new Task();
ThreadOne th1=new ThreadOne(t);
ThreadTwo th2=new ThreadTwo(t);
th1.start();
th2.start();
	}

}
