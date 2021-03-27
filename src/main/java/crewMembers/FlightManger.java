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

    public double getWeightReservedForOnePassenger() {
        int weight = this.flight.getPlane().getPlaneTotalWeight() / 2;
        return weight / this.flight.getPlane().getPlaneCapacity();
    }

    public int bagageWeightAllowed() {
        int fullWeightAllowance = this.flight.getPlane().getPlaneTotalWeight() / 2;
        return (int) (fullWeightAllowance - this.flight.getPassengerList() * this.getWeightReservedForOnePassenger());
    }
}
