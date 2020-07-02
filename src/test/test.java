package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws ParseException {
        NextDate();
    }

    public static void NextDate() throws ParseException {
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");

        Scanner scanner = new Scanner(System.in);
        System.out.println("传入日期格式示例：2020-1-1");
        String date = scanner.next();

        Date temp = dft.parse(date);
        Calendar cld = Calendar.getInstance();

        String year = dft.format(temp);
        System.out.println(year);
//        if (year > 1980 && year < 2100){
//            cld.setTime(temp);
//            cld.add(Calendar.DATE, 1);
//            temp = cld.getTime();
//            //获得下一天日期字符串
//            String nextDay = dft.format(temp);
//            System.out.println(nextDay);
//        }else {
//            System.out.println("越界");
//        }
    }
}
