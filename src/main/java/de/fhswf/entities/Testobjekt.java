package de.fhswf.entities;

import java.util.Objects;

public class Testobjekt {

    private String name;
    private String description;
    private String id;

    public Testobjekt() {
    }

    public Testobjekt(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Testobjekt)) {
            return false;
        }

        Testobjekt other = (Testobjekt) obj;

        return Objects.equals(other.name, this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
