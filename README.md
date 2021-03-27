<h1>JavaAir</h1>

<h2>Airline!</h2>

Your task is to model a system for the world renowned airline JavaAir, to allow them to manage their flights. You should use the tools you have learnt this week where appropriate and useful. Remember to TDD!

<h2>Assumptions:</h2>

<p> - Each passenger bag weighs the same</p>
<p> - Planes reserve half of their total weight for passenger bags</p>
<p> - The weight of bag per person is the weight reserved for passenger bags divided by the capacity</p>
<p> - Passengers exist for a single flight only</p>

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
<ul>
 <li>an plane type (e.g. BOEING747) which stores capacity and total weight</li>
</ul>

A Flight has:
<ul>
<li>at least one Pilot</li>
<li>a list of CabinCrewMembers (you can decide the number)</li>
<li>an empty list of booked Passenger's</li>
<li>a Plane</li>
<li>flight number (i.e. "FR756")</li>
<li>destination (i.e. GLA, EDI)</li>
<li>departure airport (i.e. GLA, EDI)</li>
<li>departure time (use a String)</li>
</ul>

The Flight should be able to:

<ul>
<li>return the number of available seats</li>
<li>book a passenger (if there are remaining seats)</li>
<li>A Pilot should be able to:</li>
<li>fly the plane (a simple method which returns a String is sufficient)</li>
</ul>

A CabinCrewMember should be able to:
<ul>
<li>relay messages to the passengers(a simple method which returns a String is sufficient)</li>
 </ul>

<h2>Extensions</h2>

Create a FlightManager which can:
<ul>
<li>calculate how much baggage weight should be reserved for each passenger for a flight</li>
<li>calculate how much baggage weight is booked by passengers of a flight</li>
<li>calculate how much overall weight reserved for baggage remains for a flight</li>
</ul>

<h2>More Extensions</h2>
<ul>
<li>Add a 'flight' property to the Passenger which is assigned when a passenger is added to a flight</li>
<li>Add a 'seat number' property to the Passenger as an integer. Set it to a random number which is assigned when a Passenger is booked on a flight</li>
<li>Make sure the flight doesn't double book the same seat number to more than one passenger</li>
</ul>
