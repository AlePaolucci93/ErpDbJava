package it.unikey.erpjavabe.DAL.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "Timesheets", schema = "public", catalog = "ErpDB")
public class TimesheetsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "Date")
    private Timestamp date;

    @Column(name = "IsLocked")
    private boolean isLocked;
    @OneToMany(mappedBy = "timesheetsByTimesheetId")
    private Collection<RecordsEntity> recordsById;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id")
    private EmployeesEntity employeesByEmployeeId;


}
