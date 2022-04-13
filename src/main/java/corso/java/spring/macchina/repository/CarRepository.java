package corso.java.spring.macchina.repository;

import corso.java.spring.macchina.domain.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {
}
