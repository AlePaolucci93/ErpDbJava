package it.unikey.erpjavabe.DAL.repository;

import it.unikey.erpjavabe.DAL.entity.RecordsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<RecordsEntity, Integer> {

    List<RecordsEntity> findRecordsEntitiesByDateTime_YearAndDateTime_MonthAndRecordTypeIsNot(Integer year, Integer month, Short recordType);

}
