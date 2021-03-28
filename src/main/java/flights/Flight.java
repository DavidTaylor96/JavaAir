package flights;

import crewMembers.CabinCrewMembers;
import crewMembers.Pilot;
import passengers.Passenger;
import planes.Plane;

import java.util.ArrayList;
import java.util.Random;

public class Flight {

    protected Plane plane;


    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMembers> cabinCrewMembers;
    private ArrayList<Pilot> pilots;

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    private int emptySeats;

   private Flight flight;
   private ArrayList<Passenger> assignSeatNumber;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, Plane plane) {

        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

        this.emptySeats = plane.getPlaneCapacity();

        this.plane = plane;

        this.passengers = new ArrayList<Passenger>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMembers>();
        this.pilots = new ArrayList<Pilot>();
        this.assignSeatNumber = new ArrayList<Passenger>();

    }


    //--------------------------Passengers--------------------------------
    public int getPassengerList() {
        return this.passengers.size();
    }



    //--------------------CabinCrewMembers-------------------------------
    public void addCabinCrew(CabinCrewMembers cabinCrewMembers) {
        this.cabinCrewMembers.add(cabinCrewMembers);
    }

    public int getCabinCrewList() {
        return this.cabinCrewMembers.size();
    }


    //-----------------------Pilot and planes---------------------------------------

    public int getPilot(){
        return pilots.size();
    }
    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public Plane getPlane(){
        return plane;
    }


    //-----------------------Flight------------------------------------

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }



    //--------------------Find available seats-------------------

    public int getAvailableSeats(){
        return this.emptySeats;
    }


    public String addPassengersToFlight(Passenger passenger){
        if (getPassengerList() < this.getAvailableSeats()){
            this.emptySeats -= 1;
            this.passengers.add(passenger);
            passenger.setFlight(flight);
            passenger.setSeatNumber(this.getAssignedSeat());
            passenger.getFlight();
            return "Booked on to flight";
        }
        return "Flight is full";
    }


    public int getAssignedSeat(){
        Random rand = new Random();
        int assignedSeat =  rand.nextInt(5);
        return assignedSeat;
    }

}
