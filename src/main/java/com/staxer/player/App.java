package com.staxer.player;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	        

	        Player firstPlayer = new Player();
	        Player secondPlayer = new Player();
	        
	        for(; ; ) {
	        	 
	        	firstPlayer.sendMessage(secondPlayer, "Hello First Player");
	        	String message = firstPlayer.receiveMessage();
	        	System.out.println(message);
	        }
	        
	    }
}
