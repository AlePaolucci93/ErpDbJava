package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Projects", schema = "public", catalog = "ErpDB")
public class ProjectsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "StartDate")
    private Timestamp startDate;
    @Basic
    @Column(name = "ExpireDeliveryDate")
    private Timestamp expireDeliveryDate;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @Basic
    @Column(name = "CustomerId")
    private int customerId;
    @Basic
    @Column(name = "PaymentDeadLine")
    private int paymentDeadLine;
    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id", nullable = false)
    private CustomersEntity customersByCustomerId;
    @OneToMany(mappedBy = "projectsByProjectId")
    private Collection<ProjectsAssignmentEntity> projectsAssignmentsById;
    @OneToMany(mappedBy = "projectsByProjectId")
    private Collection<RecordsEntity> recordsById;

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

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getExpireDeliveryDate() {
        return expireDeliveryDate;
    }

    public void setExpireDeliveryDate(Timestamp expireDeliveryDate) {
        this.expireDeliveryDate = expireDeliveryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPaymentDeadLine() {
        return paymentDeadLine;
    }

    public void setPaymentDeadLine(int paymentDeadLine) {
        this.paymentDeadLine = paymentDeadLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectsEntity that = (ProjectsEntity) o;
        return id == that.id && isDeleted == that.isDeleted && customerId == that.customerId && paymentDeadLine == that.paymentDeadLine && Objects.equals(name, that.name) && Objects.equals(startDate, that.startDate) && Objects.equals(expireDeliveryDate, that.expireDeliveryDate) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startDate, expireDeliveryDate, description, isDeleted, customerId, paymentDeadLine);
    }

    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }

    public Collection<ProjectsAssignmentEntity> getProjectsAssignmentsById() {
        return projectsAssignmentsById;
    }

    public void setProjectsAssignmentsById(Collection<ProjectsAssignmentEntity> projectsAssignmentsById) {
        this.projectsAssignmentsById = projectsAssignmentsById;
    }

    public Collection<RecordsEntity> getRecordsById() {
        return recordsById;
    }

    public void setRecordsById(Collection<RecordsEntity> recordsById) {
        this.recordsById = recordsById;
    }
}
