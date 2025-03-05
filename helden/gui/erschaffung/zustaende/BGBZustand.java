/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.G;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Geweihter;
import helden.model.profession.Magier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BGBZustand
extends ModifizierAuswahlZustand<super>
implements ActionListener {
    public BGBZustand(HEW2 hEW2) {
        super(hEW2);
        this.\u00d800000.getFilterBox().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.\u00d800000.getFilterBox())) {
            this.aktuallisiereTree(this.getRPKgemaessFilter(), this.super.getHauptProfession());
        }
        this.getWerkzeug().fireUpdateNAVI();
    }

    @Override
    public boolean anzeigen(super super_, P p2) {
        Object object;
        if (!this.super.getSetting().contains(super_, p2)) {
            return false;
        }
        if (super_ instanceof Geweihter) {
            object = (Geweihter)super_;
            if (p2 != null && p2.equals(((Geweihter)object).getKor())) {
                return false;
            }
        }
        if (super_ instanceof Magier) {
            object = (Magier)super_;
            if (p2 != null && p2.equals(((Magier)object).getInstitutDerArkanenAnalysen())) {
                return false;
            }
        }
        if (p2 == null) {
            return true;
        }
        super_.clearVarianten();
        super_.waehleVariante(p2);
        try {
            boolean bl;
            object = super_.getVorteile();
            boolean bl2 = bl = ((Oo0O)object).\u00d400000(I.forsupersuper) || ((Oo0O)object).\u00d400000(I.\u00f5\u00d8o000) || ((Oo0O)object).\u00d400000(I.\u00d5\u00f5O000) || ((Oo0O)object).\u00d400000(I.\u00d8\u00f8o000) || ((Oo0O)object).\u00d400000(I.\u00d4\u00f4O000) || ((Oo0O)object).\u00d400000(I.\u00f8\u00d50000) || ((Oo0O)object).\u00d400000(I.\u00d3\u00f5O000) || ((Oo0O)object).\u00d400000(I.iffor) || this.super.isElfisch(super_);
            if (this.super.getHauptProfession() != null && this.super.getHauptProfession().istZeitaufwendig() && super_.istZeitaufwendig()) {
                bl = true;
            }
            super_.clearVarianten();
            return !bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    @Override
    public ArrayList<super> getAlleRPK() {
        return ProfessionenFabrik.getAlleProfessionen(this.super.getGeschlecht(), G.\u00d8\u00f8\u00f4000, G.\u00d8\u00f8\u00f4000);
    }

    @Override
    public String getBezeichner() {
        return "2. Profession";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        return this.super.getPruefer().pruefeBGB();
    }

    @Override
    public String getHelp() {
        return "<html>Bitte die Regelanpassungen im Bereich Breitgef\u00e4cherter Bildung aus dem WdH-Erratum beachten!";
    }

    @Override
    public ArrayList<super> getMoeglicheRPK() {
        return this.super.getMoeglicheProfessionen(true);
    }

    @Override
    public ArrayList<super> getUebliche() {
        return new ArrayList<super>();
    }

    @Override
    public boolean hatFilterBox() {
        return true;
    }

    @Override
    public boolean hatNameFilter() {
        return true;
    }

    @Override
    public boolean hatUeblicheFiler() {
        return false;
    }

    @Override
    public boolean isActive() {
        return this.super.isHauptProfessionGesetzt() && this.super.getPhase() == HEW2.PHASEN.\u00d200000 && this.super.isBGB();
    }

    @Override
    public void setRPK(super super_, ArrayList<P> arrayList) {
        this.super.setzeBGBModifizierer(super_, arrayList);
        this.super.getPcs().firePropertyChange("ANZEIGE", null, null);
        this.getVor().setEnabled(true);
        this.updateGewaehltTextfeld(super_, arrayList);
    }

    @Override
    public void update() {
        this.aktuallisiereTree(this.getRPKgemaessFilter(), this.super.getHauptProfession());
    }
}

