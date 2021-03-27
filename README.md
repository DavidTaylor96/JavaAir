<h1>JavaAir</h1>

<h2>Airline!</h2>

Your task is to model a system for the world renowned airline JavaAir, to allow them to manage their flights. You should use the tools you have learnt this week where appropriate and useful. Remember to TDD!

<h2>Assumptions:</h2>

<p>Each passenger bag weighs the same</p>
<p>Planes reserve half of their total weight for passenger bags</p>
<p>The weight of bag per person is the weight reserved for passenger bags divided by the capacity</p>
<p>Passengers exist for a single flight only</p>

<h2>MVP</h2>
A Passenger has:
<ul>
 <li>a name</li>
 <li>a number of bags</li>
</ul> 

<p>A CabinCrewMember has:<p>
 <ul>
   <li>a name</li> 
   <li>a rank (e.g Captain/First Officer/Purser, Flight Attendant)</li>
  </ul>
  
A Pilot has:
<ul>
<li>a name</li>
<li>a rank</li>
<li>a pilot licence number (you can use a String for this)</li>
</ul>
A Plane has:

an plane type (e.g. BOEING747) which stores capacity and total weight
Hint
A Flight has:

at least one Pilot
a list of CabinCrewMembers (you can decide the number)
an empty list of booked Passenger's
a Plane
flight number (i.e. "FR756")
destination (i.e. GLA, EDI)
departure airport (i.e. GLA, EDI)
departure time (use a String)
The Flight should be able to:

return the number of available seats
book a passenger (if there are remaining seats)
A Pilot should be able to:

fly the plane (a simple method which returns a String is sufficient)
A CabinCrewMember should be able to:

relay messages to the passengers(a simple method which returns a String is sufficient)

###Extensions
Create a FlightManager which can:

calculate how much baggage weight should be reserved for each passenger for a flight
calculate how much baggage weight is booked by passengers of a flight
calculate how much overall weight reserved for baggage remains for a flight

###More Extensions
Refactor the Flight's departure time to use the Date class (HINT: Look into Type Migration in IntelliJ to refactor faster)
Add a 'flight' property to the Passenger which is assigned when a passenger is added to a flight
Add a 'seat number' property to the Passenger as an integer. Set it to a random number which is assigned when a Passenger is booked on a flight
Make sure the flight doesn't double book the same seat number to more than one passenger
