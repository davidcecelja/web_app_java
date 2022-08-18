package com.example.web_app_java.service;
import com.example.web_app_java.dao.OsobaDao;
import com.example.web_app_java.model.Osoba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OsobaService {
    // konstruktor od OsobaDao
    @Autowired
    public OsobaService(@Qualifier("fakeDao") OsobaDao osobaDao) {
        this.osobaDao = osobaDao;
    }
    private final OsobaDao osobaDao;
    public int addOsoba(Osoba osoba){
        return osobaDao.insertOsoba(osoba);
    }

    public List<Osoba> getAllPeople(){
        return osobaDao.selectAllPeople();
    }
}
