package grapic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ColorButton extends JPanel{
	ColorButton(){}
	ColorButton(Color bg, String name ,int width,int height,int x,int y){
		this.setBackground(bg);
		this.setSize(width, height);
		this.setLocation(x, y);
	}
}
