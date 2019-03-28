package pl.piaseckif.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.piaseckif.flightreservation.entities.Flight;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity")
    List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to);


}