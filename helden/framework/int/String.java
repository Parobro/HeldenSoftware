/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.for;
import helden.framework.Geschlecht;
import helden.framework.HeldenMath;
import helden.framework.OoOO.G;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.T;
import helden.framework.oOoO.returnsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.b_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.framework.oooo.oooo_6;
import helden.framework.zauber.KonkreterZauber;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Geweihter;
import helden.model.profession.Schelm;
import helden.model.profession.geweihter.Kor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class String
extends super {
    private Map<_o, ArrayList<super>> O\u00f5\u00f6000 = new HashMap<_o, ArrayList<super>>();

    public String() {
        for (_o _o2 : _o.values()) {
            ArrayList arrayList = new ArrayList();
            this.O\u00f5\u00f6000.put(_o2, arrayList);
        }
    }

    public void o00000(_o _o2, super super_) {
        ArrayList<super> arrayList = this.O\u00f5\u00f6000.get((Object)_o2);
        arrayList.add(super_);
    }

    @Override
    public void addGewahlteVerbilligteSonderfertigkeit(for for_) {
        this.getEigeneGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    public void addTalentTyp2Auswahl(interface interface_) {
        if (this.\u00d200000(_o.\u00d300000) > 0) {
            this.Object(_o.\u00d300000).get(0).addTalentTyp2Auswahl(interface_);
        }
    }

    public int \u00d200000(_o _o2) {
        return this.Object(_o2).size();
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        for (super super_ : this.Object(_o.\u00d300000)) {
            super_.bestimmeTalentwerte(n);
            k_0<oo0o_0> k_02 = super_.getTalente();
            for (oo0o_0 oo0o_02 : k_02) {
                this.addTalentwert(oo0o_02, k_02.\u00d400000(oo0o_02));
            }
            k_0<oo0o_0> object2 = super_.getZauberfertigkeiten();
            for (oo0o_0 oo0o_03 : object2) {
                this.addTalentwert(oo0o_03, object2.\u00d400000(oo0o_03));
            }
        }
    }

    public void o00000(_o _o2) {
        this.Object(_o2).clear();
    }

    public ArrayList<super> Object(_o _o2) {
        ArrayList<super> arrayList = this.O\u00f5\u00f6000.get((Object)_o2);
        return arrayList;
    }

    @Override
    public int getBasisGPKosten() {
        int n = this.Object(_o.\u00d300000).get(0).getGPKosten();
        if (this.\u00d200000(_o.\u00d500000) > 0) {
            n += 7;
        }
        return n;
    }

    @Override
    public List<java.lang.String> getBesondererBesitzMoeglichkeiten() {
        return this.Object(_o.\u00d300000).get(0).getBesondererBesitzMoeglichkeiten();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        return this.Object(_o.\u00d300000).get(0).getEmpfohleneVorteile();
    }

    @Override
    public ArrayList<I> getEntfernteKutlurVorteile() {
        if (this.\u00d200000(_o.\u00d300000) > 0) {
            return this.Object(_o.\u00d300000).get(0).getEntfernteKutlurVorteile();
        }
        return new ArrayList<I>();
    }

    public super \u00d500000(_o _o2) {
        return this.O\u00f5\u00f6000.get((Object)_o2).get(0);
    }

    @Override
    public List<oo0o_0> getGewaehlteTalente() {
        return this.Objectif().get(0).getGewaehlteTalente();
    }

    public ArrayList<for> voidif() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.addAll(this.getEigeneGewaehlteVerbilligteSonderfertigkeiten());
        arrayList.addAll(this.Object(_o.\u00d300000).get(0).getGewaehlteVerbilligteSonderfertigkeiten());
        Iterator<super> iterator = this.Object(_o.\u00d800000).iterator();
        while (iterator.hasNext()) {
            arrayList.addAll(iterator.next().getGewaehlteVerbilligteSonderfertigkeiten());
        }
        if (this.\u00d200000(_o.\u00d500000) > 0) {
            super super_ = this.Object(_o.\u00d500000).get(0);
            arrayList.addAll(super_.getGewaehlteVerbilligteSonderfertigkeiten());
            super super_2 = ProfessionenFabrik.getProfession(super_, Geschlecht.\u00d400000, G.whilewhileString, G.\u00d8\u00d8\u00f5000);
            for (P object : super_.getGewaehlteVarianten()) {
                super_2.waehleVariante(object);
            }
            for (helden.framework.D.P p2 : super_.getSonderfertigkeiten()) {
                boolean bl = super_2.getSonderfertigkeiten().\u00d200000(p2.toString());
                if (bl) continue;
                arrayList.addAll(for.o00000(p2));
            }
        }
        return arrayList;
    }

    public ArrayList<super> Objectif() {
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.addAll(this.Object(_o.\u00d300000));
        arrayList.addAll(this.Object(_o.\u00d500000));
        return arrayList;
    }

    @Override
    public java.lang.String getID() {
        java.lang.String string = "";
        string = string + this.Object(_o.\u00d300000).get(0).getID();
        Iterator<super> iterator = this.Object(_o.\u00d500000).iterator();
        while (iterator.hasNext()) {
            string = string + iterator.next().getID();
        }
        return string;
    }

    @Override
    public int getMaximalSozialstatus() {
        return this.Object(_o.\u00d300000).get(0).getMaximalSozialstatus();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (this.\u00d200000(_o.\u00d500000) > 0) {
            return Math.max(this.Object(_o.\u00d300000).get(0).getMinimalEigenschaftswert(b_02), this.Object(_o.\u00d500000).get(0).getMinimalEigenschaftswert(b_02));
        }
        return this.Object(_o.\u00d300000).get(0).getMinimalEigenschaftswert(b_02);
    }

    @Override
    public int getModifikator(b_0 b_02) {
        N n;
        Geweihter geweihter;
        int n2 = 0;
        if (this.Object(_o.\u00d300000).size() > 0) {
            n2 += this.Object(_o.\u00d300000).get(0).getModifikator(b_02);
        }
        if (this.\u00d200000(_o.\u00d500000) > 0 && (b_02.equals(b_0.thispublicsuper) || b_02.equals(b_0.\u00d3\u00f4\u00d2000) || b_02.equals(b_0.\u00d8\u00f5\u00d2000) || b_02.equals(b_0.\u00f4\u00d8\u00d2000))) {
            n2 += HeldenMath.haelfte(this.Object(_o.\u00d500000).get(0).getModifikator(b_02));
        }
        if (this.\u00d200000(_o.String) > 0 && (b_02.equals(b_0.thispublicsuper) || b_02.equals(b_0.\u00d3\u00f4\u00d2000) || b_02.equals(b_0.\u00d8\u00f5\u00d2000) || b_02.equals(b_0.\u00f4\u00d8\u00d2000))) {
            n2 += HeldenMath.haelfte(this.Object(_o.String).get(0).getModifikator(b_02));
        }
        if (this.\u00d200000(_o.\u00d200000) > 0 && (geweihter = (Geweihter)this.Object(_o.\u00d200000).get(0)) != null && geweihter.varianteGewaehlt() && (n = geweihter.getKonkreteVariante()) instanceof Kor) {
            if (b_02.equals(b_0.thispublicsuper)) {
                n2 += 2;
            }
            if (b_02.equals(b_0.\u00d8\u00f5\u00d2000)) {
                ++n2;
            }
        }
        return n2;
    }

    @Override
    public ArrayList<P> getMoeglicheVarianten() {
        return this.Object(_o.\u00d300000).get(0).getMoeglicheVarianten();
    }

    @Override
    public voidsuper getMuttersprache() {
        if (this.\u00d200000(_o.\u00d300000) > 0) {
            return this.Object(_o.\u00d300000).get(0).getMuttersprache();
        }
        return null;
    }

    @Override
    public voidsuper getMuttersprachenSchrift() {
        if (this.\u00d200000(_o.\u00d300000) > 0) {
            if (this.Object(_o.\u00d300000).get(0) instanceof Schelm) {
                return G.privatesuperclass;
            }
            return this.Object(_o.\u00d300000).get(0).getMuttersprachenSchrift();
        }
        return null;
    }

    @Override
    public T getNextLeittalentAuswahl() {
        return this.Object(_o.\u00d300000).get(0).getNextLeittalentAuswahl();
    }

    @Override
    public b_1 getNextModifikationAuswahl() {
        return this.Object(_o.\u00d300000).get(0).getNextModifikationAuswahl();
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        boolean bl;
        if (this.Object(_o.\u00d300000).get(0).hatMehrSonderfertigkeitAuswahl()) {
            return this.Object(_o.\u00d300000).get(0).getNextSonderfertigkeitAuswahl();
        }
        if (this.\u00d200000(_o.\u00d500000) > 0 && this.Object(_o.\u00d500000).get(0).hatMehrSonderfertigkeitAuswahl()) {
            objectsuper_0 objectsuper_02 = this.Object(_o.\u00d500000).get(0).getNextSonderfertigkeitAuswahl();
            objectsuper_02.o00000("Die gew\u00e4hlte Sonderfertigkeit wird zu einer verbilligten Sonderfertigkeit");
            return objectsuper_02;
        }
        boolean bl2 = bl = this.\u00d200000(_o.String) > 0 && !this.Object(_o.\u00d300000).get(0).toString().equals(this.Object(_o.String).get(0).toString());
        if (bl && this.Object(_o.String).get(0).hatMehrSonderfertigkeitAuswahl()) {
            objectsuper_0 objectsuper_03 = this.Object(_o.String).get(0).getNextSonderfertigkeitAuswahl();
            objectsuper_03.o00000("Die gew\u00e4hlte Sonderfertigkeit wird evtl. zu einer verbilligten Sonderfertigkeit");
            return objectsuper_03;
        }
        return super.getNextSonderfertigkeitAuswahl();
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        return this.Object(_o.\u00d300000).get(0).getNextSprachAuswahl();
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        if (this.\u00d200000(_o.\u00d500000) > 0 && !this.\u00d500000(_o.\u00d300000).hatMehrTalentAuswahl()) {
            return this.\u00d500000(_o.\u00d500000).getNextTalentAuswahl();
        }
        return this.\u00d500000(_o.\u00d300000).getNextTalentAuswahl();
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        if (this.\u00d200000(_o.\u00d300000) > 0) {
            return this.Object(_o.\u00d300000).get(0).getNextTalentTyp2Auswahl();
        }
        return null;
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl() {
        return this.Object(_o.\u00d300000).get(0).getNextTaPVerteilAuswahl();
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        if (this.\u00d200000(_o.\u00d500000) > 0 && !this.Object(_o.\u00d300000).get(0).hatMehrVerbilligteSonderfertigkeitAuswahl()) {
            return this.Object(_o.\u00d500000).get(0).getNextVerbilligteSonderfertigkeitAuswahl();
        }
        return this.Object(_o.\u00d300000).get(0).getNextVerbilligteSonderfertigkeitAuswahl();
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        if (this.\u00d200000(_o.\u00d500000) > 0 && !this.Object(_o.\u00d300000).get(0).hatMehrVorteilAuswahl()) {
            return this.Object(_o.\u00d500000).get(0).getNextVorteilAuswahl();
        }
        return this.Object(_o.\u00d300000).get(0).getNextVorteilAuswahl();
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        if (this.\u00d200000(_o.\u00d300000) > 0) {
            return this.Object(_o.\u00d300000).get(0).getNotwendigeVoraussetzungen();
        }
        return super.getNotwendigeVoraussetzungen();
    }

    @Override
    public int getPermanenteASP() {
        if (this.\u00d200000(_o.\u00d300000) > 0) {
            return this.Object(_o.\u00d300000).get(0).getPermanenteASP();
        }
        return 0;
    }

    @Deprecated
    public super \u00f6oO000() {
        return null;
    }

    public ArrayList<super> \u00d6oO000() {
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.addAll(this.Object(_o.\u00d300000));
        arrayList.addAll(this.Object(_o.\u00d500000));
        return arrayList;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        oOOo.o00000(this.Object(_o.\u00d300000).get(0).getSonderfertigkeiten());
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        return this.Object(_o.\u00d300000).get(0).getUngeeigneteVorteile();
    }

    public ArrayList<for> \u00f5oO000() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.addAll(this.getEigeneGewaehlteVerbilligteSonderfertigkeiten());
        arrayList.addAll(this.Object(_o.\u00d300000).get(0).getVerbilligteSonderfertigkeiten());
        for (for object : this.\u00d2oO000()) {
            arrayList.add(object);
        }
        for (for for_ : this.\u00d5oO000()) {
            if (arrayList.contains(for_)) continue;
            arrayList.add(for_);
        }
        for (super super_ : this.Object(_o.\u00d800000)) {
            Iterator<helden.framework.D.P> iterator = super_.getSonderfertigkeiten().iterator();
            while (iterator.hasNext()) {
                Iterator<for> iterator2 = for.o00000(iterator.next());
                Iterator iterator3 = ((ArrayList)((Object)iterator2)).iterator();
                while (iterator3.hasNext()) {
                    for for_ = (for)iterator3.next();
                    if (arrayList.contains(for_)) continue;
                    arrayList.add(for_);
                }
            }
            for (for for_ : super_.getVerbilligteSonderfertigkeiten()) {
                if (arrayList.contains(for_)) continue;
                arrayList.add(for_);
            }
        }
        for (super super_ : this.Object(_o.\u00d600000)) {
            for (for for_ : super_.getVerbilligteSonderfertigkeiten()) {
                if (arrayList.contains(for_)) continue;
                arrayList.add(for_);
            }
        }
        return arrayList;
    }

    public ArrayList<for> \u00d2oO000() {
        ArrayList<for> arrayList = new ArrayList<for>();
        for (super super_ : this.Object(_o.\u00d500000)) {
            Iterator<for> iterator22;
            for (Iterator<for> iterator22 : super_.getSonderfertigkeiten()) {
                ArrayList<for> arrayList2 = for.o00000((helden.framework.D.P)((Object)iterator22));
                for (for for_ : arrayList2) {
                    if (arrayList.contains(for_)) continue;
                    arrayList.add(for_);
                }
            }
            for (for for_ : super_.getVerbilligteSonderfertigkeiten()) {
                if (arrayList.contains(for_)) continue;
                arrayList.add(for_);
            }
            iterator22 = super_.getGewaehlteVerbilligteSonderfertigkeiten().iterator();
            while (iterator22.hasNext()) {
                for for_ = iterator22.next();
                if (arrayList.contains(for_)) continue;
                arrayList.add(for_);
            }
        }
        return arrayList;
    }

    public ArrayList<for> \u00d5oO000() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.Object(_o.String).size() == 0) {
            return arrayList;
        }
        java.lang.String string = this.Object(_o.\u00d300000).get(0).toString();
        java.lang.String string2 = this.Object(_o.String).get(0).toString();
        if (string2.equals(string)) {
            return arrayList;
        }
        OOOo oOOo = this.getSonderfertigkeiten();
        for (super super_ : this.Object(_o.String)) {
            for (helden.framework.D.P p2 : super_.getSonderfertigkeiten()) {
                ArrayList<for> arrayList2 = for.o00000(p2);
                for (for for_ : arrayList2) {
                    if (oOOo.\u00d200000(for_.getBezeichner().toString()) || arrayList.contains(for_)) continue;
                    arrayList.add(for_);
                }
            }
        }
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getVerteilTalente() {
        return new k_0<oo0o_0>();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        oo0O.new(this.Object(_o.\u00d300000).get(0).getVorteile());
        return oo0O;
    }

    @Override
    public int getWahlWert(oo0o_0 oo0o_02) {
        return this.Objectif().get(0).getWahlWert(oo0o_02);
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList;
        ArrayList<G> arrayList2 = new ArrayList<G>();
        if (this.\u00d200000(_o.\u00d300000) > 0 && (arrayList = this.Object(_o.\u00d300000).get(0).getZweitLehrsprache()) != null) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    public boolean \u00d400000(_o _o2) {
        return this.Object(_o2).size() > 0;
    }

    public boolean \u00d4oO000() {
        return this.Object(_o.\u00d500000).size() > 0;
    }

    @Override
    public boolean hatMehrLeittalentAuswahl() {
        return this.Object(_o.\u00d300000).get(0).hatMehrLeittalentAuswahl();
    }

    @Override
    public boolean hatMehrModifikationAuswahl() {
        return this.Object(_o.\u00d300000).get(0).hatMehrModifikationAuswahl();
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        boolean bl = this.Object(_o.\u00d300000).get(0).hatMehrSonderfertigkeitAuswahl();
        if (!bl && this.\u00d200000(_o.\u00d500000) > 0) {
            bl = this.Object(_o.\u00d500000).get(0).hatMehrSonderfertigkeitAuswahl();
        }
        if (!bl && this.\u00d200000(_o.String) > 0) {
            java.lang.String string = this.Object(_o.\u00d300000).get(0).toString();
            java.lang.String string2 = this.Object(_o.String).get(0).toString();
            if (!string2.equals(string)) {
                bl = this.Object(_o.String).get(0).hatMehrSonderfertigkeitAuswahl();
            }
        }
        return bl;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.Object(_o.\u00d300000).get(0).hatMehrSprachenAuswahl();
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        boolean bl = this.Object(_o.\u00d300000).get(0).hatMehrTalentAuswahl();
        if (!bl && this.\u00d200000(_o.\u00d500000) > 0) {
            bl = this.\u00d500000(_o.\u00d500000).hatMehrTalentAuswahl();
        }
        return bl;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        if (this.\u00d200000(_o.\u00d300000) > 0) {
            return this.Object(_o.\u00d300000).get(0).hatMehrTalentTyp2Auswahl();
        }
        return false;
    }

    @Override
    public boolean hatMehrTaPVerteilAuswahl() {
        return this.Object(_o.\u00d300000).get(0).hatMehrTaPVerteilAuswahl();
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        boolean bl = this.Object(_o.\u00d300000).get(0).hatMehrVerbilligteSonderfertigkeitAuswahl();
        if (!bl && this.\u00d200000(_o.\u00d500000) > 0) {
            bl = this.Object(_o.\u00d500000).get(0).hatMehrVerbilligteSonderfertigkeitAuswahl();
        }
        return bl;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        if (this.\u00d200000(_o.\u00d500000) > 0 && !this.Object(_o.\u00d300000).get(0).hatMehrVorteilAuswahl()) {
            return this.Object(_o.\u00d500000).get(0).hatMehrVorteilAuswahl();
        }
        return this.Object(_o.\u00d300000).get(0).hatMehrVorteilAuswahl();
    }

    @Override
    public super hatProfession(Class clazz) {
        for (super super_ : this.Object(_o.\u00d300000)) {
            if (!super_.getClass().equals(clazz)) continue;
            return super_;
        }
        for (super super_ : this.Object(_o.\u00d500000)) {
            if (!super_.getClass().equals(clazz)) continue;
            return super_;
        }
        for (super super_ : this.Object(_o.\u00d600000)) {
            if (!super_.getClass().equals(clazz)) continue;
            return super_;
        }
        return null;
    }

    public P o00000(Class clazz) {
        for (super super_ : this.Object(_o.\u00d300000)) {
            for (P p2 : super_.getGewaehlteVarianten()) {
                if (!p2.getClass().equals(clazz)) continue;
                return p2;
            }
        }
        for (super super_ : this.Object(_o.\u00d500000)) {
            for (P p2 : super_.getGewaehlteVarianten()) {
                if (!p2.getClass().equals(clazz)) continue;
                return p2;
            }
        }
        return null;
    }

    @Override
    public boolean hatVariantenAuswahl() {
        ArrayList<P> arrayList = this.Object(_o.\u00d300000).get(0).getMoeglicheVarianten();
        if (arrayList.size() == 0) {
            return false;
        }
        if (arrayList.size() > 1) {
            return true;
        }
        return arrayList.get(0).istOptional();
    }

    @Override
    public boolean istIntern() {
        for (ArrayList<super> arrayList : this.O\u00f5\u00f6000.values()) {
            for (super super_ : arrayList) {
                if (super_.istIntern()) continue;
                return false;
            }
        }
        return super.istIntern();
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return this.Object(_o.\u00d300000).get(0).istZweitLehrspracheGewaehlt();
    }

    public void o00000(_o _o2, int n) {
        ArrayList<super> arrayList = this.O\u00f5\u00f6000.get((Object)_o2);
        if (n < arrayList.size()) {
            arrayList.remove(n);
        }
    }

    public void o00000(_o _o2, super super_, int n) {
        ArrayList<super> arrayList = this.O\u00f5\u00f6000.get((Object)_o2);
        if (n >= arrayList.size()) {
            arrayList.add(super_);
        } else {
            arrayList.set(n, super_);
        }
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        if (this.Object(_o.\u00d300000).size() > 0) {
            this.Object(_o.\u00d300000).get(0).setzeHauszauber(arrayList);
        }
    }

    @Override
    public void setzeLeittalente(ArrayList<oo0o_0> arrayList) {
        this.Object(_o.\u00d300000).get(0).setzeLeittalente(arrayList);
    }

    public int \u00f4oO000() {
        return this.Object(_o.\u00d300000).size() + this.Object(_o.\u00d500000).size();
    }

    @Override
    public java.lang.String toString() {
        Object object;
        StringBuffer stringBuffer = new StringBuffer();
        java.lang.String string = this.Object(_o.\u00d300000).get(0).toString();
        stringBuffer.append(string);
        if (this.\u00d400000(_o.String) && !((java.lang.String)(object = this.Object(_o.String).get(0).toString())).equals(string)) {
            stringBuffer.append(" (");
            stringBuffer.append((java.lang.String)object);
            stringBuffer.append(")");
        }
        if (this.Object(_o.\u00d500000).size() > 0) {
            object = this.Object(_o.\u00d500000).iterator();
            while (object.hasNext()) {
                stringBuffer.append(", ");
                stringBuffer.append(((super)object.next()).toString());
            }
        }
        if (this.Object(_o.\u00d800000).size() > 0) {
            stringBuffer.append(", Magische Weiterbildung: ");
            for (int i2 = 0; i2 < this.Object(_o.\u00d800000).size(); ++i2) {
                if (i2 > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(this.Object(_o.\u00d800000).get(i2).toString());
            }
        }
        if (this.Object(_o.\u00d200000).size() > 0) {
            Iterator<super> iterator = this.Object(_o.\u00d200000).iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(", Sp\u00e4tweihe: ");
                java.lang.String string2 = iterator.next().toString();
                int n = string2.indexOf(":");
                stringBuffer.append(string2.substring(n + 2));
            }
        }
        if (this.Object(_o.\u00d600000).size() > 0) {
            Iterator<super> iterator = this.Object(_o.\u00d600000).iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(", ");
                stringBuffer.append(iterator.next().toString());
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleLeittalent(voidsuper voidsuper2) {
        this.Object(_o.\u00d300000).get(0).waehleLeittalent(voidsuper2);
    }

    @Override
    protected final void setzeModifikationen() {
        super super_ = this.Object(_o.\u00d300000).get(0);
        super_.setzeModifikationen();
        if (this.\u00d200000(_o.\u00d500000) > 0) {
            this.Object(_o.\u00d500000).get(0).setzeModifikationen();
        }
        if (this.\u00d200000(_o.String) > 0) {
            this.Object(_o.String).get(0).setzeModifikationen();
        }
    }

    public static enum _o {
        \u00d300000,
        \u00d500000,
        \u00d800000,
        \u00d200000,
        \u00d600000,
        String;

    }
}

