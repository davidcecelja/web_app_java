package com.example.web_app_java.dao;
import com.example.web_app_java.model.Osoba;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements OsobaDao {

    private static List<Osoba> DB = new ArrayList<>();

    @Override
    public int insertOsoba(UUID id, Osoba osoba) {
        DB.add(new Osoba(id, osoba.getIme()));
        return 1;
    }

    @Override
    public List<Osoba> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Osoba> selectPersonById(UUID id) {
        return DB.stream().filter(osoba -> osoba.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Osoba> osobaOptional = selectPersonById(id);
        if(osobaOptional.isEmpty()){
            return 0;
        }else{
            DB.remove(osobaOptional.get());
        }
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, Osoba update) {
        return selectPersonById(id).map(osoba -> {
            int indexOfPersonToUpdate = DB.indexOf(osoba);
            if(indexOfPersonToUpdate >= 0){
                DB.set(indexOfPersonToUpdate, new Osoba(id, update.getIme()));
                return 1;
            }
            else
            {
                return 0;
            }
        }).orElse(0);
    }
}
