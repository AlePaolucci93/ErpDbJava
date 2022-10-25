package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Invoices", schema = "public", catalog = "ErpDB")
public class InvoicesEntity {
    private int id;
    private String invoiceNumber;
    private Timestamp startDate;
    private Timestamp expireDate;
    private BigInteger amount;
    private int customerId;
    private int collaborationType;
    private boolean isDeleted;
    private Integer employeeId;
    private String notes;
    private Collection<InvoicePaymentsEntity> invoicePaymentsById;
    private CustomersEntity customersByCustomerId;
    private EmployeesEntity employeesByEmployeeId;

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
    @Column(name = "InvoiceNumber", nullable = true, length = -1)
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Basic
    @Column(name = "StartDate", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "ExpireDate", nullable = true)
    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }

    @Basic
    @Column(name = "Amount", nullable = false, precision = 0)
    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "CustomerId", nullable = false)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "CollaborationType", nullable = false)
    public int getCollaborationType() {
        return collaborationType;
    }

    public void setCollaborationType(int collaborationType) {
        this.collaborationType = collaborationType;
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
    @Column(name = "EmployeeId", nullable = true)
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "Notes", nullable = true, length = -1)
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

    @OneToMany(mappedBy = "invoicesByInvoiceId")
    public Collection<InvoicePaymentsEntity> getInvoicePaymentsById() {
        return invoicePaymentsById;
    }

    public void setInvoicePaymentsById(Collection<InvoicePaymentsEntity> invoicePaymentsById) {
        this.invoicePaymentsById = invoicePaymentsById;
    }

    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id", nullable = false)
    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }

    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id")
    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
