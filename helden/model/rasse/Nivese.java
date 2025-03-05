/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.b_0;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.Fjarninger;
import helden.model.DDZKulturen.Gjalskerlaender;
import helden.model.DDZKulturen.Hjaldinger;
import helden.model.DDZKulturen.Serrach;
import helden.model.kultur.Bornland;
import helden.model.kultur.Garetien;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Nivesenstaemme;
import helden.model.kultur.Norbardensippe;
import helden.model.kultur.NuanaaeLi;
import helden.model.kultur.Svellttal;
import helden.model.kultur.Thorwal;
import java.util.ArrayList;

public class Nivese
extends o0oo_0 {
    private static final int \u00d4\u00f6OO00 = 155;
    private static final int \u00d5\u00f6OO00 = 110;

    public Nivese() {
    }

    public Nivese(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(35);
        arrayList.add(45);
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(75);
        arrayList.add(80);
        arrayList.add(5);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("braun", 2, 20));
        arrayList.add(new oooo_1("hellbraun", 7, 20));
        arrayList.add(new oooo_1("bernstein", 5, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 3, 20));
        arrayList.add(new oooo_1("blau", 2, 20));
        arrayList.add(new oooo_1("grau", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.nullfloat);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d5\u00d40000);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 110;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("kupferrot", 15, 20));
        arrayList.add(new oooo_1("blond", 1, 20));
        arrayList.add(new oooo_1("braun", 2, 20));
        arrayList.add(new oooo_1("dunkelblond", 1, 20));
        arrayList.add(new oooo_1("schwarz", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R08";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Nivesenstaemme(this.getGeschlecht()));
        arrayList.add(new NuanaaeLi(this.getGeschlecht()));
        arrayList.add(new helden.model.DDZKulturen.Nivesenstaemme(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new Mittelreich(this.getGeschlecht()));
            arrayList.add(new Bornland(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            arrayList.add(new Thorwal(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.Gjalskerlaender(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.Fjarninger(this.getGeschlecht()));
            arrayList.add(new Norbardensippe(this.getGeschlecht()));
            arrayList.add(new Hjaldinger(this.getGeschlecht()));
            arrayList.add(new Gjalskerlaender(this.getGeschlecht()));
            arrayList.add(new Fjarninger(this.getGeschlecht()));
            arrayList.add(new Alhanien(this.getGeschlecht()));
            arrayList.add(new Serrach(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 40;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + 40;
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 110;
    }

    @Override
    public int getMinGroesse() {
        return 155;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thissuper);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d80\u00d2000);
        arrayList.add(I.\u00f8\u00d40000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Nivese";
        }
        return "Nivesin";
    }

    @Override
    public int wurfeleAlter() {
        return 14 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 155 + Wuerfel.w20() + Wuerfel.w20();
    }

    @Override
    protected int getBasisGPKosten() {
        return 4;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00f8\u00f4\u00d2000, 1);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 9);
        this.putModifikator(b_0.thispublicsuper, 12);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -5);
    }
}

