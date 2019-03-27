package pl.piaseckif.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piaseckif.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}