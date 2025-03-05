/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.zauber.KonkreterZauber;
import helden.model.myranor.profession.maggrundprof.ArkanerForscherH;
import helden.model.myranor.profession.maggrundprof.ArkanerForscherZ;
import helden.model.myranor.profession.maggrundprof.ArkanerHaendlerDiplomatH;
import helden.model.myranor.profession.maggrundprof.ArkanerHaendlerDiplomatZ;
import helden.model.myranor.profession.maggrundprof.ArkanerKuenstlerH;
import helden.model.myranor.profession.maggrundprof.ArkanerKuenstlerV;
import helden.model.myranor.profession.maggrundprof.ArkanerKuenstlerZ;
import helden.model.myranor.profession.maggrundprof.BewegungsmagierH;
import helden.model.myranor.profession.maggrundprof.BewegungsmagierZ;
import helden.model.myranor.profession.maggrundprof.ElementarzaubererVariante;
import helden.model.myranor.profession.maggrundprof.ExorzistH;
import helden.model.myranor.profession.maggrundprof.ExorzistZ;
import helden.model.myranor.profession.maggrundprof.HeilerH;
import helden.model.myranor.profession.maggrundprof.HeilerV;
import helden.model.myranor.profession.maggrundprof.HeilerZ;
import helden.model.myranor.profession.maggrundprof.HellseherAnalytikerH;
import helden.model.myranor.profession.maggrundprof.HellseherAnalytikerZ;
import helden.model.myranor.profession.maggrundprof.IllusionistH;
import helden.model.myranor.profession.maggrundprof.IllusionistZ;
import helden.model.myranor.profession.maggrundprof.KampfzaubererH;
import helden.model.myranor.profession.maggrundprof.KampfzaubererZ;
import helden.model.myranor.profession.maggrundprof.MagischerDiebMagischerSpionH;
import helden.model.myranor.profession.maggrundprof.MagischerDiebMagischerSpionZ;
import helden.model.myranor.profession.maggrundprof.MagischerKaempferH;
import helden.model.myranor.profession.maggrundprof.MagischerKaempferVE;
import helden.model.myranor.profession.maggrundprof.MagischerKaempferVW;
import helden.model.myranor.profession.maggrundprof.MagischerKaempferZ;
import helden.model.myranor.profession.maggrundprof.MagokratH;
import helden.model.myranor.profession.maggrundprof.MagokratZ;
import helden.model.myranor.profession.maggrundprof.MetamagierH;
import helden.model.myranor.profession.maggrundprof.MetamagierZ;
import helden.model.myranor.profession.maggrundprof.PionierH;
import helden.model.myranor.profession.maggrundprof.PionierV;
import helden.model.myranor.profession.maggrundprof.PionierZ;
import helden.model.myranor.profession.maggrundprof.TierzaubererH;
import helden.model.myranor.profession.maggrundprof.TierzaubererZ;
import helden.model.myranor.profession.maggrundprof.VerstaendigungszaubererH;
import helden.model.myranor.profession.maggrundprof.VerstaendigungszaubererZ;
import helden.model.myranor.profession.maggrundprof.VerwandlungszaubererH;
import helden.model.myranor.profession.maggrundprof.VerwandlungszaubererZ;
import helden.model.myranor.profession.maggrundprof.WesenbeschwoererH;
import helden.model.myranor.profession.maggrundprof.WesenbeschwoererZ;
import helden.model.myranor.profession.maggrundprof.ZauberpriesterH;
import helden.model.myranor.profession.maggrundprof.ZauberpriesterZ;
import helden.model.myranor.profession.maggrundprof.ZaubertaenzerH;
import helden.model.myranor.profession.maggrundprof.ZaubertaenzerV;
import helden.model.myranor.profession.maggrundprof.ZaubertaenzerZ;
import java.util.ArrayList;

public class BasisTraditionsaufsaetze
extends L {
    private P \u00d3\u00d2\u00d6O00;
    private P thisdoint;
    private P o\u00d4\u00d6O00;
    private P \u00d4\u00d3\u00d6O00;
    private P Oo\u00d6O00;
    private P \u00d4\u00d4\u00d6O00;
    private P thispublicint;
    private P \u00d8\u00d3\u00d6O00;
    private P \u00f8\u00d3\u00d6O00;
    private P \u00d8\u00d4\u00d6O00;
    private P \u00f4\u00d3\u00d6O00;
    private P ifwhileint;
    private P o\u00d3\u00d6O00;
    private P O\u00d2\u00d6O00;
    private P ifforint;
    private P fordoint;
    private P \u00f5o\u00d6O00;
    private P \u00d4\u00d2\u00d6O00;
    private P \u00d8o\u00d6O00;
    private P nulldoint;
    private P \u00d5o\u00d6O00;
    private P \u00d5\u00d2\u00d6O00;
    private P \u00f4o\u00d6O00;
    private P whilewhileint;
    private P \u00d5\u00d3\u00d6O00;
    private P O\u00d4\u00d6O00;
    private P newwhileint;
    private P \u00d3o\u00d6O00;
    private P o\u00d2\u00d6O00;
    private P oo\u00d6O00;
    private P \u00f5\u00d2\u00d6O00;
    private P \u00d3\u00d3\u00d6O00;
    private P \u00f4\u00d2\u00d6O00;
    private P \u00f8o\u00d6O00;
    private P \u00f5O\u00d6O00;
    private P \u00f8O\u00d6O00;
    private P \u00d3\u00d4\u00d6O00;
    private P \u00d8\u00d2\u00d6O00;
    private P Stringdoint;
    private P \u00f5\u00d3\u00d6O00;
    private P O\u00d3\u00d6O00;
    private P whileforint;
    private P \u00d5\u00d4\u00d6O00;
    private P \u00f8\u00d2\u00d6O00;
    private P returnwhileint;
    private P privatedoint;
    private ArrayList<P> \u00d4o\u00d6O00;

    public BasisTraditionsaufsaetze() {
    }

    public BasisTraditionsaufsaetze(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getArkanerForscherH());
        arrayList.add(this.getArkanerForscherZ());
        arrayList.add(this.getArkanerKuenstlerV());
        arrayList.add(this.getArkanerKuenstlerH());
        arrayList.add(this.getArkanerKuenstlerZ());
        arrayList.add(this.getHaendlerH());
        arrayList.add(this.getHaendlerZ());
        arrayList.add(this.getBewegungsmagierH());
        arrayList.add(this.getBewegungsmagierZ());
        arrayList.addAll(this.getElementar());
        arrayList.add(this.getExorzistH());
        arrayList.add(this.getExorzistZ());
        arrayList.add(this.getHeilerV());
        arrayList.add(this.getHeilerH());
        arrayList.add(this.getHeilerZ());
        arrayList.add(this.getHellseherAnalytikerH());
        arrayList.add(this.getHellseherAnalytikerZ());
        arrayList.add(this.getIllusionistH());
        arrayList.add(this.getIllusionistZ());
        arrayList.add(this.getKampfzaubererH());
        arrayList.add(this.getKampfzaubererZ());
        arrayList.add(this.getMagischerDiebMagischerSpionH());
        arrayList.add(this.getMagischerDiebMagischerSpionZ());
        arrayList.add(this.getMagischerKaempferH());
        arrayList.add(this.getMagischerKaempferZ());
        arrayList.add(this.getMagischerKaempferVE());
        arrayList.add(this.getMagischerKaempferVW());
        arrayList.add(this.getMagokratH());
        arrayList.add(this.getMagokratZ());
        arrayList.add(this.getMetamagierH());
        arrayList.add(this.getMetamagierZ());
        arrayList.add(this.getPionierV());
        arrayList.add(this.getPionierH());
        arrayList.add(this.getPionierZ());
        arrayList.add(this.getTierzaubererH());
        arrayList.add(this.getTierzaubererZ());
        arrayList.add(this.getVerstaendigungszaubererH());
        arrayList.add(this.getVerstaendigungszaubererZ());
        arrayList.add(this.getVerwandlungszaubererH());
        arrayList.add(this.getVerwandlungszaubererZ());
        arrayList.add(this.getWesenbeschwoererZ());
        arrayList.add(this.getWesenbeschwoererH());
        arrayList.add(this.getZauberpriesterH());
        arrayList.add(this.getZauberpriesterZ());
        arrayList.add(this.getZaubertaenzerV());
        arrayList.add(this.getZaubertaenzerH());
        arrayList.add(this.getZaubertaenzerZ());
        return arrayList;
    }

    public P getArkanerForscherH() {
        if (this.\u00d3\u00d2\u00d6O00 == null) {
            this.\u00d3\u00d2\u00d6O00 = new ArkanerForscherH();
            this.\u00d3\u00d2\u00d6O00.setProfession(this);
        }
        return this.\u00d3\u00d2\u00d6O00;
    }

    public P getArkanerForscherZ() {
        if (this.thisdoint == null) {
            this.thisdoint = new ArkanerForscherZ();
            this.thisdoint.setProfession(this);
        }
        return this.thisdoint;
    }

    public P getArkanerKuenstlerH() {
        if (this.\u00d3\u00d3\u00d6O00 == null) {
            this.\u00d3\u00d3\u00d6O00 = new ArkanerKuenstlerH();
            this.\u00d3\u00d3\u00d6O00.setProfession(this);
        }
        return this.\u00d3\u00d3\u00d6O00;
    }

    public P getArkanerKuenstlerV() {
        if (this.\u00f5\u00d2\u00d6O00 == null) {
            this.\u00f5\u00d2\u00d6O00 = new ArkanerKuenstlerV();
            this.\u00f5\u00d2\u00d6O00.setProfession(this);
        }
        return this.\u00f5\u00d2\u00d6O00;
    }

    public P getArkanerKuenstlerZ() {
        if (this.\u00f4\u00d2\u00d6O00 == null) {
            this.\u00f4\u00d2\u00d6O00 = new ArkanerKuenstlerZ();
            this.\u00f4\u00d2\u00d6O00.setProfession(this);
        }
        return this.\u00f4\u00d2\u00d6O00;
    }

    public P getBewegungsmagierH() {
        if (this.Oo\u00d6O00 == null) {
            this.Oo\u00d6O00 = new BewegungsmagierH();
            this.Oo\u00d6O00.setProfession(this);
        }
        return this.Oo\u00d6O00;
    }

    public P getBewegungsmagierZ() {
        if (this.\u00d4\u00d4\u00d6O00 == null) {
            this.\u00d4\u00d4\u00d6O00 = new BewegungsmagierZ();
            this.\u00d4\u00d4\u00d6O00.setProfession(this);
        }
        return this.\u00d4\u00d4\u00d6O00;
    }

    public ArrayList<P> getElementar() {
        if (this.\u00d4o\u00d6O00 == null) {
            this.\u00d4o\u00d6O00 = new ArrayList();
            for (o00O o00O2 : o00O.\u00d2O0000()) {
                ElementarzaubererVariante elementarzaubererVariante = new ElementarzaubererVariante(o00O2, false);
                elementarzaubererVariante.setProfession(this);
                this.\u00d4o\u00d6O00.add(elementarzaubererVariante);
                elementarzaubererVariante = new ElementarzaubererVariante(o00O2, true);
                elementarzaubererVariante.setProfession(this);
                this.\u00d4o\u00d6O00.add(elementarzaubererVariante);
            }
        }
        return this.\u00d4o\u00d6O00;
    }

    public P getExorzistH() {
        if (this.thispublicint == null) {
            this.thispublicint = new ExorzistH();
            this.thispublicint.setProfession(this);
        }
        return this.thispublicint;
    }

    public P getExorzistZ() {
        if (this.\u00d8\u00d3\u00d6O00 == null) {
            this.\u00d8\u00d3\u00d6O00 = new ExorzistZ();
            this.\u00d8\u00d3\u00d6O00.setProfession(this);
        }
        return this.\u00d8\u00d3\u00d6O00;
    }

    public P getHaendlerH() {
        if (this.o\u00d4\u00d6O00 == null) {
            this.o\u00d4\u00d6O00 = new ArkanerHaendlerDiplomatH();
            this.o\u00d4\u00d6O00.setProfession(this);
        }
        return this.o\u00d4\u00d6O00;
    }

    public P getHaendlerZ() {
        if (this.\u00d4\u00d3\u00d6O00 == null) {
            this.\u00d4\u00d3\u00d6O00 = new ArkanerHaendlerDiplomatZ();
            this.\u00d4\u00d3\u00d6O00.setProfession(this);
        }
        return this.\u00d4\u00d3\u00d6O00;
    }

    public P getHeilerH() {
        if (this.\u00d8\u00d4\u00d6O00 == null) {
            this.\u00d8\u00d4\u00d6O00 = new HeilerH();
            this.\u00d8\u00d4\u00d6O00.setProfession(this);
        }
        return this.\u00d8\u00d4\u00d6O00;
    }

    public P getHeilerV() {
        if (this.\u00f8\u00d3\u00d6O00 == null) {
            this.\u00f8\u00d3\u00d6O00 = new HeilerV();
            this.\u00f8\u00d3\u00d6O00.setProfession(this);
        }
        return this.\u00f8\u00d3\u00d6O00;
    }

    public P getHeilerZ() {
        if (this.\u00f4\u00d3\u00d6O00 == null) {
            this.\u00f4\u00d3\u00d6O00 = new HeilerZ();
            this.\u00f4\u00d3\u00d6O00.setProfession(this);
        }
        return this.\u00f4\u00d3\u00d6O00;
    }

    public P getHellseherAnalytikerH() {
        if (this.ifwhileint == null) {
            this.ifwhileint = new HellseherAnalytikerH();
            this.ifwhileint.setProfession(this);
        }
        return this.ifwhileint;
    }

    public P getHellseherAnalytikerZ() {
        if (this.o\u00d3\u00d6O00 == null) {
            this.o\u00d3\u00d6O00 = new HellseherAnalytikerZ();
            this.o\u00d3\u00d6O00.setProfession(this);
        }
        return this.o\u00d3\u00d6O00;
    }

    public P getIllusionistH() {
        if (this.O\u00d2\u00d6O00 == null) {
            this.O\u00d2\u00d6O00 = new IllusionistH();
            this.O\u00d2\u00d6O00.setProfession(this);
        }
        return this.O\u00d2\u00d6O00;
    }

    public P getIllusionistZ() {
        if (this.ifforint == null) {
            this.ifforint = new IllusionistZ();
            this.ifforint.setProfession(this);
        }
        return this.ifforint;
    }

    public P getKampfzaubererH() {
        if (this.fordoint == null) {
            this.fordoint = new KampfzaubererH();
            this.fordoint.setProfession(this);
        }
        return this.fordoint;
    }

    public P getKampfzaubererZ() {
        if (this.\u00f5o\u00d6O00 == null) {
            this.\u00f5o\u00d6O00 = new KampfzaubererZ();
            this.\u00f5o\u00d6O00.setProfession(this);
        }
        return this.\u00f5o\u00d6O00;
    }

    public P getMagischerDiebMagischerSpionH() {
        if (this.\u00d4\u00d2\u00d6O00 == null) {
            this.\u00d4\u00d2\u00d6O00 = new MagischerDiebMagischerSpionH();
            this.\u00d4\u00d2\u00d6O00.setProfession(this);
        }
        return this.\u00d4\u00d2\u00d6O00;
    }

    public P getMagischerDiebMagischerSpionZ() {
        if (this.\u00d8o\u00d6O00 == null) {
            this.\u00d8o\u00d6O00 = new MagischerDiebMagischerSpionZ();
            this.\u00d8o\u00d6O00.setProfession(this);
        }
        return this.\u00d8o\u00d6O00;
    }

    public P getMagischerKaempferH() {
        if (this.nulldoint == null) {
            this.nulldoint = new MagischerKaempferH();
            this.nulldoint.setProfession(this);
        }
        return this.nulldoint;
    }

    public P getMagischerKaempferVE() {
        if (this.\u00d5\u00d2\u00d6O00 == null) {
            this.\u00d5\u00d2\u00d6O00 = new MagischerKaempferVE();
            this.\u00d5\u00d2\u00d6O00.setProfession(this);
        }
        return this.\u00d5\u00d2\u00d6O00;
    }

    public P getMagischerKaempferVW() {
        if (this.\u00f4o\u00d6O00 == null) {
            this.\u00f4o\u00d6O00 = new MagischerKaempferVW();
            this.\u00f4o\u00d6O00.setProfession(this);
        }
        return this.\u00f4o\u00d6O00;
    }

    public P getMagischerKaempferZ() {
        if (this.\u00d5o\u00d6O00 == null) {
            this.\u00d5o\u00d6O00 = new MagischerKaempferZ();
            this.\u00d5o\u00d6O00.setProfession(this);
        }
        return this.\u00d5o\u00d6O00;
    }

    public P getMagokratH() {
        if (this.whilewhileint == null) {
            this.whilewhileint = new MagokratH();
            this.whilewhileint.setProfession(this);
        }
        return this.whilewhileint;
    }

    public P getMagokratZ() {
        if (this.\u00d5\u00d3\u00d6O00 == null) {
            this.\u00d5\u00d3\u00d6O00 = new MagokratZ();
            this.\u00d5\u00d3\u00d6O00.setProfession(this);
        }
        return this.\u00d5\u00d3\u00d6O00;
    }

    public P getMetamagierH() {
        if (this.O\u00d4\u00d6O00 == null) {
            this.O\u00d4\u00d6O00 = new MetamagierH();
            this.O\u00d4\u00d6O00.setProfession(this);
        }
        return this.O\u00d4\u00d6O00;
    }

    public P getMetamagierZ() {
        if (this.newwhileint == null) {
            this.newwhileint = new MetamagierZ();
            this.newwhileint.setProfession(this);
        }
        return this.newwhileint;
    }

    public P getPionierH() {
        if (this.o\u00d2\u00d6O00 == null) {
            this.o\u00d2\u00d6O00 = new PionierH();
            this.o\u00d2\u00d6O00.setProfession(this);
        }
        return this.o\u00d2\u00d6O00;
    }

    public P getPionierV() {
        if (this.\u00d3o\u00d6O00 == null) {
            this.\u00d3o\u00d6O00 = new PionierV();
            this.\u00d3o\u00d6O00.setProfession(this);
        }
        return this.\u00d3o\u00d6O00;
    }

    public P getPionierZ() {
        if (this.oo\u00d6O00 == null) {
            this.oo\u00d6O00 = new PionierZ();
            this.oo\u00d6O00.setProfession(this);
        }
        return this.oo\u00d6O00;
    }

    public P getTierzaubererH() {
        if (this.\u00f8o\u00d6O00 == null) {
            this.\u00f8o\u00d6O00 = new TierzaubererH();
            this.\u00f8o\u00d6O00.setProfession(this);
        }
        return this.\u00f8o\u00d6O00;
    }

    public P getTierzaubererZ() {
        if (this.\u00f5O\u00d6O00 == null) {
            this.\u00f5O\u00d6O00 = new TierzaubererZ();
            this.\u00f5O\u00d6O00.setProfession(this);
        }
        return this.\u00f5O\u00d6O00;
    }

    public P getVerstaendigungszaubererH() {
        if (this.\u00f8O\u00d6O00 == null) {
            this.\u00f8O\u00d6O00 = new VerstaendigungszaubererH();
            this.\u00f8O\u00d6O00.setProfession(this);
        }
        return this.\u00f8O\u00d6O00;
    }

    public P getVerstaendigungszaubererZ() {
        if (this.\u00d3\u00d4\u00d6O00 == null) {
            this.\u00d3\u00d4\u00d6O00 = new VerstaendigungszaubererZ();
            this.\u00d3\u00d4\u00d6O00.setProfession(this);
        }
        return this.\u00d3\u00d4\u00d6O00;
    }

    public P getVerwandlungszaubererH() {
        if (this.\u00d8\u00d2\u00d6O00 == null) {
            this.\u00d8\u00d2\u00d6O00 = new VerwandlungszaubererH();
            this.\u00d8\u00d2\u00d6O00.setProfession(this);
        }
        return this.\u00d8\u00d2\u00d6O00;
    }

    public P getVerwandlungszaubererZ() {
        if (this.Stringdoint == null) {
            this.Stringdoint = new VerwandlungszaubererZ();
            this.Stringdoint.setProfession(this);
        }
        return this.Stringdoint;
    }

    public P getWesenbeschwoererH() {
        if (this.\u00f5\u00d3\u00d6O00 == null) {
            this.\u00f5\u00d3\u00d6O00 = new WesenbeschwoererH();
            this.\u00f5\u00d3\u00d6O00.setProfession(this);
        }
        return this.\u00f5\u00d3\u00d6O00;
    }

    public P getWesenbeschwoererZ() {
        if (this.O\u00d3\u00d6O00 == null) {
            this.O\u00d3\u00d6O00 = new WesenbeschwoererZ();
            this.O\u00d3\u00d6O00.setProfession(this);
        }
        return this.O\u00d3\u00d6O00;
    }

    public P getZauberpriesterH() {
        if (this.whileforint == null) {
            this.whileforint = new ZauberpriesterH();
            this.whileforint.setProfession(this);
        }
        return this.whileforint;
    }

    public P getZauberpriesterZ() {
        if (this.\u00d5\u00d4\u00d6O00 == null) {
            this.\u00d5\u00d4\u00d6O00 = new ZauberpriesterZ();
            this.\u00d5\u00d4\u00d6O00.setProfession(this);
        }
        return this.\u00d5\u00d4\u00d6O00;
    }

    public P getZaubertaenzerH() {
        if (this.returnwhileint == null) {
            this.returnwhileint = new ZaubertaenzerH();
            this.returnwhileint.setProfession(this);
        }
        return this.returnwhileint;
    }

    public P getZaubertaenzerV() {
        if (this.\u00f8\u00d2\u00d6O00 == null) {
            this.\u00f8\u00d2\u00d6O00 = new ZaubertaenzerV();
            this.\u00f8\u00d2\u00d6O00.setProfession(this);
        }
        return this.\u00f8\u00d2\u00d6O00;
    }

    public P getZaubertaenzerZ() {
        if (this.privatedoint == null) {
            this.privatedoint = new ZaubertaenzerZ();
            this.privatedoint.setProfession(this);
        }
        return this.privatedoint;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = this.getAlleZusatzVarianten();
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        for (P p2 : this.getGewaehlteVarianten()) {
            ((N)p2).setzeHauszauber(arrayList);
        }
    }
}

