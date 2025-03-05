/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.settings.Settings;
import helden.gui.O0OO.D.new.OooO;
import helden.gui.O0OO.ooOO.new;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefMoeglicheVorteile;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class int
extends TabDefMoeglicheVorteile {
    private new \u00d8\u00d40000;
    private int floatObject;
    private OooO \u00d6\u00d40000;

    public int(int n, new new_, OooO oooO2, boolean bl) {
        super(GuiModus.\u00d500000, null);
        this.\u00d8\u00d40000 = new_;
        this.floatObject = n;
        this.\u00d6\u00d40000 = oooO2;
        ArrayList<SpaltenDefinition> arrayList = this.getSpaltenDefinition();
        this.spalteName(arrayList);
        this.spalteAuswahl1(arrayList);
        this.spalteAuswahl2(arrayList);
        this.spalteAuswahl3(arrayList);
        this.spalteAddButton(arrayList);
    }

    @Override
    public void addVorteil(public public_) {
        this.\u00d6\u00d40000.o00000(public_);
        this.update();
    }

    @Override
    public int getAnzahl() {
        if (this.new() == null) {
            return 0;
        }
        return this.new().getListe(this.floatObject).size();
    }

    @Override
    public int getMinimalWert(J j2) {
        return 1;
    }

    @Override
    public Settings getSetting() {
        return null;
    }

    @Override
    public public getVorteilFuerZeile(int n) {
        return this.new().getListe(this.floatObject).get(n);
    }

    @Override
    public void update() {
        this.\u00d6\u00d40000.\u00d500000();
    }

    @Override
    public void updateSoft() {
    }

    private KategorienArrayList<public> new() {
        Oo0O oo0O = this.\u00d8\u00d40000.nullnew();
        return oo0O.o00000();
    }
}

