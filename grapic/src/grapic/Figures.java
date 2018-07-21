package grapic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
import java.awt.event.*;

class Figures extends JPanel{
	String shape;
	int width;
	int height;
	Figures(int x, int y, int width, int height, String shape){
		setSize(width,height);
		setLocation(x, y);
		setBackground(Color.WHITE);
		this.shape = shape;
		this.width = width;
		this.height = height;

		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Figures but = (Figures)e.getSource();
				Screen.CURRENT_SHAPE = but.shape;
			}
		});
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		if(shape == "Rect") {
		g.drawRect(2, 2, width-4, height-4);
		}
		else if(shape == "Line") {
		g.drawLine(0, (int)(height/2), width, (int)(height/2));;
		}
		else if(shape == "Oval") {
		g.drawOval(2, 2, width-4, height-4);
		
		}
	}
	
	
}
