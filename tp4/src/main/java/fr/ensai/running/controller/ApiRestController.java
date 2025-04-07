package fr.ensai.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.service.AthleteService;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    private AthleteService athleteService;

    /**
     * Get all athletes
     */
    @GetMapping("/athlete")
    public ResponseEntity <List<Athlete>> allAthletes() {

        List<Athlete> listAthletes = athleteService.findAll(); 

        if (listAthletes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listAthletes);
    }

    @GetMapping("/athlete/{id}")
    public ResponseEntity<Athlete> getAthleteById(@PathVariable(value = "id") long id) {
        Athlete athlete = athleteService.findById(id);
        if(athlete==null){
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(athlete);
    }

    @DeleteMapping("/delete-athlete/{id}")
    public ResponseEntity<Athlete> deleteAthleteById(@PathVariable(value = "id") long id) {
        Athlete athlete = athleteService.findById(id);
        if (athlete != null) {
            athleteService.deleteById(id);
        }
       
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/athlete")
    public ResponseEntity<Athlete> getAthleteById(@RequestBody Athlete athlete) {

        Athlete createAthlete = athleteService.save(athlete);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(createAthlete);

    }


}
