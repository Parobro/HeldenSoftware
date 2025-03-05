/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o00o_0;
import helden.framework.zauber.Zauber;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.AndergastNostria;
import helden.model.DDZKulturen.Fjarninger;
import helden.model.DDZKulturen.Hjaldinger;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Serrach;
import helden.model.DDZKulturen.Steppenelfensippe;
import helden.model.kultur.Almada;
import helden.model.kultur.Aranien;
import helden.model.kultur.AuelfenSippe;
import helden.model.kultur.Bornland;
import helden.model.kultur.ElfischeSiedlung;
import helden.model.kultur.FirnelfenSippe;
import helden.model.kultur.Garetien;
import helden.model.kultur.Gjalskerlaender;
import helden.model.kultur.Horasreich;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Nivesenstaemme;
import helden.model.kultur.Norbardensippe;
import helden.model.kultur.Svellttal;
import helden.model.kultur.Thorwal;
import helden.model.kultur.WaldelfenSippe;
import java.util.ArrayList;
import java.util.Iterator;

public class Halbelf
extends o0oo_0
implements for {
    public static final P \u00d4OoO00 = new P("Halbelf", "Halbelfe", 0, false);
    public static final P oOoO00 = new P("Halbelf firnelfischer Abstammung", "Halbelfe firnelfischer Abstammung", 2, true);
    public static final P \u00f40oO00 = new P("Halbelf nivesischer Abstammung", "Halbelfe nivesischer Abstammung", 5, false);
    public static final P whileStringvoid = new P("Halbelf thorwalscher Abstammung", "Halbelfe thorwalscher Abstammung", 1, false);
    public static final P \u00d3OoO00 = new P("in menschlicher Kultur aufgewachsen", 0, false);
    public static final P ifStringvoid = new P("in elfischer Kultur aufgewachsen", 7, false);
    private static final int \u00f50oO00 = 158;
    private static final int \u00f80oO00 = 120;
    private public OOoO00;

    public Halbelf() {
    }

    public Halbelf(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.OOoO00 = public_;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        if (this.istVariante(oOoO00)) {
            this.addTalentwert(voidsuper.StringvoidObject, 1);
        }
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.newnewObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, -1);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(\u00d3OoO00);
        arrayList.add(ifStringvoid);
        return arrayList;
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(10);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("schwarz", 3, 20));
        arrayList.add(new oooo_1("grau", 3, 20));
        arrayList.add(new oooo_1("blau", 4, 20));
        arrayList.add(new oooo_1("gr\u00fcn", 4, 20));
        arrayList.add(new oooo_1("dunkelbraun", 2, 20));
        arrayList.add(new oooo_1("hellbraun", 2, 20));
        arrayList.add(new oooo_1("bernsteinfarben", 1, 20));
        arrayList.add(new oooo_1("goldgesprenkelt", 1, 20));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        if (this.istVariante(oOoO00)) {
            arrayList.add(I.\u00d5\u00d40000);
        }
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f50O000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.forpublic);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.ifif);
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.Stringdo);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.nullpublic);
        arrayList.add(I.\u00f8\u00d40000);
        arrayList.add(I.O\u00f5O000);
        return arrayList;
    }

    @Override
    public int getGewicht() {
        return this.getGroesse() - 120;
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        ArrayList<oooo_1> arrayList = new ArrayList<oooo_1>();
        arrayList.add(new oooo_1("rot", 3, 20));
        arrayList.add(new oooo_1("braun", 3, 20));
        arrayList.add(new oooo_1("dunkelblond", 4, 20));
        arrayList.add(new oooo_1("hellblond", 5, 20));
        arrayList.add(new oooo_1("wei\u00dfblond", 2, 20));
        arrayList.add(new oooo_1("schwarz", 2, 20));
        arrayList.add(new oooo_1("blauschwarz", 1, 20));
        return arrayList;
    }

    @Override
    public String getID() {
        return "R05";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        if (this.getGewaehlteVarianten().contains(ifStringvoid)) {
            arrayList.add(new ElfischeSiedlung(this.getGeschlecht()));
            if (this.getSetting().toString().equals("Die Dunklen Zeiten")) {
                arrayList.add(new Steppenelfensippe(this.getGeschlecht()));
                arrayList.add(new AuelfenSippe(this.getGeschlecht()));
                arrayList.add(new WaldelfenSippe(this.getGeschlecht()));
                arrayList.add(new FirnelfenSippe(this.getGeschlecht()));
            }
        } else {
            arrayList.add(new Mittelreich(this.getGeschlecht()));
            arrayList.add(new Garetien(this.getGeschlecht()));
            arrayList.add(new helden.model.kultur.AndergastNostria(this.getGeschlecht()));
            arrayList.add(new Svellttal(this.getGeschlecht()));
            arrayList.add(new Almada(this.getGeschlecht()));
            arrayList.add(new Nivesenstaemme(this.getGeschlecht()));
            arrayList.add(new Norbardensippe(this.getGeschlecht()));
        }
        if (!bl) {
            if (this.getGewaehlteVarianten().contains(ifStringvoid)) {
                if (!this.getSetting().toString().equals("Die Dunklen Zeiten")) {
                    arrayList.add(new AuelfenSippe(this.getGeschlecht()));
                    arrayList.add(new WaldelfenSippe(this.getGeschlecht()));
                    arrayList.add(new FirnelfenSippe(this.getGeschlecht()));
                }
            } else {
                arrayList.add(new Aranien(this.getGeschlecht()));
                arrayList.add(new Thorwal(this.getGeschlecht()));
                arrayList.add(new Bornland(this.getGeschlecht()));
                arrayList.add(new helden.model.kultur.Fjarninger(this.getGeschlecht()));
                arrayList.add(new Gjalskerlaender(this.getGeschlecht()));
                arrayList.add(new Horasreich(this.getGeschlecht()));
                arrayList.add(new Nordprovinzen(this.getGeschlecht()));
                arrayList.add(new AndergastNostria(this.getGeschlecht()));
                arrayList.add(new Alhanien(this.getGeschlecht()));
                arrayList.add(new Serrach(this.getGeschlecht()));
                arrayList.add(new Fjarninger(this.getGeschlecht()));
                arrayList.add(new helden.model.DDZKulturen.Gjalskerlaender(this.getGeschlecht()));
                arrayList.add(new Hjaldinger(this.getGeschlecht()));
                arrayList.add(new helden.model.DDZKulturen.Nivesenstaemme(this.getGeschlecht()));
            }
        }
        return arrayList;
    }

    @Override
    public int getMaxGewicht() {
        return this.getMinGewicht() + 44;
    }

    @Override
    public int getMaxGroesse() {
        return this.getMinGroesse() + 44;
    }

    @Override
    public int getMinGewicht() {
        return this.getMinGroesse() - 120;
    }

    @Override
    public int getMinGroesse() {
        return 158;
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        ArrayList<public> arrayList = new ArrayList<public>();
        arrayList.add(K.o00000(I.\u00f4\u00f80000));
        arrayList.add(K.o00000(I.nullpublic));
        return new o00o_0(this, arrayList, 1);
    }

    @Override
    public ArrayList<Zauber> getUebernatuerlicheBegabungMoeglichkeiten(ArrayList<Zauber> arrayList) {
        arrayList.add(Zauber.\u00f4\u00f8\u00d2000);
        arrayList.add(Zauber.\u00d3\u00f6\u00d4000);
        arrayList.add(Zauber.\u00d5\u00d2\u00d3000);
        arrayList.add(Zauber.\u00f4O\u00d5000);
        arrayList.add(Zauber.nullsupernew);
        arrayList.add(Zauber.\u00f5\u00d6\u00d3000);
        arrayList.add(Zauber.\u00d30\u00d4000);
        arrayList.add(Zauber.thisObjectnew);
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.OO0000);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.newif);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.O\u00d20000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00f4\u00d40000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (this.istVariante(\u00d3OoO00)) {
            oo0O.\u00d300000(K.o00000(I.\u00d5\u00d3O000));
        } else {
            oo0O.\u00d300000(K.o00000(I.forsupersuper));
            oo0O.\u00d300000(K.o00000(I.nullpublic));
        }
        if (!this.istVariante(oOoO00)) {
            oo0O.\u00d300000(K.o00000(I.\u00d8\u00d3o000));
        }
        if (this.istVariante(oOoO00)) {
            oo0O.\u00d300000(K.o00000(I.o\u00d3O000));
        }
        if (this.istVariante(\u00f40oO00)) {
            oo0O.\u00d300000(this.OOoO00);
            M m = (M)K.o00000(I.fordo);
            m.\u00d2o0000();
            m.o00000(voidsuper.\u00d40\u00d6000);
            oo0O.\u00d300000(m);
        }
        return oo0O;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        arrayList.add(this.getAlleZusatzVarianten());
        return arrayList;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.istVariante(\u00f40oO00) && this.OOoO00 == null;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istVeteranErlaubt() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Halbelf");
        } else {
            stringBuffer.append("Halbelfe");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next().getBezeichner(this.getGeschlecht()));
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public int wurfeleAlter() {
        return 15 + Wuerfel.w(3);
    }

    @Override
    protected int erwuerfleGroesse() {
        return 158 + Wuerfel.w20() + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6() + Wuerfel.w6();
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d4OoO00);
        this.addAlleVarianten(oOoO00);
        this.addAlleVarianten(\u00f40oO00);
        this.addAlleVarianten(whileStringvoid);
    }

    @Override
    protected void setzeModifikationen() {
        if (!this.istVariante(whileStringvoid)) {
            this.putModifikator(b_0.\u00f4\u00f4\u00d2000, 1);
            this.putModifikator(b_0.privatedosuper, -1);
        }
        if (this.istVariante(oOoO00)) {
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
            this.putModifikator(b_0.thispublicsuper, 2);
        }
        if (this.istVariante(\u00f40oO00)) {
            this.putModifikator(b_0.\u00f8\u00f4\u00d2000, 1);
            this.putModifikator(b_0.thispublicsuper, 1);
        }
        if (this.istVariante(whileStringvoid)) {
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        }
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 8);
        this.putModifikator(b_0.thispublicsuper, 10);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -4);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d4OoO00);
        this.addMoeglicheVariante(oOoO00);
        this.addMoeglicheVariante(\u00f40oO00);
        this.addMoeglicheVariante(whileStringvoid);
    }
}

