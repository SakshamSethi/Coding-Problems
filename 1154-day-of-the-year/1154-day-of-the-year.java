class Solution {
    public int dayOfYear(String date) {
        
int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
        String[] d = date.split("-");
        
        int year = Integer.parseInt(d[0]);
        
        if(checkYear(year)) days[1]+=1;
        
        int month = Integer.parseInt(d[1]);
        
        int ans=0;
        for(int i=0;i<month-1;i++)
        {
            ans+=days[i];
        }
        return ans+Integer.parseInt(d[2]);
    }
        boolean checkYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
}