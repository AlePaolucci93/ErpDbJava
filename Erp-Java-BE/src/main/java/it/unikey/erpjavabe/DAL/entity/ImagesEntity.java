package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Images", schema = "public", catalog = "ErpDB")
public class ImagesEntity {
    private int id;
    private String name;
    private String path;
    private String timestamp;
    private Collection<AspNetUsersEntity> aspNetUsersById;

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
    @Column(name = "Path", nullable = true, length = -1)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "Timestamp", nullable = true, length = -1)
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImagesEntity that = (ImagesEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(path, that.path) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, path, timestamp);
    }

    @OneToMany(mappedBy = "imagesByUserImageId")
    public Collection<AspNetUsersEntity> getAspNetUsersById() {
        return aspNetUsersById;
    }

    public void setAspNetUsersById(Collection<AspNetUsersEntity> aspNetUsersById) {
        this.aspNetUsersById = aspNetUsersById;
    }
}
