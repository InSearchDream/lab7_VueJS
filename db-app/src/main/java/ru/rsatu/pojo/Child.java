package ru.rsatu.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tabl_child")
public class Child {

    @Id
    private Long id;
    private String fio;
    private String phone;
    private String address;
    @ManyToOne
    private Group group;

    public Long getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Child() {
    }
}
