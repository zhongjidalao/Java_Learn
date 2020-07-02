package test;

public class Date {
    public static void main(String[] args) {
        NextDate(2099,12,31);
    }

    public static void NextDate(int year, int month, int day){
        int[] day30 = {2, 4, 6, 9, 11};
        int[] day31 = {1, 3, 5, 7, 8, 10, 12};

        int max_day = 0;
        for (int s : day30){
            if (s == month){
                max_day = 30;
                break;
            }
        }
        for (int s : day31){
            if (s == month){
                max_day = 31;
                break;
            }
        }

        if ((year > 1980 && year < 2100) && (month >= 1 && month <= 12 ) && (day >= 1 && day <= max_day)){
            if (month == 12 && day == 31){
                year = year + 1;
                month = 1;
                day = 1;
            }else if (month == 2 && day == 28){
                month = 3;
                day = 1;
            }else if (max_day == 30 && day == 30){
                month = month +1;
                day = 1;
            }else if (max_day == 31 && day == 31){
                month = month +1;
                day = 1;
            }else {
                day = day + 1;
            }

            System.out.println(year + "-" + month + "-" + day);
        }else {
            System.out.println("越界");
        }
    }
}
