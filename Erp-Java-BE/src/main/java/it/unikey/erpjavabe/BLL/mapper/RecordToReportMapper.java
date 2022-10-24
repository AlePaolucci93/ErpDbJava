package it.unikey.erpjavabe.BLL.mapper;

import it.unikey.erpjavabe.BLL.DTO.ReportDTO;
import it.unikey.erpjavabe.DAL.entity.RecordsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface RecordToReportMapper {

    @Mappings({
            @Mapping(source = "recordType", target = "recordName", qualifiedByName = "intoRecordName"),
            @Mapping(source = "timesheetsByTimesheetId.employeesByEmployeeId.aspNetUsersById.name", target = "employeeName"),
            @Mapping(source = "timesheetsByTimesheetId.employeesByEmployeeId.aspNetUsersById.lastname", target = "employeeLastName")
    })
    ReportDTO toDto(RecordsEntity entity);

    @Named("intoRecordName")
    public static String toRecordName(Short recordType){
        if(recordType == 2)
            return "P";
        else if (recordType == 3)
            return "F";
        return "M";
    }

}
