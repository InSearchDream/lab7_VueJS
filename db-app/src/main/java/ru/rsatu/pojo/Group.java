package ru.rsatu.pojo;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity // для связи класса с БД
@Table(name = "tabl_group")
public class Group {

    @Id
    private Long id;
    private String namegroup;
    @OneToOne
    private Trainer trainer;

    public Long getId() {
        return id;
    }

    public String getNamegroup() {
        return namegroup;
    }

    public void setNamegroup(String namegroup) {
        this.namegroup = namegroup;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Group() {
    }
}
