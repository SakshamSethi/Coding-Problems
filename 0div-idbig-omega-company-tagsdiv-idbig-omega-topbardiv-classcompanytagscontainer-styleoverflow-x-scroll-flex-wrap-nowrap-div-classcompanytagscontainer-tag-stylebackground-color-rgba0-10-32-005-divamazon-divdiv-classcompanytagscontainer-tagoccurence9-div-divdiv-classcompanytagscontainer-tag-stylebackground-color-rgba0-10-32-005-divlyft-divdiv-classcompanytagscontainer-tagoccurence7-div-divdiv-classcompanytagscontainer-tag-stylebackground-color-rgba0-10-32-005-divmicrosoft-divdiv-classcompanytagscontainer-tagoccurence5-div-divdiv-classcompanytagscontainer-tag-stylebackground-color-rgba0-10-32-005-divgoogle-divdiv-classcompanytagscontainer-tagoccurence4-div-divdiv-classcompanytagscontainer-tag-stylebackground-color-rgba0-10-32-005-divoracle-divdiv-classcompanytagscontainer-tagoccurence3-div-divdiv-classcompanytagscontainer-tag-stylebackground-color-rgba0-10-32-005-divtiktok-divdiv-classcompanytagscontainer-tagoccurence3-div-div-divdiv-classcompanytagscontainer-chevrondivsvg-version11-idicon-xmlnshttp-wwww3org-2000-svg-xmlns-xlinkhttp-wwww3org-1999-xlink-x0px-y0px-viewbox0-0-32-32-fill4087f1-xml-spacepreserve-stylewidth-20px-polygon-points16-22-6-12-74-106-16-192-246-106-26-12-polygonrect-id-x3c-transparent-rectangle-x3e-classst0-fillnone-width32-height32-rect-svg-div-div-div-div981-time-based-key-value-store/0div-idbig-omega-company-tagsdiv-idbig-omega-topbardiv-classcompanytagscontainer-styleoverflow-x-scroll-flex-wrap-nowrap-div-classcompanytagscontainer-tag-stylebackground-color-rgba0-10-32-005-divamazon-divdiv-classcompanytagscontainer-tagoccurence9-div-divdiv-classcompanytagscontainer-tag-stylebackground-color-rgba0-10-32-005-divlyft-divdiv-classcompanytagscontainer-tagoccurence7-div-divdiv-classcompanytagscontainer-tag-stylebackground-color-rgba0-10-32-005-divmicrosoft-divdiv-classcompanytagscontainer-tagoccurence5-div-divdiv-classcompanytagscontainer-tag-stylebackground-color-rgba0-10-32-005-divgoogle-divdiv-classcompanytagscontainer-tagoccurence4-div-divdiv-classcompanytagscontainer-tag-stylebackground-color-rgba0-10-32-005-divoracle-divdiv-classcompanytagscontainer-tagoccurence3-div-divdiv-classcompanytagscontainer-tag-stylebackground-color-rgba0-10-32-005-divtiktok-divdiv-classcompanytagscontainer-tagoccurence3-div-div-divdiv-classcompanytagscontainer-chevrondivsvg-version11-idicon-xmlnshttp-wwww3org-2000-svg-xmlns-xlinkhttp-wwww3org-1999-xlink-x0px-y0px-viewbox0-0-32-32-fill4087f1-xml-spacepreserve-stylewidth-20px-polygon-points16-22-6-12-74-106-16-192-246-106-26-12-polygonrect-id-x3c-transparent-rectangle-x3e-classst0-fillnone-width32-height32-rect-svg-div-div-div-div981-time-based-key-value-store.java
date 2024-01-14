class TimeMap {
 
    class Pair
    {
        int time ; String val ;
        Pair(int time , String val)
        {
            this.time = time ;
            this.val = val ;
        }
    }
    
    
   HashMap<String , List<Pair>> map;

    public TimeMap() {
        map = new HashMap();
        
    }
    public void set(String key, String value, int timestamp) {
      
        if(!map.containsKey(key))
        { 
            ArrayList<Pair> arr = new ArrayList<>();
            arr.add(new Pair(timestamp , value));
            map.put(key , arr);
            
            return ;
        }
        else
        { 
            map.get(key).add(new Pair(timestamp,value));
            return ;
            
        }
    }
    
    public String get(String key, int timestamp) {
       
        if(!map.containsKey(key)) return "";
        
         
        String s = "";
        List<Pair> list = map.get(key);
        int time = binarySearch(list , timestamp);        
        if(time==-1)return "";
        
        s = list.get(time).val;
        
        return s;
    }
    
    private int binarySearch(List<Pair> list , int target)
    {
        int start = 0;
        int end = list.size()-1;
        int ans = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(list.get(mid).time==target)
            {
                 return mid;
            } 
            else if(list.get(mid).time<target)
            {
                ans = mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
    
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */