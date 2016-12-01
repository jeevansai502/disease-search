package com.sample;

import java.util.*;
public class factObject {

	private String disease;
	private ArrayList<String> symptoms;
	public ArrayList<String> il;
	public ArrayList<String> sl;

	public String getDiseaseName(){
		return disease;
	}

	public void setDiseaseName(String disease){
		this.disease = disease;
	}

	public ArrayList<String> getSymptoms(){
		return symptoms;
	}

	public void setSymptoms(ArrayList<String> symptoms){
		this.symptoms = symptoms;
	}

	public void setIL(ArrayList<String> l){

		this.il = l;
		int size = symptoms.size();

	}	

	public void setSL(ArrayList<String> l){

		this.sl = l;
		int size = symptoms.size();

	}

	public ArrayList<String> getIL(){
		return il;
	}

	public ArrayList<String> getSL(){
		return sl;
	}

	public double getsi1(){
		return (il.size())/(symptoms.size()*(1.0));
	}

	public double getsi2(){
		return (sl.size())/(symptoms.size()*(1.0));
	}
	
	
}
