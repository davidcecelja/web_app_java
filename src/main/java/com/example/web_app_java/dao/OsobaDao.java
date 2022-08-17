package com.example.web_app_java.dao;
import com.example.web_app_java.model.Osoba;
import java.util.UUID;

public interface OsobaDao {
    // dodavanje osobe koja ima id
    int insertOsoba(UUID id, Osoba osoba);
    // dodavanje osobe koja ima ime, a id se generira
    default int addOsoba(Osoba osoba){
        UUID id = UUID.randomUUID();
        return insertOsoba(id, osoba);
    }

}
