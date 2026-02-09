package Collection;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;

public class PassangerDetails {

	public static void main(String[] args) {
		passangerApp p1 = new PassengerApp(101,"Akanksha Meshram", "Nagpur", "Pune", "Airoplane");
		PassengerApp p2 = new PassengerApp(117,"Krupali Shivankar", "Nagpur", "Chennai", "Train");
		PassengerApp p3 = new PassengerApp(101,"Chaitali", "Nagpur", "Katol", "City Bus");
		
		ArrayList al=new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
class PassangerApp {
	int id;
    String name;
    String Destination_from;
    String Destination_to;
    String Source;
 
}
			    
	    
public passanger(int p_id, String p_name, String destination_from, String destination_to, String Source) {
			this.p_id = id;
	    	this.p_name = name;
	    	this.Destination_from = from;
	    	this.Destination_to = to;
	    	this.Source = Source;
	    
}
	    
	    public int getId() {
	    	return id;
	    }
	    public void setId(int id) {
	    	this.id = id;
	    }
	    	
	    public String Name() {
	    	return name;
	    }
	    public void setName(String name) {
	    	this.name = name;
	    }
	    public String From() {
	    	return from;
	    }
	   
	    public String getDestination_from() {
	    	return Destination_from;
	    }
	    public void setDestination_From(String Destination_from) {
	    	this.Destination_from = from;
	    }
	    public String getDestination_to() {
	    	return Destination_to;
	    }
	    public void setDestination_to(String Destination_to) {
	    	this.Destination_to = to;
	    }
	    
	    
	    Public int compareTo(Object o) {
	    	if(this.p_id)>(Passanger)(o))p_id){
	    		return 1;
	    	}
	    	else {
	    		return -1;
	    	}
	  }
	    }
	    
	 

}


