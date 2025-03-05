/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o00o_0;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Serrach;
import helden.model.DDZKulturen.Steppenelfensippe;
import helden.model.kultur.AuelfenSippe;
import helden.model.kultur.ElfischeSiedlung;
import helden.model.kultur.Garetien;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Norbardensippe;
import helden.model.kultur.SteppenelfenSippe;
import helden.model.kultur.Svellttal;
import helden.model.kultur.WaldelfenSippe;
import java.util.ArrayList;

public class Waldelf
extends o0oo_0
implements for {
    private static final int \u00f5\u00d8OO00 = 166;
    private static final int Stringsupervoid = 120;
    private public \u00f4\u00d8OO00;

    public Waldelf() {
    }

    public Waldelf(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.\u00f4\u00d8OO00 = public_;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 4);
        this.setTalentwert(voidsuper.returnforObject, 2);
        this.setTalentwert(voidsuper.newnewObject, 2);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 5);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, -2);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        arrayList.add(1000);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 2, 20));
        arrayList.add(new oooo_1("saphirblau", 2, 20));
        arrayList.add(new oooo_1("smaragdgr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("dunkelbraun", 4, 20));
        arrayList.add(new oooo_1("bernsteinfarben", 4, 20));
        arrayList.add(new oooo_1("goldgesprenkelt", 1, 20));
        arrayList.add(new oooo_1("rubinrot", 2, 20));
        arrayList.add(new oooo_1("amethyst", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f8oO000);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.forpublic);
        arrayList.add(I.thissuper);
        arrayList.add(I.ifif);
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00d5O0000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00f8\u00d40000);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 120;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("blauschwarz", 3, 20));
        arrayList.add(new oooo_1("schwarz", 4, 20));
        arrayList.add(new oooo_1("silbern", 3, 20));
        arrayList.add(new oooo_1("wei\u00dfblond", 1, 20));
        arrayList.add(new oooo_1("hellblond", 2, 20));
        arrayList.add(new oooo_1("mittelblond", 3, 20));
        arrayList.add(new oooo_1("dunkelblond", 3, 20));
        arrayList.add(new oooo_1("goldblond", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R16";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new WaldelfenSippe(this.getGeschlecht()));
        arrayList.add(new Steppenelfensippe(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new AuelfenSippe(this.getGeschlecht()));
            arrayList.add(new SteppenelfenSippe(this.getGeschlecht()));
            arrayList.add(new ElfischeSiedlung(this.getGeschlecht()));
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new Mittelreich(this.getGeschlecht()));
            arrayList.add(new Norbardensippe(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            Nordprovinzen nordprovinzen = new Nordprovinzen(this.getGeschlecht());
            nordprovinzen.clearMoeglicheVarianten();
            nordprovinzen.addMoeglicheVariante(Nordprovinzen.\u00f5\u00d50O00);
            nordprovinzen.addMoeglicheVariante(Nordprovinzen.thisintreturn);
            arrayList.add(nordprovinzen);
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
        return this.getMinGroesse() - 120;
    }

    @Override
    public int getMinGroesse() {
        return 166;
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        ArrayList<public> arrayList = new ArrayList<public>();
        M m = (M)K.o00000(I.ifif);
        m.\u00d2o0000();
        ArrayList arrayList2 = m.\u00d200000(false);
        D<String> d2 = arrayList2.get(0);
        d2.o00000("Geh\u00f6r");
        D<String> d3 = arrayList2.get(1);
        d3.o00000("Geruch");
        arrayList.add(d2);
        arrayList.add(d3);
        return new o00o_0(this, arrayList, 1);
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.OO0000);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.forclasssuper);
        arrayList.add(I.o00000);
        arrayList.add(I.newif);
        arrayList.add(I.O\u00d40000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.OOO000);
        arrayList.add(I.O\u00d20000);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00d3\u00f8O000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f8o0000));
        oo0O.\u00d300000(K.o00000(I.\u00f50O000));
        oo0O.\u00d300000(K.o00000(I.\u00d8\u00d3o000));
        oo0O.\u00d300000(this.\u00f4\u00d8OO00);
        oo0O.\u00d300000(K.o00000(I.o\u00f4o000));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d4O000));
        oo0O.\u00d300000(K.o00000(I.forsupersuper));
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f80000));
        oo0O.\u00d300000(K.o00000(I.nullpublic));
        J j2 = (J)K.o00000(I.O\u00f5O000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        M m = (M)K.o00000(I.fordo);
        m.\u00d2o0000();
        m.o00000(voidsuper.\u00d40\u00d6000);
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.\u00f4\u00d8OO00 == null;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istSchelmErlaubt() {
        return false;
    }

    @Override
    public boolean istVeteranErlaubt() {
        return true;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Waldelf";
        }
        return "Waldelfe";
    }

    @Override
    public int wurfeleAlter() {
        return 25 + Wuerfel.w(20);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 166 + Wuerfel.w20() + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6();
    }

    @Override
    protected int getBasisGPKosten() {
        return 23;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.newwhilesuper, -1);
        this.putModifikator(b_0.\u00f8\u00f4\u00d2000, 2);
        this.putModifikator(b_0.\u00f4\u00f4\u00d2000, 2);
        this.putModifikator(b_0.privatedosuper, -1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 6);
        this.putModifikator(b_0.thispublicsuper, 10);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -4);
    }
}

