package ba.telegroup.mljekara.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by milicaavramovic on 7/9/2018.
 */
@Entity
@Table(name = "otkup_stavka", schema = "mljekara", catalog = "")
public class OtkupStavka {
    private Integer id;
    private Double kolicina;
    private Double kvalitet;
    private Double jedinicnaCena;
    private Double jedinicnaPremija;
    private Double otkupnaVrednost;
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

    @Basic
    @Column(name = "jedinicnaCena", nullable = false, precision = 0)
    public Double getJedinicnaCena() {
        return jedinicnaCena;
    }

    public void setJedinicnaCena(Double jedinicnaCena) {
        this.jedinicnaCena = jedinicnaCena;
    }

    @Basic
    @Column(name = "jedinicnaPremija", nullable = false, precision = 0)
    public Double getJedinicnaPremija() {
        return jedinicnaPremija;
    }

    public void setJedinicnaPremija(Double jedinicnaPremija) {
        this.jedinicnaPremija = jedinicnaPremija;
    }

    @Basic
    @Column(name = "otkupnaVrednost", nullable = false, precision = 0)
    public Double getOtkupnaVrednost() {
        return otkupnaVrednost;
    }

    public void setOtkupnaVrednost(Double otkupnaVrednost) {
        this.otkupnaVrednost = otkupnaVrednost;
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
        OtkupStavka that = (OtkupStavka) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(kolicina, that.kolicina) &&
                Objects.equals(kvalitet, that.kvalitet) &&
                Objects.equals(jedinicnaCena, that.jedinicnaCena) &&
                Objects.equals(jedinicnaPremija, that.jedinicnaPremija) &&
                Objects.equals(otkupnaVrednost, that.otkupnaVrednost) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, kolicina, kvalitet, jedinicnaCena, jedinicnaPremija, otkupnaVrednost, active);
    }
}
