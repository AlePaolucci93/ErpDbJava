package it.unikey.erpjavabe.BLL.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ReportDTO {
    private String employeeName;
    private String employeeLastName;
    private Date dateTime;
    private Double workedHours;
    private String recordName;
}
