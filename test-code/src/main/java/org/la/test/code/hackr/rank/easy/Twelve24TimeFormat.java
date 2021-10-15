package org.la.test.code.hackr.rank.easy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Twelve24TimeFormat {
    public static String timeConversion(String s) throws ParseException {
        String result = null;
        try {
            DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
            DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = inputFormat.parse(s);
            result = outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(timeConversion("12:01:00AM"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
