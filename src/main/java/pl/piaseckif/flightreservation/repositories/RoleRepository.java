package pl.piaseckif.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piaseckif.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
