package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "__EFMigrationsHistory", schema = "public", catalog = "ErpDB")
public class EfMigrationsHistoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MigrationId")
    private String migrationId;
    @Basic
    @Column(name = "ProductVersion")
    private String productVersion;

    public String getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EfMigrationsHistoryEntity that = (EfMigrationsHistoryEntity) o;
        return Objects.equals(migrationId, that.migrationId) && Objects.equals(productVersion, that.productVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationId, productVersion);
    }
}
