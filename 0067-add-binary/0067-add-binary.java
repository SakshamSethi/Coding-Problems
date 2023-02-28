class Solution {
    public String addBinary(String as, String bs) {
        
 int i = as.length()-1 , j=bs.length()-1;
        char a[] = as.toCharArray();
        char b[] = bs.toCharArray();
       StringBuffer res = new StringBuffer();
           int carry=0; 
        while(i>=0 && j>=0)
        {
        
            if(a[i]=='0'&& b[j]=='0')
            {
                if(carry ==1)
                {
                    res.append('1');
                    carry=0;
                }
                else
                res.append('0');
            }
            
            if(a[i]=='0'&&b[j]=='1')
            {
                if(carry ==1)
                {
                    res.append('0');
                    carry=1;
                }
                else {res.append('1'); carry=0;} 
            }
            
            if(a[i]== '1' && b[j]=='0')
            {
                if(carry ==1)
                {
                    res.append('0');
                    carry=1;
                }
              else {  res.append('1'); carry=0;}            }
            
            if(a[i]=='1'&&b[j]=='1')
            {
                if(carry ==1)
                {
                    res.append('1');
                    carry=1;
                }
               else { res.append('0');
                carry=1;
            }}
            
            i--;
            j--;
        }
        while(i>=0)
        {
                if(a[i]=='1')
                {
                    if(carry==1)
                    {
                        res.append('0');
                        carry=1;
                    }
                    else
                    {
                        res.append('1');
                    }
                    
                }
             if(a[i]=='0')
                {
                    if(carry==1)
                    {
                        res.append('1');
                        carry=0;
                    }
                    else
                    {
                        res.append('0');
                    }
                    
                }
            
            i--;
        }
        while(j>=0)
        {
                if(b[j]=='1')
                {
                    if(carry==1)
                    {
                        res.append('0');
                        carry=1;
                    }
                    else
                    {
                        res.append('1');
                    }
                    
                }
             if(b[j]=='0')
                {
                    if(carry==1)
                    {
                        res.append('1');
                        carry=0;
                    }
                    else
                    {
                        res.append('0');
                    }
                    
                }
            j--;
            
        }
        if(carry==1)
        {
            res.append('1');
        }
        res.reverse();
        String ress = new String(res);
        return ress;
    }
}