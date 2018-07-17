package grapic;

import javax.swing.*;

class Menu extends JMenuBar{
	Menu(){
		
		JMenu file = new JMenu("File");
		JMenu option = new JMenu("Option");
		
		file.add(new JMenuItem("new"));
		file.add(new JMenuItem("save"));
		file.add(new JMenuItem("load"));

		
		option.add(new JMenuItem("view"));
		option.add(new JMenuItem("screensize"));
		
		
		
		this.add(file);
		this.add(option);
	}
	
}
