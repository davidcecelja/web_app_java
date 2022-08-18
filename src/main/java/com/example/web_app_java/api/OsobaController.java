package com.example.web_app_java.api;
import com.example.web_app_java.model.Osoba;
import com.example.web_app_java.service.OsobaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
