package com.example.web_app_java.service;
import com.example.web_app_java.dao.OsobaDao;
import com.example.web_app_java.model.Osoba;

public class OsobaService {
    // konstruktor od OsobaDao
    public OsobaService(OsobaDao osobaDao) {
        this.osobaDao = osobaDao;
    }
    private final OsobaDao osobaDao;
    public int addOsoba(Osoba osoba){
        return osobaDao.insertOsoba(osoba);
    }
}
