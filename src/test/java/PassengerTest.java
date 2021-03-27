import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("David", 1);
    }

    @Test
    public void hasName(){
        assertEquals("David", passenger.getName());
    }

    @Test
    public void hasBag(){
        assertEquals(1, passenger.getBags());
    }
}
