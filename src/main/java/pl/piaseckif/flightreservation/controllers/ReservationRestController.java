package pl.piaseckif.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.piaseckif.flightreservation.dto.ReservationUpdateRequest;
import pl.piaseckif.flightreservation.entities.Reservation;
import pl.piaseckif.flightreservation.repositories.ReservationRepository;

@RestController
public class ReservationRestController {

    @Autowired
    ReservationRepository reservationRepository;

    @RequestMapping("/reservations/{id}")
    public Reservation findReservation(@PathVariable("id") Long id) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        return reservation;
    }

    @RequestMapping("/reservations")
    public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
        Reservation reservation = reservationRepository.findById(request.getId()).orElse(null);
        reservation.setNumberOfBags(request.getNumberOfBags());
        reservation.setCheckedIn(request.getCheckedIn());
        Reservation updatedReservation = reservationRepository.save(reservation);
        return updatedReservation;

    }
}
