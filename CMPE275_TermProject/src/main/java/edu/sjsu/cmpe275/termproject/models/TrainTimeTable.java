package edu.sjsu.cmpe275.termproject.models;




public class TrainTimeTable {

	private int dept_time;
	
	//@Column(name="from_station")
    private String from;
	
	//@Column(name="to_station")
    private String to;
    
	//@Column(name="ticket_type")
    private String types;
	
	//@Column(name="round_trip")
    private String tripway;

	public int getDept_time() {
		return dept_time;
	}

	public void setDept_time(int dept_time) {
		this.dept_time = dept_time;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getTripway() {
		return tripway;
	}

	public void setTripway(String tripway) {
		this.tripway = tripway;
	}
}
	