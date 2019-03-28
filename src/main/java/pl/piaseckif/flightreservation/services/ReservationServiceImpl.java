package pl.piaseckif.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piaseckif.flightreservation.dto.ReservationRequest;
import pl.piaseckif.flightreservation.entities.Flight;
import pl.piaseckif.flightreservation.entities.Passenger;
import pl.piaseckif.flightreservation.entities.Reservation;
import pl.piaseckif.flightreservation.repositories.FlightRepository;
import pl.piaseckif.flightreservation.repositories.PassengerRepository;
import pl.piaseckif.flightreservation.repositories.ReservationRepository;
import pl.piaseckif.flightreservation.util.EmailUtil;
import pl.piaseckif.flightreservation.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    PDFGenerator pdfGenerator;

    @Autowired
    EmailUtil emailUtil;

    @Override
    public Reservation bookFlight(ReservationRequest request) {

        //Add some kind of payment method PayU, PayPal, etc.

        //payment successful
        Long flightId = request.getFlightId();
        Flight flight = flightRepository.findById(flightId).orElse(null);

        Passenger passenger = new Passenger();
        passenger.setFirstName(request.getPassengerFirstName());
        passenger.setLastName(request.getPassengerLastName());
        passenger.setEmail(request.getPassengerEmail());
        passenger.setPhone(request.getPassengerPhone());

        Passenger savedPassenger = passengerRepository.save(passenger);

        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setCheckedIn(false);

        Reservation savedReservation = reservationRepository.save(reservation);

        String filePath = "E:\\flightreservation\\itinerary" + savedReservation.getId() + ".pdf";
        pdfGenerator.generateItinerary(savedReservation, filePath);

        emailUtil.sendItinerary(passenger.getEmail(), filePath);


        return savedReservation;
    }
}
