/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.Filter;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.P;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlDialog;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.zustaende.ErschaffungsZustand;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

public abstract class ModifizierAuswahlZustand<T>
extends ErschaffungsZustand {
    protected ModifizierAuswahlDialog<T> \u00d800000 = new ModifizierAuswahlDialog(this);

    public ModifizierAuswahlZustand(HEW2 hEW2) {
        super(hEW2);
        this.getVor().setEnabled(false);
    }

    public void aktuallisiereTree(ArrayList<T> arrayList, T t) {
        this.\u00d800000.aktuallisiereTree(arrayList, t);
    }

    public boolean anzeigen(T t, P p2) {
        return true;
    }

    public boolean anzeigenZusatzVariante(P p2) {
        if (p2.getWahlBedingung() == null) {
            return true;
        }
        return this.super.getBt().Object(p2.getWahlBedingung());
    }

    public void fuelleTree(ArrayList<T> arrayList) {
        this.\u00d800000.fillTree(arrayList);
    }

    public abstract ArrayList<T> getAlleRPK();

    @Override
    public String getBezeichner() {
        return "Keine";
    }

    public abstract ArrayList<T> getMoeglicheRPK();

    @Override
    public ModifizierAuswahlDialog<T> getPanel() {
        this.\u00d800000.initialize();
        return this.\u00d800000;
    }

    public ArrayList<T> getRPKgemaessFilter() {
        if (this.\u00d800000.getFilterBox().getSelectedItem().equals((Object)Filter.\u00d600000)) {
            ArrayList<T> arrayList = this.getMoeglicheRPK();
            return arrayList;
        }
        if (this.\u00d800000.getFilterBox().getSelectedItem().equals((Object)Filter.o00000)) {
            ArrayList<T> arrayList = this.getAlleRPK();
            return arrayList;
        }
        if (this.\u00d800000.getFilterBox().getSelectedItem().equals((Object)Filter.void)) {
            ArrayList<T> arrayList = this.getUebliche();
            return arrayList;
        }
        return new ArrayList();
    }

    public abstract ArrayList<T> getUebliche();

    public List<JComponent> getZusatzGuiElemente() {
        return new ArrayList<JComponent>();
    }

    public abstract boolean hatFilterBox();

    public boolean hatNameFilter() {
        return false;
    }

    public abstract boolean hatUeblicheFiler();

    public void setRPK(T t, ArrayList<P> arrayList) {
        this.super.setzeModifizierer((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)t, arrayList);
        this.super.getPcs().firePropertyChange("ANZEIGE", null, null);
        this.getVor().setEnabled(true);
        this.updateGewaehltTextfeld(t, arrayList);
    }

    @Override
    public abstract void update();

    protected void updateGewaehltTextfeld(T t, ArrayList<P> arrayList) {
        String string = "";
        if (arrayList != null && arrayList.size() > 0) {
            string = string + " ( ";
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                string = string + arrayList.get(i2).toString() + " ";
            }
            string = string + ")";
        }
        if (t != null) {
            this.\u00d800000.getGewaehltTextfeld().setText(t.toString() + string);
        } else {
            this.\u00d800000.getGewaehltTextfeld().setText("");
            this.getVor().setEnabled(false);
        }
    }
}

