package ba.telegroup.mljekara.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Created by milicaavramovic on 7/9/2018.
 */
@Entity
public class Banka {
    private Integer id;
    private String naziv;
    private Byte active;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "naziv", nullable = false, length = 50)
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
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
        Banka banka = (Banka) o;
        return Objects.equals(id, banka.id) &&
                Objects.equals(naziv, banka.naziv) &&
                Objects.equals(active, banka.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, naziv, active);
    }
}
