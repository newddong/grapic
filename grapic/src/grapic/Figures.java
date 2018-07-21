package grapic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

class Figures extends JPanel{
	Figures(int x, int y, int width, int height){
		setSize(width,height);
		setLocation(x, y);
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawRect(10, 10, 10, 10);
		g.drawLine(30, 15, 40, 15);
		g.drawOval(50, 10, 10, 10);
	}
	
	
}
