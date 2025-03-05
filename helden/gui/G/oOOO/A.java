/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.oOOO;

import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.held.Object.O0OO;
import helden.framework.settings.Settings;
import helden.gui.G.oOOO.B;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefMoeglicheVorteile;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import java.util.ArrayList;

public class A
extends TabDefMoeglicheVorteile {
    private O0OO superString;
    private int \u00f8\u00d40000;
    private B O\u00d50000;

    public A(int n, O0OO o0OO2, B b) {
        super(GuiModus.\u00d500000, null);
        this.superString = o0OO2;
        this.\u00f8\u00d40000 = n;
        this.O\u00d50000 = b;
        ArrayList<SpaltenDefinition> arrayList = this.getSpaltenDefinition();
        this.spalteName(arrayList);
        this.spalteAuswahl1(arrayList);
        this.spalteAuswahl2(arrayList);
        this.spalteAuswahl3(arrayList);
        this.spalteAddButton(arrayList);
    }

    @Override
    public void addVorteil(public public_) {
        this.superString.o00000(public_);
        this.update();
    }

    @Override
    public int getAnzahl() {
        if (this.\u00d300000() == null) {
            return 0;
        }
        return this.\u00d300000().getListe(this.\u00f8\u00d40000).size();
    }

    @Override
    public int getMinimalWert(J j2) {
        return 1;
    }

    @Override
    public Settings getSetting() {
        return this.superString.\u00f5O0000();
    }

    @Override
    public public getVorteilFuerZeile(int n) {
        return this.\u00d300000().getListe(this.\u00f8\u00d40000).get(n);
    }

    @Override
    public void update() {
        this.O\u00d50000.update();
    }

    @Override
    public void updateSoft() {
        this.O\u00d50000.updateSoft();
    }

    private KategorienArrayList<public> \u00d300000() {
        return this.superString.\u00d3o0000().o00000();
    }
}

