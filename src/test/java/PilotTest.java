import crewMembers.CrewType;
import crewMembers.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {


    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("John", CrewType.CAPTAIN, "BF662241");
    }

    @Test
    public void hasName(){
        assertEquals("John", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CrewType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicence(){
        assertEquals("BF662241", pilot.getPilotLicence());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Requesting fly by!!", pilot.flyPlane("Requesting fly by!!"));
    }
}
