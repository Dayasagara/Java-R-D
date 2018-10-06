package com.daya.test;

import org.junit.Test;

import com.daya.pojo.MyDate;
import com.daya.service.DateDifferenceProvider;

import junit.framework.TestCase;

public class DateDifferenceTestTest extends TestCase {
	@Test
	public void testCase1() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(06, 04, 2011);
		assertEquals(0, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase2() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 04, 2011);
		assertEquals(12, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase3() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 05, 2011);
		assertEquals(42, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase4() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 06, 2011);
		assertEquals(73, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase5() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2011);
		assertEquals(256, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase6() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2012);
		assertEquals(622, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase7() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2013);
		assertEquals(987, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase8() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2113);
		assertEquals(37511, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase9() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2413);
		assertEquals(147084, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase10() 
	{
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2813);
		assertEquals(293181, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase11() 
	{
		MyDate startDate = new MyDate(06, 01, 2011);
		MyDate endDate = new MyDate(06, 03, 2011);
		assertEquals(59, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase12() 
	{
		MyDate startDate = new MyDate(06, 01, 2012);
		MyDate endDate = new MyDate(06, 03, 2012);
		assertEquals(60, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase13() 
	{
		MyDate startDate = new MyDate(06, 02, 2012);
		MyDate endDate = new MyDate(06, 03, 2012);
		assertEquals(29, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
	
	@Test
	public void testCase14() 
	{
		MyDate startDate = new MyDate(22, 01, 2012);
		MyDate endDate = new MyDate(15, 11, 2012);
		assertEquals(298, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testCase15() 
	{
		MyDate startDate = new MyDate(06, 02, 2012);
		MyDate endDate = new MyDate(06, 12, 2012);
		assertEquals(304, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}
}
