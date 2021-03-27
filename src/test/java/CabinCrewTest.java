import crewMembers.CabinCrewMembers;
import crewMembers.CrewType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMembers cabinCrewMember;


    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMembers("Eleanor", CrewType.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Eleanor", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CrewType.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void hasMessagePassengers(){
        assertEquals("Hold on to your seatbelts", cabinCrewMember.messageToPassengers("Hold on to your seatbelts"));
    }
}
