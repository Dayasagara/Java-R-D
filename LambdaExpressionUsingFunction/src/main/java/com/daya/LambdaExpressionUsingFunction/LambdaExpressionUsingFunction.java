package com.daya.LambdaExpressionUsingFunction;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class LambdaExpressionUsingFunction 
{
    public static void main( String[] args )
    {
        List<Integer> list= new ArrayList<Integer>();
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(9);
        list.forEach(System.out::println);//to print all entered elements in list
        
        System.out.println("==================================");
        
        //to print the square root of numbers present in the list
        List<Double> findSquareRoot = LambdaExpressionUsingFunction.findSquareRoots(list, Integer::new);
        findSquareRoot.forEach(System.out::println);
        
    }

	private static List<Double> findSquareRoots(List<Integer> list, Function<Integer, Integer> f) {
		List<Double> result= new ArrayList<>();
		list.forEach((x)->result.add(Math.sqrt(f.apply(x))));
		return result;
		
	}

	
		
	
}