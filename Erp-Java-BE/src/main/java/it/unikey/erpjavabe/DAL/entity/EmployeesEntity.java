package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Employees", schema = "public", catalog = "ErpDB")
public class EmployeesEntity {
    private int id;
    private Timestamp birthDate;
    private String birthPlace;
    private String iban;
    private String identityCard;
    private String fiscalCode;
    private String gender;
    private Timestamp hireDate;
    private Timestamp endOfEmployment;
    private Collection<AddressesEntity> addressesById;
    private Collection<EconomicDataEntity> economicDataById;
    private Collection<EmployeeAssetsEntity> employeeAssetsById;
    private Collection<EmployeeCvsEntity> employeeCvsById;
    private Collection<EmployeePaySlipEntity> employeePaySlipsById;
    private AspNetUsersEntity aspNetUsersById;
    private Collection<FilePathsEntity> filePathsById;
    private Collection<InvoicesEntity> invoicesById;
    private Collection<ProjectsAssignmentEntity> projectsAssignmentsById;
    private Collection<PropositionsEntity> propositionsById;
    private Collection<TimesheetsEntity> timesheetsById;

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
    @Column(name = "BirthDate", nullable = false)
    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "BirthPlace", nullable = true, length = -1)
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Basic
    @Column(name = "IBAN", nullable = true, length = -1)
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Basic
    @Column(name = "IdentityCard", nullable = true, length = -1)
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Basic
    @Column(name = "FiscalCode", nullable = true, length = -1)
    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    @Basic
    @Column(name = "Gender", nullable = false, length = -1)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "HireDate", nullable = false)
    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    @Basic
    @Column(name = "EndOfEmployment", nullable = true)
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

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<AddressesEntity> getAddressesById() {
        return addressesById;
    }

    public void setAddressesById(Collection<AddressesEntity> addressesById) {
        this.addressesById = addressesById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<EconomicDataEntity> getEconomicDataById() {
        return economicDataById;
    }

    public void setEconomicDataById(Collection<EconomicDataEntity> economicDataById) {
        this.economicDataById = economicDataById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<EmployeeAssetsEntity> getEmployeeAssetsById() {
        return employeeAssetsById;
    }

    public void setEmployeeAssetsById(Collection<EmployeeAssetsEntity> employeeAssetsById) {
        this.employeeAssetsById = employeeAssetsById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<EmployeeCvsEntity> getEmployeeCvsById() {
        return employeeCvsById;
    }

    public void setEmployeeCvsById(Collection<EmployeeCvsEntity> employeeCvsById) {
        this.employeeCvsById = employeeCvsById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<EmployeePaySlipEntity> getEmployeePaySlipsById() {
        return employeePaySlipsById;
    }

    public void setEmployeePaySlipsById(Collection<EmployeePaySlipEntity> employeePaySlipsById) {
        this.employeePaySlipsById = employeePaySlipsById;
    }

    @OneToOne
    @JoinColumn(name = "Id", referencedColumnName = "Id", nullable = false)
    public AspNetUsersEntity getAspNetUsersById() {
        return aspNetUsersById;
    }

    public void setAspNetUsersById(AspNetUsersEntity aspNetUsersById) {
        this.aspNetUsersById = aspNetUsersById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeDaoId")
    public Collection<FilePathsEntity> getFilePathsById() {
        return filePathsById;
    }

    public void setFilePathsById(Collection<FilePathsEntity> filePathsById) {
        this.filePathsById = filePathsById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<InvoicesEntity> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(Collection<InvoicesEntity> invoicesById) {
        this.invoicesById = invoicesById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<ProjectsAssignmentEntity> getProjectsAssignmentsById() {
        return projectsAssignmentsById;
    }

    public void setProjectsAssignmentsById(Collection<ProjectsAssignmentEntity> projectsAssignmentsById) {
        this.projectsAssignmentsById = projectsAssignmentsById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<PropositionsEntity> getPropositionsById() {
        return propositionsById;
    }

    public void setPropositionsById(Collection<PropositionsEntity> propositionsById) {
        this.propositionsById = propositionsById;
    }

    @OneToMany(mappedBy = "employeesByEmployeeId")
    public Collection<TimesheetsEntity> getTimesheetsById() {
        return timesheetsById;
    }

    public void setTimesheetsById(Collection<TimesheetsEntity> timesheetsById) {
        this.timesheetsById = timesheetsById;
    }
}
