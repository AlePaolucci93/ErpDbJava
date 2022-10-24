package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Invoices", schema = "public", catalog = "ErpDB")
public class InvoicesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "InvoiceNumber")
    private String invoiceNumber;
    @Basic
    @Column(name = "StartDate")
    private Timestamp startDate;
    @Basic
    @Column(name = "ExpireDate")
    private Timestamp expireDate;
    @Basic
    @Column(name = "Amount")
    private BigInteger amount;
    @Basic
    @Column(name = "CustomerId")
    private int customerId;
    @Basic
    @Column(name = "CollaborationType")
    private int collaborationType;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @Basic
    @Column(name = "EmployeeId")
    private Integer employeeId;
    @Basic
    @Column(name = "Notes")
    private String notes;
    @OneToMany(mappedBy = "invoicesByInvoiceId")
    private Collection<InvoicePaymentsEntity> invoicePaymentsById;
    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id", nullable = false)
    private CustomersEntity customersByCustomerId;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id")
    private EmployeesEntity employeesByEmployeeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCollaborationType() {
        return collaborationType;
    }

    public void setCollaborationType(int collaborationType) {
        this.collaborationType = collaborationType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoicesEntity that = (InvoicesEntity) o;
        return id == that.id && customerId == that.customerId && collaborationType == that.collaborationType && isDeleted == that.isDeleted && Objects.equals(invoiceNumber, that.invoiceNumber) && Objects.equals(startDate, that.startDate) && Objects.equals(expireDate, that.expireDate) && Objects.equals(amount, that.amount) && Objects.equals(employeeId, that.employeeId) && Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoiceNumber, startDate, expireDate, amount, customerId, collaborationType, isDeleted, employeeId, notes);
    }

    public Collection<InvoicePaymentsEntity> getInvoicePaymentsById() {
        return invoicePaymentsById;
    }

    public void setInvoicePaymentsById(Collection<InvoicePaymentsEntity> invoicePaymentsById) {
        this.invoicePaymentsById = invoicePaymentsById;
    }

    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
