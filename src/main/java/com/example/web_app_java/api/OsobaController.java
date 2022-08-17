package com.example.web_app_java.api;

import com.example.web_app_java.model.Osoba;
import com.example.web_app_java.service.OsobaService;

public class OsobaController {

    public OsobaController(OsobaService osobaService) {
        this.osobaService = osobaService;
    }
    private final OsobaService osobaService;

    public void addOsoba(Osoba osoba){
        osobaService.addOsoba(osoba);
    }
}
