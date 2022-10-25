package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "__EFMigrationsHistory", schema = "public", catalog = "ErpDB")
public class EfMigrationsHistoryEntity {
    private String migrationId;
    private String productVersion;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MigrationId", nullable = false, length = 150)
    public String getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    @Basic
    @Column(name = "ProductVersion", nullable = false, length = 32)
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
