/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.OOOo;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;

public class SchelmAlt
extends super {
    private P \u00d8\u00f5\u00f4O00;
    private P forinterfaceif;
    private P \u00f4\u00f5\u00f4O00;
    private P \u00f5\u00f5\u00f4O00;
    private P \u00d3\u00f5\u00f4O00;
    private P \u00d5\u00f5\u00f4O00;
    private P \u00d4\u00f5\u00f4O00;
    private int privateinterfaceif = 0;

    public SchelmAlt() {
    }

    public SchelmAlt(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.setTalentwert(G.privatesuperclass, n - 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 3);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00d5\u00d6\u00d8000, 2);
        this.setTalentwert(voidsuper.o\u00d2\u00d8000, 5);
        this.setTalentwert(voidsuper.OO\u00d6000, 5);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 4);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 4);
        this.setTalentwert(voidsuper.returnforObject, 3);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.thisvoidObject, 5);
        this.setTalentwert(voidsuper.newnewObject, 2);
        this.setTalentwert(voidsuper.returnwhileObject, 7);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 2);
        this.setTalentwert(voidsuper.forclassObject, 4);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 5);
        this.setTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.privateObjectObject, 3);
        this.setTalentwert(voidsuper.returnifObject, 1);
        this.setTalentwert(this.getZauber(Zauber.whilethisnew), 7);
        this.setTalentwert(this.getZauber(Zauber.\u00d4\u00f8\u00d2000), 6);
        this.setTalentwert(this.getZauber(Zauber.thisdonew), 7);
        this.setTalentwert(this.getZauber(Zauber.O\u00d3\u00d3000), 6);
        this.setTalentwert(this.getZauber(Zauber.\u00d40\u00d3000), 6);
        this.setTalentwert(this.getZauber(Zauber.\u00f5\u00f8\u00d2000), 5);
        this.setTalentwert(this.getZauber(Zauber.\u00d5\u00d6\u00d4000), 5);
        this.setTalentwert(this.getZauber(Zauber.\u00d4\u00d2\u00d4000), 5);
        this.setTalentwert(this.getZauber(Zauber.privateinterfacesuper), 3);
        if (this.istVariante(this.getSchoepfer())) {
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 4);
            this.addTalentwert(this.getZauber(Zauber.\u00d3\u00d8\u00d4000), 3);
            this.addTalentwert(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 2);
        }
        if (this.istVariante(this.getVisionaer())) {
            this.addTalentwert(voidsuper.thisinterfaceObject, 2);
            this.addTalentwert(voidsuper.thisintObject, 2);
            this.addTalentwert(voidsuper.StringObjectObject, 1);
            this.addTalentwert(this.getZauber(Zauber.\u00d30\u00d5000), 3);
            this.addTalentwert(this.getZauber(Zauber.\u00f4\u00d2\u00d5000), 3);
        }
        if (this.istVariante(this.getPossenreisser())) {
            this.addTalentwert(voidsuper.o\u00d2\u00d8000, 1);
            this.addTalentwert(voidsuper.OO\u00d6000, 1);
            this.addTalentwert(voidsuper.returnwhileObject, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.newprivateObject, 3);
            this.addTalentwert(this.getZauber(Zauber.\u00d8\u00d2\u00d4000), 2);
            this.addTalentwert(this.getZauber(Zauber.fordonew), 4);
        }
        if (this.istVariante(this.getVagabund())) {
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.nullObjectObject, 2);
            this.addTalentwert(this.getZauber(Zauber.O\u00f6\u00d4000), 3);
            this.addTalentwert(this.getZauber(Zauber.\u00d3O\u00d3000), 3);
            this.addTalentwert(this.getZauber(Zauber.\u00f50\u00d3000), 3);
        }
        if (this.istVariante(this.getHofnarr())) {
            this.addTalentwert(voidsuper.o\u00d2\u00d8000, 1);
            this.addTalentwert(voidsuper.OO\u00d6000, 2);
            this.addTalentwert(voidsuper.O0\u00d6000, 2);
            this.addTalentwert(voidsuper.thisinterfaceObject, 2);
            this.addTalentwert(voidsuper.forclassObject, 2);
            this.addTalentwert(this.getZauber(Zauber.\u00f5O\u00d3000), 2);
            this.addTalentwert(this.getZauber(Zauber.o\u00d2\u00d4000), 3);
            this.addTalentwert(this.getZauber(Zauber.\u00f4\u00d2\u00d5000), 3);
        }
        if (this.istVariante(this.getKlabauterlehrling())) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.returnprivateObject, 4);
            this.addTalentwert(voidsuper.thisvoidObject, 3);
            this.addTalentwert(voidsuper.newnewObject, 1);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 3);
            this.addTalentwert(voidsuper.thisclassObject, 2);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 2);
            this.addTalentwert(this.getZauber(Zauber.\u00d4\u00d6\u00d4000), 2);
            this.addTalentwert(this.getZauber(Zauber.\u00d3\u00d8\u00d4000), 2);
            this.addTalentwert(this.getZauber(Zauber.nullsupernew), 5);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.O\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d4\u00d60000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.forclasssuper);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.\u00f8\u00d5O000);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.\u00d8\u00f8O000);
        arrayList.add(I.whileStringsuper);
        arrayList.add(I.o\u00d3o000);
        return arrayList;
    }

    public P getHofnarr() {
        if (this.\u00d8\u00f5\u00f4O00 == null) {
            this.\u00d8\u00f5\u00f4O00 = new P("Hofnarr", 6, false);
        }
        return this.\u00d8\u00f5\u00f4O00;
    }

    @Override
    public String getID() {
        return "P54";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getKlabauterlehrling() {
        if (this.forinterfaceif == null) {
            this.forinterfaceif = new P("Klabauterlehrling", 8, false);
        }
        return this.forinterfaceif;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.privateinterfaceif) {
            case 0: {
                arrayList.add(this.getZauber(Zauber.returnprivatenew));
                arrayList.add(this.getZauber(Zauber.whileprivatesuper));
                arrayList.add(this.getZauber(Zauber.\u00d8\u00d2\u00d4000));
                int[] nArray = new int[]{6, 3};
                ++this.privateinterfaceif;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                if (this.istVariante(this.getSchoepfer())) {
                    arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                    ++this.privateinterfaceif;
                    int[] nArray = new int[]{3, 2};
                    return new o0oo_2(this, arrayList, nArray);
                }
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                ++this.privateinterfaceif;
                int[] nArray = new int[]{1, 1};
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    public P getPossenreisser() {
        if (this.\u00f4\u00f5\u00f4O00 == null) {
            this.\u00f4\u00f5\u00f4O00 = new P("Possenrei\u00dfer", 5, false);
        }
        return this.\u00f4\u00f5\u00f4O00;
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00d8o0000;
    }

    public P getSchelm() {
        if (this.\u00d4\u00f5\u00f4O00 == null) {
            this.\u00d4\u00f5\u00f4O00 = new P("Schelm", 0, false);
        }
        return this.\u00d4\u00f5\u00f4O00;
    }

    public P getSchoepfer() {
        if (this.\u00f5\u00f5\u00f4O00 == null) {
            this.\u00f5\u00f5\u00f4O00 = new P("Schoepfer", 5, false);
        }
        return this.\u00f5\u00f5\u00f4O00;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.\u00d5o\u00d3000.toString()));
        oOOo.o00000(K.o00000(voidsuper.returnwhileObject, "Bauchreden"));
        if (this.istVariante(this.getVagabund())) {
            oOOo.o00000(oooo_0.o00000(while.\u00f8\u00f6\u00d5000.toString()));
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.\u00f5\u00f50000);
        arrayList.add(I.thisdo);
        arrayList.add(I.newif);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.OO0000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    public P getVagabund() {
        if (this.\u00d3\u00f5\u00f4O00 == null) {
            this.\u00d3\u00f5\u00f4O00 = new P("Vagabund", 0, false);
        }
        return this.\u00d3\u00f5\u00f4O00;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d3\u00d5\u00d6000));
        arrayList.add(new for(while.\u00d8\u00d8\u00d3000));
        arrayList.add(new for(while.\u00d8\u00d20000));
        arrayList.add(new for(while.\u00f6\u00f8\u00f4000));
        arrayList.add(new for(while.\u00f6\u00f8\u00d8000));
        arrayList.add(new for(while.privatenullsuper));
        if (this.istVariante(this.\u00f5\u00f5\u00f4O00)) {
            arrayList.add(new for(while.\u00d2\u00d6\u00d2000));
        }
        return arrayList;
    }

    public P getVisionaer() {
        if (this.\u00d5\u00f5\u00f4O00 == null) {
            this.\u00d5\u00f5\u00f4O00 = new P("Visionaer", 4, false);
        }
        return this.\u00d5\u00f5\u00f4O00;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.O\u00f5o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00d8o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d8Oo000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d4Oo000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.privatedo, "nur aus Spa\u00df zaubern"));
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d50o000);
        j2.oO0000(10);
        oo0O.\u00d300000(j2);
        J j3 = (J)helden.framework.C.K.o00000(I.o\u00d5O000, "Obrigkeit und Autorit\u00e4ten");
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        j3 = (J)helden.framework.C.K.o00000(I.o\u00d5O000, "menschliches Humorverst\u00e4ndnis");
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        M m = (M)helden.framework.C.K.o00000(I.O\u00d4O000);
        m.\u00d2o0000();
        m.o00000(o00O.\u00d400000);
        oo0O.\u00d300000(m);
        if (this.istVariante(this.getVagabund())) {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f4\u00f5o000));
        }
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, helden.framework.OOoO.K.\u00d8o0000, this.getSetting()));
        if (this.istVariante(this.\u00f5\u00f5\u00f4O00)) {
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4O\u00d3000, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f4\u00d4000, helden.framework.OOoO.K.\u00d8o0000, ""));
        }
        if (this.istVariante(this.\u00d5\u00f5\u00f4O00)) {
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d2\u00d4000, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringclassnew, helden.framework.OOoO.K.\u00d8o0000, ""));
        }
        if (this.istVariante(this.\u00f4\u00f5\u00f4O00)) {
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d8\u00d4000, helden.framework.OOoO.K.\u00d8o0000, ""));
        }
        if (this.istVariante(this.\u00d3\u00f5\u00f4O00)) {
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d5\u00d4000, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5O\u00d5000, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d3000, helden.framework.OOoO.K.\u00d8o0000, ""));
        }
        if (this.istVariante(this.\u00d8\u00f5\u00f4O00)) {
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d5\u00d4000, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.fordonew, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d8\u00d4000, helden.framework.OOoO.K.\u00d8o0000, ""));
        }
        if (this.istVariante(this.forinterfaceif)) {
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d2\u00d5000, helden.framework.OOoO.K.\u00d8o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.thisintnew, helden.framework.OOoO.K.\u00d8o0000, ""));
        }
        return waehlbareZauber;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(this.getSchoepfer()) || this.istVariante(this.getVagabund())) {
            return this.privateinterfaceif < 2;
        }
        return this.privateinterfaceif < 1;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schelm");
        } else {
            stringBuffer.append("Schelmin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 12;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getSchelm());
        this.addAlleVarianten(this.getHofnarr());
        this.addAlleVarianten(this.getKlabauterlehrling());
        this.addAlleVarianten(this.getPossenreisser());
        this.addAlleVarianten(this.getSchoepfer());
        this.addAlleVarianten(this.getVagabund());
        this.addAlleVarianten(this.getVisionaer());
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.whilethisnew));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f8\u00d2000));
        arrayList.add(this.getZauber(Zauber.thisdonew));
        arrayList.add(this.getZauber(Zauber.O\u00d3\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d3000));
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 2);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSchelm());
        this.addMoeglicheVariante(this.getHofnarr());
        this.addMoeglicheVariante(this.getKlabauterlehrling());
        this.addMoeglicheVariante(this.getPossenreisser());
        this.addMoeglicheVariante(this.getSchoepfer());
        this.addMoeglicheVariante(this.getVagabund());
        this.addMoeglicheVariante(this.getVisionaer());
    }
}

