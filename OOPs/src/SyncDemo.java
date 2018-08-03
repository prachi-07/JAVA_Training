
public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		display(name);

	}
	private Object dummy = new Object();

	private void display(String name) {
		System.out.println("Thread entered");
		synchronized (dummy) {
			try {
				System.out.print("[");
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.println("]");
			} catch (InterruptedException e) {

			}

		}
		System.out.println("Thread exited ");
	}

	public static void main(String args[]) {
		SyncDemo st = new SyncDemo();
		Thread t1 = new Thread(st, "Alpha");
		Thread t2 = new Thread(st, "Bravo");
		Thread t3 = new Thread(st, "Charlie");

		t1.start();
		t2.start();
		t3.start();

	}

}
