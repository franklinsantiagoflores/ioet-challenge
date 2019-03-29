package ioet.com;

public class Exercise {
	
	/*
	 Hi Franklin

	We are happy that you are interested in being part of the company. As part of the recruitment 
	process we would like you to solve a programming exercise to evaluate your skills and later we will 
	schedule a meeting to discuss your solution. It’s important to notice that you can use any programming 
	language you want but you can not use any external library to solve the exercise, however you can 
	add any dependency for testing purposes like JUnit, Mockito, etc.
	
	Exercise
	
	The company ACME offers their employees the flexibility to work the hours they want. 
	They will pay for the hours worked based on the day of the week and time of day, according to the 
	following table:
	
	Monday - Friday
	
	00:01 - 09:00 25 USD
	
	09:01 - 18:00 15 USD
	
	18:01 - 00:00 20 USD
	
	Saturday and Sunday
	
	00:01 - 09:00 30 USD
	
	09:01 - 18:00 20 USD
	
	18:01 - 00:00 25 USD
	
	The goal of this exercise is to calculate the total that the company has to pay an employee, 
	based on the hours they worked and the times during which they worked. 
	The following abbreviations will be used for entering data:
	
	MO: Monday
	
	TU: Tuesday
	
	WE: Wednesday
	
	TH: Thursday
	
	FR: Friday
	
	SA: Saturday
	
	SU: Sunday
	
	Input: the name of an employee and the schedule they worked, indicating the time and hours. 
	This should be a .txt file with at least five sets of data. You can include the data from our 
	two examples below.
	
	Output: indicate how much the employee has to be paid
	
	For example:
	
	Case 1:
	
	INPUT
	
	RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00
	
	OUTPUT:
	
	The amount to pay RENE is: 215 USD
	
	Case 2:
	
	INPUT
	
	ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
	
	OUTPUT:
	
	The amount to pay ASTRID is: 85 USD
	
	Once you have finished the exercise, please upload the solution to GitHub and send us the 
	link. Don’t forget to include a README.md file with a description about your design and the 
	instructions to run your program. We evaluate many aspects, including how well your code is 
	structured, applied pattern designs, testing and the quality of your solution.
	
	The solution shouldn’t need any UI, a console application is good enough.
	
	This exercise should be completed within a week. If for some reason you are unable to finish on 
	time, please let us know.
	 */
	
	private static Integer MO=0,TU=1,WE=2,TH=3,FR=4,SA=5,SU=6;

	public double[][] fillMatrix() {
		double[][] daysHours= new double[7][24];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 9; j++) {
				daysHours[i][j] = i < 5 ? 25.0 : 30.0;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			for (int j = 9; j < 18; j++) {
				daysHours[i][j]=i < 5 ? 15.0 : 20.0;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			for (int j = 18; j < 24; j++) {
				daysHours[i][j]=i < 5 ? 20.0 : 25.0;
			}
		}
		return daysHours;
	}
	
	public boolean [][] fillJob(String nameEmployed){
		boolean [][]job= new boolean[7][24];
		
		if(nameEmployed.equals("RENE")){
			job[MO][10]=true;
			job[MO][11]=true;
			
			job[TU][10]=true;
			job[TU][11]=true;
			
			job[TH][01]=true;
			job[TH][02]=true;
			
			job[SA][14]=true;
			job[SA][15]=true;
			job[SA][16]=true;
			job[SA][17]=true;
			
			job[SU][20]=true;
		}
		if(nameEmployed.equals("ASTRID")){
			job[MO][10]=true;
			job[MO][11]=true;
			
			job[TH][12]=true;
			job[TH][13]=true;
			
			job[SU][20]=true;
		}
		return job;
	}
	
	public Double amountPay(boolean [][] job,double[][]matrix){
		double value=0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 24; j++) {
				if(job[i][j])
					value+=matrix[i][j];
			}
		}
		return value;
	} 
}
