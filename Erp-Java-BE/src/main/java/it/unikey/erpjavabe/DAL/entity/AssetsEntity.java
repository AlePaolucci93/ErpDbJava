package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Assets", schema = "public", catalog = "ErpDB")
public class AssetsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "SerialNumber")
    private String serialNumber;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @Basic
    @Column(name = "Price")
    private BigInteger price;
    @Basic
    @Column(name = "AssetTypeId")
    private Integer assetTypeId;
    @ManyToOne
    @JoinColumn(name = "AssetTypeId", referencedColumnName = "Id")
    private AssetTypesEntity assetTypesByAssetTypeId;
    @OneToMany(mappedBy = "assetsByAssetId")
    private Collection<EmployeeAssetsEntity> employeeAssetsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

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

    public AssetTypesEntity getAssetTypesByAssetTypeId() {
        return assetTypesByAssetTypeId;
    }

    public void setAssetTypesByAssetTypeId(AssetTypesEntity assetTypesByAssetTypeId) {
        this.assetTypesByAssetTypeId = assetTypesByAssetTypeId;
    }

    public Collection<EmployeeAssetsEntity> getEmployeeAssetsById() {
        return employeeAssetsById;
    }

    public void setEmployeeAssetsById(Collection<EmployeeAssetsEntity> employeeAssetsById) {
        this.employeeAssetsById = employeeAssetsById;
    }
}
