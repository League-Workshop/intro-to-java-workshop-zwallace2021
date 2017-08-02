package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String name = JOptionPane.showInputDialog("Please Enter Your Name");
		JOptionPane.showMessageDialog(null,"Good Morning "+ name + "! :)");
		
	}

}
