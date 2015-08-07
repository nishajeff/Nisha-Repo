/* The idea is to create a 2 dimensional array as below
 *               col1        col2                   col3
 *row1     Male       sum_gpa     count_records_male
 *row2     Female      "              count_record_female
 *row3     major1       "                count_record_major1
 *row4     major 2
 *row5     state1
 *.........so on
 *To find avg we divide each sum by the count corresponding to each row
 *print out the avg gpa's by iterating through the array to give  the statistics.
 *
 *I am using a single  String array to populate all the information dynamically as 
 *the user inputs them.Parsing the double,int to string and back again to double and int to
 *store to the array and to do calculations
 */ 

import java.util.Scanner;
public class BonusAssignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [][] Statistics=new String [100][3];
		int index1=0,index2=0;
		double gen_tot=0.0,major_tot=0.0,state_tot=0.0,overall_tot=0.0;		
		boolean FIRSTRECORD=true,major_flag=false,state_flag=false,gender_flag=false;
		int count_total=0,count=0;
		System.out.println("Enter the student name");
		String name=sc.nextLine();
		System.out.println("Enter the student grade");
		String grade=sc.nextLine();
		overall_tot+=DetermineGPA(grade);
		count_total++;
		System.out.println("Enter the student gender");
		String gender=sc.nextLine();
		System.out.println("Enter the student major");
		String major=sc.nextLine();
		System.out.println("Enter the student state");
		String state=sc.nextLine();
		
		while(true){
			if(FIRSTRECORD==true)
			{
				
				Statistics[index1][index2]=gender;				
			    gen_tot+=DetermineGPA(grade);			    
			    index2++;
			    Statistics[index1][index2]=Double.toString(gen_tot);
			    count++;			    
			    index2++;
			    Statistics[index1][index2]=Integer.toString(count);
			    count=0;
			    
				index1++;
				index2=0;
				Statistics[index1][index2]=major;
				major_tot+=DetermineGPA(grade);				
				index2++;
				Statistics[index1][index2]=Double.toString(major_tot);
				count++;
			    index2++;
			    Statistics[index1][index2]=Integer.toString(count);
			    count=0;
				
				index1++;
				index2=0;
				Statistics[index1][index2]=state;
				state_tot+=DetermineGPA(grade);
				index2++;
				Statistics[index1][index2]=Double.toString(state_tot);
				count++;
			    index2++;
			    Statistics[index1][index2]=Integer.toString(count);
			    count=0;
				
				FIRSTRECORD=false;
				major_tot=0.0;
				state_tot=0.0;
				gen_tot=0.0;
				
			}
			else
			{				
				
					double gpa=DetermineGPA(grade);	
					double tot=0.0;
					int cnt=0;				
					for(int i=0;i<=index1;i++){					
						tot=Double.parseDouble(Statistics[i][1])+gpa;					
						if(Statistics[i][0].equals(gender)){											
							Statistics[i][1]=Double.toString(tot);
							cnt=Integer.parseInt(Statistics[i][2]);
							cnt++;
							Statistics[i][2]=Integer.toString(cnt);
							gender_flag=false;
							break;
							}
						else
						   gender_flag=true;
					}
					for(int i=0;i<=index1;i++){
						tot=Double.parseDouble(Statistics[i][1])+gpa;
						if(Statistics[i][0].equals(major)){						
							Statistics[i][1]=Double.toString(tot);
							cnt=Integer.parseInt(Statistics[i][2]);
							cnt++;
							Statistics[i][2]=Integer.toString(cnt);
							major_flag=false;
							break;
							}
						else
						major_flag=true;
						}
					for(int i=0;i<=index1;i++){
						tot=Double.parseDouble(Statistics[i][1])+gpa;
						if(Statistics[i][0].equals(state)){																
							System.out.println("Hello3");
							Statistics[i][1]=Double.toString(tot);
							cnt=Integer.parseInt(Statistics[i][2]);
							cnt++;
							Statistics[i][2]=Integer.toString(cnt);	
							state_flag=false;
							break;
									}
						else
							state_flag=true;
							}
							
				 if(gender_flag==true){
					
					index1++;
					index2=0;
					Statistics[index1][index2]=gender;
					gen_tot+=DetermineGPA(grade);
					index2++;
					Statistics[index1][index2]=Double.toString(gen_tot);
					index2++;
					Statistics[index1][index2]=Integer.toString(1);
					gender_flag=false;
					gen_tot=0.0;
					
				 }
				 if(major_flag==true){				
					 index1++;
					 index2=0;
					 Statistics[index1][index2]=major;
					 major_tot+=DetermineGPA(grade);
					 index2++;
					 Statistics[index1][index2]=Double.toString(major_tot);
					 index2++;
					 Statistics[index1][index2]=Integer.toString(1);
					 major_flag=false;
					 major_tot=0.0;
					 
				 }
				 if(state_flag==true){
				//System.out.println("Hello");
					 index1++;
					 index2=0;
					 Statistics[index1][index2]=state;
					 state_tot+=DetermineGPA(grade);
					 index2++;
					 Statistics[index1][index2]=Double.toString(state_tot);
					 index2++;
					 Statistics[index1][index2]=Integer.toString(1);
					 state_flag=false;
					 state_tot=0.0;
					 
				 	}	
		
				}
			
		
			//info_cnt=3;
			System.out.println("Enter the student name");
			name=sc.nextLine();
			if(name.equals(""))
				break;
			System.out.println("Enter the student grade");
			grade=sc.nextLine();
			overall_tot+=DetermineGPA(grade);
			count_total++;
			System.out.println("Enter the student gender");
			gender=sc.nextLine();
			System.out.println("Enter the student major");
			major=sc.nextLine();
			System.out.println("Enter the student state");
			state=sc.nextLine();			
	     }
			
	    PrintStatistics(index1,Statistics,overall_tot,count_total);
		sc.close();
		}
		

	
	
	public static double DetermineGPA(String grade){
		switch(grade){
		case"A":
			return 4.0;
		case"B":
			return 3.0;
		case "C":
			return 1.0;
		case "F":
			return 0.0;
		default:
			return 0.0;
		
		    
		}
	}
	
	public static void PrintStatistics(int index1,String [][] Statistics,double overall_tot,int count_total){
		//System.out.println(overall_tot);
		//System.out.println(count_total);
		System.out.println();
		System.out.println("Populated Array:");
		for(int i=0;i<=index1;i++){
			System.out.println(Statistics[i][0]+"  "+Statistics[i][1]+"  "+Statistics[i][2]);
		}
		System.out.println();
		System.out.println("Overall Avg GPA= "+(overall_tot/count_total));
		for(int i=0;i<=index1;i++){
			System.out.println("AVG GPA for "+Statistics[i][0]+" ="+(Double.parseDouble(Statistics[i][1])/Integer.parseInt(Statistics[i][2])));
		}
		
	}


}
