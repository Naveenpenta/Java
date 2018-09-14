/*
 1. Write an application that uses String method compareTo to compare two strings
 defined by the user.
2. Write an application that uses String method equals and equalsIgnoreCase to tests
 any two string objects for equality.
3. Write an application that uses String method indexOf to determine the total
 number of occurrences of any given alphabet in a defined text.
4. Write an application that uses String method concat to concatenate two defined
 strings.
5. Write a Java program to print all vowels in given string and count number of vowels and
 consonants present in given string
6. Write an application that finds the length of a given string.
7. Write an application that uses String method charAt to reverse the string.
8. Write an application that finds the substring from any given string using substring
 method and startsWith & endsWith methods.
9. Write an application that changes any given string with uppercase letters, displays
 it, changes it back to lowercase letters and displays it.
 */
package week4;

/**
 *
 * @author RGUKT
 */
public class compare {
    
 /*1. Write an application that uses String method compareTo to compare two strings
 defined by the user. */

import java.util.*;
class Equal{
	String s1;
	String s2;
	boolean compare(){
		return(s1.equals(s2));
		
		
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter first string");
		Equal s=new Equal();
		String ss=in.nextLine();
		s.s1=ss;
		System.out.println("enter second string");
		String sss=in.nextLine();
		s.s2=sss;
		//System.out.println()
		System.out.println(s.compare());
		//compare(s1,s2);
		
		
	}
	
	
} 


/*2. Write an application that uses String method equals and equalsIgnoreCase to tests
 any two string objects for equality. */

import java.util.*;
class Ignore{
	String s1;
	String s2;
	String s3;
	boolean equals(){
		
		return(s1.equals(s2));
	}
	boolean equalsignore(){
		return(s1.equalsIgnoreCase(s2));	
		
	}
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		Ignore s=new Ignore();
		System.out.println("enter first string");
		String s11=in.nextLine();
		s.s1=s11;
		System.out.println("enter second string");
		String s22=in.nextLine();
		s.s2=s22;
		System.out.println("enter third  string");
		String s33=in.nextLine();
		s.s3=s33;		
		System.out.println(s.equals());
		System.out.println(s.equalsignore());
		//s2.equalsIgnoreCase(s4);
		//System.out.println(e1);
		//System.out.println(e2);	
		//System.out.println(s4);
		//System.out.println(s2.concat(s4));		
	}	
}


/*3. Write an application that uses String method indexOf to determine the total
 number of occurrences of any given alphabet in a defined text. */

import java.util.*;
class Equall{
	String s1;
	char s2;
	//int count=0;
	void indexof(){
			int count=0;
			//String [] res=s1.split("(?!^)");
			//String[] res=new String[s1.length()]; 
			
		for(int i=0;i<s1.length();i++){		
		if(s1.charAt(i)==s2){
				
				count++;
				//System.out.println(count);
			}
			
			
		}
		System.out.println(count);
		
		
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter String");
		Equall s=new Equall();
		String ss=in.nextLine();
		s.s1=ss;
		System.out.println("enter letter to search which index it is there");
		char sss=in.next().charAt(0);
		s.s2=sss;
		s.indexof();
		
		
		
		
		
		
		//System.out.println((ss).indexOf(sss));
		//System.out.println("number of "+sss +" are "+ s.indexOf());
		//System.out.println("enter position to start indexing");
		//int index=in.nextInt();
		//System.out.println((ss).indexOf(sss,index));
		/*for(int i=0;i<s1.length();i++){
			//for(char ch: s1.toCharArray[]){	
			res[0]=Character.toString(s1.charAt(i));
			}
		for(int i=0;i<s1.length();i++){
			System.out.println(res[i]);
		}
			*/
		
		
		
		
	}
	
	
}


/*4. Write an application that uses String method concat to concatenate two defined
 strings. */

class Concat{
	String s1;
	String s2;
	
	Concat(String x,String y){
		s1=x;
		s2=y;		
	}
	public String concatt(){
		System.out.println(s1+" "+s2);
		return(s1.concat(s2));
		
	}
	
	public static void main(String[] args){
		
		Concat c=new Concat("naveen","penta");
		System.out.println(c.concatt());
		
	}
}


/*5. Write a Java program to print all vowels in given string and count number of vowels and
 consonants present in given string*/


import java.util.*;
class Vowels{
	public static void main(String[] args){
		
		String str="hello this is prograsm";
		//String[] strr=str.split(' ');
		//String[] strr=new String[str.length()];
		int count=0,countt=0;
		System.out.println("vowels are");
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				//System.out.println(str[i]);
				count=count+1;
				System.out.println(str.charAt(i));
			}
			else
			{
				countt=countt+1;
				
			}
		}
		System.out.println("no of vowels "+count);
		System.out.println("no of consonants "+countt);
			//System.out.println(str.charAt(i));
			//System.out.println(strr[i]);
			
	}	
}


/*6. Write an application that finds the length of a given string. */

class Length{
	public static void main(String[] args){
		String str="that is an application";
	System.out.println("length of the String is "+str.length());
					
	}	
}

/*7. Write an application that uses String method charAt to reverse the string. */


class Reverse{
	
	public static void main(String args[]){
		
		String str="This is the Computer";
		
		for(int i=str.length()-1;i>=0;i--){
			
			System.out.print(str.charAt(i));
			
		}
		
	}
	
}
/*8. Write an application that finds the substring from any given string using substring
 method and startsWith & endsWith methods. */


class Substring{
	
	public static void main(String args[]){
		String str="This is the Hello world";
		String subString="Hel";
		String endswith="rld";
		String startswith="Ths";
		System.out.println("Substring "+str.substring(6));
		System.out.println("Ending "+str.endsWith(endswith));
		System.out.println("Starting "+str.startsWith(startswith));

	}
}

*/9. Write an application that changes any given string with uppercase letters, displays
 it, changes it back to lowercase letters and displays it.*/

class Upper{
	
	public static void main(String[] args){
		
		String str="This is Naveen Penta";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
	
}

}
