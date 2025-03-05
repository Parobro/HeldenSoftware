/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.K;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.super;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class SeefahrerAlt
extends super
implements for {
    private P \u00d3\u00f40O00;
    private helden.framework.int.P whileifreturn;
    private helden.framework.int.P \u00f4\u00d80O00;
    private helden.framework.int.P ififreturn;
    private helden.framework.int.P \u00f8\u00d80O00;
    private helden.framework.int.P \u00f5\u00d80O00;
    private int o\u00f40O00 = 0;
    private J O\u00f40O00 = null;

    public SeefahrerAlt() {
    }

    public SeefahrerAlt(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.O\u00f40O00 = (J)public_;
        this.O\u00f40O00.oO0000(5);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(voidsuper.ifforObject, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 4);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 3);
        this.setTalentwert(voidsuper.returnprivateObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 2);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 2);
        this.setTalentwert(voidsuper.StringvoidObject, 3);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 3);
        this.setTalentwert(voidsuper.nullObjectObject, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.thisclassObject, 4);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 4);
        if (this.istVariante(this.getMatrose())) {
            this.addTalentwert(E.\u00f5\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 2);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 3);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 2);
            this.addTalentwert(voidsuper.thisclassObject, 1);
        }
        if (this.istVariante(this.getPirat())) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 2);
            this.addTalentwert(E.\u00f4\u00d4\u00d8000, 2);
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(voidsuper.o\u00d2\u00d8000, 2);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d6000, 1);
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, -1);
            this.addTalentwert(voidsuper.nullvoidObject, 2);
            this.addTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        }
        if (this.istVariante(this.getWalfaenger())) {
            this.addTalentwert(E.o\u00d6\u00d8000, 3);
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, 3);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, -1);
            this.addTalentwert(voidsuper.returnprivateObject, 2);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
            this.addTalentwert(voidsuper.thisclassObject, 3);
        }
        if (this.istVariante(this.getRobbenjaeger())) {
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, 3);
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, -2);
            this.addTalentwert(voidsuper.returnforObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, -1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, -2);
        }
        if (this.istVariante(this.getNavigator())) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, -1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 4);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 3);
            this.addTalentwert(voidsuper.StringclassObject, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 2);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 2);
            this.addTalentwert(voidsuper.\u00f4\u00f6\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 4);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 4);
            this.addTalentwert(this.getMuttersprachenSchrift(), 6);
            this.addTalentwert(voidsuper.thisclassObject, -2);
            this.addTalentwert(voidsuper.ifnullObject, 4);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 4);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 3);
        }
    }

    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Kiste mit optischen Utensilien");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.o\u00f5O000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "P60";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public helden.framework.int.P getMatrose() {
        if (this.whileifreturn == null) {
            this.whileifreturn = new helden.framework.int.P("Matrose", 0, false);
        }
        return this.whileifreturn;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper) && this.istVariante(this.getNavigator())) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000) && this.istVariante(this.getNavigator())) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000) && this.istVariante(this.getNavigator())) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            if (this.istVariante(this.getNavigator())) {
                return 6;
            }
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public helden.framework.int.P getNavigator() {
        if (this.\u00f5\u00d80O00 == null) {
            this.\u00f5\u00d80O00 = new helden.framework.int.P("Navigator", 6, false);
        }
        return this.\u00f5\u00d80O00;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        return new objectsuper_0(this, oooo_0.o00000(voidsuper.\u00d8\u00d8\u00d5000), 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.o\u00f40O00) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                ++this.o\u00f40O00;
                int[] nArray = new int[]{2};
                if (this.istVariante(this.getRobbenjaeger())) {
                    nArray[0] = nArray[0] + 2;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getMuttersprache());
                ++this.o\u00f40O00;
                int[] nArray = new int[]{4};
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                if (this.istVariante(this.getNavigator())) {
                    arrayList.add(voidsuper.o\u00f6\u00d5000);
                    arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                    arrayList.add(voidsuper.privatedoObject);
                    arrayList.add(voidsuper.oo\u00d8000);
                } else {
                    arrayList.add(voidsuper.o\u00f6\u00d6000);
                    arrayList.add(voidsuper.\u00f4\u00f6\u00d5000);
                    arrayList.add(voidsuper.returnifObject);
                    arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                    arrayList.add(voidsuper.\u00d3\u00d6\u00d5000);
                    arrayList.add(voidsuper.oo\u00d8000);
                }
                ++this.o\u00f40O00;
                int[] nArray = new int[]{2};
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                int[] nArray = null;
                if (this.istVariante(this.getPirat())) {
                    arrayList.add(E.\u00d3\u00d5\u00d8000);
                    arrayList.add(E.\u00f5\u00d5\u00d8000);
                    arrayList.add(E.\u00d5\u00d6\u00d8000);
                    arrayList.add(E.\u00d5\u00d4\u00d8000);
                    nArray = new int[]{3, 2};
                }
                if (this.istVariante(this.getWalfaenger())) {
                    arrayList.add(E.\u00f4\u00d3\u00d8000);
                    arrayList.add(voidsuper.oO\u00d6000);
                    arrayList.add(voidsuper.Oo\u00d6000);
                    nArray = new int[]{1};
                }
                if (this.istVariante(this.getRobbenjaeger())) {
                    arrayList.add(voidsuper.oO\u00d6000);
                    arrayList.add(voidsuper.Oo\u00d6000);
                    nArray = new int[]{4, 2};
                }
                ++this.o\u00f40O00;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        if (this.O\u00f40O00 == null) {
            ArrayList<public> arrayList = new ArrayList<public>();
            arrayList.add(helden.framework.C.K.o00000(I.\u00d3O0000));
            arrayList.add(helden.framework.C.K.o00000(I.privateclass));
            if (this.istVariante(this.getNavigator())) {
                arrayList.add(helden.framework.C.K.o00000(I.thisdo));
                arrayList.add(helden.framework.C.K.o00000(I.\u00d50o000));
            }
            return new o00o_0(this, arrayList, 1);
        }
        throw new c_1();
    }

    public helden.framework.int.P getPirat() {
        if (this.\u00f4\u00d80O00 == null) {
            this.\u00f4\u00d80O00 = new helden.framework.int.P("Pirat", 2, false);
        }
        return this.\u00f4\u00d80O00;
    }

    public helden.framework.int.P getRobbenjaeger() {
        if (this.\u00f8\u00d80O00 == null) {
            this.\u00f8\u00d80O00 = new helden.framework.int.P("Robbenj\u00e4ger", 0, false);
        }
        return this.\u00f8\u00d80O00;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(oooo_0.o00000(while.ifinterfaceObject.toString()));
        oOOo.o00000(oooo_0.o00000(while.\u00d8\u00d8\u00d2000.toString()));
        if (this.istVariante(this.getRobbenjaeger())) {
            oOOo.o00000(oooo_0.o00000(while.o\u00f8\u00f5000.toString()));
        }
        if (this.istVariante(this.getNavigator())) {
            oOOo.o00000(K.o00000(voidsuper.\u00d8\u00d8\u00d5000, "Steuermann"));
        }
        if (this.istVariante(this.getMatrose())) {
            oOOo.o00000(oooo_0.o00000(while.\u00d30\u00d2000, "Hafen/K\u00fcste"));
        }
        if (this.\u00d3\u00f40O00 != null) {
            oOOo.o00000(this.\u00d3\u00f40O00);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.OOO000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    public ArrayList<helden.framework.D.for> getVerbilligteSonderfertigkeiten() {
        ArrayList<helden.framework.D.for> arrayList = new ArrayList<helden.framework.D.for>();
        arrayList.add(new helden.framework.D.for(while.\u00d60\u00d5000));
        if (this.istVariante(this.getWalfaenger())) {
            arrayList.add(new helden.framework.D.for(while.thisforObject));
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(this.O\u00f40O00);
        return oo0O;
    }

    public helden.framework.int.P getWalfaenger() {
        if (this.ififreturn == null) {
            this.ififreturn = new helden.framework.int.P("Walf\u00e4nger/Haij\u00e4ger", 0, false);
        }
        return this.ififreturn;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.istVariante(this.getMatrose()) && this.\u00d3\u00f40O00 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(this.getPirat()) || this.istVariante(this.getWalfaenger()) || this.istVariante(this.getRobbenjaeger())) {
            return this.o\u00f40O00 < 4;
        }
        return this.o\u00f40O00 < 3;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.O\u00f40O00 == null;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            if (this.istVariante(this.getMatrose())) {
                return "Seefahrer/Matrose";
            }
            if (this.istVariante(this.getPirat())) {
                return "Seefahrer/Pirat";
            }
            if (this.istVariante(this.getWalfaenger())) {
                return "Seefahrer/Walf\u00e4nger/Haij\u00e4ger";
            }
            if (this.istVariante(this.getRobbenjaeger())) {
                return "Seefahrer/Robbenj\u00e4ger";
            }
            return "Seefahrer";
        }
        if (this.istVariante(this.getMatrose())) {
            return "Seefahrerin/Matrosin";
        }
        if (this.istVariante(this.getPirat())) {
            return "Seefahrerin/Piratin";
        }
        if (this.istVariante(this.getWalfaenger())) {
            return "Seefahrerin/Walf\u00e4ngerin/Haij\u00e4gerin";
        }
        if (this.istVariante(this.getRobbenjaeger())) {
            return "Seefahrerin/Robbenj\u00e4gerin";
        }
        return "Seefahrerin";
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.\u00d3\u00f40O00 = p2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getMatrose());
        this.addAlleVarianten(this.getPirat());
        this.addAlleVarianten(this.getWalfaenger());
        this.addAlleVarianten(this.getRobbenjaeger());
        this.addAlleVarianten(this.getNavigator());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMatrose());
        this.addMoeglicheVariante(this.getPirat());
        this.addMoeglicheVariante(this.getWalfaenger());
        this.addMoeglicheVariante(this.getRobbenjaeger());
        this.addMoeglicheVariante(this.getNavigator());
    }
}

