package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Administrators", schema = "public", catalog = "ErpDB")
public class AdministratorsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @OneToOne
    @JoinColumn(name = "Id", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministratorsEntity that = (AdministratorsEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public AspNetUsersEntity getAspNetUsersById() {
        return aspNetUsersById;
    }

    public void setAspNetUsersById(AspNetUsersEntity aspNetUsersById) {
        this.aspNetUsersById = aspNetUsersById;
    }
}
