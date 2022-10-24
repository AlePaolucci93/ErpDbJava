package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "AssetTypes", schema = "public", catalog = "ErpDB")
public class AssetTypesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @OneToMany(mappedBy = "assetTypesByAssetTypeId")
    private Collection<AssetsEntity> assetsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        AssetTypesEntity that = (AssetTypesEntity) o;
        return id == that.id && isDeleted == that.isDeleted && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isDeleted);
    }

    public Collection<AssetsEntity> getAssetsById() {
        return assetsById;
    }

    public void setAssetsById(Collection<AssetsEntity> assetsById) {
        this.assetsById = assetsById;
    }
}
