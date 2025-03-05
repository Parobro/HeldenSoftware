/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.E.C.K;
import helden.framework.settings.Settings;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefMoeglicheVorteile;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.super.B.super.OOOo;
import java.util.ArrayList;
import java.util.Iterator;

public class P
extends TabDefMoeglicheVorteile {
    private ArrayList<public> \u00d2\u00d40000 = new ArrayList();
    private OOOo \u00d4\u00d40000;
    private Settings \u00d3\u00d40000;

    public P(OOOo oOOo, K k2) {
        super(GuiModus.\u00d400000, null);
        this.\u00d3\u00d40000 = Settings.getSettingsBySetting(k2.\u00f6\u00d30000());
        this.\u00d4\u00d40000 = oOOo;
        this.o00000();
        ArrayList<SpaltenDefinition> arrayList = this.getSpaltenDefinition();
        this.spalteName(arrayList);
        this.spalteAuswahl1(arrayList);
        this.spalteAuswahl2(arrayList);
        this.spalteAuswahl3(arrayList);
        this.spalteAddButton(arrayList);
    }

    @Override
    public void addVorteil(public public_) {
        this.\u00d4\u00d40000.o00000(public_);
        this.update();
    }

    public void o00000() {
        Iterator<public> iterator = helden.framework.C.K.\u00d400000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!this.\u00d3\u00d40000.contains(public_)) continue;
            if (public_ instanceof M) {
                M m = (M)public_;
                m.\u00d500000(1);
                this.\u00d2\u00d40000.addAll(m.\u00d200000(false));
                continue;
            }
            this.\u00d2\u00d40000.add(public_);
        }
    }

    @Override
    public int getAnzahl() {
        return this.\u00d2\u00d40000.size();
    }

    @Override
    public int getMinimalWert(J j2) {
        return 1;
    }

    @Override
    public Settings getSetting() {
        return this.\u00d3\u00d40000;
    }

    @Override
    public public getVorteilFuerZeile(int n) {
        return this.\u00d2\u00d40000.get(n);
    }

    @Override
    public void update() {
    }

    @Override
    public void updateSoft() {
    }
}

