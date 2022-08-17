package com.example.web_app_java.model;
import java.util.UUID;

public class Osoba {
    private final UUID id;
    private final String ime;
    public Osoba(UUID id, String ime) {
        this.id = id;
        this.ime = ime;
    }
    public UUID getId() {
        return id;
    }
    public String getIme() {
        return ime;
    }
}
