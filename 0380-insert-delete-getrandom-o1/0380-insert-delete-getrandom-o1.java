class RandomizedSet {

    HashSet<Integer>set ;
    Random random;
    public RandomizedSet() {
        set = new HashSet();
        random = new Random(); 
    }
    
    public boolean insert(int val) {
        if(!set.contains(val))
        {
            set.add(val);
            return true;
        }
        return false;
        
    }
    
    public boolean remove(int val) {
        
        if(set.contains(val))
        {
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        
        int min = 0;
        int max = set.size()-1;
        
        int rand = random.nextInt(max-min+1)+min;
        Integer[] array = set.toArray(new Integer[0]);
        return array[rand];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */