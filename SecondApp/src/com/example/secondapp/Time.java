package com.example.secondapp;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;



public class Time {
	
	long startTime;
	long stopTime;
	public boolean running;
	
	public void start(){
		//startTime = Calendar.getInstance().getTime().getTime();
		startTime = System.currentTimeMillis();
		System.out.println("Start Time = " +startTime);
		running  = true;
	}
	
	public void stop() {
		//stopTime = Calendar.getInstance().getTime().getTime();
		stopTime = System.currentTimeMillis();
		System.out.println("Stop Time = " + stopTime);
		running = false;
	}
	
	public void reset() {
		startTime = 0;
		stopTime = 0;
		running = true;
	}
	
	public long elapsedTime() {
		long duration = stopTime - startTime;		
		System.out.println("Duration = " +TimeUnit.SECONDS.convert(duration, TimeUnit.MILLISECONDS));
		return (TimeUnit.SECONDS.convert(duration, TimeUnit.MILLISECONDS));
	}

}
