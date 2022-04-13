package corso.java.spring.macchina.service;

import corso.java.spring.macchina.domain.Car;
import corso.java.spring.macchina.repository.CarRepository;
import corso.java.spring.macchina.service.api.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car create(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateById(Car car) {
        Car tmp = carRepository.findById(car.getTarga()).orElseThrow();
        tmp.setMarca(car.getMarca());
        tmp.setModello(car.getModello());
        tmp.setNRuote(car.getNRuote());
        return carRepository.save(tmp);
    }
}
