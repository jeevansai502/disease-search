/**
 * 
 */
package com.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author jeevansai
 *
 */
public class runRule {


	static int total=0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			getInput.inp = new ArrayList<String>();
			findApprox.map1 = new HashMap<>();
			findApprox.map2 = new HashMap<>();
			findApprox.map3 = new HashMap<>();

			File file = new File("facts.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line = null;

			ArrayList<String> populate = new ArrayList<String>();

			while( (line = br.readLine())!= null ){

				if(line.length() != 0){

					total++;
					ArrayList<String> list = new ArrayList<String>();
					list.addAll(Arrays.asList(line.split(",")));

					System.out.println(list.size());
					factObject object = new factObject();
					object.setDiseaseName(list.get(0));

					list.remove(0);			

					populate.addAll(list);
					object.setSymptoms(list);
					kSession.insert(object);

				}
			}
			System.out.println(total);
			gui g = new gui();

			g.fun(kSession,populate);


			//	kSession.fireAllRules();
		}catch(Exception ex){
			ex.printStackTrace();
		}


	}

}
