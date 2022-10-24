package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Managers", schema = "public", catalog = "ErpDB")
public class ManagersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @OneToOne
    @JoinColumn(name = "Id", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersById;
    @OneToMany(mappedBy = "managersByManagerId")
    private Collection<PropositionsEntity> propositionsById;

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
        ManagersEntity that = (ManagersEntity) o;
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

    public Collection<PropositionsEntity> getPropositionsById() {
        return propositionsById;
    }

    public void setPropositionsById(Collection<PropositionsEntity> propositionsById) {
        this.propositionsById = propositionsById;
    }
}
