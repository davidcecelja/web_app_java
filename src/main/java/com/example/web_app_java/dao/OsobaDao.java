package com.example.web_app_java.dao;
import com.example.web_app_java.model.Osoba;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OsobaDao {

    int insertOsoba(UUID id, Osoba osoba);

    default int insertOsoba(Osoba osoba){
        UUID id = UUID.randomUUID();
        return insertOsoba(id, osoba);
    }

    List<Osoba> selectAllPeople();

    Optional<Osoba> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Osoba osoba);
}
