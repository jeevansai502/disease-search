

	--------------------------------------------------------------------------------------------------------------------------
								READ ME
	--------------------------------------------------------------------------------------------------------------------------


	1) This is a drools based symptom checker project which is expected to assist medical practitioners for basic use to give all
	disease possibilities.

	2)It takes patients symptoms as input and gives all matching diseases in the facts.txt file that matches more than 50% of symptoms.It  		needs to be filled prior to execution of program.

	3)Installation:
		
		a) It works on drools which is a java based expert system shell so you need to install any java ide first, i have used 
	           eclipse ide.  
  		b) Next you need to install drools plugin in your ide (check if all dependencies are met properly especially kie jar files, 			   else you may run into some error). 
		c) If you have successfully completed the above steps then you are ready to go.

	4)Files:
		
		a) runRule.java is the main class of the project,it starts the kie session and database and initialises the expert system shell.
		b) ds.drl is the main rule file of the application which consists of two main rules "analyzesymptoms" and "printoutput"
		c) The first one calls java class to take input from user and map the symptoms with database facts,second one prints the values 		   checking the percentage of mapped symptoms.   
		d) The rules for data manipulation checking input ordering and checking mapped percentage are in java code.		

	5)when you run the project you will see start screen with search button next you will be prompted to enter your symptoms,enter each 		symptom and press add button, after you have added all symptoms press finish,now you will be presented with your report of matching 		symptoms and the particular disease.

	6)Now after seeing the report you may find any symptom not entered by you or forgotten ,then you can re run to get better matches,this 		continues until you find a satisfying solution.
	
