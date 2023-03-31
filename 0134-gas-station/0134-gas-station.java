class Solution {
    public int canCompleteCircuit(int[] petrol, int[] distance) {
        	int psum=0, dsum=0;
	for(int x : petrol) psum+=x;
	for(int x : distance) dsum+=x;
	
	if(dsum>psum) return -1;
	
	int fuel_storage=0;
	int ans=0;
	for(int i=0;i<petrol.length;i++)
	{
	    fuel_storage += petrol[i]-distance[i];
	    
	    if(fuel_storage<0)
	    {
	        fuel_storage = 0;
	        ans=i+1;
	    }
	}
	return ans;
    }
}