package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "EmployeeAssets", schema = "public", catalog = "ErpDB")
public class EmployeeAssetsEntity {
    private int id;
    private int employeeId;
    private int assetId;
    private Timestamp deliveryDeviceDate;
    private Timestamp returnDeviceDate;
    private boolean isDeleted;
    private EmployeesEntity employeesByEmployeeId;
    private AssetsEntity assetsByAssetId;

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
    @Column(name = "EmployeeId", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "AssetId", nullable = false)
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    @Basic
    @Column(name = "DeliveryDeviceDate", nullable = false)
    public Timestamp getDeliveryDeviceDate() {
        return deliveryDeviceDate;
    }

    public void setDeliveryDeviceDate(Timestamp deliveryDeviceDate) {
        this.deliveryDeviceDate = deliveryDeviceDate;
    }

    @Basic
    @Column(name = "ReturnDeviceDate", nullable = true)
    public Timestamp getReturnDeviceDate() {
        return returnDeviceDate;
    }

    public void setReturnDeviceDate(Timestamp returnDeviceDate) {
        this.returnDeviceDate = returnDeviceDate;
    }

    @Basic
    @Column(name = "IsDeleted", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", nullable = false)
    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    @ManyToOne
    @JoinColumn(name = "AssetId", referencedColumnName = "Id", nullable = false)
    public AssetsEntity getAssetsByAssetId() {
        return assetsByAssetId;
    }

    public void setAssetsByAssetId(AssetsEntity assetsByAssetId) {
        this.assetsByAssetId = assetsByAssetId;
    }
}
