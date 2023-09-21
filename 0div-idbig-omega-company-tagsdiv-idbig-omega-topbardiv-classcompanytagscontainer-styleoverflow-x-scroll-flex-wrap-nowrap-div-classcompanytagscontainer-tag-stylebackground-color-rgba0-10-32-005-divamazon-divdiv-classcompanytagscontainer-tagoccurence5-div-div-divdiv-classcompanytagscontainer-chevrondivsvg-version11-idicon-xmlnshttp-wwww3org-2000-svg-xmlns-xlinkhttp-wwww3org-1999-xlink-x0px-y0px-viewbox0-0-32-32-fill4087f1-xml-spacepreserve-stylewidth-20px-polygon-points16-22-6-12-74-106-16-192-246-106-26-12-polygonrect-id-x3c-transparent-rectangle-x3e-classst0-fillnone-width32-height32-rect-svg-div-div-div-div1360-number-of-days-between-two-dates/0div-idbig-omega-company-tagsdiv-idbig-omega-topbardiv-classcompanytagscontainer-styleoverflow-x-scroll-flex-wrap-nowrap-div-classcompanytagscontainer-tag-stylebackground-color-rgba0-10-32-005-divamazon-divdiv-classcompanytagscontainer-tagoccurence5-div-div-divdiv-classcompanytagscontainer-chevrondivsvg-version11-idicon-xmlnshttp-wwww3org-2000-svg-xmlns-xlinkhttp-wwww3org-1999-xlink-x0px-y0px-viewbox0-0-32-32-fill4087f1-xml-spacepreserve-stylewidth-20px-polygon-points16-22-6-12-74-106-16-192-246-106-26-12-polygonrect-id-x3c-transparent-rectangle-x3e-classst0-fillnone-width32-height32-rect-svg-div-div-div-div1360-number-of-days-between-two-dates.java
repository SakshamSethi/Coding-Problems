 
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(numOfDays(date1) - numOfDays(date2));
    }

    public int numOfDays(String date) {
        int[] monthDays = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };

        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));

        for(int i = 0 ; i < month-1; i++){
            day += monthDays[i];
        }

        day += (year-1)*365 + (year-1)/4;
        if(year % 4 == 0 && month > 2 && year != 2100) day++;

        return day;
    }
}
 