package fr.humanbooster.fx.enquetes.business;

import javax.persistence.Entity;

/**
 * Created by Human Booster on 17/02/2017.
 */
@Entity
public class EnqueteTel extends Enquete {
    String accroche;

    public EnqueteTel() {
    }

    public String getAccroche() {
        return accroche;
    }

    public void setAccroche(String accroche) {
        this.accroche = accroche;
    }
}
