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
public class Isporuka {
    private Integer id;
    private String brojOtpremnice;
    private Date datum;
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
    @Column(name = "brojOtpremnice", nullable = false, length = 20)
    public String getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(String brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }

    @Basic
    @Column(name = "datum", nullable = false)
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
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
        Isporuka isporuka = (Isporuka) o;
        return Objects.equals(id, isporuka.id) &&
                Objects.equals(brojOtpremnice, isporuka.brojOtpremnice) &&
                Objects.equals(datum, isporuka.datum) &&
                Objects.equals(active, isporuka.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, brojOtpremnice, datum, active);
    }
}
