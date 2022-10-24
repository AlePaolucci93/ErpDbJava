package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Learners", schema = "public", catalog = "ErpDB")
public class LearnersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "LastName")
    private String lastName;
    @Basic
    @Column(name = "FiscalCode")
    private String fiscalCode;
    @Basic
    @Column(name = "IBAN")
    private String iban;
    @Basic
    @Column(name = "Contact")
    private String contact;
    @Basic
    @Column(name = "Termination")
    private Timestamp termination;
    @Basic
    @Column(name = "Placement")
    private Timestamp placement;
    @OneToMany(mappedBy = "learnersByLearnerId")
    private Collection<AttendsEntity> attendsById;

    public int getId() {
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Timestamp getTermination() {
        return termination;
    }

    public void setTermination(Timestamp termination) {
        this.termination = termination;
    }

    public Timestamp getPlacement() {
        return placement;
    }

    public void setPlacement(Timestamp placement) {
        this.placement = placement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LearnersEntity that = (LearnersEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(fiscalCode, that.fiscalCode) && Objects.equals(iban, that.iban) && Objects.equals(contact, that.contact) && Objects.equals(termination, that.termination) && Objects.equals(placement, that.placement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, fiscalCode, iban, contact, termination, placement);
    }

    public Collection<AttendsEntity> getAttendsById() {
        return attendsById;
    }

    public void setAttendsById(Collection<AttendsEntity> attendsById) {
        this.attendsById = attendsById;
    }
}
