package planes;

public class Plane {

    protected PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getPlaneCapacity() {
        return planeType.getPlaneCapacity();
    }

    public int getPlaneTotalWeight() {
        return planeType.getPlaneTotalWeight();
    }
}
