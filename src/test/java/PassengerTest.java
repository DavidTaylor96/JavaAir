import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;
import planes.Plane;
import planes.PlaneType;

import java.time.LocalTime;
import java.util.Random;

import static org.junit.Assert.*;

public class PassengerTest {
    Passenger passenger;
    Passenger passenger1;
    Flight flight;
    Plane plane;

    @Before
    public void before(){

        plane = new Plane(PlaneType.BOEING747);

        flight = new Flight("FF6622", "EDI", "GLA", "13:00", plane);

        passenger = new Passenger("David", 1, flight, 0);
        passenger1 = new Passenger("Juan", 1, flight, 0);

    }

    @Test
    public void hasName(){
        assertEquals("David", passenger.getName());
    }

    @Test
    public void hasBag(){
        assertEquals(1, passenger.getBags());
    }


    @Test
    public void hasFlightAssigned(){
        assertEquals("Destination: EDI, Flight time: 13:00, Flight number: FF6622", passenger.getFlightDetail());
    }

    @Test
    public void hasRandomSeatNumber(){
        assertEquals(0, passenger.getSeatNumber());
    }

    @Test
    public void hasBeenAssignedSeat(){
        flight.addPassengersToFlight(passenger);

        // Not to sure how this works.
        assertEquals(true, passenger.getSeatNumber() != 0);
    }

    @Test
    public void twoPassengersTwoSeatNumber(){
        flight.addPassengersToFlight(passenger);
        flight.addPassengersToFlight(passenger1);
        assertNotEquals(passenger.getSeatNumber(), passenger1.getSeatNumber());
    }

    @Test
    public void getTimeMigration(){
        assertEquals(LocalTime.parse("13:00"), passenger.getFlightTime());
    }
}
