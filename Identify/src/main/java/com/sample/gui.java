package com.sample;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.*;

import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;

public class gui {

	JFrame f;
	JPanel p;
	JButton b1;

	public void fun(KieSession kSession,ArrayList<String> populate) {

		f = new JFrame("Search");
		p = new JPanel(new GridBagLayout());
		f.setSize(600, 300);
		f.setLocation(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		GridBagConstraints gc=new GridBagConstraints();
		gc.fill=GridBagConstraints.VERTICAL;
		gc.gridx=0;
		gc.gridy=0;
		
/*		JLabel l = new JLabel();
		l.setText("Welcome");
//		l.setBounds(200, 70, 100, 30);
		
		p.add(l,gc);
	*/	
	
	    ImageIcon pic = new ImageIcon("search.png");
		p.add(new JLabel(pic));
		
		gc.gridx=0;
		gc.gridy=5;
	
		b1 = new JButton("Search");
		b1.setSize(50, 50);
		b1.addActionListener(new scan(kSession,populate,f));
//		b1.setBounds(200, 200, 100, 30);

		p.add(b1,gc);
		
		f.add(p);
		f.add(b1);
		
//		p.add(l);
		p.add(b1);

		f.add(p);
		f.setVisible(true);

	}

}
