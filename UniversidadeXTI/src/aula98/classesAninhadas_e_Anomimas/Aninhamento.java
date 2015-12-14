package aula98.classesAninhadas_e_Anomimas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author edney.souza
 * A nestled class is a java class inside another java class.
 * 
 * Notice: This this has two more class declaration, so you can see inside source code, three java.class after compile from JVM.
 * In each class Java, is create an archive java.class
 */
public class Aninhamento extends JFrame{
	private static final long serialVersionUID = 1L;


	//This is our Nestled class, we are put it inside the constructor
	public class ListenerNestled implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Nestled class is run from button" + button.getText());
		}
		
	}
	
	JButton button;
	
	//Constructor
	public Aninhamento() {
		super("Nestled");
		button = new JButton("OK");
		//injecting Nestled class
		button.addActionListener(new ListenerNestled());
		
		
		//This is an example anonymous class, she doesn't have name
		//How you can see, we are injecting an Interface instead Nestled class
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Anonymous class is run from button" + button.getText());
			}
		});
		
		
		//Skills from Swim
		getContentPane().add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		Aninhamento window = new Aninhamento();

		//How to create a Nestled class directly
		@SuppressWarnings("unused")
		Aninhamento.ListenerNestled litener = window.new ListenerNestled();
		
	}
	
}
