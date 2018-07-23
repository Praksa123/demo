package ba.telegroup.mljekara.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by milicaavramovic on 7/9/2018.
 */
@Entity
public class Racun {
    private Integer id;
    private String brojRacuna;
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
    @Column(name = "brojRacuna", nullable = false, length = 20)
    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
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
        Racun racun = (Racun) o;
        return Objects.equals(id, racun.id) &&
                Objects.equals(brojRacuna, racun.brojRacuna) &&
                Objects.equals(active, racun.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, brojRacuna, active);
    }
}
