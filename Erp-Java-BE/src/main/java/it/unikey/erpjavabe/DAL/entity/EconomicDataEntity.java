package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "EconomicData", schema = "public", catalog = "ErpDB")
public class EconomicDataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "CCNL")
    private int ccnl;
    @Basic
    @Column(name = "StartDate")
    private Timestamp startDate;
    @Basic
    @Column(name = "EndDate")
    private Timestamp endDate;
    @Basic
    @Column(name = "ContractType")
    private Integer contractType;
    @Basic
    @Column(name = "MoneyRAL")
    private double moneyRal;
    @Basic
    @Column(name = "ContractLevel")
    private Integer contractLevel;
    @Basic
    @Column(name = "OneMonthSalary")
    private int oneMonthSalary;
    @Basic
    @Column(name = "FoodStamp")
    private int foodStamp;
    @Basic
    @Column(name = "FoodStampValue")
    private double foodStampValue;
    @Basic
    @Column(name = "Refund")
    private double refund;
    @Basic
    @Column(name = "TrialPeriod")
    private int trialPeriod;
    @Basic
    @Column(name = "EmployeeId")
    private int employeeId;
    @Basic
    @Column(name = "ContractLevelStage")
    private Integer contractLevelStage;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", nullable = false)
    private EmployeesEntity employeesByEmployeeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCcnl() {
        return ccnl;
    }

    public void setCcnl(int ccnl) {
        this.ccnl = ccnl;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public double getMoneyRal() {
        return moneyRal;
    }

    public void setMoneyRal(double moneyRal) {
        this.moneyRal = moneyRal;
    }

    public Integer getContractLevel() {
        return contractLevel;
    }

    public void setContractLevel(Integer contractLevel) {
        this.contractLevel = contractLevel;
    }

    public int getOneMonthSalary() {
        return oneMonthSalary;
    }

    public void setOneMonthSalary(int oneMonthSalary) {
        this.oneMonthSalary = oneMonthSalary;
    }

    public int getFoodStamp() {
        return foodStamp;
    }

    public void setFoodStamp(int foodStamp) {
        this.foodStamp = foodStamp;
    }

    public double getFoodStampValue() {
        return foodStampValue;
    }

    public void setFoodStampValue(double foodStampValue) {
        this.foodStampValue = foodStampValue;
    }

    public double getRefund() {
        return refund;
    }

    public void setRefund(double refund) {
        this.refund = refund;
    }

    public int getTrialPeriod() {
        return trialPeriod;
    }

    public void setTrialPeriod(int trialPeriod) {
        this.trialPeriod = trialPeriod;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

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

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
