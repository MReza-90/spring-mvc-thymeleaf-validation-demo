package com.code2go.thymeleafdemo.model;

import com.code2go.thymeleafdemo.validation.PassCode;
import jakarta.validation.constraints.*;


import java.util.List;


public class Student {

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String firstName="";
    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName="";

    @NotNull(message = "is required")
    @Min(value=7, message = "must be older than 7")
    @Max(value=18, message = "must be younger than 18")
    private Integer age;
    @PassCode(value="TX", message="Pass code must start with TX")
    private String passCode;

    private String country;
    private String latestDegree;
    private List<String> subjects;
    @NotNull(message = "is required")
    @Pattern(regexp="^[a-zA-Z0-9]{5}", message = "not valid postal code")
    private String postalCode;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatestDegree() {
        return latestDegree;
    }

    public void setLatestDegree(String latestDegree) {
        this.latestDegree = latestDegree;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPassCode() {
        return passCode;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }
}
