package grapic;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


class Screen extends JFrame{
	static Color CURRENT_COLOR;
	static String CURRENT_SHAPE = "Line";
	
	Screen(){
		
		setTitle("Paint");
		setSize(640,380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Menu menubar = new Menu();
		setJMenuBar(menubar);
		
	
		setVisible(true);
		
		
		Container content = getContentPane();

		content.setLayout(null);
		content.setBackground(Color.gray);
		
		DrawPanel draw = new DrawPanel(100,5,500,300);
		content.add(draw);
		content.add(new Figures(10,150,30,30,"Line"));
		content.add(new Figures(60,150,30,30,"Rect"));
		content.add(new Figures(10,200,30,30,"Oval"));
		
		
		content.add(new ColorButton(Color.blue,"",20,20,20,20));
		content.add(new ColorButton(Color.red,"",20,20,50,20));
		content.add(new ColorButton(Color.green,"",20,20,20,50));
		content.add(new ColorButton(Color.yellow,"",20,20,50,50));
		
		
		if (CURRENT_SHAPE.equals("Line")) {
			LineDraw k = new LineDraw(draw);
			draw.addMouseListener(k);
			draw.addMouseMotionListener(k);
		} else if (CURRENT_SHAPE.equals("Oval")) {
			OvalDraw o = new OvalDraw(draw);
			draw.addMouseListener(o);
			draw.addMouseMotionListener(o);
		}
	}
	
	
}


	
