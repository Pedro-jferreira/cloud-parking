package one.digitalinnovation.cloudparking.controller;

import one.digitalinnovation.cloudparking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/parking")
public class ParkingController {
    @GetMapping("/parkings")
    public List<Parking> findALL(){
        var parking = new Parking();
        parking.setColor("preto");
        parking.setLicense("vl gol");
        parking.setState("SP");
        return Arrays.asList(parking,parking);
    }
}
