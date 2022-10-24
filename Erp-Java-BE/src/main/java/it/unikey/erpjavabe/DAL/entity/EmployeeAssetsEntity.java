package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "EmployeeAssets", schema = "public", catalog = "ErpDB")
public class EmployeeAssetsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "EmployeeId")
    private int employeeId;
    @Basic
    @Column(name = "AssetId")
    private int assetId;
    @Basic
    @Column(name = "DeliveryDeviceDate")
    private Timestamp deliveryDeviceDate;
    @Basic
    @Column(name = "ReturnDeviceDate")
    private Timestamp returnDeviceDate;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", nullable = false)
    private EmployeesEntity employeesByEmployeeId;
    @ManyToOne
    @JoinColumn(name = "AssetId", referencedColumnName = "Id", nullable = false)
    private AssetsEntity assetsByAssetId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public Timestamp getDeliveryDeviceDate() {
        return deliveryDeviceDate;
    }

    public void setDeliveryDeviceDate(Timestamp deliveryDeviceDate) {
        this.deliveryDeviceDate = deliveryDeviceDate;
    }

    public Timestamp getReturnDeviceDate() {
        return returnDeviceDate;
    }

    public void setReturnDeviceDate(Timestamp returnDeviceDate) {
        this.returnDeviceDate = returnDeviceDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeAssetsEntity that = (EmployeeAssetsEntity) o;
        return id == that.id && employeeId == that.employeeId && assetId == that.assetId && isDeleted == that.isDeleted && Objects.equals(deliveryDeviceDate, that.deliveryDeviceDate) && Objects.equals(returnDeviceDate, that.returnDeviceDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, assetId, deliveryDeviceDate, returnDeviceDate, isDeleted);
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    public AssetsEntity getAssetsByAssetId() {
        return assetsByAssetId;
    }

    public void setAssetsByAssetId(AssetsEntity assetsByAssetId) {
        this.assetsByAssetId = assetsByAssetId;
    }
}
