package lk.ruh.example.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneResource {
    @Autowired
    private PhoneRepo phoneRepo;

    public Object search(String search) {
        List<PhoneEntity> byNameContaining = phoneRepo.findByNameContaining(search);
        return byNameContaining;
    }

    public Object save(String name, String brand) {
        return phoneRepo.save(new PhoneEntity(name, brand));
    }
}
