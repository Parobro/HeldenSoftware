/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.zauber.KonkreterZauber;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.bosparanischermagier.Legionsmagier;
import helden.model.DDZprofessionen.bosparanischermagier.LeibmagierCuslicum;
import helden.model.DDZprofessionen.bosparanischermagier.NekromantBosparan;
import java.util.ArrayList;

public class BosMagier
extends BasisDDZProfessionMitGeweihter {
    private P whilenullif;
    private P O\u00f5\u00d8O00;
    private P o\u00f5\u00d8O00;

    public BosMagier() {
    }

    public BosMagier(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P149";
    }

    public P getLegionsmagier() {
        if (this.whilenullif == null) {
            this.whilenullif = new Legionsmagier();
        }
        return this.whilenullif;
    }

    public P getLeibmagier() {
        if (this.o\u00f5\u00d8O00 == null) {
            this.o\u00f5\u00d8O00 = new LeibmagierCuslicum();
        }
        return this.o\u00f5\u00d8O00;
    }

    public P getNekromant() {
        if (this.O\u00f5\u00d8O00 == null) {
            this.O\u00f5\u00d8O00 = new NekromantBosparan();
        }
        return this.O\u00f5\u00d8O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istVeteranErlaubt() {
        return false;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Bosparanischer Magier");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getLegionsmagier());
        this.addAlleVarianten(this.getNekromant());
        this.addAlleVarianten(this.getLeibmagier());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getLegionsmagier());
        this.addMoeglicheVariante(this.getNekromant());
        this.addMoeglicheVariante(this.getLeibmagier());
    }
}

