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
	
	/**
	 * This method is responsible to set msg in second player
	 * @param secPlayer
	 * @param message
	 */
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
	
	public int getCounter() {
		return counter;
	}
	
	/**
	 * This method is responsible for sending back the message to first player
	 * @return string message
	 */
	public String receiveMessage() {
		return player.getMessage()+" "+(++counter);
	}

}
