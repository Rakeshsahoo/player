package com.staxer.player;

/**
 * 
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	      //Creating to 2 different instance of class Player  
	        Player firstPlayer = new Player();
	        Player secondPlayer = new Player();
	        
	        for( ; ; ) {
	        	 //
	        	firstPlayer.sendMessage(secondPlayer, "Hello First Player");
	        	
	        	String message = firstPlayer.receiveMessage();
	        	System.out.println(message);
	        	
	        	//finalize the program (gracefully) after receiving 10th msg
	        	if(firstPlayer.getCounter() >= 10) {
	    			System.exit(0);
	    		}
	        }
	        
	    }
}
