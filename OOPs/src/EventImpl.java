
public class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("First Event ImpleFmention");
	}

	public static class InnerEventImpl implements Event {
		@Override
		public void doSomething() {

			System.out.println("Second event Implementation");
		}
	}

	public void doingSomething() {
		class InnerMostImpl implements Event {

			@Override
			public void doSomething() {
				System.out.println("Third Event Implementation");
			}

		}
		;
		new InnerMostImpl().doSomething();
	}

	public void doingSomethingAgain() {
		Event e = new Event() {

			@Override
			public void doSomething() {
				System.out.println("Forth Event Implementation");
			}

		};
		e.doSomething();
	}

	public void doingSomethingOneLastTime() {
		Event e = () -> System.out.println("Fifth Event Implementation");
		e.doSomething();
	}

	public static void main(String[] args) {
		EventImpl impl = new EventImpl();
		// InnerEventImpl innerIpml = impl.new InnerEventImpl();
		InnerEventImpl innerIpml = new EventImpl.InnerEventImpl();
		impl.doSomething();
		innerIpml.doSomething();

		impl.doingSomething();
		impl.doingSomethingAgain();
		impl.doingSomethingOneLastTime();
	}

}
