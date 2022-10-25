package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "AssetTypes", schema = "public", catalog = "ErpDB")
public class AssetTypesEntity {
    private int id;
    private String name;
    private boolean isDeleted;
    private Collection<AssetsEntity> assetsById;

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
    @Column(name = "Name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        AssetTypesEntity that = (AssetTypesEntity) o;
        return id == that.id && isDeleted == that.isDeleted && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isDeleted);
    }

    @OneToMany(mappedBy = "assetTypesByAssetTypeId")
    public Collection<AssetsEntity> getAssetsById() {
        return assetsById;
    }

    public void setAssetsById(Collection<AssetsEntity> assetsById) {
        this.assetsById = assetsById;
    }
}
