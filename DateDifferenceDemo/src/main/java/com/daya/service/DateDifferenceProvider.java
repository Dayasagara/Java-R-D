package com.daya.service;

import com.daya.pojo.MyDate;

public class DateDifferenceProvider {
	static int daysInMonth[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	final static int Days_IN_LEAP_YEAR=366;
	final static int Days_IN_NON_LEAP_YEAR=365;
	public static int getDateDifference(MyDate startDate, MyDate endDate) {
		if (sameMonth(startDate, endDate) && sameYear(startDate, endDate) && sameDay(startDate, endDate)) {
			return 0;
		} else if (sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return endDate.getDd() - startDate.getDd();
		} else if (!sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return remainingDaysInMonth(startDate) + daysInInterveningMonth(startDate, endDate) + leadingMonth(endDate);
		} else {
			return remainingDaysInYear(startDate) + daysInInterveningYear(startDate, endDate) + LeadingYear(endDate);
		}
	}

	private static int LeadingYear(MyDate endDate) {
		int days = leadingMonth(endDate);
		int monthCount = endDate.getMm() - 1;
		while (monthCount > 0) {
			
			days = days + daysInMonth[monthCount];
			monthCount--;
		}
		return days;
	}

	private static int remainingDaysInYear(MyDate startDate) {
		int days = remainingDaysInMonth(startDate);
		int monthCount = startDate.getMm();
		while (monthCount <= 11) {
			if(!isLeap(startDate.getYyyy())&&monthCount==1) {
				days=days+28;	
			}
			else {
				days = days + daysInMonth[monthCount];
			}
			monthCount++;
		}
		return days;
	}

	private static int leadingMonth(MyDate endDate) {
		return endDate.getDd();
	}

	private static int daysInInterveningMonth(MyDate startDate, MyDate endDate) {
		int days = 0;
		int monthCount = startDate.getMm();
		while (monthCount < endDate.getMm() - 1) {
			if(!isLeap(startDate.getYyyy())&&monthCount==1) {
				days=days+28;	
			}
			else {
			days = days + daysInMonth[monthCount];
			}
			monthCount++;
		}
		return days;
	}

	private static int daysInInterveningYear(MyDate startDate, MyDate endDate) {
		int days = 0;
		int yearCount = startDate.getYyyy();
		while (yearCount < endDate.getYyyy() - 1) {
			if (isLeap(yearCount)) {
				days = days + Days_IN_LEAP_YEAR;
			} else {
				days = days + Days_IN_NON_LEAP_YEAR;
			}
			yearCount++;
		}
		return days;
	}

	private static boolean isLeap(int yearCount) {
		if (((yearCount % 4 == 0)&& (yearCount % 100 != 0)) || (yearCount % 400 == 0)) {
			return true;
		} 
		else {
			return false;
		}
	}

	private static boolean sameMonth(MyDate startDate, MyDate endDate) {
		return startDate.getMm() == endDate.getMm();
	}

	private static boolean sameDay(MyDate startDate, MyDate endDate) {
		return startDate.getDd() == endDate.getDd();
	}

	private static boolean sameYear(MyDate startDate, MyDate endDate) {
		return startDate.getYyyy() == endDate.getYyyy();
	}

	private static int remainingDaysInMonth(MyDate startDate) {
		if(!isLeap(startDate.getYyyy())&&startDate.getMm()==2) {
			return 28;
		}
		else {
			return daysInMonth[startDate.getMm() - 1] - startDate.getDd();
		}
	}
}
