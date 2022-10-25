package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Customers", schema = "public", catalog = "ErpDB")
public class CustomersEntity {
    private int id;
    private String name;
    private String billingAddress;
    private Timestamp startCollaborationDate;
    private Timestamp endCollaborationDate;
    private String email;
    private String phoneNumber;
    private boolean isDeleted;
    private BigInteger plafond;
    private BigInteger balance;
    private String vatNumber;
    private String uniqueCode;
    private String pec;
    private String description;
    private int customerType;
    private Collection<CustomerFileEntity> customerFilesById;
    private Collection<InvoicesEntity> invoicesById;
    private Collection<ProjectsEntity> projectsById;
    private Collection<PropositionsEntity> propositionsById;
    private Collection<RepresentativesEntity> representativesById;

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
    @Column(name = "Name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "BillingAddress", nullable = true, length = -1)
    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Basic
    @Column(name = "StartCollaborationDate", nullable = true)
    public Timestamp getStartCollaborationDate() {
        return startCollaborationDate;
    }

    public void setStartCollaborationDate(Timestamp startCollaborationDate) {
        this.startCollaborationDate = startCollaborationDate;
    }

    @Basic
    @Column(name = "EndCollaborationDate", nullable = true)
    public Timestamp getEndCollaborationDate() {
        return endCollaborationDate;
    }

    public void setEndCollaborationDate(Timestamp endCollaborationDate) {
        this.endCollaborationDate = endCollaborationDate;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PhoneNumber", nullable = true, length = -1)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "IsDeleted", nullable = false)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "Plafond", nullable = false, precision = 0)
    public BigInteger getPlafond() {
        return plafond;
    }

    public void setPlafond(BigInteger plafond) {
        this.plafond = plafond;
    }

    @Basic
    @Column(name = "Balance", nullable = false, precision = 0)
    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "VatNumber", nullable = true, length = -1)
    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Basic
    @Column(name = "UniqueCode", nullable = true, length = -1)
    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    @Basic
    @Column(name = "Pec", nullable = true, length = -1)
    public String getPec() {
        return pec;
    }

    public void setPec(String pec) {
        this.pec = pec;
    }

    @Basic
    @Column(name = "Description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "CustomerType", nullable = false)
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

    @OneToMany(mappedBy = "customersByCustomerId")
    public Collection<CustomerFileEntity> getCustomerFilesById() {
        return customerFilesById;
    }

    public void setCustomerFilesById(Collection<CustomerFileEntity> customerFilesById) {
        this.customerFilesById = customerFilesById;
    }

    @OneToMany(mappedBy = "customersByCustomerId")
    public Collection<InvoicesEntity> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(Collection<InvoicesEntity> invoicesById) {
        this.invoicesById = invoicesById;
    }

    @OneToMany(mappedBy = "customersByCustomerId")
    public Collection<ProjectsEntity> getProjectsById() {
        return projectsById;
    }

    public void setProjectsById(Collection<ProjectsEntity> projectsById) {
        this.projectsById = projectsById;
    }

    @OneToMany(mappedBy = "customersByCustomerId")
    public Collection<PropositionsEntity> getPropositionsById() {
        return propositionsById;
    }

    public void setPropositionsById(Collection<PropositionsEntity> propositionsById) {
        this.propositionsById = propositionsById;
    }

    @OneToMany(mappedBy = "customersByCustomerId")
    public Collection<RepresentativesEntity> getRepresentativesById() {
        return representativesById;
    }

    public void setRepresentativesById(Collection<RepresentativesEntity> representativesById) {
        this.representativesById = representativesById;
    }
}
