package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class Stopwatch {
	  
	  private long startTime = 0;
	  private long stopTime = 0;
	  private boolean running = false;
	  
	  
	  public void start() {
	    this.startTime = System.currentTimeMillis();
	    this.running = true;
	  }
	  
	  
	  public void stop() {
	    this.stopTime = System.currentTimeMillis();
	    this.running = false;
	  }
	  
	  
	  //elaspsed time in milliseconds
	  public long getElapsedTime() {
	    long elapsed;
	    if (running) {
	      elapsed = (System.currentTimeMillis() - startTime);
	    } else {
	      elapsed = (stopTime - startTime);
	    }
	    return elapsed;
	  }
	  
	  
	  //elaspsed time in seconds
	  public long getElapsedTimeSecs() {
	    long elapsed;
	    if (running) {
	      elapsed = ((System.currentTimeMillis() - startTime) / 1000);
	    } else {
	      elapsed = ((stopTime - startTime) / 1000);
	    }
	    return elapsed;
	  }
	  //print sysout time
	  public void printTime() {
		  System.out.println("start time: "+this.startTime+", end time: "+this.stopTime+" & elapsed time: "+this.getElapsedTime()+"ms");
	  }
}