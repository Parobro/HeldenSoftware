/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.int.Q;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;

public abstract class StandardMagierVariante
extends N
implements helden.framework.oOoO.A.Object,
Q {
    protected String oO\u00d2O00 = "keine";

    public StandardMagierVariante(String string, int n) {
        super(string, n);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("verzierter Magierstab");
        arrayList.add("Magisches Buch (100-150D)");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f8oO000);
        arrayList.add(I.o\u00d60000);
        arrayList.add(I.\u00f5\u00f50000);
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.whilenull);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00f400000);
        arrayList.add(I.privateObject);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.privatedo);
        arrayList.add(I.\u00d8oo000);
        arrayList.add(I.\u00f8\u00d5O000);
        arrayList.add(I.o\u00f8o000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d4\u00d8o000);
        arrayList.add(I.\u00d3\u00f4O000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public String getGildenzugehoerigkeit() {
        return this.oO\u00d2O00;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(helden.framework.d.oooo_0.o00000(while.StringwhileString.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d5\u00d2000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.oo\u00f6000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d6\u00f6o000.toString()));
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.O\u00f8o000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.O\u00f6O000);
        arrayList.add(I.\u00d3\u00f50000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.\u00f4oO000);
        arrayList.add(I.whilefor);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.O\u00d3O000);
        arrayList.add(I.o\u00d3o000);
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        return new ArrayList<oooo_0>();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d50\u00d2000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d50o000);
        j2.oO0000(7);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00f8O0000, this.getSetting()));
        return waehlbareZauber;
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        throw new RuntimeException("Nicht implementiert");
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
        this.getProfession().getGewaehlteSonderfertigkeiten().o00000(p2);
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, helden.framework.held.K k2, boolean bl) {
        if (oo0o_02 instanceof voidsuper) {
            k2.\u00f8O0000().\u00d300000((voidsuper)oo0o_02, n);
        } else {
            k2.\u00d5o0000().super((KonkreterZauber)oo0o_02, (Integer)n);
        }
        this.setTalentauswahl(oo0o_02, n);
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        this.getProfession().waehleVerbilligteSonderfertigkeit(for_);
    }
}

