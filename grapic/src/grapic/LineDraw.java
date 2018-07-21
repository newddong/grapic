package grapic;

import java.awt.event.*;
import java.awt.*;

class LineDraw extends MouseAdapter{
	int x1;
	int y1;
	int x2;
	int y2;
	Container onscreen;
	Graphics line;
	LineDraw(Container con){
		onscreen = con;
		line = onscreen.getGraphics();
	}
	
	
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		line.drawLine(x1, y1, x2, y2);
		onscreen.paintComponents(line);
	}
	
//	public void mouseDragged(MouseEvent e) {
//		x2 = e.getX();
//		y2 = e.getY();
//		line.drawLine(x1, y1, x2, y2);
//		onscreen.paintComponents(line);
//		onscreen.repaint();
//	}
	
	
	
}
