import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;
import planes.Plane;
import planes.PlaneType;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    Flight flight;
    Plane plane;

    @Before
    public void before(){

        plane = new Plane(PlaneType.BOEING747);

        flight = new Flight("FF6622", "EDI", "GLA", "13:00", plane);

        passenger = new Passenger("David", 1, flight);

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
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void hasRandomSeatNumber(){
        assertEquals(, passenger.getSeatNumber());
    }
}
