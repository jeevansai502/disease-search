package com.sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JComboBox;

public class readInput implements ActionListener{

	JComboBox c;
	public readInput(JComboBox c){
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String s;		
		s = (String) c.getSelectedItem();

		getInput.insert(s);

	}

}
