/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin3.A;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.E.F;
import helden.framework.Einstellungen;
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
import helden.framework.oooo.s_0;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.allgemein.new.I;
import helden.plugin.werteplugin.A.A;
import helden.plugin.werteplugin.A.C;
import helden.plugin.werteplugin.A.G;
import helden.plugin.werteplugin.A.OO0O;
import helden.plugin.werteplugin.A.OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.plugin.werteplugin.A.oooO;
import helden.plugin.werteplugin.PluginAusruestung;
import helden.plugin.werteplugin.PluginHeld;
import helden.plugin.werteplugin.PluginSonderfertigkeit;
import helden.plugin.werteplugin.PluginTalent;
import helden.plugin.werteplugin.PluginVorteil;
import helden.plugin.werteplugin.PluginZauberInfo;
import helden.plugin.werteplugin2.PluginAusruestung2;
import helden.plugin.werteplugin2.PluginGegenstand;
import helden.plugin.werteplugin2.PluginTreeNode;
import helden.plugin.werteplugin2.oOOO.H;
import helden.plugin.werteplugin3.A.oOOO;
import helden.plugin.werteplugin3.PluginHeldenWerteWerkzeug3;
import helden.plugin.werteplugin3.PluginZauber3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.tree.TreePath;

public class B
implements PluginHeldenWerteWerkzeug3 {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000;
    private A Object;
    private HashMap<KonkreterZauber, PluginZauberInfo> \u00d200000 = new HashMap();

    public B(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 != null) {
            this.Object = new A(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
            this.\u00d200000 = new HashMap();
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
    public PluginAusruestung2 getAusruestung2() {
        if (this.o00000 == null) {
            return null;
        }
        return new helden.plugin.werteplugin2.oOOO.E(this.o00000.OO0000());
    }

    @Override
    public String getBasisKomplexitaet(PluginZauber3 pluginZauber3) {
        return ((KonkreterZauber)pluginZauber3.getZauber()).getKategorie(false).toString();
    }

    @Override
    public String[] getEigenschaftsbezeichner() {
        String[] stringArray = new String[this.o00000.\u00d3\u00d30000().\u00d200000().size()];
        for (int i2 = 0; i2 < this.o00000.\u00d3\u00d30000().\u00d200000().size(); ++i2) {
            stringArray[i2] = ((b_0)this.o00000.\u00d3\u00d30000().\u00d200000().get(i2)).toString();
        }
        return stringArray;
    }

    @Override
    public int getEigenschaftswert(String string) {
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
    public int getEingestzteAbenteuerpunkte() {
        if (this.o00000 == null) {
            return -1;
        }
        return this.o00000.o\u00d30000() - this.o00000.\u00d400000();
    }

    @Override
    public PluginGegenstand[] getGegenstand(String string) {
        F[] fArray = this.o00000.\u00d8o0000().\u00d300000(string);
        if (fArray == null) {
            return null;
        }
        PluginGegenstand[] pluginGegenstandArray = new PluginGegenstand[fArray.length];
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            if (fArray[i2] == null) continue;
            pluginGegenstandArray[i2] = new H(fArray[i2]);
        }
        return pluginGegenstandArray;
    }

    @Override
    public GeldBoerse getGeldBoerse() {
        return this.o00000.\u00f400000();
    }

    @Override
    public int getGeschwindigkeit() {
        if (this.o00000 == null) {
            return -99;
        }
        return this.o00000.o00000(b_0.O\u00f4\u00d2000);
    }

    @Override
    public String[] getGruppenPath() {
        TreePath treePath = Einstellungen.getInstance().getSelectedHeldPath();
        if (treePath != null) {
            String[] stringArray = new String[treePath.getPathCount()];
            for (int i2 = 0; i2 < treePath.getPathCount(); ++i2) {
                stringArray[i2] = ((I)treePath.getPath()[i2]).o00000();
            }
            return stringArray;
        }
        return new String[0];
    }

    @Override
    public String getHeldenID() {
        if (this.o00000 != null) {
            return this.o00000.\u00f4o0000();
        }
        return null;
    }

    @Override
    public ArrayList<String> getHeldenInventarAlsString() {
        Iterator<F> iterator = this.o00000.\u00d8o0000().\u00d400000().iterator();
        ArrayList<String> arrayList = new ArrayList<String>();
        while (iterator.hasNext()) {
            F f2 = iterator.next();
            if (arrayList.contains(f2.toString())) continue;
            arrayList.add(f2.toString());
        }
        return arrayList;
    }

    @Override
    public ArrayList<String> getInventarAlsString() {
        Iterator<F> iterator = this.o00000.\u00d8o0000().\u00d400000().iterator();
        ArrayList<String> arrayList = new ArrayList<String>();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().OO0000());
        }
        return arrayList;
    }

    @Override
    public String getKommentar(PluginSonderfertigkeit pluginSonderfertigkeit) {
        for (P p2 : this.o00000.\u00f5O0000()) {
            if (!p2.toString().equals(pluginSonderfertigkeit.toString())) continue;
            return this.o00000.Stringsuper().o00000(p2.toString());
        }
        return "";
    }

    @Override
    public String getKommentar(PluginVorteil pluginVorteil) {
        Iterator<public> iterator = this.o00000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.toString().equals(pluginVorteil.getName())) continue;
            return this.o00000.Stringsuper().o00000(public_.toString());
        }
        return "";
    }

    @Override
    public String getLernKomplexitaet(PluginZauber3 pluginZauber3) {
        if (this.o00000 != null && pluginZauber3 != null) {
            String string = this.o00000.new((KonkreterZauber)pluginZauber3.getZauber()).toString();
            if (string.equals("A+")) {
                s_0 s_02 = this.o00000.new((KonkreterZauber)pluginZauber3.getZauber());
                int n = 1;
                while (s_02.\u00d400000() < 0) {
                    ++n;
                    s_02 = s_02.\u00d300000();
                }
                string = "A";
                string = n > 1 ? "A" + n : "A+";
            }
            return string;
        }
        return null;
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
    public String getPfadZumPortrait() {
        if (this.o00000 != null) {
            return this.o00000.forsuper();
        }
        return null;
    }

    @Override
    public int getRassenGeschwindigkeit() {
        return this.o00000.o00000(b_0.O\u00f4\u00d2000);
    }

    public A o00000() {
        return this.Object;
    }

    @Override
    public PluginSonderfertigkeit getSonderfertigkeit(String string) {
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
    public String[] getSonderfertigkeitenAlsString() {
        if (this.o00000 == null) {
            return new String[0];
        }
        String[] stringArray = new String[this.o00000.\u00f5O0000().newsuper()];
        for (int i2 = 0; i2 < this.o00000.\u00f5O0000().newsuper(); ++i2) {
            P p2 = this.o00000.\u00f5O0000().\u00d2o0000().get(i2);
            stringArray[i2] = p2.toString();
        }
        return stringArray;
    }

    @Override
    public String getSprachKomplexitaet(PluginTalent pluginTalent) {
        if (pluginTalent.getTalent() instanceof helden.framework.OoOO.G) {
            return "" + ((helden.framework.OoOO.G)pluginTalent.getTalent()).\u00f5\u00f40000();
        }
        return "";
    }

    @Override
    public PluginTalent getTalent(String string) {
        if (this.o00000 == null) {
            return null;
        }
        return new OO0O((oo0o_0)this.o00000.\u00f8O0000().super(string));
    }

    @Override
    public String[] getTalenteAlsString() {
        if (this.o00000 == null) {
            return new String[0];
        }
        String[] stringArray = new String[this.o00000.\u00f8O0000().\u00d300000()];
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
    public PluginTreeNode getTreeRoot() {
        return new helden.plugin.werteplugin2.oOOO.B((I)Einstellungen.getInstance().getTreeModel().getRoot());
    }

    @Override
    public int getVerfuegbareAbenteuerpunkte() {
        if (this.o00000 == null) {
            return -1;
        }
        return this.o00000.\u00d400000();
    }

    @Override
    public PluginVorteil getVorteil(String string) {
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
    public String[] getVorteileAlsString() {
        if (this.o00000 == null) {
            return new String[0];
        }
        String[] stringArray = new String[this.o00000.\u00d500000().OO0000()];
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
    public PluginZauber3 getZauber(String string, String string2) {
        if (this.o00000 == null) {
            return null;
        }
        KonkreterZauber konkreterZauber = (KonkreterZauber)this.o00000.\u00d5o0000().super(string);
        return new oOOO(konkreterZauber, this.o00000.\u00d5o0000().\u00d200000(konkreterZauber));
    }

    @Override
    public String[][] getZauberAlsString() {
        if (this.o00000 == null) {
            return new String[0][];
        }
        String[][] stringArray = new String[this.o00000.\u00d5o0000().\u00d300000()][2];
        for (int i2 = 0; i2 < this.o00000.\u00d5o0000().\u00d300000(); ++i2) {
            KonkreterZauber konkreterZauber = (KonkreterZauber)this.o00000.\u00d5o0000().\u00d200000(i2);
            stringArray[i2][0] = konkreterZauber.toString();
            stringArray[i2][1] = konkreterZauber.getRep().toString();
        }
        return stringArray;
    }

    public int o00000(PluginZauber3 pluginZauber3) {
        if (this.o00000 != null) {
            try {
                return this.o00000.\u00d300000((oo0o_0)pluginZauber3.getZauber());
            }
            catch (D d2) {
                // empty catch block
            }
        }
        return -9;
    }

    @Override
    public PluginZauberInfo getZauberInfo(PluginZauber3 pluginZauber3) {
        if (this.\u00d200000 != null) {
            return this.\u00d200000.get(pluginZauber3.getZauber());
        }
        return null;
    }

    @Override
    public void setAktivenHeld(PluginHeld pluginHeld) {
        this.o00000 = (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)pluginHeld.getHeld();
        if (this.o00000 != null) {
            this.o00000.OO0000().String(this.o00000);
            ArrayList<KonkreterZauber> arrayList = null;
            this.\u00d200000 = new HashMap();
            if (this.o00000.\u00d5o0000().\u00d300000() > 0) {
                arrayList = new ArrayList<KonkreterZauber>(this.o00000.\u00d5o0000().\u00d200000());
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    this.\u00d200000.put(arrayList.get(i2), new OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(arrayList.get(i2), this.o00000));
                }
            }
        }
    }
}

