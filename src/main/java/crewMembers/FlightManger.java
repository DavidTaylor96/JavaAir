package crewMembers;

import flights.Flight;

public class FlightManger {

    private String name;
    private Flight flight;

    public FlightManger(String name, Flight flight) {
        this.name = name;
        this.flight = flight;
    }


    public String getName() {
        return name;
    }

    // weight reserved for one person bags.
    public double getWeightReservedForOnePassengerBags() {
        int weight = this.flight.getPlane().getPlaneTotalWeight() / 2;
        return weight / this.flight.getPlane().getPlaneCapacity();
    }

    // weight of bags for all booked passengers
    public int weightOFBagsForAllBookedPassengers() {
        return (int) (this.flight.getPassengerList() * this.getWeightReservedForOnePassengerBags() );
    }

    public int baggageWeightLeft(){
      int weightLeft = this.flight.getPlane().getPlaneTotalWeight() / 2;
      return weightLeft - this.weightOFBagsForAllBookedPassengers();
    }
}
