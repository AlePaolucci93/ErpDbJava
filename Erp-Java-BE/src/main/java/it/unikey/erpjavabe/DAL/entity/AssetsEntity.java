package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Assets", schema = "public", catalog = "ErpDB")
public class AssetsEntity {
    private int id;
    private String serialNumber;
    private boolean isDeleted;
    private BigInteger price;
    private Integer assetTypeId;
    private AssetTypesEntity assetTypesByAssetTypeId;
    private Collection<EmployeeAssetsEntity> employeeAssetsById;

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
    @Column(name = "SerialNumber", nullable = true, length = -1)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "IsDeleted", nullable = false)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "Price", nullable = false, precision = 0)
    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @Basic
    @Column(name = "AssetTypeId", nullable = true)
    public Integer getAssetTypeId() {
        return assetTypeId;
    }

    public void setAssetTypeId(Integer assetTypeId) {
        this.assetTypeId = assetTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssetsEntity that = (AssetsEntity) o;
        return id == that.id && isDeleted == that.isDeleted && Objects.equals(serialNumber, that.serialNumber) && Objects.equals(price, that.price) && Objects.equals(assetTypeId, that.assetTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serialNumber, isDeleted, price, assetTypeId);
    }

    @ManyToOne
    @JoinColumn(name = "AssetTypeId", referencedColumnName = "Id")
    public AssetTypesEntity getAssetTypesByAssetTypeId() {
        return assetTypesByAssetTypeId;
    }

    public void setAssetTypesByAssetTypeId(AssetTypesEntity assetTypesByAssetTypeId) {
        this.assetTypesByAssetTypeId = assetTypesByAssetTypeId;
    }

    @OneToMany(mappedBy = "assetsByAssetId")
    public Collection<EmployeeAssetsEntity> getEmployeeAssetsById() {
        return employeeAssetsById;
    }

    public void setEmployeeAssetsById(Collection<EmployeeAssetsEntity> employeeAssetsById) {
        this.employeeAssetsById = employeeAssetsById;
    }
}
