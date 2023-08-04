class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
      
      for(int ele : nums)
        pq.offer(ele);
      
      while(k>1)
      {
        pq.poll();
      k--;
      }
      return pq.peek();
    }
}