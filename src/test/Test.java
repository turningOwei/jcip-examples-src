package test;

import net.jcip.examples.Holder;

public class Test {
	public Holder holder;

	public void initialize() {
		holder = new Holder(42);
	}
}
