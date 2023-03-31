class Solution {
    public int canCompleteCircuit(int[] petrol, int[] distance) {


int total=0;	
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
        total+= petrol[i]-distance[i];
	}
	return total<0?-1:ans;
    }
}