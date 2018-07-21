package grapic;

import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;

class ClrButClicked extends MouseAdapter{
	Color selectedcolor;
	
	ClrButClicked(Color screencolor){
		selectedcolor = screencolor;
	}
	
	public void mouseClicked(MouseEvent e) {
		JPanel selected = (JPanel)e.getSource();
		selectedcolor = selected.getBackground();
		
	}
	
	
	
}
