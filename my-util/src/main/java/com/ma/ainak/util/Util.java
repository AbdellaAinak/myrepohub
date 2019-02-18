package com.ma.ainak.util;
import java.util.Date;  
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * Hello world!
 *
 */
public  class  Util 
{
	
	public static String formatDate (Date Dinput, String pattern) {
		 SimpleDateFormat sdf = new SimpleDateFormat(pattern);
         String dateout =  sdf.format(Dinput);
		
		return dateout;
	}

	public static Date parseDate (String date , String pattern) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date dout = sdf.parse(date);
        return dout;
    } 
	
	
	public static int addition(int a, int b) {
		return a+b;
	}
}
