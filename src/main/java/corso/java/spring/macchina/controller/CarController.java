package corso.java.spring.macchina.controller;

import corso.java.spring.macchina.domain.Car;
import corso.java.spring.macchina.service.api.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="macchina")
public class CarController {

    @Autowired
    CarService carService;

    @CrossOrigin
    @GetMapping
    public List<Car> getAll(){
        return carService.findAll();
    }

    @PostMapping
    public Car create(@RequestBody Car car){
        return carService.create(car);
    }
}
