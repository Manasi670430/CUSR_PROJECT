package edu.sjsu.cmpe275.termproject.services;



public interface CUSRService {

//	public ResponseEntity<?> createPlayer(HttpServletRequest request);
	
	//public Player getPlayer(int id);
	
	//public ResponseEntity<?> updatePlayer(int id, HttpServletRequest request);
	
	//public ResponseEntity<?> deletePlayer(int id);
	
	//public ResponseEntity<?> createSponsor(HttpServletRequest request);

	//public Sponsor getSponsor(int id);
	
	//public ResponseEntity<?> updateSponsor(int id, HttpServletRequest request);
	
	//public ResponseEntity<?> deleteSponsor(int id);
	
	public String addOpponents(int id1, int id2);
	
	public String removeOpponents(int id1, int id2);
	
}
