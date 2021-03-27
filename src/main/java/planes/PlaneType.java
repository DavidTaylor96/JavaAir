package planes;

public enum PlaneType {
    BOEING747(5, 50),
    AIRBUS(4, 40);

    private final int capacity;
    private final  int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getPlaneCapacity() {
        return capacity;
    }

    public int getPlaneTotalWeight(){
        return totalWeight;
    }
}
