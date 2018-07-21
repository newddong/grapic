package grapic;

import javax.swing.*;
import java.awt.*;

class DrawPanel extends JPanel{
	DrawPanel(int x, int y, int width, int height){
		setSize(width,height);
		setLocation(x, y);
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
}
