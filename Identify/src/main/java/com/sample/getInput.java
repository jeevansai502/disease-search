package com.sample;

import java.util.*;

public class getInput{

	public static ArrayList<String> inp;


	public static void insert(String s){

		inp.add(s);
	}

	public static void getMatches(factObject fo){

		int count = 0;

		ArrayList<String> al = fo.getSymptoms();

		ArrayList<String> ansl = new ArrayList<String>();
		ArrayList<String> anss = new ArrayList<String>();

		for(int i=0;i<inp.size();i++){

			if(!al.contains(inp.get(i)))
				ansl.add(inp.get(i));
		}

		for(int i=0;i<al.size();i++){

			if(!inp.contains(al.get(i)))
				anss.add(al.get(i));
		}

		fo.setIL(ansl);
		fo.setSL(anss);

	}
}
