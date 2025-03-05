/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.goetterdiener.Goetterdiener1;
import helden.model.DDZprofessionen.goetterdiener.Goetterdiener2;
import helden.model.DDZprofessionen.goetterdiener.Goetterdiener3;
import helden.model.DDZprofessionen.zusatzvarianten.Geweiht;
import helden.model.profession.KeineWahl;
import java.util.ArrayList;

public class Goetterdiener
extends BasisDDZProfessionMitGeweihter {
    private static P[] \u00d3\u00d8\u00f4O00;
    private static P newprivateif;
    private P returnprivateif;
    private P \u00d5\u00d8\u00f4O00;
    private P \u00d4\u00d8\u00f4O00;

    public Goetterdiener() {
    }

    public Goetterdiener(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getGeweiht(1));
        arrayList.add(this.getGeweiht(2));
        arrayList.add(this.getGeweiht(3));
        arrayList.add(this.getGeweiht(4));
        return arrayList;
    }

    @Override
    public P getGeweiht(int n) {
        if (\u00d3\u00d8\u00f4O00 == null) {
            \u00d3\u00d8\u00f4O00 = new P[4];
            for (int i2 = 0; i2 < 4; ++i2) {
                Goetterdiener.\u00d3\u00d8\u00f4O00[i2] = new Geweiht(i2 + 1, false);
            }
        }
        return \u00d3\u00d8\u00f4O00[n - 1];
    }

    public P getGoetterdiener1() {
        if (this.returnprivateif == null) {
            this.returnprivateif = new Goetterdiener1();
        }
        return this.returnprivateif;
    }

    public P getGoetterdiener2() {
        if (this.\u00d5\u00d8\u00f4O00 == null) {
            this.\u00d5\u00d8\u00f4O00 = new Goetterdiener2();
        }
        return this.\u00d5\u00d8\u00f4O00;
    }

    public P getGoetterdiener3() {
        if (this.\u00d4\u00d8\u00f4O00 == null) {
            this.\u00d4\u00d8\u00f4O00 = new Goetterdiener3();
        }
        return this.\u00d4\u00d8\u00f4O00;
    }

    @Override
    public String getID() {
        return "P152";
    }

    @Override
    public super._o getKategorie() {
        return super._o.class;
    }

    @Override
    public P getKeineWahl() {
        if (newprivateif == null) {
            newprivateif = new KeineWahl();
        }
        return newprivateif;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.add(this.getKeineWahl());
        arrayList2.add(this.getGeweiht(1));
        arrayList2.add(this.getGeweiht(2));
        arrayList2.add(this.getGeweiht(3));
        arrayList2.add(this.getGeweiht(4));
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.varianteGewaehlt()) {
            if (this.istMaennlich()) {
                stringBuilder.append("G\u00f6tterdiener");
            } else {
                stringBuilder.append("G\u00f6tterdienerin");
            }
        } else {
            stringBuilder.append(super.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getGoetterdiener1());
        this.addAlleVarianten(this.getGoetterdiener2());
        this.addAlleVarianten(this.getGoetterdiener3());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getGoetterdiener1());
        this.addMoeglicheVariante(this.getGoetterdiener2());
        this.addMoeglicheVariante(this.getGoetterdiener3());
    }
}

