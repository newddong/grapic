package grapic;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


class Screen extends JFrame{
	Screen(){
		setTitle("Paint");
		setSize(640,380);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content = getContentPane();
		content.setLayout(null);
		content.setBackground(Color.white);
		content.add(new ColorButton(Color.BLUE,"ÆÄ¶û",20,20,20,20));
		Menu a = new Menu();
		setJMenuBar(a);
	}
	
	
}
