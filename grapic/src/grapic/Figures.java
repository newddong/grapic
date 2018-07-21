package grapic;

import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;
import java.awt.event.*;

class Figures extends JPanel{
	String shape;
	Container draw;
	int width;
	int height;
	
	Figures(int x, int y, int width, int height, String shape, Container con){
		setSize(width,height);
		setLocation(x, y);
		setBackground(Color.WHITE);
		this.shape = shape;
		this.width = width;
		this.height = height;
		this.draw = con;
		
		
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Figures but = (Figures)e.getSource();
				Draw l = new Draw(but.shape, draw);
				
				MouseListener[] ml = draw.getMouseListeners();
				if(ml.length>0) {
					draw.removeMouseListener(ml[0]);
				}
				
				draw.addMouseListener(l);
				draw.addMouseMotionListener(l);
				
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
