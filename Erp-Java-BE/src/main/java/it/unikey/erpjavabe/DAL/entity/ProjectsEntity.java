package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Projects", schema = "public", catalog = "ErpDB")
public class ProjectsEntity {
    private int id;
    private String name;
    private Timestamp startDate;
    private Timestamp expireDeliveryDate;
    private String description;
    private boolean isDeleted;
    private int customerId;
    private int paymentDeadLine;
    private CustomersEntity customersByCustomerId;
    private Collection<ProjectsAssignmentEntity> projectsAssignmentsById;
    private Collection<RecordsEntity> recordsById;

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
    @Column(name = "StartDate", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "ExpireDeliveryDate", nullable = true)
    public Timestamp getExpireDeliveryDate() {
        return expireDeliveryDate;
    }

    public void setExpireDeliveryDate(Timestamp expireDeliveryDate) {
        this.expireDeliveryDate = expireDeliveryDate;
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
    @Column(name = "IsDeleted", nullable = false)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
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
    @Column(name = "PaymentDeadLine", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id", nullable = false)
    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }

    @OneToMany(mappedBy = "projectsByProjectId")
    public Collection<ProjectsAssignmentEntity> getProjectsAssignmentsById() {
        return projectsAssignmentsById;
    }

    public void setProjectsAssignmentsById(Collection<ProjectsAssignmentEntity> projectsAssignmentsById) {
        this.projectsAssignmentsById = projectsAssignmentsById;
    }

    @OneToMany(mappedBy = "projectsByProjectId")
    public Collection<RecordsEntity> getRecordsById() {
        return recordsById;
    }

    public void setRecordsById(Collection<RecordsEntity> recordsById) {
        this.recordsById = recordsById;
    }
}
