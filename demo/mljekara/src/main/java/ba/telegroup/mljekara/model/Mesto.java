package ba.telegroup.mljekara.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Mesto {
    private Integer postanskiBroj;
    private String naziv;
    private Integer id;
    private Byte active;

    @Basic
    @Column(name = "postanskiBroj", nullable = false)
    public Integer getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(Integer postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    @Basic
    @Column(name = "naziv", nullable = false, length = 50)
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
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
        Mesto mesto = (Mesto) o;
        return Objects.equals(postanskiBroj, mesto.postanskiBroj) &&
                Objects.equals(naziv, mesto.naziv) &&
                Objects.equals(id, mesto.id) &&
                Objects.equals(active, mesto.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(postanskiBroj, naziv, id, active);
    }
}
