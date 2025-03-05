/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.OoOO.voidsuper;
import helden.framework.gmod.GMod;
import helden.framework.held.object.oooo_0;
import helden.gui.components.GmodSpalte;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.super.B.super.null;
import java.util.ArrayList;

public class F
extends TabellenDefinition {
    private ArrayList<GMod> \u00f600000;

    public F(final null nullVal, String string, ArrayList<GMod> arrayList) {
        this.\u00f600000 = arrayList;
        this.setTabname(string);
        this.setHideWennLeer(false);
        ArrayList<SpaltenDefinition> arrayList2 = new ArrayList<SpaltenDefinition>();
        int n = 0;
        for (GMod gMod : this.\u00f600000) {
            n = Math.max(n, gMod.getAnzahlAuswahlen());
        }
        for (int i2 = 0; i2 < n; ++i2) {
            arrayList2.add(new GmodSpalte(this.\u00f600000, i2, nullVal.\u00d3O0000()));
        }
        arrayList2.add(new SpaltenDefinition("", 50, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                try {
                    GMod gMod = (GMod)((GMod)object).clone();
                    if (!gMod.isGueltig()) {
                        return;
                    }
                    nullVal.o00000(gMod);
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    oooo_0.\u00f500000("Kann " + object + " nicht clonen!");
                }
            }

            @Override
            public Object getData(int n) {
                return F.this.\u00f600000.get(n);
            }
        });
        this.setSpaltenDefinition(arrayList2);
    }

    @Override
    public int getAnzahl() {
        return this.\u00f600000.size();
    }
}

