package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Propositions", schema = "public", catalog = "ErpDB")
public class PropositionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "EmployeeId")
    private int employeeId;
    @Basic
    @Column(name = "CustomerId")
    private int customerId;
    @Basic
    @Column(name = "ManagerId")
    private int managerId;
    @Basic
    @Column(name = "PropositionDate")
    private Timestamp propositionDate;
    @Basic
    @Column(name = "InterviewDate")
    private Timestamp interviewDate;
    @Basic
    @Column(name = "State")
    private boolean state;
    @Basic
    @Column(name = "PropositionSale")
    private double propositionSale;
    @Basic
    @Column(name = "Remarks")
    private String remarks;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", nullable = false)
    private EmployeesEntity employeesByEmployeeId;
    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id", nullable = false)
    private CustomersEntity customersByCustomerId;
    @ManyToOne
    @JoinColumn(name = "ManagerId", referencedColumnName = "Id", nullable = false)
    private ManagersEntity managersByManagerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public Timestamp getPropositionDate() {
        return propositionDate;
    }

    public void setPropositionDate(Timestamp propositionDate) {
        this.propositionDate = propositionDate;
    }

    public Timestamp getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Timestamp interviewDate) {
        this.interviewDate = interviewDate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double getPropositionSale() {
        return propositionSale;
    }

    public void setPropositionSale(double propositionSale) {
        this.propositionSale = propositionSale;
    }

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

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }

    public ManagersEntity getManagersByManagerId() {
        return managersByManagerId;
    }

    public void setManagersByManagerId(ManagersEntity managersByManagerId) {
        this.managersByManagerId = managersByManagerId;
    }
}
