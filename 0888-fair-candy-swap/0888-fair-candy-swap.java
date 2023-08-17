class Solution {
    public int[] fairCandySwap(int[] alice,  int[] bob ) { 
        
      // simple we are having two arrays with different elements and we want to make the sum of         these two arrays equal ! --> by exchanging any two elements  !
      
      // we can break down the problem as :
      
      // lets say total sum of elements in Alice array is Sa and similarly Sb for Bob
      
      //  we want to make them equal by exchanging an element 
      
      // Sa - A + B = Sb - B + A 
      
      // 2(A-B) = (Sa-Sb)

      // A-B = (Sa-Sb) / 2  --> lets say the difference Sa-Sb to be D 
      
      // hence  A-B = D/2  , where A is the element in Alice and B in Bob which are to be               exchanged
      
      // now what we want is , using any one array we will find an element in other array
      
      // A-B = D/2 --> what we can do is --> A = D/2 + B : from this we can search using each element in Bob  we want to see if there is any element in A such that its equal to D/2 + ele (element of B) and we will do this until we found such element and return the answer !
      
      
      
      
      int Sa = 0 , Sb = 0;
      
      
      for(int ele : alice) Sa += ele;
      
      for (int ele : bob) Sb += ele ;
      
      
      // now calculate D !
      
      int D = (Sa-Sb)/2;
      
      
      Arrays.sort(alice); // so that we can perform binarySearch eaisly !
      
      
      for(int ele : bob)
      {
       
        if( binarySearch(alice,D+ele)!=-1) return new int[]{ele+D,ele};
      }
      
      return new int[]{-1,-1}; // dummy as the question guarenteed to have atlease 1 pair  
      
      
    }
  
  int binarySearch(int[] arr , int target)
  {
    int s = 0 ;
    int e = arr.length-1;
    
    while(s<=e)
    {
      int mid = s + (e-s)/2;
      if(arr[mid]==target) return arr[mid];  
      
      else if(arr[mid]<target) s=mid+1;
      else e=mid-1;
      
    }
    return -1;
  }
}