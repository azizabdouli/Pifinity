package com.example.pifinity.RestController;

import com.example.pifinity.Entity.Reclamation;
import com.example.pifinity.Services.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ReclamationController {
@Autowired
    private ReclamationService reclamationService;


    @PostMapping("/reclamations")
    public Reclamation createReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.add(reclamation);
    }


//    @GetMapping("/{id}")
//    public Reclamation getReclamationById(@PathVariable int id) {
//        return reclamationService.findById(id);
//    }
//
//    @GetMapping
//    public List<Reclamation> getAllReclamations() {
//        return reclamationService.findAll();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteReclamation(@PathVariable int id) {
//        reclamationService.deleteById(id);
//    }
}

