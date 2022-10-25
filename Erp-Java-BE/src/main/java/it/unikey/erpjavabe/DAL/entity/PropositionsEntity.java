package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Propositions", schema = "public", catalog = "ErpDB")
public class PropositionsEntity {
    private int id;
    private int employeeId;
    private int customerId;
    private int managerId;
    private Timestamp propositionDate;
    private Timestamp interviewDate;
    private boolean state;
    private double propositionSale;
    private String remarks;
    private EmployeesEntity employeesByEmployeeId;
    private CustomersEntity customersByCustomerId;
    private ManagersEntity managersByManagerId;

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
    @Column(name = "EmployeeId", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
    @Column(name = "ManagerId", nullable = false)
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "PropositionDate", nullable = false)
    public Timestamp getPropositionDate() {
        return propositionDate;
    }

    public void setPropositionDate(Timestamp propositionDate) {
        this.propositionDate = propositionDate;
    }

    @Basic
    @Column(name = "InterviewDate", nullable = false)
    public Timestamp getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Timestamp interviewDate) {
        this.interviewDate = interviewDate;
    }

    @Basic
    @Column(name = "State", nullable = false)
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Basic
    @Column(name = "PropositionSale", nullable = false, precision = 0)
    public double getPropositionSale() {
        return propositionSale;
    }

    public void setPropositionSale(double propositionSale) {
        this.propositionSale = propositionSale;
    }

    @Basic
    @Column(name = "Remarks", nullable = true, length = -1)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropositionsEntity that = (PropositionsEntity) o;
        return id == that.id && employeeId == that.employeeId && customerId == that.customerId && managerId == that.managerId && state == that.state && Double.compare(that.propositionSale, propositionSale) == 0 && Objects.equals(propositionDate, that.propositionDate) && Objects.equals(interviewDate, that.interviewDate) && Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, customerId, managerId, propositionDate, interviewDate, state, propositionSale, remarks);
    }

    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", nullable = false)
    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
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
    @JoinColumn(name = "ManagerId", referencedColumnName = "Id", nullable = false)
    public ManagersEntity getManagersByManagerId() {
        return managersByManagerId;
    }

    public void setManagersByManagerId(ManagersEntity managersByManagerId) {
        this.managersByManagerId = managersByManagerId;
    }
}
