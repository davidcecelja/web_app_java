package com.example.web_app_java.dao;
import com.example.web_app_java.model.Osoba;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService implements OsobaDao {
    @Override
    public int insertOsoba(UUID id, Osoba osoba) {
        return 0;
    }

    @Override
    public List<Osoba> selectAllPeople() {
        return List.of(new Osoba(UUID.randomUUID(), "FROM POSTGRES DB"));
    }

    @Override
    public Optional<Osoba> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Osoba osoba) {
        return 0;
    }
}
