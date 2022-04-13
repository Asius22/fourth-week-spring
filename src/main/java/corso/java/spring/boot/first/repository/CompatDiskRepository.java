package corso.java.spring.boot.first.repository;

import corso.java.spring.boot.first.domain.CompatDisk;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompatDiskRepository extends MongoRepository<CompatDisk, String> {

}
