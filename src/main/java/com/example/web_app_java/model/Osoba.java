package com.example.web_app_java.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class Osoba {
    private final UUID id;
    private final String ime;
    public Osoba(@JsonProperty("id") UUID id, @JsonProperty("ime") String ime) {
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
