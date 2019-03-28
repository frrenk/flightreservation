package pl.piaseckif.flightreservation.services;

import pl.piaseckif.flightreservation.dto.ReservationRequest;
import pl.piaseckif.flightreservation.entities.Reservation;

public interface ReservationService {

    public Reservation bookFlight(ReservationRequest request);
}
