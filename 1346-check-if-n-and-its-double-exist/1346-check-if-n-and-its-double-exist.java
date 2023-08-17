class Solution {
    public boolean checkIfExist(int[] arr) {
     
  
      // can sort the array and perform binary search for each element to find out if 
      // there exists its double in the array or not 
      // nlogn complexity 
      
      // can use a set to check if it contains the double of an element 
      // will use  O(n) time but o(n) space as well
      
      
      HashSet<Integer>hs = new HashSet();
      
  
      
      for(int ele : arr)
      { 
        if(hs.contains(ele*2)||(ele%2==0 && hs.contains(ele/2))) return true;
     
        hs.add(ele);
          
      }
      return false;
}
  
}