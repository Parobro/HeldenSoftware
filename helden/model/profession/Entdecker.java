/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.framework.oooo.a_1;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class Entdecker
extends super {
    private helden.framework.int.P \u00f8\u00f5\u00f4O00;
    private int O\u00f6\u00f4O00 = 0;

    public Entdecker() {
    }

    public Entdecker(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        if (this.istVariante(this.getKartograph())) {
            this.setTalentwert(E.\u00d4\u00d6\u00d8000, 2);
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 3);
            this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
            this.setTalentwert(voidsuper.\u00d5O\u00d6000, 2);
            this.setTalentwert(voidsuper.returnprivateObject, 2);
            this.setTalentwert(voidsuper.o\u00d3\u00d6000, 4);
            this.setTalentwert(voidsuper.O0\u00d6000, 1);
            this.setTalentwert(voidsuper.thisinterfaceObject, 1);
            this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
            this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.setTalentwert(voidsuper.StringvoidObject, 4);
            this.setTalentwert(voidsuper.\u00d40\u00d8000, 4);
            this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 3);
            this.setTalentwert(voidsuper.nullObjectObject, 4);
            this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00d50\u00d8000, 2);
            this.setTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
            this.setTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 7);
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
            this.setTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 4);
            this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
            this.setTalentwert(this.getMuttersprachenSchrift(), 6);
            this.setTalentwert(voidsuper.thisclassObject, 1);
            this.setTalentwert(voidsuper.\u00d5o\u00d8000, 1);
            this.setTalentwert(voidsuper.o\u00f6\u00d5000, 2);
            this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.setTalentwert(voidsuper.ifnullObject, 7);
            this.setTalentwert(voidsuper.o\u00f6\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
            this.setTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 5);
            this.setTalentwert(voidsuper.returnifObject, 1);
        } else {
            this.setTalentwert(E.\u00d4\u00d6\u00d8000, 1);
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
            this.setTalentwert(voidsuper.\u00d5O\u00d6000, 3);
            this.setTalentwert(voidsuper.returnprivateObject, 1);
            this.setTalentwert(voidsuper.o\u00d3\u00d6000, 4);
            this.setTalentwert(voidsuper.O0\u00d6000, 3);
            this.setTalentwert(voidsuper.thisinterfaceObject, 1);
            this.setTalentwert(voidsuper.\u00d30\u00d8000, 2);
            this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
            this.setTalentwert(voidsuper.StringvoidObject, 3);
            this.setTalentwert(voidsuper.\u00d40\u00d8000, 2);
            this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.setTalentwert(voidsuper.thisclassObject, 1);
            this.setTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 4);
            this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 4);
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
            this.setTalentwert(voidsuper.O\u00f4\u00d5000, 3);
            this.setTalentwert(this.getMuttersprachenSchrift(), 6);
            this.addVerteilTalent(voidsuper.\u00d5\u00d3\u00d8000, 0);
            this.addVerteilTalent(voidsuper.\u00f5o\u00d6000, 0);
            this.addVerteilTalent(voidsuper.forObjectObject, 0);
            this.addVerteilTalent(voidsuper.o\u00f6\u00d5000, 0);
            this.addVerteilTalent(voidsuper.nullObjectObject, 2);
            this.addVerteilTalent(voidsuper.\u00d5\u00d4\u00d6000, 4);
            this.addVerteilTalent(voidsuper.\u00d50\u00d8000, 0);
            this.addVerteilTalent(voidsuper.oo\u00d6000, 3);
            this.addVerteilTalent(voidsuper.o\u00f4\u00d6000, 1);
            this.addVerteilTalent(voidsuper.ifnullObject, 5);
            this.addVerteilTalent(voidsuper.\u00f5\u00f5\u00d5000, 3);
            this.addVerteilTalent(voidsuper.\u00f4\u00f6\u00d5000, 1);
            this.addVerteilTalent(voidsuper.o\u00d5\u00d6000, 0);
            this.addVerteilTalent(voidsuper.\u00f4\u00d2\u00d6000, 1);
            this.addVerteilTalent(voidsuper.\u00d5\u00f5\u00d5000, 3);
            this.addVerteilTalent(voidsuper.\u00d3\u00d6\u00d5000, 2);
            this.addVerteilTalent(voidsuper.\u00d4\u00f6\u00d6000, 0);
        }
    }

    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.istVariante(this.getKartograph())) {
            arrayList.add("Fernglas, Landvermessungsger\u00e4te");
        } else {
            arrayList.add("Maultier");
            arrayList.add("Kleines Boot");
        }
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.o00000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "P19";
    }

    public helden.framework.int.P getKartograph() {
        if (this.\u00f8\u00f5\u00f4O00 == null) {
            this.\u00f8\u00f5\u00f4O00 = new helden.framework.int.P("Kartograph", -1, true);
        }
        return this.\u00f8\u00f5\u00f4O00;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            if (this.istVariante(this.getKartograph())) {
                return 11;
            }
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            if (this.istVariante(this.getKartograph())) {
                return 6;
            }
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.O\u00f6\u00f4O00) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                ++this.O\u00f6\u00f4O00;
                if (this.istVariante(this.getKartograph())) {
                    ++this.O\u00f6\u00f4O00;
                    ++this.O\u00f6\u00f4O00;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                this.addVerteilTalente(arrayList);
                int[] nArray = new int[]{5, 4, 2};
                ++this.O\u00f6\u00f4O00;
                return new a_1(this, arrayList, nArray, "Talentwerte werden ggf. im n\u00e4chsten Schritt umverteilt", this.getVerteilTalente());
            }
            case 2: {
                int[] nArray = this.getUmverteilen();
                if (nArray.length > 0) {
                    arrayList = this.getUmverteilenTalente();
                    return new a_1(this, arrayList, nArray, "Punkte, die aus dem Umverteilen entstanden sind", this.getVerteilTalente());
                }
                ++this.O\u00f6\u00f4O00;
            }
            case 3: {
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getMuttersprache());
                ++this.O\u00f6\u00f4O00;
                if (this.istVariante(this.getKartograph())) {
                    int[] nArray = new int[]{6, 3, 3};
                    return new o0oo_2(this, arrayList, nArray);
                }
                int[] nArray = new int[]{6, 6, 2, 2};
                return new o0oo_2(this, arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getMuttersprachenSchrift());
                ++this.O\u00f6\u00f4O00;
                if (this.istVariante(this.getKartograph())) {
                    int[] nArray = new int[]{3, 3};
                    return new o0oo_2(this, arrayList, nArray);
                }
                int[] nArray = new int[]{4, 4};
                return new o0oo_2(this, arrayList, nArray);
            }
            case 5: {
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.O\u00d8\u00d5000);
                int[] nArray = new int[]{1};
                ++this.O\u00f6\u00f4O00;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        switch (this.getGewaehlteVerbilligteSonderfertigkeiten().size()) {
            case 0: {
                if (this.istVariante(this.getKartograph())) {
                    ArrayList<for> arrayList = new ArrayList<for>();
                    ArrayList<P> arrayList2 = this.getSetting().getGelaendekunden();
                    for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
                        arrayList.add(new for(P.new(arrayList2.get(i2).toString())));
                    }
                    return new void(this, arrayList, 1);
                }
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.addAll(this.getSetting().getvSF(while.\u00d2o\u00f5000.toString()));
                return new void(this, arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.nullclass);
        arrayList.add(I.OOO000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (!this.istVariante(this.getKartograph())) {
            arrayList.add(new for(while.\u00f8\u00f6\u00d5000));
        }
        arrayList.addAll(this.getGewaehlteVerbilligteSonderfertigkeiten());
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d50o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        if (this.istVariante(this.getKartograph())) {
            oo0O.\u00d300000(K.o00000(I.ifprivate));
        }
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(this.getKartograph())) {
            return this.O\u00f6\u00f4O00 < 5;
        }
        return this.O\u00f6\u00f4O00 < 6;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.getGewaehlteVerbilligteSonderfertigkeiten().size() < this.getAnzahlVerbilligteSonderfertigkeitAuswahlen();
    }

    @Override
    public boolean istZeitaufwendig() {
        return this.istVariante(this.getKartograph());
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            if (this.istVariante(this.getKartograph())) {
                return "Entdecker/Kartograph";
            }
            return "Entdecker";
        }
        if (this.istVariante(this.getKartograph())) {
            return "Entdeckerin/Kartographin";
        }
        return "Entdeckerin";
    }

    @Override
    protected int getBasisGPKosten() {
        return 6;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getKartograph());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getKartograph());
    }
}

