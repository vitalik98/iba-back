package by.iba.controller;

import by.iba.entity.Subsystem;
import by.iba.repository.SubsystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@CrossOrigin
public class SubsystemController {
    private static List<Subsystem> subsystems = new LinkedList<Subsystem>();

    @Autowired
    SubsystemRepository subsystemRepository;

    @GetMapping(path = "/subsystems")
    public ResponseEntity<List<Subsystem>> getAll() {
        subsystems = subsystemRepository.findAll();
        return ResponseEntity.ok(subsystems);
    }

    @GetMapping(path = "/subsystems/{id}")
    public ResponseEntity<Subsystem> getSubsystemById(
            @PathVariable int id){
        for (Subsystem i : subsystems){
            if (i.getId() == id){
                return new ResponseEntity<Subsystem>(i, HttpStatus.OK);
            }
        }
        return null;
    }

    @DeleteMapping(path = "/subsystems/{id}")
    public ResponseEntity<Subsystem> deleteSubsystemById(
            @PathVariable int id){
        for (Subsystem i : subsystems){
            if (i.getId() == id){
                subsystems.remove(i);
            }
        }
        return null;
    }

    @PutMapping(path = "/subsystems")
    public void updateSubsystem(@RequestParam("name") String name) {
        subsystemRepository.save(new Subsystem(name));
    }
}
