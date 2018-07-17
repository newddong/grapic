package grapic;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


class Screen extends JFrame{
	Screen(){
		setTitle("Paint");
		setSize(640,380);
		Menu a = new Menu();
		setJMenuBar(a);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content = getContentPane();
		content.setLayout(null);
		content.setBackground(Color.gray);
		content.add(new DrawPanel(100,5,500,300));
		content.add(new ColorButton(Color.blue,"",20,20,20,20));
		content.add(new ColorButton(Color.red,"",20,20,50,20));
		content.add(new ColorButton(Color.green,"",20,20,20,50));
		content.add(new ColorButton(Color.yellow,"",20,20,50,50));
		
		
	}
}


	
