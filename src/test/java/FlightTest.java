import crewMembers.CabinCrewMembers;
import crewMembers.CrewType;
import crewMembers.Pilot;
import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;
import planes.Plane;
import planes.PlaneType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

        Flight flight;

        Passenger passenger;

        CabinCrewMembers cabinCrewMember;

        Pilot pilot;

        Plane plane;



        @Before
        public void before(){

            passenger = new Passenger("David", 1, flight);

            cabinCrewMember = new CabinCrewMembers("John", CrewType.FLIGHT_ATTENDANT);


            pilot = new Pilot("Jenny", CrewType.CAPTAIN, "BB442211");

            plane = new Plane(PlaneType.BOEING747);


            flight = new Flight("FR756", "EDI", "GLA", "10:00", plane);

        }


        @Test
        public void hasPassengerList(){
            assertEquals(0, flight.getPassengerList());
        }

        @Test
        public void hasCabinCrewMembers(){
            flight.addCabinCrew(cabinCrewMember);
            flight.addCabinCrew(cabinCrewMember);
            flight.addCabinCrew(cabinCrewMember);
            assertEquals(3, flight.getCabinCrewList());
        }

        @Test
        public void hasFlightNumber(){
            assertEquals("FR756", flight.getFlightNumber());
        }

        @Test
        public void hasDestination(){
            assertEquals("EDI", flight.getDestination());
        }

        @Test
        public void hasDepartureAirport(){
            assertEquals("GLA", flight.getDepartureAirport());
        }

        @Test
        public void hasDepartureTime(){
            assertEquals("10:00", flight.getDepartureTime());
        }

        @Test
        public void hasPassengers(){
            assertEquals(0 , flight.getPassengerList());
        }

        @Test
        public void hasPilot(){
            flight.addPilot(pilot);
            flight.addPilot(pilot);
            assertEquals(2 , flight.getPilot());
        }

        @Test
        public void canAddPassengersToFlight(){
            flight.addPassengersToFlight(passenger);
            flight.addPassengersToFlight(passenger);
            assertEquals(2, flight.getPassengerList());
            assertEquals(3, flight.getAvailableSeats());
        }

        @Test
        public void canNotOverBookFlight(){
            flight.addPassengersToFlight(passenger);
            flight.addPassengersToFlight(passenger);
            flight.addPassengersToFlight(passenger);
            flight.addPassengersToFlight(passenger);
            flight.addPassengersToFlight(passenger);
            assertEquals("Flight is full", flight.addPassengersToFlight(passenger));

        }
}
