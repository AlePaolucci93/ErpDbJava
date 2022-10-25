package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "EconomicData", schema = "public", catalog = "ErpDB")
public class EconomicDataEntity {
    private int id;
    private int ccnl;
    private Timestamp startDate;
    private Timestamp endDate;
    private Integer contractType;
    private double moneyRal;
    private Integer contractLevel;
    private int oneMonthSalary;
    private int foodStamp;
    private double foodStampValue;
    private double refund;
    private int trialPeriod;
    private int employeeId;
    private Integer contractLevelStage;
    private EmployeesEntity employeesByEmployeeId;

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
    @Column(name = "CCNL", nullable = false)
    public int getCcnl() {
        return ccnl;
    }

    public void setCcnl(int ccnl) {
        this.ccnl = ccnl;
    }

    @Basic
    @Column(name = "StartDate", nullable = false)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "ContractType", nullable = true)
    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    @Basic
    @Column(name = "MoneyRAL", nullable = false, precision = 0)
    public double getMoneyRal() {
        return moneyRal;
    }

    public void setMoneyRal(double moneyRal) {
        this.moneyRal = moneyRal;
    }

    @Basic
    @Column(name = "ContractLevel", nullable = true)
    public Integer getContractLevel() {
        return contractLevel;
    }

    public void setContractLevel(Integer contractLevel) {
        this.contractLevel = contractLevel;
    }

    @Basic
    @Column(name = "OneMonthSalary", nullable = false)
    public int getOneMonthSalary() {
        return oneMonthSalary;
    }

    public void setOneMonthSalary(int oneMonthSalary) {
        this.oneMonthSalary = oneMonthSalary;
    }

    @Basic
    @Column(name = "FoodStamp", nullable = false)
    public int getFoodStamp() {
        return foodStamp;
    }

    public void setFoodStamp(int foodStamp) {
        this.foodStamp = foodStamp;
    }

    @Basic
    @Column(name = "FoodStampValue", nullable = false, precision = 0)
    public double getFoodStampValue() {
        return foodStampValue;
    }

    public void setFoodStampValue(double foodStampValue) {
        this.foodStampValue = foodStampValue;
    }

    @Basic
    @Column(name = "Refund", nullable = false, precision = 0)
    public double getRefund() {
        return refund;
    }

    public void setRefund(double refund) {
        this.refund = refund;
    }

    @Basic
    @Column(name = "TrialPeriod", nullable = false)
    public int getTrialPeriod() {
        return trialPeriod;
    }

    public void setTrialPeriod(int trialPeriod) {
        this.trialPeriod = trialPeriod;
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
    @Column(name = "ContractLevelStage", nullable = true)
    public Integer getContractLevelStage() {
        return contractLevelStage;
    }

    public void setContractLevelStage(Integer contractLevelStage) {
        this.contractLevelStage = contractLevelStage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EconomicDataEntity that = (EconomicDataEntity) o;
        return id == that.id && ccnl == that.ccnl && Double.compare(that.moneyRal, moneyRal) == 0 && oneMonthSalary == that.oneMonthSalary && foodStamp == that.foodStamp && Double.compare(that.foodStampValue, foodStampValue) == 0 && Double.compare(that.refund, refund) == 0 && trialPeriod == that.trialPeriod && employeeId == that.employeeId && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(contractType, that.contractType) && Objects.equals(contractLevel, that.contractLevel) && Objects.equals(contractLevelStage, that.contractLevelStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccnl, startDate, endDate, contractType, moneyRal, contractLevel, oneMonthSalary, foodStamp, foodStampValue, refund, trialPeriod, employeeId, contractLevelStage);
    }

    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", nullable = false)
    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
