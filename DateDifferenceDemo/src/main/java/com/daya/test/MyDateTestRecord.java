package com.daya.test;

import com.daya.pojo.MyDate;

public class MyDateTestRecord {
	public MyDate startDate;
	public long expectedResult;
	public MyDate endDate;
	public MyDateTestRecord(MyDate startDate , MyDate endDate,long expectedResult) {
		super();
		this.startDate = startDate;
		this.expectedResult = expectedResult;
		this.endDate = endDate;
	}
	
	
}
