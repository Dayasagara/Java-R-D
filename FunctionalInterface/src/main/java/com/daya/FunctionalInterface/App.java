package com.daya.FunctionalInterface;

/**
 * Hello world!
 *
 */
public class App implements Runnable
{
    public static void main( String[] args )
    {
    	Runnable r=new Runnable() {
    		
    		public void run() {
    			System.out.println("Running.....");
    		}
    	};
    	Thread thread=new Thread(r);
    	thread.start();
    }

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
