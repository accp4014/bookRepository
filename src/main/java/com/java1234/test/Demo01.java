package com.java1234.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01 {

	public static Date formatDateStr(String formatDateStr,String format) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.parse(formatDateStr);
	}
	
	public static String formatDate(Date date,String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		if(date != null) {
			return simpleDateFormat.format(date);
		}
		return "";
	}
	
	public static void main(String [] args) throws ParseException {
		System.out.println(formatDate(formatDateStr("1995-02-09","yyyy-MM-dd"),"yyyy-MM-dd"));
		
		Calendar calendar = Calendar.getInstance();
		System.out.print(calendar.get(Calendar.YEAR)+"年"
				+(calendar.get(Calendar.MONTH)+1)+"月"
				+calendar.get(Calendar.DAY_OF_MONTH)+"日"
				+calendar.get(Calendar.HOUR)+"时"
				+calendar.get(Calendar.MINUTE)+"分"
				+calendar.get(Calendar.SECOND)+"秒"
				+"星期"+(calendar.get(Calendar.DAY_OF_WEEK)-1));
	}
}
