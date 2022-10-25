package it.unikey.erpjavabe.BLL.service;

import it.unikey.erpjavabe.DAL.entity.RecordsEntity;
import it.unikey.erpjavabe.DAL.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ReportService {

   RecordRepository recordRepository;

    public String sendMonthlyReport(String reportFormat) throws FileNotFoundException, JRException {
        String destinationPath = "src/main/resources";
        List<RecordsEntity> filteredRecords =
                recordRepository.findRecordsEntitiesByDateTime_YearAndDateTime_MonthAndRecordTypeIsNot(
                        LocalDate.now().getYear(),
                        LocalDate.now().getMonthValue(),
                        (short) 1);
        File file = ResourceUtils.getFile("classpath:report.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(filteredRecords);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Unikey");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, destinationPath + "/report.html");
        } else if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, destinationPath + "/report.pdf");
        }
        return "report generated in path: " + destinationPath;

    }
}
