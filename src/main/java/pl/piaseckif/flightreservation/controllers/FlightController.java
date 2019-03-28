package pl.piaseckif.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.piaseckif.flightreservation.entities.Flight;
import pl.piaseckif.flightreservation.repositories.FlightRepository;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.List;

@Controller
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @RequestMapping("findFlights")
    public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
                              ModelMap modelMap) {
        List<Flight> flights = flightRepository.findFlights(from, to);
        modelMap.addAttribute("flights", flights);
        return "displayFlights";
    }
}
