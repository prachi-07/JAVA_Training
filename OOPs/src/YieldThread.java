
public class YieldThread extends Thread {
	static class HelloThread extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println("Hello");
				yield();
				/*try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		}

	}

	static class WorldThread extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println("world");
				yield();
				/*try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		}
	}

	public static void main(String[] args) {
		HelloThread hello = new HelloThread();
		WorldThread world = new WorldThread();

		hello.start();
		world.start();
	}
}
