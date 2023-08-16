class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
      //Binary Search  Approach is kind of tricky with duplicates !
      
      // 1st approach : using an HashMap 
      // 2nd if the array is arleady sorted and there are no duplicates then we can apply BS !
      // we can apply binary search by searching the adjacent elements (tricky!!)
      // 3rd if duplicates are there then what we can do is use the 2 pointer appraoch !
      
      // using 2 pointer approach !
      
      int i = 0;
      int j = 0;
      
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      
      int n=nums1.length;
      int m = nums2.length;
      
      ArrayList<Integer> list = new ArrayList<>();
      
      while(i<n && j<m)
      {
        if(nums1[i]==nums2[j])
        {
          list.add(nums1[i]);
          i++; j++;
          
        }
        
        else if ( nums1[i]<nums2[j])
        {
          i++;
        }
        else
        {
          j++;
        }
        
      }
      
    int[]ans = new int[list.size()];
      
      int k=0;
      
      for(int ele : list) ans[k++] = ele;
      
      return ans;
    }
}