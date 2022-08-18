package com.example.web_app_java.dao;
import com.example.web_app_java.model.Osoba;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements OsobaDao {
    // lista s osobama, prazna inicijalizirana
    private static List<Osoba> DB = new ArrayList<>();
    // implementirana metoda iz klase Osoba
    @Override
    public int insertOsoba(UUID id, Osoba osoba) {
        // sad punimo listu ovdje
        DB.add(new Osoba(id, osoba.getIme()));
        return 1;
    }
}
