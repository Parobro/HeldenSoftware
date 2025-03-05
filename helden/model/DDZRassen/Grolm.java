/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZRassen;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.bedingungen.Bedingung;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.AndergastNostria;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.Grolmensippe;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Suedaventurien;
import java.util.ArrayList;

public class Grolm
extends o0oo_0
implements helden.framework.oOoO.A.Object {
    private static final int o\u00d4oO00 = 81;
    private static final int \u00d3\u00d4oO00 = 0;
    private ArrayList<KonkreterZauber> nullvoidvoid;

    public Grolm() {
    }

    public Grolm(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 2);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 3);
        this.setTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 3);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 3);
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(25);
        arrayList.add(26);
        arrayList.add(27);
        arrayList.add(28);
        arrayList.add(29);
        arrayList.add(30);
        arrayList.add(1);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("milchig-grau", 3, 20));
        arrayList.add(new oooo_1("klar-grau", 4, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 7, 20));
        arrayList.add(new oooo_1("blau", 4, 20));
        arrayList.add(new oooo_1("schwarz", 2, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f8oO000);
        arrayList.add(helden.framework.C.K.o00000(I.\u00f4\u00d20000, voidsuper.\u00d30\u00d8000));
        arrayList.add(helden.framework.C.K.o00000(I.\u00f5\u00f6O000, o00O.classnew, o00O.\u00d8o0000, o00O.\u00d200000));
        arrayList.add(I.\u00f5\u00f50000);
        arrayList.add(I.whilenull);
        arrayList.add(I.\u00f5\u00f4o000);
        arrayList.add(I.o00000);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f40\u00d2000);
        arrayList.add(I.\u00f5\u00d6O000);
        arrayList.add(I.\u00f5\u00f80000);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() / 3;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("kahlk\u00f6pfig", 6, 20));
        arrayList.add(new oooo_1("hellgrau", 8, 20));
        arrayList.add(new oooo_1("braun", 4, 20));
        arrayList.add(new oooo_1("schwarz", 2, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R20";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Grolmensippe(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new BosparanischesReich(this.getGeschlecht()));
            arrayList.add(new Nordprovinzen(this.getGeschlecht()));
            arrayList.add(new Suedaventurien(this.getGeschlecht()));
            arrayList.add(new Alhanien(this.getGeschlecht()));
            arrayList.add(new AndergastNostria(this.getGeschlecht()));
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 24;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + 24;
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 0;
    }

    @Override
    public int getMinGroesse() {
        return 81;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(helden.framework.d.oooo_0.o00000(while.\u00f6\u00f6\u00d2000.toString()));
        return oOOo;
    }

    public ArrayList<oooo_0> getSpezielleAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0();
        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.o00000(Zauber.O\u00d3\u00d4000), 5, true)));
        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.o00000(Zauber.\u00d4\u00d3\u00d3000), 5, true)));
        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.o00000(Zauber.\u00f8o\u00d3000), 5, true)));
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.o00000(Zauber.O\u00d3\u00d4000), 3, false), Bedingung.hatNicht(this.o00000(Zauber.O\u00d3\u00d4000), (Integer)5)));
        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.o00000(Zauber.\u00d4\u00d3\u00d3000), 3, false), Bedingung.hatNicht(this.o00000(Zauber.\u00d4\u00d3\u00d3000), (Integer)5)));
        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.o00000(Zauber.\u00f8o\u00d3000), 3, false), Bedingung.hatNicht(this.o00000(Zauber.\u00f8o\u00d3000), (Integer)5)));
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        for (KonkreterZauber konkreterZauber : this.\u00d5\u00d2O000()) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(konkreterZauber, 6, true)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        for (KonkreterZauber konkreterZauber : this.\u00d5\u00d2O000()) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(konkreterZauber, 5, true), Bedingung.hatNicht(konkreterZauber, (Integer)6)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        for (KonkreterZauber konkreterZauber : this.\u00d5\u00d2O000()) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(konkreterZauber, 4, false), Bedingung.hatNicht(konkreterZauber, (Integer)5)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        for (KonkreterZauber konkreterZauber : this.\u00d5\u00d2O000()) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(konkreterZauber, 2, false), Bedingung.hatNicht(konkreterZauber, (Integer)4)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        for (KonkreterZauber konkreterZauber : this.\u00d6\u00d2O000()) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(konkreterZauber, 5, true)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        for (KonkreterZauber konkreterZauber : this.\u00d6\u00d2O000()) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(konkreterZauber, 2, false), Bedingung.hatNicht(konkreterZauber, (Integer)5)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        for (KonkreterZauber konkreterZauber : this.\u00d4\u00d2O000()) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(konkreterZauber, 4, true)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        for (KonkreterZauber konkreterZauber : this.\u00d4\u00d2O000()) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(konkreterZauber, 2, false), Bedingung.hatNicht(konkreterZauber, (Integer)4)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        oooo_02 = new oooo_0();
        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.o00000(Zauber.\u00d3o\u00d4000), 3, false)));
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(helden.framework.C.K.o00000(I.\u00f5\u00f6O000, o00O.\u00d2O0000, o00O.\u00d6o0000));
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.\u00d5\u00d3O000);
        arrayList.add(I.nullclass);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00d8o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5O0000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.privateObjectsuper, 8));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.privateclass, 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f4\u00f8o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f50\u00d2000));
        return oo0O;
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        if (this.nullvoidvoid == null) {
            this.nullvoidvoid = new ArrayList();
        }
        this.nullvoidvoid.add(konkreterZauber);
    }

    @Override
    public void gewaehlterVorteil(public public_) {
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, helden.framework.held.K k2, boolean bl) {
        k2.\u00d5o0000().\u00d300000((KonkreterZauber)oo0o_02, n);
    }

    @Override
    public boolean istSchelmErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Grolm";
        }
        return "Grolmin";
    }

    @Override
    public int wurfeleAlter() {
        return 4 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 81 + Wuerfel.w20();
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        if (this.nullvoidvoid != null) {
            arrayList.addAll(this.nullvoidvoid);
        }
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(helden.framework.oooo.b_0.newwhilesuper, 2);
        this.putModifikator(helden.framework.oooo.b_0.\u00f8\u00f4\u00d2000, 1);
        this.putModifikator(helden.framework.oooo.b_0.\u00d5\u00f4\u00d2000, -1);
        this.putModifikator(helden.framework.oooo.b_0.O\u00f5\u00d2000, 2);
        this.putModifikator(helden.framework.oooo.b_0.returnwhilesuper, -1);
        this.putModifikator(helden.framework.oooo.b_0.privatedosuper, -3);
        this.putModifikator(helden.framework.oooo.b_0.\u00d3\u00f4\u00d2000, 5);
        this.putModifikator(helden.framework.oooo.b_0.thispublicsuper, 10);
        this.putModifikator(helden.framework.oooo.b_0.\u00d8\u00f5\u00d2000, -2);
    }

    private ArrayList<KonkreterZauber> \u00d5\u00d2O000() {
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        arrayList.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.privateintnew, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.o0\u00d4000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d8\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.O\u00f6\u00d4000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00f4\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.O\u00d5\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d2000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d6\u00d3000, K.\u00d3\u00d20000, ""));
        return arrayList;
    }

    private ArrayList<KonkreterZauber> \u00d6\u00d2O000() {
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d6\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d4000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d3000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d4\u00d4000, K.\u00d3\u00d20000, ""));
        return arrayList;
    }

    private ArrayList<KonkreterZauber> \u00d4\u00d2O000() {
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        arrayList.add(KonkreterZauber.getZauber(Zauber.nullpublicnew, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f80\u00d5000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f40\u00d4000, K.\u00d3\u00d20000, ""));
        arrayList.add(KonkreterZauber.getZauber(Zauber.O\u00f6\u00d3000, K.\u00d3\u00d20000, ""));
        return arrayList;
    }

    private KonkreterZauber o00000(Zauber zauber) {
        return KonkreterZauber.getZauber(zauber, K.\u00d3\u00d20000, "");
    }
}

