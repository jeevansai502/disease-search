package com.sample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class findApprox {

	static Map<String , ArrayList<String>> map1;
	static Map<String , ArrayList<String>> map2;
	static Map<String , ArrayList<String>> map3;
	
	static int check = 0;
	static JFrame f;
	static JTextArea l;
	static JScrollPane scroll;
	static JButton b;
	static JPanel p;
	
	static void build(){

		f = new JFrame("Report");
		f.setSize(600, 500);
	//	f.setLayout(null);

		f.setLocation(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		l = new JTextArea();

		//   l.setText("<html>");
		for(Map.Entry<String , ArrayList<String>> entry : map1.entrySet()){

			String disease = entry.getKey();

			//	System.out.println(disease + " " + entry.getValue() + map2.get(disease));

			ArrayList<String> s1 = entry.getValue();
			ArrayList<String> s2 = map2.get(disease);
			ArrayList<String> s3 = map3.get(disease);


			l.setText(l.getText() + "\n" + "Symptoms for " + disease + ":" + "\n" + s1 + "\n" + "\n"
					+ "Patient has extra symptoms:" + "\n" + s2  + " " + "(" + s2.size() + "/" + getInput.inp.size() + ")" + "\n" + "Extra symptoms for the disease are:" + "\n" +
					s3  + " " + "(" + s3.size() + "/" + s1.size() + ")"+ "\n");


		}
		l.setText(l.getText() + "\n" + "Please check if you have missed any symptom and try again.");
				
		//System.out.println(l.getText());
		scroll = new JScrollPane(l);
				
		f.add(scroll);
		
		f.setVisible(true);

		
	}

	public static void findApprox(factObject fo){
		
		

	//	if( ((fo.getsi1() > 0.5) || (fo.getsi2() < 0.5)) &&fo.getIL().size() != getInput.inp.size()){

			String disease = fo.getDiseaseName();
			//    System.out.println(disease);

			ArrayList<String> s = fo.getSymptoms();
			map1.put(disease,s);

			ArrayList<String> il = fo.getIL();
			map2.put(disease, il);

			ArrayList<String> sl = fo.getSL();
			map3.put(disease, sl);

	//	}

		//		System.out.println(fo.getsi());

		check++;

		if(check == runRule.total){
			
			
			build();
		}


	}

}
