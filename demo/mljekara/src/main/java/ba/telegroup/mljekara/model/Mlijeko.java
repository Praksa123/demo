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
public class Mlijeko {
    private Integer id;
    private String vrsta;
    private Double jedinicnaCena;
    private Double jedinicnaPremija;
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
    @Column(name = "vrsta", nullable = false, length = 20)
    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
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
        Mlijeko mlijeko = (Mlijeko) o;
        return Objects.equals(id, mlijeko.id) &&
                Objects.equals(vrsta, mlijeko.vrsta) &&
                Objects.equals(jedinicnaCena, mlijeko.jedinicnaCena) &&
                Objects.equals(jedinicnaPremija, mlijeko.jedinicnaPremija) &&
                Objects.equals(active, mlijeko.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, vrsta, jedinicnaCena, jedinicnaPremija, active);
    }
}
