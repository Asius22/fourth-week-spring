package corso.java.spring.macchina.service.api;

import corso.java.spring.macchina.domain.Car;

import java.util.List;

public interface CarService {
    List<Car> findAll();
    Car create(Car car);
    Car updateById(Car car);
}
