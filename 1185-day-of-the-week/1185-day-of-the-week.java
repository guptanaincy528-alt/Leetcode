class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week={"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
        int[] monthDays={31,28,31,30,31,30,31,31,30,31,30,31};
        int days=0;

        for(int y=1971;y<year;y++){
            days+=365;

            if(y%400 ==0 || (y%4==0 && y%100!=0)){
                days++;
            }
        }

        for(int m=1;m<month;m++){
            days+=monthDays[m-1];

            if(m==2 && (year%400==0 || (year %4==0 && year %100!=0))){
                days++;
            }
        }
        days+=day;

        return week[(days-1)%7];

    }
}