package ba.telegroup.mljekara.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

/**
 * Created by milicaavramovic on 7/9/2018.
 */
@Entity
public class Otkup {
    private String brojPotvrde;
    private Date datum;
    private Integer id;
    private String otkupcol;
    private Byte active;

    @Basic
    @Column(name = "brojPotvrde", nullable = false, length = 20)
    public String getBrojPotvrde() {
        return brojPotvrde;
    }

    public void setBrojPotvrde(String brojPotvrde) {
        this.brojPotvrde = brojPotvrde;
    }

    @Basic
    @Column(name = "datum", nullable = false)
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
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
    @Column(name = "otkupcol", nullable = true, length = 45)
    public String getOtkupcol() {
        return otkupcol;
    }

    public void setOtkupcol(String otkupcol) {
        this.otkupcol = otkupcol;
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
        Otkup otkup = (Otkup) o;
        return Objects.equals(brojPotvrde, otkup.brojPotvrde) &&
                Objects.equals(datum, otkup.datum) &&
                Objects.equals(id, otkup.id) &&
                Objects.equals(otkupcol, otkup.otkupcol) &&
                Objects.equals(active, otkup.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(brojPotvrde, datum, id, otkupcol, active);
    }
}
