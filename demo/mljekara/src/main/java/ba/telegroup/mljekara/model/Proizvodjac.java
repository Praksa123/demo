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
public class Proizvodjac {
    private Integer id;
    private String sifra;
    private String adresa;
    private String brojTelefona;
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
    @Column(name = "sifra", nullable = false, length = 20)
    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    @Basic
    @Column(name = "adresa", nullable = false, length = 50)
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Basic
    @Column(name = "brojTelefona", nullable = false, length = 25)
    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
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
        Proizvodjac that = (Proizvodjac) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(sifra, that.sifra) &&
                Objects.equals(adresa, that.adresa) &&
                Objects.equals(brojTelefona, that.brojTelefona) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, sifra, adresa, brojTelefona, active);
    }
}
