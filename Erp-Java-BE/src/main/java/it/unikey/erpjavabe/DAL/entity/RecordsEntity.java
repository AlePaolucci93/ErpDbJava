package it.unikey.erpjavabe.DAL.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "Records", schema = "public", catalog = "ErpDB")
public class RecordsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "WorkedHours")
    private double workedHours;

    @Column(name = "RecordType")
    private short recordType;
    @ManyToOne
    @JoinColumn(name = "TimesheetId", referencedColumnName = "Id", nullable = false)
    private TimesheetsEntity timesheetsByTimesheetId;

}
