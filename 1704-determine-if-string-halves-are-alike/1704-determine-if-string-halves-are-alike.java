class Solution {
    public boolean halvesAreAlike(String s) {
        
      s = s.toLowerCase();
        char[] c = s.toCharArray();
        
        int n = c.length;
        int h = n/2;
        int a=0,b=0;
    
        for(int i=0;i<h;i++)
        {
            if(c[i]=='a' ||c[i]=='e'|| c[i]=='i'||  c[i]=='o' ||c[i]=='u' )
            {
                a++;
            }
          if(c[i+h]=='a' ||c[i+h]=='e'|| c[i+h]=='i'||  c[i+h]=='o' ||c[i+h]=='u' )
            {
                b++;
            }
        }
       return a==b;
    }
    
}