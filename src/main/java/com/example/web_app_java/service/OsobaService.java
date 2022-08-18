package com.example.web_app_java.service;
import com.example.web_app_java.dao.OsobaDao;
import com.example.web_app_java.model.Osoba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OsobaService {
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

    public Optional<Osoba> getPersonById(UUID id){
        return osobaDao.selectPersonById(id);
    }

    public int deletePerson(UUID id){
        return osobaDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, Osoba newOsoba){
        return osobaDao.updatePersonById(id, newOsoba);
    }
}
