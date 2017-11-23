/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmaluapp;

import java.io.Serializable;

/**
 *
 * @author jodey
 */
public class Airport extends Petmalu implements Serializable {
    private String Airport;
    private String FlightNmbr;
    private String Origin;
    private String Destination;
    
    public Airport (String Airport, String FlightNmbr, String Origin, String Destination) {
        Airport = " ";
        FlightNmbr = " ";
        Origin = " ";
        Destination = " ";
    }

    public void setAirport(String Airport) {
        this.Airport = Airport;
    }

    public void setFlightNmbr(String FlightNmbr) {
        this.FlightNmbr = FlightNmbr;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    
    public String getAirport() {
        return Airport;
    }

    public String getFlightNmbr() {
        return FlightNmbr;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getDestination() {
        return Destination;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+","+Airport+","+FlightNmbr+","+","+Origin+","+Destination;  
    }
    

}
