package crewMembers;

public class Pilot {

    private String name;
    private String pilotLicence;
    protected CrewType crewType;

    public Pilot(String name, CrewType crewType, String pilotLicence) {

        this.name = name;
        this.pilotLicence = pilotLicence;
        this.crewType = crewType;
    }

    public String getName() {
        return name;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }

    public CrewType getRank() {
        return crewType;
    }

    public String flyPlane(String instruction){
        return instruction;
    }
}
