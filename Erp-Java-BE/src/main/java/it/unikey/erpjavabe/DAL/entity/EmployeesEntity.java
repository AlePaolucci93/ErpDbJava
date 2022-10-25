package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Employees", schema = "public", catalog = "ErpDB")
public class EmployeesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "BirthDate", nullable = false)
    private Timestamp birthDate;
    @Basic
    @Column(name = "BirthPlace", nullable = true, length = -1)
    private String birthPlace;
    @Basic
    @Column(name = "IBAN", nullable = true, length = -1)
    private String iban;
    @Basic
    @Column(name = "IdentityCard", nullable = true, length = -1)
    private String identityCard;
    @Basic
    @Column(name = "FiscalCode", nullable = true, length = -1)
    private String fiscalCode;
    @Basic
    @Column(name = "Gender", nullable = false, length = -1)
    private String gender;
    @Basic
    @Column(name = "HireDate", nullable = false)
    private Timestamp hireDate;
    @Basic
    @Column(name = "EndOfEmployment", nullable = true)
    private Timestamp endOfEmployment;
    @OneToOne
    @JoinColumn(name = "Id", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public Timestamp getEndOfEmployment() {
        return endOfEmployment;
    }

    public void setEndOfEmployment(Timestamp endOfEmployment) {
        this.endOfEmployment = endOfEmployment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesEntity that = (EmployeesEntity) o;
        return id == that.id && Objects.equals(birthDate, that.birthDate) && Objects.equals(birthPlace, that.birthPlace) && Objects.equals(iban, that.iban) && Objects.equals(identityCard, that.identityCard) && Objects.equals(fiscalCode, that.fiscalCode) && Objects.equals(gender, that.gender) && Objects.equals(hireDate, that.hireDate) && Objects.equals(endOfEmployment, that.endOfEmployment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, birthDate, birthPlace, iban, identityCard, fiscalCode, gender, hireDate, endOfEmployment);
    }

    public AspNetUsersEntity getAspNetUsersById() {
        return aspNetUsersById;
    }

    public void setAspNetUsersById(AspNetUsersEntity aspNetUsersById) {
        this.aspNetUsersById = aspNetUsersById;
    }
}
