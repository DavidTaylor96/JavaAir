package crewMembers;

public class CabinCrewMembers {
    private CrewType crewType;
    private String name;

    public CabinCrewMembers(String name,CrewType crewType){
        this.name = name;
        this.crewType = crewType;
    }

    public CrewType getRank() {
        return crewType;
    }

    public String getName() {
        return name;
    }

    public String messageToPassengers(String message){
        return message;
    }
}
