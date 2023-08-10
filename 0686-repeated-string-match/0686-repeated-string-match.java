class Solution {
    public int repeatedStringMatch(String a, String b) {
        
      int n1 = a.length();
      int n2 = b.length();
      if(a.contains(b))return 1;
       
      String str = "";
      
      int times=0;
      
      while(str.length()<n2)
      {
 
        str+=a;
        times++;
        
      }
      if(str.contains(b))return times;
      
      str+=a;
      times++;
      
      return str.contains(b)?times:-1;
      
             
    }
}