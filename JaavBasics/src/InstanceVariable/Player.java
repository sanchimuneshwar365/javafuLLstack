package InstanceVariable;
	class Player {

	    // instance variables
	    private int playerId;
	    private String playerName;

	    // Constructor
	    public Player(int playerId, String playerName) {
	        this.playerId = playerId;   // this = instance variable
	        this.playerName = playerName;
	    }

	    // Getter methods
	    public int getPlayerId() {
	        return playerId;
	    }

	    public String getPlayerName() {
	        return playerName;
	    }

	    // Setter methods
	    public void setPlayerId(int playerId) {
	        this.playerId = playerId;
	    }

	    public void setPlayerName(String playerName) {
	        this.playerName = playerName;
	    }
	}

	


