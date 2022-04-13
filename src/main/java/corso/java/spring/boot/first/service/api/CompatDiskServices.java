package corso.java.spring.boot.first.service.api;

import corso.java.spring.boot.first.domain.CompatDisk;

import java.util.List;

public interface CompatDiskServices {
    List<CompatDisk> findAll();

    CompatDisk create(CompatDisk compatDisk);

    CompatDisk updateById(CompatDisk compatDisk);
}
