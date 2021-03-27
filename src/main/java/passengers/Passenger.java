package passengers;

import flights.Flight;

import java.util.Random;

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
//        this.seatNumber = getSeatNumber();
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    //
//    public int getSeatNumber() {
//        Random rand = new Random();
//        return this.seatNumber = rand.nextInt(5);
//    }
}
