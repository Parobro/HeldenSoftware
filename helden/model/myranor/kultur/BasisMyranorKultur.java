/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Settings;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatAlantinosVariante;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatAphirdanosVariante;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatBasisVariante;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatEnnanduVariante;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatEupherbanVariante;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatIllacrionVariante;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatKouramnionVariante;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatPartholonVariante;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatPhraisopos;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatQuoran;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatRhidamanVariante;
import helden.model.profession.KeineWahl;
import java.util.ArrayList;
import java.util.Map;

public abstract class BasisMyranorKultur
extends OooO {
    ArrayList<helden.framework.int.P> \u00d8o0O00;
    private G returnreturnreturn = null;
    private G \u00d5o0O00 = null;
    private P \u00f4o0O00;
    protected ArrayList<o0oo_2> \u00f5o0O00;
    private int ifreturnreturn = 0;

    public BasisMyranorKultur() {
    }

    public void setAuswahlen() {
        this.\u00f5o0O00 = new ArrayList();
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        if (this.ifreturnreturn >= this.\u00f5o0O00.size()) {
            throw new c_1();
        }
        return this.\u00f5o0O00.get(this.ifreturnreturn++);
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.\u00f5o0O00 == null) {
            this.setAuswahlen();
            for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
                OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
                this.\u00f5o0O00.addAll(optimatBasisVariante.getAuswahlen(this));
            }
        }
        return this.ifreturnreturn < this.\u00f5o0O00.size();
    }

    public BasisMyranorKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    private void O\u00d2O000() {
        if (this.\u00d8o0O00 == null) {
            this.\u00d8o0O00 = new ArrayList();
            this.\u00d8o0O00.add(new KeineWahl());
            this.\u00d8o0O00.add(new OptimatAlantinosVariante());
            this.\u00d8o0O00.add(new OptimatAphirdanosVariante());
            this.\u00d8o0O00.add(new OptimatEnnanduVariante());
            this.\u00d8o0O00.add(new OptimatEupherbanVariante());
            this.\u00d8o0O00.add(new OptimatIllacrionVariante());
            this.\u00d8o0O00.add(new OptimatKouramnionVariante());
            this.\u00d8o0O00.add(new OptimatPartholonVariante());
            this.\u00d8o0O00.add(new OptimatPhraisopos());
            this.\u00d8o0O00.add(new OptimatQuoran());
            this.\u00d8o0O00.add(new OptimatRhidamanVariante());
        }
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        if (this.returnreturnreturn == null) {
            this.returnreturnreturn = g2;
            ArrayList<G> arrayList = g2.voidreturn();
            if (arrayList.size() == 1) {
                this.\u00d5o0O00 = arrayList.get(0);
            }
        } else if (this.returnreturnreturn.voidreturn().size() > 1 && this.\u00d5o0O00 == null) {
            this.\u00d5o0O00 = g2;
        } else {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(g2);
            this.setZweitLehrsprache(arrayList);
        }
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
            OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
            if (!optimatBasisVariante.wirdMutterspracheZurZeitsprache()) continue;
            return true;
        }
        return false;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
            OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
            k_0<oo0o_0> k_02 = optimatBasisVariante.getTalentwerte(null, null, n);
            for (Map.Entry<oo0o_0, Integer> entry : k_02.o00000().entrySet()) {
                this.addTalentwert(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
            OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
            arrayList.addAll(optimatBasisVariante.getEmpfohleneVorteile());
        }
        return arrayList;
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return null;
    }

    @Override
    public G getMuttersprache() {
        if (this.returnreturnreturn == null) {
            for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
                OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
                if (optimatBasisVariante.getMuttersprache() == null) continue;
                this.returnreturnreturn = optimatBasisVariante.getMuttersprache();
                ArrayList<G> arrayList = this.returnreturnreturn.voidreturn();
                if (arrayList.size() != 1) break;
                this.\u00d5o0O00 = arrayList.get(0);
                break;
            }
        }
        return this.returnreturnreturn;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<P> arrayList = new ArrayList<P>();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        for (Q q : u2.o00000(this.getSetting())) {
            U u3 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
            u3.\u00d3\u00d40000();
            u3.\u00d500000(((o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)q.\u00d8\u00d30000()).toString());
            arrayList.add(u3);
        }
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.getMuttersprache() == null || this.returnreturnreturn.voidreturn().size() > 1 && this.\u00d5o0O00 == null || this.istZweitLehrspracheGewaehlt() && this.getZweitLehrsprache().size() == 0;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (this.getMuttersprache() == null) {
            arrayList.addAll(Settings.getSettingByName("Myranor").get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
            return new oo0o_2(this, arrayList, 1, "Muttersprache");
        }
        if (this.returnreturnreturn.voidreturn().size() > 1 && this.\u00d5o0O00 == null) {
            arrayList.addAll(this.returnreturnreturn.voidreturn());
            return new oo0o_2(this, arrayList, 1, "Schrift der Muttersprache");
        }
        arrayList.addAll(Settings.getSettingByName("Myranor").get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        return new oo0o_2(this, arrayList, 1, "Zweitsprache");
    }

    @Override
    public G getSchrift() {
        return this.\u00d5o0O00;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
            OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
            oOOo.o00000(optimatBasisVariante.getSonderfertigkeiten());
        }
        if (this.\u00f4o0O00 != null) {
            oOOo.o00000(this.\u00f4o0O00);
        }
        return oOOo;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.\u00f4o0O00 == null;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return true;
    }

    @Override
    public boolean istMutterspracheGewaehlt() {
        return true;
    }

    @Override
    public void setzeMuttersprache(G g2) {
        this.returnreturnreturn = g2;
    }

    @Override
    public void setzeMuttersSchriftSrache(G g2) {
        this.\u00d5o0O00 = g2;
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.\u00f4o0O00 = p2;
    }

    @Override
    public ArrayList<helden.framework.int.P> getAlleZusatzVarianten() {
        this.O\u00d2O000();
        return this.\u00d8o0O00;
    }

    @Override
    public ArrayList<ArrayList<helden.framework.int.P>> getZusatzVarianten(helden.framework.int.P p2) {
        ArrayList<ArrayList<helden.framework.int.P>> arrayList = new ArrayList<ArrayList<helden.framework.int.P>>();
        if (this.hatOptimatischeVariante()) {
            ArrayList<helden.framework.int.P> arrayList2 = new ArrayList<helden.framework.int.P>();
            arrayList2.addAll(this.getAlleZusatzVarianten());
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public abstract boolean hatOptimatischeVariante();

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
            OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
            oo0O.new(optimatBasisVariante.getVorteile());
        }
        return oo0O;
    }

    @Override
    public abstract String getID();

    @Override
    public abstract ArrayList<super> getProfessionen(floatsuper var1);

    @Override
    protected abstract int getBasisGPKosten();

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
            OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
            arrayList.addAll(optimatBasisVariante.getUngeeigneteVorteile());
        }
        return arrayList;
    }

    public boolean isOptimatSelected() {
        return this.getGewaehlteVarianten().size() > 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
            OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
            stringBuilder.append(" ,").append(optimatBasisVariante.toString());
        }
        return stringBuilder.toString();
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
            OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
            arrayList.addAll(optimatBasisVariante.getVerbilligteSonderfertigkeiten());
        }
        return arrayList;
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = super.getZweitLehrsprache();
        if (arrayList.size() == 0) {
            for (helden.framework.int.P p2 : this.getGewaehlteVarianten()) {
                OptimatBasisVariante optimatBasisVariante = (OptimatBasisVariante)p2;
                if (optimatBasisVariante.getZweitLehrsprache() == null) continue;
                arrayList.addAll(optimatBasisVariante.getZweitLehrsprache());
            }
        }
        return arrayList;
    }
}

