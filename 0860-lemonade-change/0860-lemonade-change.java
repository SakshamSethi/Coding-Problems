class Solution {
    public boolean lemonadeChange(int[] bills) {
      
  
      int fiveDollor=0 , tenDollor=0;
      for(int i=0 ; i<bills.length ; i++)
      {
        
        
        if(bills[i]==5)
        {
            fiveDollor++;
        }
        
        
        else  if(bills[i]==10)
            {
          if(fiveDollor<=0)return false;
             

        else
        {   fiveDollor--; 
            tenDollor++;
           
        }   
            
        }
        
          else
          {
            if(tenDollor>0 && fiveDollor>0) // koshish krenge ki jada se jada 10 k note return krne ki 
            {
              tenDollor--;
              fiveDollor--;
            }
         else   if(fiveDollor >= 3)
            {
              fiveDollor-=3;
            }
           
            else
            {
              return false;
            }
          }
          
      }
      
      
      return true;
        
    }
  
  
}

/*class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        for(int b : bills){
            if(b == 5){
                count5++;
            }else if(b == 10){
                if(count5 == 0){
                    return false;
                }else{
                    count5--;
                    count10++;
                }
            }else{
                if(count10 > 0 && count5 > 0){
                    count5--;
                    count10--;
                    continue;
                }else if(count5 >= 3){
                    count5 -= 3;
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}*/