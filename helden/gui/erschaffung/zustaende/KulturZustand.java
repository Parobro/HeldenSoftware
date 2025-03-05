/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.Einstellungen;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.model.KulturFabrik;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KulturZustand
extends ModifizierAuswahlZustand<OooO>
implements ActionListener {
    public KulturZustand(HEW2 hEW2) {
        super(hEW2);
        this.\u00d800000.getFilterBox().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.\u00d800000.getFilterBox())) {
            this.aktuallisiereTree(this.getRPKgemaessFilter(), this.super.getKultur());
        }
        this.getWerkzeug().fireUpdateNAVI();
    }

    @Override
    public boolean anzeigen(OooO oooO2, P p2) {
        if (!this.super.getSetting().contains(oooO2, p2)) {
            return false;
        }
        return super.anzeigen(oooO2, p2);
    }

    @Override
    public ArrayList<OooO> getAlleRPK() {
        OooO oooO2;
        ArrayList<OooO> arrayList = KulturFabrik.getKulturen(this.super.getGeschlecht());
        if (Einstellungen.getInstance().isTestMode() && (oooO2 = KulturFabrik.getLeerKultur(this.super.getGeschlecht())) != null) {
            arrayList.add(oooO2);
        }
        return arrayList;
    }

    @Override
    public String getBezeichner() {
        return "Kultur";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        return this.super.getPruefer().pruefeKultur();
    }

    @Override
    public ArrayList<OooO> getMoeglicheRPK() {
        OooO oooO2;
        ArrayList<OooO> arrayList = this.super.getRasse().getKulturen(false);
        if (Einstellungen.getInstance().isTestMode() && (oooO2 = KulturFabrik.getLeerKultur(this.super.getGeschlecht())) != null) {
            arrayList.add(oooO2);
        }
        return arrayList;
    }

    @Override
    public ArrayList<OooO> getUebliche() {
        OooO oooO2;
        ArrayList<OooO> arrayList = this.super.getRasse().getKulturen(true);
        if (Einstellungen.getInstance().isTestMode() && (oooO2 = KulturFabrik.getLeerKultur(this.super.getGeschlecht())) != null) {
            arrayList.add(oooO2);
        }
        return arrayList;
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
        return true;
    }

    @Override
    public boolean isActive() {
        return this.super.isRasseGesetzt() && this.super.getPhase() == HEW2.PHASEN.\u00d200000;
    }

    @Override
    public void update() {
        this.aktuallisiereTree(this.getRPKgemaessFilter(), this.super.getKultur());
    }
}

