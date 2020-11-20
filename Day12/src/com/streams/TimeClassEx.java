//*
/*
 * @author vaishnavi
 * @date 18/11/2020
 * Time class is for accepting date from user and applying Time API functions
 */
package com.streams;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;
public class TimeClassEx {
    public static void main(String[] args) {
		String date;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date");
		date=sc.next();//accepting date from user
		LocalDate ld=LocalDate.parse(date);//declaring localdate object and converting accepted date into localdate format
		System.out.println(ld);
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println("Formatted Date "+ld.format(d));//format method accepts date formatter object and formats date according to the format specified
		System.out.println("new date after 6 days "+ld.plusDays(6));//printing date after 6 days using plusdays method
		System.out.println("year using temporal filed "+ld.get(ChronoField.YEAR));//getting year of date
		System.out.println("day of month using temporal field "+ld.get(ChronoField.DAY_OF_MONTH));//getting month of date
		System.out.println("day of year- "+ld.getDayOfYear()+" "+"day of month- "+ld.getDayOfMonth()+" "+"length of month- "+ld.lengthOfMonth());//getting year and month and length from given date
		System.out.println("year "+ld.getYear());//getting year
		System.out.println("month "+ld.getMonthValue());//getting month of year
		LocalDate ld1=LocalDate.now();
		System.out.println("checking two dates as before/after "+ld.isAfter(ld1));//checking two dates 
		System.out.println("checking two dates as before/after "+ld.isBefore(ld1));//checking two dates
		System.out.println("comparing two dates as equal "+ld.isEqual(ld1));//comparing two dates
		System.out.println("checking year as leap year "+ld.isLeapYear());//checking given year is leap year
		System.out.println("checking whether fields are supported in localdate "+ld.isSupported(ChronoField.ERA));//checks specified field is supported
		System.out.println("converting date to epoch day "+ld.toEpochDay());//converts date to epoch day
		System.out.println("checks the given day is start of  a day "+ld.atStartOfDay());//checks given day is start of a day
		LocalTime lt=LocalTime.now();
		System.out.println("combining date with time "+ld.atTime(lt));//getting time 
		System.out.println(ld.getChronology());//getting chronology i.e ISO
		
		

	}

}
