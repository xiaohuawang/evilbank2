package evilbank2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Evil2 {



public static void main(String[] args) throws Exception
{



String aa[]=new String[100];//type
int bb[]=new int[100]; //number
double cc[]=new double[100];//balance
long ff[]=new long[100];
int dd[]= new int[100]; // input number
double ee[]=new double[100];//input balance
String gg[]=new String[100];
String ll[]=new String[100];
String ddd[]= new String[100];
String eee[]= new String[100];

int bbb[]=new int[100];
double ccc[]=new double[100];
int g=0;

double balance1=0;
double balance=0;
int s=0;
int x=0,y=0,z=0;

System.out.println("Welcome to Evil Corp Savings and Loan");
System.out.println("Please create the user account(s)");

HashMap<Integer,Double> map = new HashMap<Integer,Double>();

  test222 c=new test222();
  

try {
    Scanner in = new Scanner(new File("c:/a.txt"));

    while (in.hasNextLine()) {
        String str = in.nextLine();
        ll=c.splitt(str);
        ddd[x]=ll[z];
        eee[y]=ll[z+1];
        x++;
        y++;
        s++;
       
    }
    for( int k=0;k<s;k++)
     {
    	dd[k]=Integer.valueOf(ddd[k]);
    	ee[k]=Double.valueOf(eee[k]);
    	 map.put(dd[k],ee[k]);
     }
 for( int k=0;k<s;k++)
     {
  	   System.out.println(eee[k]);
  	 System.out.println(ddd[k]);
     }
 
    
System.out.println( "map = " + map );
    
} catch (FileNotFoundException e) {
    e.printStackTrace();
}




/*while(true)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the account number");
int number=sc.nextInt();
if(number<0)
break;
=number;

System.out.println("Enter the account balance");
balance=sc.nextDouble();
ee[s]=balance;

map.put(number,balance);

s++;


}

System.out.println( "map = " + map );

*/







//Double dd[]=new Double[100];


//System.out.println("Enter the account number");







int i=0;
double sum=0.0;
Scanner sc=new Scanner(System.in);

while(true)
{


System.out.println("Enter the account number or -1 to finish");// # 7779311 : Homer Simpson

int number1=sc.nextInt();
bb[i]=number1;



if(number1<0)
break;

Scanner sd=new Scanner(System.in); 
System.out.println("Enter a transaction type (Check, Debit card)"); 
String type=sd.nextLine();
aa[i]=type; 

System.out.println("Enter the date of the check:"); 
System.out.println("input yyyy-mm-dd");
Scanner ck=new Scanner(System.in);
String DATE=ck.nextLine();
gg[i]=DATE;
DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
try{
Date dt1 = df.parse(DATE);
ff[i]=dt1.getTime();
}
catch(Exception exception )
{
exception.printStackTrace();
}







System.out.println("Enter the amount of the check");

balance1=sc.nextDouble();
cc[i]=balance1;






System.out.println("Do you want to make a deposite? y/n");

Scanner mm=new Scanner(System.in);

String kk=mm.nextLine();



if(kk.equals("y"))
{
	//System.out.println("enter the card number again");
	
     //int bbbb=mm.nextInt();
     //bbb[i]=bb[i];
     
     System.out.println("how much you want to deposit");
     
      double cccc=mm.nextInt();
      ccc[i]=cccc;
      
}
 
else 
	ccc[i]=0;
    //bbb[i]=bb[i];




i++;

}

/*
ArrayList abc = new ArrayList();


for(int k=0;k<i;k++)
{
abc.add(bb[k]);
}

Iterator it=abc.iterator();

while(it.hasNext())
{

Object obj=it.next();
if(!abc.contains(obj))
abc.add(obj);

}

System.out.println("amount of check"+abc);
*/



//for(int k=0;k<i;k++)
//{
//if(cc[i])

//sum=sum+cc[k];


//}



for( y=0;y<=s;y++ )
{ 
   for( z=0;z<=i;z++)
     {
        if(dd[y]==bb[z])
         {
         ee[y]=ee[y]-cc[z]+ccc[z];
          }
         else ; 
       }
}



/*for( y=0;y<=s;y++ )
  {
	for(z=0;z<=g;z++)
      {
		if(dd[y]==bbb[z])
        {
         ee[y]=ee[y]+ccc[z];
        } 
		else ;
      }
   } 
   */  	   

HashMap<Integer,Double> map1 = new HashMap<Integer,Double>();


for(int q=0;q<=s-1;q++)
map1.put( dd[q],ee[q]);


File fp=new File("c:\\abc.txt");
PrintWriter pfp= new PrintWriter(fp);

for(int t=0;t<=s-1;t++)
{
   if(ee[t]<0)
   {
	System.out.println("current balance for card"+dd[t] + "= " +(ee[t]-35));
	System.out.println(" the account has been closed");
	
	map1.remove(dd[t]);
	pfp.println("current balance for card"+dd[t] + "= " +(ee[t]-35));
	pfp.println(" the account has been closed");
    }
    
    else
    {
     System.out.println("current balance for card"+dd[t] + "= " +(ee[t])); 
     pfp.println("current balance for card"+dd[t] + "= " +(ee[t]));
    }
}




System.out.println( "map1 = " + map1 );
pfp.println( "map1 = " + map1 );
System.out.println();






//for(int j=0;j<=i+1;j++)
// {
// 
// System.out.println(ff[j]);
// }
int ss[]=new int[100];

for(int t=0,kk=0;t<=i+1;t++)
{
ss[kk]=t;
kk++;
}



int temp1=0;
long temp=0;

for(int j=0;j<=i;j++)
{
for(int t=0;t<=i-j;t++)
{
if(ff[t]<ff[t+1])
{
temp=ff[t];
ff[t]=ff[t+1];
ff[t+1]=temp;

temp1=ss[t];
ss[t]=ss[t+1];
ss[t+1]=temp1;


}

}


} 

// for(int t=0;t<=i+1;t++)
// {
// 
// System.out.println(ff[t]);
// System.out.println(ss[t]);
// }



System.out.println("type account num# amount date deposit");
pfp.println("type account num# amount date deposit ");

for(int t=0;t<=i-1;t++)
{

System.out.println(aa[ss[t]]+" "+bb[ss[t]]+" "+cc[ss[t]]+" "+gg[ss[t]]+" "+ccc[ss[t]]);
pfp.println(aa[ss[t]]+" "+bb[ss[t]]+" "+cc[ss[t]]+" "+gg[ss[t]]+" "+ccc[ss[t]]);
System.out.println();

}






//HashMap<Integer,String> map = new HashMap<Integer,String>();


//Scanner sd=new Scanner(System.in);

// int b=sd.nextInt();
 

 //pfp.print("fdfs");
pfp.close();


} 


}






