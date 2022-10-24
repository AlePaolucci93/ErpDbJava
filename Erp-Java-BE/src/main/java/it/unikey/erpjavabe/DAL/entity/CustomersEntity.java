package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Customers", schema = "public", catalog = "ErpDB")
public class CustomersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "BillingAddress")
    private String billingAddress;
    @Basic
    @Column(name = "StartCollaborationDate")
    private Timestamp startCollaborationDate;
    @Basic
    @Column(name = "EndCollaborationDate")
    private Timestamp endCollaborationDate;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @Basic
    @Column(name = "Plafond")
    private BigInteger plafond;
    @Basic
    @Column(name = "Balance")
    private BigInteger balance;
    @Basic
    @Column(name = "VatNumber")
    private String vatNumber;
    @Basic
    @Column(name = "UniqueCode")
    private String uniqueCode;
    @Basic
    @Column(name = "Pec")
    private String pec;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "CustomerType")
    private int customerType;
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<CustomerFileEntity> customerFilesById;
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<InvoicesEntity> invoicesById;
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<ProjectsEntity> projectsById;
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<PropositionsEntity> propositionsById;
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<RepresentativesEntity> representativesById;

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

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Timestamp getStartCollaborationDate() {
        return startCollaborationDate;
    }

    public void setStartCollaborationDate(Timestamp startCollaborationDate) {
        this.startCollaborationDate = startCollaborationDate;
    }

    public Timestamp getEndCollaborationDate() {
        return endCollaborationDate;
    }

    public void setEndCollaborationDate(Timestamp endCollaborationDate) {
        this.endCollaborationDate = endCollaborationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public BigInteger getPlafond() {
        return plafond;
    }

    public void setPlafond(BigInteger plafond) {
        this.plafond = plafond;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getPec() {
        return pec;
    }

    public void setPec(String pec) {
        this.pec = pec;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersEntity that = (CustomersEntity) o;
        return id == that.id && isDeleted == that.isDeleted && customerType == that.customerType && Objects.equals(name, that.name) && Objects.equals(billingAddress, that.billingAddress) && Objects.equals(startCollaborationDate, that.startCollaborationDate) && Objects.equals(endCollaborationDate, that.endCollaborationDate) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(plafond, that.plafond) && Objects.equals(balance, that.balance) && Objects.equals(vatNumber, that.vatNumber) && Objects.equals(uniqueCode, that.uniqueCode) && Objects.equals(pec, that.pec) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, billingAddress, startCollaborationDate, endCollaborationDate, email, phoneNumber, isDeleted, plafond, balance, vatNumber, uniqueCode, pec, description, customerType);
    }

    public Collection<CustomerFileEntity> getCustomerFilesById() {
        return customerFilesById;
    }

    public void setCustomerFilesById(Collection<CustomerFileEntity> customerFilesById) {
        this.customerFilesById = customerFilesById;
    }

    public Collection<InvoicesEntity> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(Collection<InvoicesEntity> invoicesById) {
        this.invoicesById = invoicesById;
    }

    public Collection<ProjectsEntity> getProjectsById() {
        return projectsById;
    }

    public void setProjectsById(Collection<ProjectsEntity> projectsById) {
        this.projectsById = projectsById;
    }

    public Collection<PropositionsEntity> getPropositionsById() {
        return propositionsById;
    }

    public void setPropositionsById(Collection<PropositionsEntity> propositionsById) {
        this.propositionsById = propositionsById;
    }

    public Collection<RepresentativesEntity> getRepresentativesById() {
        return representativesById;
    }

    public void setRepresentativesById(Collection<RepresentativesEntity> representativesById) {
        this.representativesById = representativesById;
    }
}
