package pl.piaseckif.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piaseckif.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}