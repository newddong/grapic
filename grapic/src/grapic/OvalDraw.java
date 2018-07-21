package grapic;

import java.awt.event.*;
import java.awt.*;

class OvalDraw extends MouseAdapter{
	int x1;
	int y1;
	int x2;
	int y2;
	Container onscreen;
	Graphics g;
	OvalDraw(Container selected){
		onscreen = selected;
		g = onscreen.getGraphics();
	}
	
	
	
	
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		
	}
	
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		g.drawOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));
		onscreen.paintComponents(g);
		
	}
	
	
	
}
