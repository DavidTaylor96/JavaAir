package passengers;

import flights.Flight;

import java.time.LocalTime;

public class Passenger {

    private String name;
    private int bags;
    private Flight flight;


    private int seatNumber;

    public Passenger(String name, int bags, Flight flight, int seatNumber) {
        this.name = name;
        this.bags = bags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public String getFlightDetail() {
        return "Destination: " +flight.getDestination() + ", Flight time: " + flight.getDepartureTime() + ", Flight number: " + flight.getFlightNumber();
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalTime getFlightTime(){
       return LocalTime.parse(flight.getDepartureTime());
    }
}
