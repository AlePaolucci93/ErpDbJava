package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Images", schema = "public", catalog = "ErpDB")
public class ImagesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Path")
    private String path;
    @Basic
    @Column(name = "Timestamp")
    private String timestamp;
    @OneToMany(mappedBy = "imagesByUserImageId")
    private Collection<AspNetUsersEntity> aspNetUsersById;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

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

    public Collection<AspNetUsersEntity> getAspNetUsersById() {
        return aspNetUsersById;
    }

    public void setAspNetUsersById(Collection<AspNetUsersEntity> aspNetUsersById) {
        this.aspNetUsersById = aspNetUsersById;
    }
}
