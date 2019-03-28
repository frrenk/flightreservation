package pl.piaseckif.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.piaseckif.flightreservation.dto.ReservationRequest;
import pl.piaseckif.flightreservation.entities.Flight;
import pl.piaseckif.flightreservation.entities.Reservation;
import pl.piaseckif.flightreservation.repositories.FlightRepository;
import pl.piaseckif.flightreservation.services.ReservationService;

import java.util.Optional;

@Controller
public class ReservationController {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    ReservationService reservationService;

    @RequestMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
        Flight flight = flightRepository.findById(flightId).orElse(null);
        modelMap.addAttribute("flight", flight);

        return "completeReservation";

    }

    @RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
    public String completeReservation(ReservationRequest request, ModelMap modelMap) {

        Reservation reservation = reservationService.bookFlight(request);
        modelMap.addAttribute("msg", "Reservation created succesfully. ID of your reservation is: "+ reservation.getId());

        return "reservationConfirmation";
    }
}
