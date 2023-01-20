class Solution {
    public int reachNumber(int target) {

        target = Math.abs(target);
int sum=0 , steps=0;
   
    while(sum<target)
    {
        steps++;
        sum+=steps;
    }
        while((sum-target)%2==1)
        {
            steps++;
            sum+=steps;
        }
    return steps;
    }
    
    
    

}