/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.model.profession.Geweihter;
import helden.model.profession.Magier;
import java.util.ArrayList;

public class VeteranZustand
extends ModifizierAuswahlZustand<super> {
    public VeteranZustand(HEW2 hEW2) {
        super(hEW2);
    }

    @Override
    public boolean anzeigen(super super_, P p2) {
        L l2;
        if (!this.super.getSetting().contains(super_, p2)) {
            return false;
        }
        if (p2 == null) {
            return true;
        }
        if (super_ instanceof Geweihter && p2.equals(((Geweihter)(l2 = (Geweihter)super_)).getKor())) {
            return false;
        }
        if (super_ instanceof Magier && p2.equals(((Magier)(l2 = (Magier)super_)).getInstitutDerArkanenAnalysen())) {
            return false;
        }
        return this.super.getBt().Object(p2.getWahlBedingung());
    }

    @Override
    public ArrayList<super> getAlleRPK() {
        ArrayList<super> arrayList = new ArrayList<super>();
        return arrayList;
    }

    @Override
    public String getBezeichner() {
        return "Veteran Variante";
    }

    @Override
    public String getHelp() {
        return "<html>An diese Stelle muss die Veteran-Variante ausgew\u00e4hlt werden.";
    }

    @Override
    public ArrayList<super> getMoeglicheRPK() {
        ArrayList<super> arrayList = new ArrayList<super>();
        return arrayList;
    }

    @Override
    public ArrayList<super> getUebliche() {
        return new ArrayList<super>();
    }

    @Override
    public boolean hatFilterBox() {
        return false;
    }

    @Override
    public boolean hatUeblicheFiler() {
        return false;
    }

    @Override
    public boolean isActive() {
        return this.super.isHauptProfessionGesetzt() && this.super.getPhase() == HEW2.PHASEN.\u00d200000 && this.super.isVeteran();
    }

    @Override
    public void setRPK(super super_, ArrayList<P> arrayList) {
        this.super.setzeVeteranModifizierer(super_, arrayList);
        this.super.getPcs().firePropertyChange("ANZEIGE", null, null);
        this.getVor().setEnabled(true);
    }

    @Override
    public void update() {
    }

    @Override
    public void wirdJetztDargstellt() {
        if (this.isActive()) {
            ArrayList<super> arrayList = new ArrayList<super>();
            super super_ = this.super.cloneProfession(this.super.getHauptProfession(), this.super.getGeschlecht(), this.super.getKultur());
            super_.macheAlleVariantenMoeglich();
            arrayList.add(super_);
            super super_2 = super_;
            if (this.super.getHeld().\u00d800000().\u00d200000(String._o.String) > 0) {
                super_2 = this.super.getVeteranProfession();
            }
            this.aktuallisiereTree(arrayList, super_2);
            this.\u00d800000.expandAll();
        }
    }
}

