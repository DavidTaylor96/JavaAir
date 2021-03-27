import crewMembers.FlightManger;
import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManger flightManger;
    Flight flight;
    Plane plane;
    Passenger passenger;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);

        flight = new Flight("FA4433", "AMD", "EDI", "12:00", plane);

        flightManger = new FlightManger("Harrison", flight);

        passenger = new Passenger("Bob", 1, flight, 0);
    }

    @Test
    public void hasName(){
        assertEquals("Harrison", flightManger.getName());
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger(){
        assertEquals(5, flightManger.getWeightReservedForOnePassengerBags(), 0.0);
    }


    @Test
    public void canCalculateWeightAfterAddingPassengers(){
        flight.addPassengersToFlight(passenger);
        flight.addPassengersToFlight(passenger);
        assertEquals(10, flightManger.weightOFBagsForAllBookedPassengers());
    }

    @Test
    public void hasBaggageWeightLeftOver(){
        flight.addPassengersToFlight(passenger);
        flight.addPassengersToFlight(passenger);
        assertEquals(15, flightManger.baggageWeightLeft());
    }
}
