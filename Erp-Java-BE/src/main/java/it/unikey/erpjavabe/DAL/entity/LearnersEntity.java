package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Learners", schema = "public", catalog = "ErpDB")
public class LearnersEntity {
    private int id;
    private String name;
    private String lastName;
    private String fiscalCode;
    private String iban;
    private String contact;
    private Timestamp termination;
    private Timestamp placement;
    private Collection<AttendsEntity> attendsById;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "LastName", nullable = false, length = -1)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "FiscalCode", nullable = false, length = -1)
    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    @Basic
    @Column(name = "IBAN", nullable = false, length = -1)
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Basic
    @Column(name = "Contact", nullable = false, length = -1)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "Termination", nullable = true)
    public Timestamp getTermination() {
        return termination;
    }

    public void setTermination(Timestamp termination) {
        this.termination = termination;
    }

    @Basic
    @Column(name = "Placement", nullable = true)
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

    @OneToMany(mappedBy = "learnersByLearnerId")
    public Collection<AttendsEntity> getAttendsById() {
        return attendsById;
    }

    public void setAttendsById(Collection<AttendsEntity> attendsById) {
        this.attendsById = attendsById;
    }
}
