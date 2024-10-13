1)write the program print repeating elements in alphabetical 
order in given string  ?
i/p:terv team pro
o/p:e r t

2)write the program check plaindrome or not using stringbuffer ?
i/p: appa             i/p:hello
o/p: plaindrome       o/p:not 

3)write the program only reverse vowels in string ?
i/p: terv team pro
o/p: torv taem pre

4)write the program reverse the string ?
i/p: terv team pro
o/p: vret maet orp 

5)write the program string expansion?
i/p:  a1b4f3
o/p: abbbbfff

-------------------------------------------------------------------------
1)write the program print repeating elements in alphabetical 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String a=s.nextLine();
	    char s1[]=a.toCharArray();
	     int b[]=new int[257];
	     for(int i=0;i<s1.length;i++)
	     b[s1[i]]++;
	     for(int i=0;i<257;i++)
	     {
	         if(b[i]>1 && i!=32)
	         System.out.print((char)i+" ");
	     }
		
	}
}
----------------------------------------------------------------------
2)write the program check plaindrome or not using stringbuffer ?
import java.util.*;
public class Main
{
// 	public static void main(String[] args) {
// 	    Scanner s=new Scanner(System.in);
// 	    String a=s.nextLine();
// 	    StringBuffer b=new StringBuffer(a);
// 	    b.reverse();
// 	    System.out.println(a.contentEquals(b)?"plaindrome":"not");
// 	}
		public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String a=s.nextLine();
	    StringBuffer b=new StringBuffer(a);
	    b.reverse();
	    String c=b.toString();
	    System.out.println(a.equals(c)?"plaindrome":"not");
	}
}
--------------------------------------------------------------------