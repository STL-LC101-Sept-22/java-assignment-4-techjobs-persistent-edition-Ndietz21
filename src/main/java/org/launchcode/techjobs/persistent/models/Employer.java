package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @NotNull
    @Size(max=75, message = "location should be less than 75 characters")
    private String location;

    @OneToMany
    @JoinColumn(name ="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public Employer(){

    }

}
