package org.comp;

public class Computer extends Desktop {
	private void computerModel() {
		// TODO Auto-generated method stub
    System.out.println("the computer model is hp");
	}
	public static void main(String[] args) {
		Computer c = new Computer();
		Desktop d = new Desktop();
		c.computerModel();
		d.desktopSize();
	}

}
