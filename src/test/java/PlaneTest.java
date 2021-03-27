import planes.Plane;
import org.junit.Before;
import org.junit.Test;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, plane.getPlaneCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(50, plane.getPlaneTotalWeight());
    }
}
