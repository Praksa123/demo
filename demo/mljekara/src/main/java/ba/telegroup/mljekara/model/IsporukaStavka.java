package ba.telegroup.mljekara.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by milicaavramovic on 7/9/2018.
 */
@Entity
@Table(name = "isporuka_stavka", schema = "mljekara", catalog = "")
public class IsporukaStavka {
    private Double kolicina;
    private Double kvalitet;
    private Integer id;
    private Byte active;

    @Basic
    @Column(name = "kolicina", nullable = false, precision = 0)
    public Double getKolicina() {
        return kolicina;
    }

    public void setKolicina(Double kolicina) {
        this.kolicina = kolicina;
    }

    @Basic
    @Column(name = "kvalitet", nullable = false, precision = 0)
    public Double getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(Double kvalitet) {
        this.kvalitet = kvalitet;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "active", nullable = false)
    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsporukaStavka that = (IsporukaStavka) o;
        return Objects.equals(kolicina, that.kolicina) &&
                Objects.equals(kvalitet, that.kvalitet) &&
                Objects.equals(id, that.id) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(kolicina, kvalitet, id, active);
    }
}
