/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.E.F;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.geld.GeldBoerse;
import helden.framework.geld.WaehrungsCollection;
import helden.framework.geld.WaehrungsFabrik;
import helden.framework.held.D;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.plugin.werteplugin.A.A;
import helden.plugin.werteplugin.A.C;
import helden.plugin.werteplugin.A.G;
import helden.plugin.werteplugin.A.OO0O;
import helden.plugin.werteplugin.A.String;
import helden.plugin.werteplugin.A.oooO;
import helden.plugin.werteplugin.PluginAusruestung;
import helden.plugin.werteplugin.PluginHeld;
import helden.plugin.werteplugin.PluginHeldenWerteWerkzeug;
import helden.plugin.werteplugin.PluginSonderfertigkeit;
import helden.plugin.werteplugin.PluginTalent;
import helden.plugin.werteplugin.PluginVorteil;
import helden.plugin.werteplugin.PluginZauber;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class do
implements PluginHeldenWerteWerkzeug {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000;
    private A \u00d200000;

    public do(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 != null) {
            this.\u00d200000 = new A(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
    }

    @Override
    public int getAttacke(PluginTalent pluginTalent) {
        if (this.o00000 == null) {
            return -1;
        }
        if (pluginTalent.getTalentart().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.toString())) {
            E e = (E)pluginTalent.getTalent();
            return this.o00000.o00000(e);
        }
        return -1;
    }

    @Override
    public PluginAusruestung getAusruestung() {
        if (this.o00000 == null) {
            return null;
        }
        return new oooO(this.o00000.\u00d8o0000());
    }

    @Override
    public java.lang.String[] getEigenschaftsbezeichner() {
        java.lang.String[] stringArray = new java.lang.String[this.o00000.\u00d3\u00d30000().\u00d200000().size()];
        for (int i2 = 0; i2 < this.o00000.\u00d3\u00d30000().\u00d200000().size(); ++i2) {
            stringArray[i2] = ((b_0)this.o00000.\u00d3\u00d30000().\u00d200000().get(i2)).toString();
        }
        return stringArray;
    }

    @Override
    public int getEigenschaftswert(java.lang.String string) {
        if (this.o00000 == null) {
            return 0;
        }
        for (int i2 = 0; i2 < this.o00000.\u00d3\u00d30000().\u00d200000().size(); ++i2) {
            b_0 b_02 = (b_0)this.o00000.\u00d3\u00d30000().\u00d200000().get(i2);
            if (!b_02.toString().equals(string)) continue;
            if (!this.o00000.oo0000() && b_0.\u00f4\u00f5\u00d2000.toString().equals(string)) {
                return 0;
            }
            return this.o00000.\u00d3\u00d30000().do(b_02);
        }
        return 0;
    }

    @Override
    public GeldBoerse getGeldBoerse() {
        return this.o00000.\u00f400000();
    }

    @Override
    public ArrayList<java.lang.String> getInventarAlsString() {
        Iterator<F> iterator = this.o00000.\u00d8o0000().\u00d400000().iterator();
        ArrayList<java.lang.String> arrayList = new ArrayList<java.lang.String>();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().OO0000());
        }
        return arrayList;
    }

    @Override
    public int getParade(PluginTalent pluginTalent) {
        if (this.o00000 == null) {
            return -1;
        }
        if (pluginTalent.getTalentart().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.toString())) {
            E e = (E)pluginTalent.getTalent();
            return this.o00000.new(e);
        }
        return -1;
    }

    @Override
    public int getRassenGeschwindigkeit() {
        return this.o00000.o00000(b_0.O\u00f4\u00d2000);
    }

    public A super() {
        return this.\u00d200000;
    }

    @Override
    public PluginSonderfertigkeit getSonderfertigkeit(java.lang.String string) {
        if (this.o00000 == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.o00000.\u00f5O0000().newsuper(); ++i2) {
            P p2 = this.o00000.\u00f5O0000().\u00d2o0000().get(i2);
            if (!string.equals(p2.toString())) continue;
            return new G(p2);
        }
        return null;
    }

    @Override
    public java.lang.String[] getSonderfertigkeitenAlsString() {
        if (this.o00000 == null) {
            return new java.lang.String[0];
        }
        java.lang.String[] stringArray = new java.lang.String[this.o00000.\u00f5O0000().newsuper()];
        for (int i2 = 0; i2 < this.o00000.\u00f5O0000().newsuper(); ++i2) {
            P p2 = this.o00000.\u00f5O0000().\u00d2o0000().get(i2);
            stringArray[i2] = p2.toString();
        }
        return stringArray;
    }

    @Override
    public PluginTalent getTalent(java.lang.String string) {
        if (this.o00000 == null) {
            return null;
        }
        return new OO0O((oo0o_0)this.o00000.\u00f8O0000().super(string));
    }

    @Override
    public java.lang.String[] getTalenteAlsString() {
        if (this.o00000 == null) {
            return new java.lang.String[0];
        }
        java.lang.String[] stringArray = new java.lang.String[this.o00000.\u00f8O0000().\u00d300000()];
        for (int i2 = 0; i2 < this.o00000.\u00f8O0000().\u00d300000(); ++i2) {
            voidsuper voidsuper2 = (voidsuper)this.o00000.\u00f8O0000().\u00d200000(i2);
            stringArray[i2] = voidsuper2.toString();
        }
        return stringArray;
    }

    @Override
    public int getTalentwert(PluginTalent pluginTalent) {
        if (this.o00000 != null) {
            try {
                return this.o00000.\u00d300000((oo0o_0)pluginTalent.getTalent());
            }
            catch (D d2) {
                // empty catch block
            }
        }
        return -9;
    }

    @Override
    public PluginVorteil getVorteil(java.lang.String string) {
        if (this.o00000 == null) {
            return null;
        }
        Iterator<public> iterator = this.o00000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.oO0000().equals(string)) continue;
            return new C(public_);
        }
        return null;
    }

    @Override
    public java.lang.String[] getVorteileAlsString() {
        if (this.o00000 == null) {
            return new java.lang.String[0];
        }
        java.lang.String[] stringArray = new java.lang.String[this.o00000.\u00d500000().OO0000()];
        Iterator<public> iterator = this.o00000.\u00d500000().\u00d500000();
        int n = 0;
        while (iterator.hasNext()) {
            stringArray[n++] = iterator.next().oO0000();
        }
        return stringArray;
    }

    @Override
    public WaehrungsCollection getWaehrungen() {
        return WaehrungsFabrik.getInstance();
    }

    @Override
    public PluginZauber getZauber(java.lang.String string, java.lang.String string2) {
        if (this.o00000 == null) {
            return null;
        }
        return new String((KonkreterZauber)this.o00000.\u00d5o0000().super(string));
    }

    @Override
    public java.lang.String[][] getZauberAlsString() {
        if (this.o00000 == null) {
            return new java.lang.String[0][];
        }
        java.lang.String[][] stringArray = new java.lang.String[this.o00000.\u00d5o0000().\u00d300000()][2];
        for (int i2 = 0; i2 < this.o00000.\u00d5o0000().\u00d300000(); ++i2) {
            KonkreterZauber konkreterZauber = (KonkreterZauber)this.o00000.\u00d5o0000().\u00d200000(i2);
            stringArray[i2][0] = konkreterZauber.toString();
            stringArray[i2][1] = konkreterZauber.getRep().toString();
        }
        return stringArray;
    }

    @Override
    public int getZauberfertigkeitswert(PluginZauber pluginZauber) {
        if (this.o00000 != null) {
            try {
                return this.o00000.\u00d300000((oo0o_0)pluginZauber.getZauber());
            }
            catch (D d2) {
                // empty catch block
            }
        }
        return -9;
    }

    @Override
    public void setAktivenHeld(PluginHeld pluginHeld) {
        this.o00000 = (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)pluginHeld.getHeld();
    }
}

