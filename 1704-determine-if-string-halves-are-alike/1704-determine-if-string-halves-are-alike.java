class Solution {
    public boolean halvesAreAlike(String s) {
        
        char[] c = s.toCharArray();
        
        int n = c.length;
        int h = n/2;
        int a=0,b=0;
        System.out.println(h);
        for(int i=0;i<h;i++)
        {
            if(c[i]=='a'||c[i]=='A'||c[i]=='e'||c[i]=='E'||c[i]=='i'||c[i]=='I'||c[i]=='o'||c[i]=='O'||c[i]=='u'||c[i]=='U' )
            {
                a++;
            }
        }
        for(int i=h;i<n;i++)
        {
            if(c[i]=='a'||c[i]=='A'||c[i]=='e'||c[i]=='E'||c[i]=='i'||c[i]=='I'||c[i]=='o'||c[i]=='O'||c[i]=='u'||c[i]=='U' )
            {
                b++;
            }
        
  
        }
       
          if(a==b) return true;
        
        return false;
    }
    
}