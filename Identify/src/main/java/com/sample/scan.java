package com.sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;

import org.kie.api.runtime.KieSession;

public class scan implements ActionListener{

	JFrame f1,f;
	JButton b1,b2;
	 JComboBox c;
	 KieSession kSession;
	ArrayList<String> populate;

	public scan(KieSession kSession,ArrayList<String> populate,JFrame f){
	
		this.kSession = kSession;
		this.populate = populate;
		this.f = f;
		
		Set<String> set = new HashSet<>();
		set.addAll(populate);
		
			
		String cvalues[]=  set.toArray(new String[set.size()]);
		
		Arrays.sort(cvalues);
		
		c = new JComboBox(cvalues);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		f1 = new JFrame("scan"); 
		f1.setSize(600, 300);
		f1.setLocation(300,150);
		f1.setLayout(null);

		c.setBounds(200, 70, 200, 30);
		c.setSize(200, c.getPreferredSize().height);

		
	                BoundsPopupMenuListener listener = new BoundsPopupMenuListener(true, false);
	                c.addPopupMenuListener( listener );        
		 
		
		
		f1.setSize(600, 300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1 = new JButton("Add");
		b1.setSize(50, 50);
		b1.setBounds(100, 160, 100, 30);

		b1.addActionListener(new readInput(c));

		b2 = new JButton("Finish");
		b2.setSize(50, 50);
		b2.setBounds(400, 160, 100, 30);

		b2.addActionListener(new Run(kSession));
	
		
		f1.add(c);
		f1.add(b1);
		f1.add(b2);
		f1.setVisible(true);
		f.dispose();


	}

}
