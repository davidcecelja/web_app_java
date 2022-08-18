package com.example.web_app_java.api;
import com.example.web_app_java.model.Osoba;
import com.example.web_app_java.service.OsobaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/osoba")
@RestController
public class OsobaController {
    @Autowired
    public OsobaController(OsobaService osobaService) {
        this.osobaService = osobaService;
    }

    private final OsobaService osobaService;
    @PostMapping
    public void addOsoba(@RequestBody Osoba osoba){
        osobaService.addOsoba(osoba);
    }

    @GetMapping
    public List<Osoba> getAllPeople(){
        return osobaService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Osoba getPersonById(@PathVariable("id") UUID id){
        return  osobaService.getPersonById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id){
        osobaService.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id, @RequestBody Osoba personToUpdate){
        osobaService.updatePerson(id, personToUpdate);
    }
}
