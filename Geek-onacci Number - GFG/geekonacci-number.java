/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int  t = s.nextInt() ;
	
	
	while(t>0)
	{
	    int  a = s.nextInt() ;
		int  b = s.nextInt() ;
		int  c = s.nextInt() ;
		int  n = s.nextInt() ;
	    
	    System.out.println(ans(a,b,c,n));
	    
	    t--;
	}	    
	    
	}
	
	static int ans(int a, int b,int c,int n)
	{
	    if(n<=0) return 0;
	    if(n==1) return a;
	    if(n==2) return b;
	    if(n==3) return c;
	    
	    
	    return ans(a,b,c,n-1)+ans(a,b,c,n-2)+ans(a,b,c,n-3);
	    
	    
	}
}