// import java.awt.BorderLayout;
// import java.awt.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class mainFlowlayout {
	public static void main(String [] args, Component component){

		//FlowLayout = places comp in row, sized at the preferred size.
		//				if horizontal space in container is too small,
		//				uses the next available row.

		JFrame frame = new JFrame();
		frame.setSize(420,420);
		frame.setTitle("THis is me!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default is HIDE_ON_CLOSE

		frame.setLayout(new FlowLayout(FlowLayout.TRAILING,10,10)); // also can be LEADING OR CENTER(default)

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,300));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());


		component = panel.add(new JButton("b1"));
		panel.add(new JButton("b2"));
		panel.add(new JButton("b3"));
		panel.add(new JButton("b4"));
		panel.add(new JButton("b5"));
		panel.add(new JButton("b6"));

		frame.add(panel);
		frame.setVisible(true);


}}