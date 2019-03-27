package pl.piaseckif.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piaseckif.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
