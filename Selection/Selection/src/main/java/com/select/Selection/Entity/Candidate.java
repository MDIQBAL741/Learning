package com.select.Selection.Entity;


import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name="CANDIDATES")

public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private Long phnoe;
    @Column
    private String skills;
    @Column
    private String about;
    @Column
    private String status;
    @Lob
    @Column
    private byte[] resume;

    public Candidate(String originalFilename, String contentType, byte[] bytes) {
    }

    public byte[] getResume() {
        return resume;
    }

    public void setResume(byte[] resume) {
        this.resume = resume;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhnoe() {
        return phnoe;
    }

    public void setPhnoe(Long phnoe) {
        this.phnoe = phnoe;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

