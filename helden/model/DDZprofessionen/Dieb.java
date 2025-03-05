/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.held.Object.private;
import helden.framework.int.super;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;

public class Dieb
extends super
implements helden.framework.oOoO.A.Object {
    public Dieb() {
    }

    public Dieb(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 3);
        this.setTalentwert(E.newnewString, 3);
        this.setTalentwert(E.\u00d5\u00d6\u00d8000, 2);
        this.setTalentwert(voidsuper.ifforObject, 3);
        this.setTalentwert(voidsuper.OO\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 3);
        this.setTalentwert(voidsuper.returnforObject, 3);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.thisvoidObject, 4);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 4);
        this.setTalentwert(voidsuper.whilenewObject, 7);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, 6);
        this.setTalentwert(voidsuper.thisinterfaceObject, 4);
        this.setTalentwert(voidsuper.forclassObject, 3);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 4);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
        this.setTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.O\u00d3\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.O\u00d8\u00d5000, 2);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d4OO000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "P123";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f4\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(helden.framework.d.oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        oOOo.o00000(helden.framework.d.oooo_0.o00000(while.\u00f6\u00f5o000.toString()));
        oOOo.o00000(helden.framework.d.oooo_0.o00000(while.\u00d30\u00d2000, "Stadtteil/Kleinstadt"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.privateinterface);
        arrayList.add(I.nullclass);
        arrayList.add(I.Ooo000);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.Stringintsuper);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.\u00f4\u00f4o000);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0();
        b_0 b_02 = new b_0();
        b_02.o00000(new interface(G.o\u00f8\u00f5000, 5));
        b_02.o00000(new interface(voidsuper.\u00f8\u00f4\u00d5000, 1));
        oooo_02.o00000(b_02);
        b_02 = new b_0();
        b_02.o00000(new interface(E.nullsuperString, 1));
        b_02.o00000(new interface(E.\u00d5\u00d6\u00d8000, 1));
        b_02.o00000(new interface(voidsuper.returnifObject, 1));
        oooo_02.o00000(b_02);
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.privateclass);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        private.o00000("gewaehlterHauszauber nicht implementiert f\u00fcr " + this.toString());
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, K k2, boolean bl) {
        k2.\u00f8O0000().\u00d300000((voidsuper)oo0o_02, n);
        this.setTalentauswahl(oo0o_02, n);
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Dieb";
        }
        return "Diebin";
    }

    @Override
    protected int getBasisGPKosten() {
        return 4;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(helden.framework.oooo.b_0.\u00f4\u00d8\u00d2000, 1);
    }
}

