/**
 * 
 */
package com.staxer.player;

/**
 * @author srake
 *
 */
public class Player {
	
	private Player player;
	private String message;
	private static int counter;
	
	public Player() {
		
	}
	
	public void sendMessage(Player secPlayer ,  String message) {
		player = secPlayer;
		player.setMessage(message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String receiveMessage() {
		if(counter >= 10) {
			System.exit(0);
		}
		return player.getMessage()+" "+(++counter);
	}

}
