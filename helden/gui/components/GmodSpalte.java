/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.framework.gmod.GMod;
import helden.framework.gmod.GModAtome;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import java.util.ArrayList;
import java.util.List;

public class GmodSpalte
extends SpaltenDefinition {
    private ArrayList<GMod> \u00d8\u00f80000;
    private int \u00f5\u00f80000;
    private Settings \u00f4\u00f80000;

    public GmodSpalte(ArrayList<GMod> arrayList, int n, Settings settings) {
        super("", 180, true, String.class, SpaltenDefinition.ART.\u00d300000);
        this.\u00d8\u00f80000 = arrayList;
        this.\u00f5\u00f80000 = n;
        this.\u00f4\u00f80000 = settings;
    }

    @Override
    public void click(Object object, Object object2) {
        GModAtome gModAtome = (GModAtome)object2;
        ((GMod)object).getAuswahl().\u00d200000(this.\u00f5\u00f80000, gModAtome.getWert2());
    }

    @Override
    public Object getData(int n) {
        GMod gMod = this.\u00d8\u00f80000.get(n);
        if (this.\u00f5\u00f80000 < gMod.getAnzahlAuswahlen()) {
            return gMod;
        }
        return null;
    }

    @Override
    public List<Object> getItems(Object object) {
        return ((GMod)object).getAuswahlMoeglichkeiten()[this.\u00f5\u00f80000].getFormatierteListe(this.\u00f4\u00f80000);
    }

    @Override
    public Object selectedItem(Object object) {
        return ((GMod)object).getAuswahlFormatiert().o00000(this.\u00f5\u00f80000);
    }
}

