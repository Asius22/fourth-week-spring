package corso.java.spring.boot.first.controller;

import corso.java.spring.boot.first.domain.CompatDisk;
import corso.java.spring.boot.first.repository.CompatDiskRepository;
import corso.java.spring.boot.first.service.CompatDiskServicesImpl;
import corso.java.spring.boot.first.service.api.CompatDiskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class CompatDiskController {

    @Autowired
    CompatDiskServices compatDiskServices;

    @GetMapping
    ResponseEntity<List<CompatDisk>> getAll() {
        List<CompatDisk> compatDiskList = compatDiskServices.findAll();
        return new ResponseEntity<>(compatDiskList,HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<CompatDisk> create(@RequestBody CompatDisk compatDisk) {
        return new ResponseEntity<>(
                compatDiskServices.create(compatDisk),
                HttpStatus.OK);
    }
}
