package corso.java.spring.boot.first.service;

import corso.java.spring.boot.first.domain.CompatDisk;
import corso.java.spring.boot.first.repository.CompatDiskRepository;
import corso.java.spring.boot.first.service.api.CompatDiskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompatDiskServicesImpl implements CompatDiskServices {

    @Autowired
    CompatDiskRepository compatDiskRepository;

    @Override
    public List<CompatDisk> findAll() {
        //deve richiamare un repository
        return compatDiskRepository.findAll();
    }
    @Override
    public CompatDisk create(CompatDisk compatDisk){
        return compatDiskRepository.save(compatDisk);
    }

    @Override
    public CompatDisk updateById(CompatDisk compatDisk) {
        return compatDiskRepository.save(compatDisk);
    }
}
