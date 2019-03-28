<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Complete Reservation</title>
</head>
<pre>
<h2> Complete Your Reservation</h2>

    Airline: ${flight.operatingAirlines}<br>
    Departure City: ${flight.departureCity}<br>
    Arrival City: ${flight.arrivalCity}<br>
    Departure Time ${flight.estimatedDepartureTime}<br>
<form action="completeReservation" method="post">
    <h2>Passenger Details</h2>
    First Name:             <input type="text" name="passengerFirstName"/><br>
    Last Name:              <input type="text" name="passengerLastName"/><br>
    e-mail Address:         <input type="text" name="passengerEmail"/><br>
    Phone Number:           <input type="text" name="passengerPhone"/><br>

    <h2>Card Details:</h2>
    Name of the Cardholder: <input type="text" name="nameOnTheCard"/><br>
    Card Number:            <input type="text" name="cardNumber"/><br>
    Expiry Date:            <input type="text" name="expirationDate"/><br>
    CVV Code:               <input type="text" name="cvvCode"/><br>

    <input type="hidden" name="flightId" value="${flight.id}"/>
    <input type="submit" value="Confirm"/>
    </pre>

</form>


</body>
</html>