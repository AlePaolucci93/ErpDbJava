package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Employees", schema = "public", catalog = "ErpDB")
public class EmployeesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "BirthDate")
    private Timestamp birthDate;
    @Basic
    @Column(name = "BirthPlace")
    private String birthPlace;
    @Basic
    @Column(name = "IBAN")
    private String iban;
    @Basic
    @Column(name = "IdentityCard")
    private String identityCard;
    @Basic
    @Column(name = "FiscalCode")
    private String fiscalCode;
    @Basic
    @Column(name = "Gender")
    private String gender;
    @Basic
    @Column(name = "HireDate")
    private Timestamp hireDate;
    @Basic
    @Column(name = "EndOfEmployment")
    private Timestamp endOfEmployment;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<AddressesEntity> addressesById;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<EconomicDataEntity> economicDataById;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<EmployeeAssetsEntity> employeeAssetsById;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<EmployeeCvsEntity> employeeCvsById;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<EmployeePaySlipEntity> employeePaySlipsById;
    @OneToOne
    @JoinColumn(name = "Id", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersById;
    @OneToMany(mappedBy = "employeesByEmployeeDaoId")
    private Collection<FilePathsEntity> filePathsById;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<InvoicesEntity> invoicesById;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<ProjectsAssignmentEntity> projectsAssignmentsById;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<PropositionsEntity> propositionsById;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<TimesheetsEntity> timesheetsById;

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

    public Collection<AddressesEntity> getAddressesById() {
        return addressesById;
    }

    public void setAddressesById(Collection<AddressesEntity> addressesById) {
        this.addressesById = addressesById;
    }

    public Collection<EconomicDataEntity> getEconomicDataById() {
        return economicDataById;
    }

    public void setEconomicDataById(Collection<EconomicDataEntity> economicDataById) {
        this.economicDataById = economicDataById;
    }

    public Collection<EmployeeAssetsEntity> getEmployeeAssetsById() {
        return employeeAssetsById;
    }

    public void setEmployeeAssetsById(Collection<EmployeeAssetsEntity> employeeAssetsById) {
        this.employeeAssetsById = employeeAssetsById;
    }

    public Collection<EmployeeCvsEntity> getEmployeeCvsById() {
        return employeeCvsById;
    }

    public void setEmployeeCvsById(Collection<EmployeeCvsEntity> employeeCvsById) {
        this.employeeCvsById = employeeCvsById;
    }

    public Collection<EmployeePaySlipEntity> getEmployeePaySlipsById() {
        return employeePaySlipsById;
    }

    public void setEmployeePaySlipsById(Collection<EmployeePaySlipEntity> employeePaySlipsById) {
        this.employeePaySlipsById = employeePaySlipsById;
    }

    public AspNetUsersEntity getAspNetUsersById() {
        return aspNetUsersById;
    }

    public void setAspNetUsersById(AspNetUsersEntity aspNetUsersById) {
        this.aspNetUsersById = aspNetUsersById;
    }

    public Collection<FilePathsEntity> getFilePathsById() {
        return filePathsById;
    }

    public void setFilePathsById(Collection<FilePathsEntity> filePathsById) {
        this.filePathsById = filePathsById;
    }

    public Collection<InvoicesEntity> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(Collection<InvoicesEntity> invoicesById) {
        this.invoicesById = invoicesById;
    }

    public Collection<ProjectsAssignmentEntity> getProjectsAssignmentsById() {
        return projectsAssignmentsById;
    }

    public void setProjectsAssignmentsById(Collection<ProjectsAssignmentEntity> projectsAssignmentsById) {
        this.projectsAssignmentsById = projectsAssignmentsById;
    }

    public Collection<PropositionsEntity> getPropositionsById() {
        return propositionsById;
    }

    public void setPropositionsById(Collection<PropositionsEntity> propositionsById) {
        this.propositionsById = propositionsById;
    }

    public Collection<TimesheetsEntity> getTimesheetsById() {
        return timesheetsById;
    }

    public void setTimesheetsById(Collection<TimesheetsEntity> timesheetsById) {
        this.timesheetsById = timesheetsById;
    }
}
