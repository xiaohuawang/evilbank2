package evilbank2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class test222 {

	
	    public static void main(String[] args) {
	         
	    	String[] cc=new String[100];
	    	String[] dd=new String[100]; 
	    	String[] ee=new String[100]; 
	    	int i=0;
	    	int j=0;
	    	int m=0;
	    	try {
	            Scanner in = new Scanner(new File("c:/a.txt"));
	           
	            
	            while (in.hasNextLine()) {
	            	
	                String str = in.nextLine();
	               
	                cc=splitt(str);
	                //System.out.println(dd[]);
	                dd[i]=cc[j];
	                ee[m]=cc[j+1];
	                i++;
	                m++;
	                }
	            for( int k=0;k<5;k++)
	 	           {
	 	        	   System.out.println(dd[k]);
	 	           }
	            for( int k=0;k<5;k++)
	 	           {
	 	        	   System.out.println(ee[k]);
	 	           }
	            
	            
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            
	         
	        }
	    }
	     
	    public static String[] splitt(String str){
	        String strr = str.trim();
	        String[] abc = strr.split("[\\p{Space}]+");
	        String str1 = abc[0];
	        //String str2 = abc[1];
	       // System.out.println(str1);
	       // System.out.println(abc[1]);
	        return abc;
	    }
	     
	}
	
	

