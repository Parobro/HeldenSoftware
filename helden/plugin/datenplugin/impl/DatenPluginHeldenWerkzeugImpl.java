/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.E.F;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.Einstellungen;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.geld.WaehrungsFabrik;
import helden.framework.held.D;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.return_0;
import helden.framework.oooo.s_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.gui.allgemein.new.I;
import helden.plugin.datenplugin.DatenPluginAusreustungWerkzeug;
import helden.plugin.datenplugin.DatenPluginAusruestung;
import helden.plugin.datenplugin.DatenPluginEreignisWerkzeug;
import helden.plugin.datenplugin.DatenPluginGegenstand;
import helden.plugin.datenplugin.DatenPluginGeldBoerse;
import helden.plugin.datenplugin.DatenPluginHeld;
import helden.plugin.datenplugin.DatenPluginHeldenWerkzeug;
import helden.plugin.datenplugin.DatenPluginSonderfertigkeit;
import helden.plugin.datenplugin.DatenPluginSteigernWerkzeug;
import helden.plugin.datenplugin.DatenPluginTalent;
import helden.plugin.datenplugin.DatenPluginTreeNode;
import helden.plugin.datenplugin.DatenPluginVorteil;
import helden.plugin.datenplugin.DatenPluginWaehrungsCollection;
import helden.plugin.datenplugin.DatenPluginZauber;
import helden.plugin.datenplugin.DatenPluginZauberInfo;
import helden.plugin.datenplugin.impl.DatenPluginAusreustungWerkzeugImpl;
import helden.plugin.datenplugin.impl.DatenPluginAusruestungImpl;
import helden.plugin.datenplugin.impl.DatenPluginEreignisWerkzeugImpl;
import helden.plugin.datenplugin.impl.DatenPluginGegenstandImpl;
import helden.plugin.datenplugin.impl.DatenPluginGeldBoerseImpl;
import helden.plugin.datenplugin.impl.DatenPluginHeldImpl;
import helden.plugin.datenplugin.impl.DatenPluginSonderfertigkeitImpl;
import helden.plugin.datenplugin.impl.DatenPluginSteigernWerkzeugImpl;
import helden.plugin.datenplugin.impl.DatenPluginTalentImpl;
import helden.plugin.datenplugin.impl.DatenPluginTreeNodeImpl;
import helden.plugin.datenplugin.impl.DatenPluginVorteilImpl;
import helden.plugin.datenplugin.impl.DatenPluginWaehrungsCollectionImpl;
import helden.plugin.datenplugin.impl.DatenPluginZauberImpl;
import helden.plugin.datenplugin.impl.DatenPluginZauberInfoImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.swing.tree.TreePath;

public class DatenPluginHeldenWerkzeugImpl
implements DatenPluginHeldenWerkzeug {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000 = null;
    private DatenPluginHeld \u00d200000;
    private HashMap<KonkreterZauber, DatenPluginZauberInfo> Object;

    public DatenPluginHeldenWerkzeugImpl(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.o00000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00d200000 = new DatenPluginHeldImpl(this.o00000);
    }

    @Override
    public ArrayList<DatenPluginGegenstand> getAlleGegenstaende(boolean bl) {
        ArrayList<DatenPluginGegenstand> arrayList = new ArrayList<DatenPluginGegenstand>();
        Settings settings = Settings.getSettingByName("DSA 4.1");
        for (F f2 : O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().Object()) {
            if (!settings.contains(f2)) continue;
            arrayList.add(new DatenPluginGegenstandImpl(f2));
        }
        return arrayList;
    }

    @Override
    public ArrayList<DatenPluginSonderfertigkeit> getAlleSonderfertigkeiten(boolean bl) {
        ArrayList<DatenPluginSonderfertigkeit> arrayList = new ArrayList<DatenPluginSonderfertigkeit>();
        Settings settings = Settings.getSettingByName("DSA 4.1");
        Set<String> set = oooo_0.\u00f500000().keySet();
        for (String string : set) {
            P p2 = oooo_0.\u00f500000().get(string);
            if (!settings.contains(p2)) continue;
            arrayList.add(new DatenPluginSonderfertigkeitImpl(p2));
        }
        return arrayList;
    }

    @Override
    public ArrayList<DatenPluginTalent> getAlleTalente(boolean bl) {
        ArrayList<voidsuper> arrayList = N.floatsuper().\u00d400000();
        ArrayList<DatenPluginTalent> arrayList2 = new ArrayList<DatenPluginTalent>();
        Settings settings = Settings.getSettingByName("DSA 4.1");
        for (voidsuper voidsuper2 : arrayList) {
            if (bl) {
                if (!settings.contains(voidsuper2)) continue;
                for (voidsuper voidsuper3 : N.floatsuper().do()) {
                    if (!voidsuper2.equals(voidsuper3)) continue;
                }
            }
            arrayList2.add(new DatenPluginTalentImpl(voidsuper2));
        }
        return arrayList2;
    }

    @Override
    public ArrayList<DatenPluginVorteil> getAlleVorteile(boolean bl) {
        ArrayList<DatenPluginVorteil> arrayList = new ArrayList<DatenPluginVorteil>();
        Settings settings = Settings.getSettingByName("DSA 4.1");
        Iterator<public> iterator = helden.framework.C.K.\u00f400000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!settings.contains(public_)) continue;
            arrayList.add(new DatenPluginVorteilImpl(public_));
        }
        return arrayList;
    }

    @Override
    public ArrayList<DatenPluginZauber> getAlleZauber(boolean bl) {
        ArrayList<Zauber> arrayList = ZauberFabrik.getInstance().getAlleZauber();
        ArrayList<DatenPluginZauber> arrayList2 = new ArrayList<DatenPluginZauber>();
        Settings settings = Settings.getSettingByName("DSA 4.1");
        for (Zauber zauber : arrayList) {
            if (bl && !settings.contains(zauber)) continue;
            for (K k2 : zauber.getRepraesentationen()) {
                arrayList2.add(new DatenPluginZauberImpl(KonkreterZauber.getZauber(zauber, k2, ""), false));
            }
        }
        return arrayList2;
    }

    @Override
    public int getAnzahlAusruestungen() {
        return 3;
    }

    @Override
    public int getAttacke(DatenPluginTalent datenPluginTalent) {
        if (this.o00000 == null) {
            return -1;
        }
        if (datenPluginTalent.getTalentart().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.toString())) {
            E e = (E)datenPluginTalent.getTalent();
            return this.o00000.o00000(e);
        }
        return -1;
    }

    @Override
    public DatenPluginAusreustungWerkzeug getAusreustungWerkzeug(DatenPluginHeld datenPluginHeld) {
        return new DatenPluginAusreustungWerkzeugImpl((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)datenPluginHeld.getHeldObject());
    }

    @Override
    public DatenPluginAusruestung getAusruestung(int n) {
        if (this.o00000 == null) {
            return null;
        }
        if (this.o00000.o00000(n) == null) {
            return null;
        }
        return new DatenPluginAusruestungImpl(this.o00000.o00000(n));
    }

    @Override
    public String getBasisKomplexitaet(DatenPluginZauber datenPluginZauber) {
        return ((KonkreterZauber)datenPluginZauber.getZauber()).getKategorie(false).toString();
    }

    @Override
    public HashMap<String, String> getDatenVomHeld(DatenPluginHeld datenPluginHeld) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            for (Map.Entry entry : return_0.o00000("datenplugin." + this.o00000.\u00f4o0000() + ".").entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        catch (IOException iOException) {
            helden.framework.held.object.oooo_0.o00000(iOException);
            return null;
        }
        return hashMap;
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
    public DatenPluginEreignisWerkzeug getEreignisWerkzeug(DatenPluginHeld datenPluginHeld) {
        return new DatenPluginEreignisWerkzeugImpl((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)datenPluginHeld.getHeldObject());
    }

    @Override
    public ArrayList<DatenPluginGegenstand> getGegenstaende() {
        Iterator<F[]> iterator = this.o00000.\u00d8o0000().new().iterator();
        ArrayList<DatenPluginGegenstand> arrayList = new ArrayList<DatenPluginGegenstand>();
        while (iterator.hasNext()) {
            F[] fArray;
            for (F f2 : fArray = iterator.next()) {
                if (f2 == null) continue;
                arrayList.add(new DatenPluginGegenstandImpl(f2));
            }
        }
        return arrayList;
    }

    @Override
    public DatenPluginGeldBoerse getGeldBoerse() {
        return new DatenPluginGeldBoerseImpl(this.o00000.\u00f400000());
    }

    @Override
    public int getGeschwindigkeit() {
        if (this.o00000 == null) {
            return -99;
        }
        return this.o00000.OO0000().returnsuper();
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
    public ArrayList<String> getInventarAlsString() {
        Iterator<F> iterator = this.o00000.\u00d8o0000().\u00d400000().iterator();
        ArrayList<String> arrayList = new ArrayList<String>();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().OO0000());
        }
        return arrayList;
    }

    @Override
    public String getKommentar(DatenPluginSonderfertigkeit datenPluginSonderfertigkeit) {
        for (P p2 : this.o00000.\u00f5O0000()) {
            if (!p2.toString().equals(datenPluginSonderfertigkeit.toString())) continue;
            return this.o00000.Stringsuper().o00000(p2.toString());
        }
        return "";
    }

    @Override
    public String getKommentar(DatenPluginVorteil datenPluginVorteil) {
        Iterator<public> iterator = this.o00000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.toString().equals(datenPluginVorteil.getName())) continue;
            return this.o00000.Stringsuper().o00000(public_.toString());
        }
        return "";
    }

    @Override
    public String getLernKomplexitaet(DatenPluginZauber datenPluginZauber) {
        if (this.o00000 != null && datenPluginZauber != null) {
            String string = this.o00000.new((KonkreterZauber)datenPluginZauber.getZauber()).toString();
            if (string.equals("A+")) {
                s_0 s_02 = this.o00000.new((KonkreterZauber)datenPluginZauber.getZauber());
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
    public int getParade(DatenPluginTalent datenPluginTalent) {
        if (this.o00000 == null) {
            return -1;
        }
        if (datenPluginTalent.getTalentart().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.toString())) {
            E e = (E)datenPluginTalent.getTalent();
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

    @Override
    public DatenPluginHeld getSelectesHeld() {
        return this.\u00d200000;
    }

    @Override
    public DatenPluginSonderfertigkeit getSonderfertigkeit(String string) {
        if (this.o00000 == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.o00000.\u00f5O0000().newsuper(); ++i2) {
            P p2 = this.o00000.\u00f5O0000().\u00d2o0000().get(i2);
            if (!string.equals(p2.toString())) continue;
            return new DatenPluginSonderfertigkeitImpl(p2);
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
    public String getSprachKomplexitaet(DatenPluginTalent datenPluginTalent) {
        if (datenPluginTalent.getTalent() instanceof G) {
            return "" + ((G)datenPluginTalent.getTalent()).\u00f5\u00f40000();
        }
        return "";
    }

    @Override
    public DatenPluginSteigernWerkzeug getSteigernWerkzeug(DatenPluginHeld datenPluginHeld) {
        return new DatenPluginSteigernWerkzeugImpl((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)datenPluginHeld.getHeldObject());
    }

    @Override
    public DatenPluginTalent getTalent(String string) {
        if (this.o00000 == null) {
            return null;
        }
        return new DatenPluginTalentImpl((oo0o_0)this.o00000.\u00f8O0000().super(string));
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
    public int getTalentwert(DatenPluginTalent datenPluginTalent) {
        if (this.o00000 != null) {
            try {
                return this.o00000.\u00d300000((oo0o_0)datenPluginTalent.getTalent());
            }
            catch (D d2) {
                // empty catch block
            }
        }
        return -9;
    }

    @Override
    public DatenPluginTreeNode getTreeRoot() {
        return new DatenPluginTreeNodeImpl((I)Einstellungen.getInstance().getTreeModel().getRoot());
    }

    @Override
    public int getVerfuegbareAbenteuerpunkte() {
        if (this.o00000 == null) {
            return -1;
        }
        return this.o00000.\u00d400000();
    }

    @Override
    public DatenPluginVorteil getVorteil(String string) {
        if (this.o00000 == null) {
            return null;
        }
        Iterator<public> iterator = this.o00000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.oO0000().equals(string)) continue;
            return new DatenPluginVorteilImpl(public_);
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
    public DatenPluginWaehrungsCollection getWaehrungen() {
        return new DatenPluginWaehrungsCollectionImpl(WaehrungsFabrik.getInstance());
    }

    @Override
    public DatenPluginZauber getZauber(String string, String string2) {
        if (this.o00000 == null) {
            return null;
        }
        KonkreterZauber konkreterZauber = (KonkreterZauber)this.o00000.\u00d5o0000().super(string);
        return new DatenPluginZauberImpl(konkreterZauber, this.o00000.\u00d5o0000().\u00d200000(konkreterZauber));
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

    @Override
    public DatenPluginZauberInfo getZauberInfo(DatenPluginZauber datenPluginZauber) {
        if (this.Object != null) {
            return this.Object.get(datenPluginZauber.getZauber());
        }
        return null;
    }

    @Override
    public boolean legeDatenZumHeld(HashMap<String, String> hashMap, DatenPluginHeld datenPluginHeld) {
        try {
            Properties properties = new Properties();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                properties.put(entry.getKey(), entry.getValue());
            }
            return_0.\u00d200000("datenplugin." + this.o00000.\u00f4o0000() + ".", properties);
        }
        catch (IOException iOException) {
            helden.framework.held.object.oooo_0.o00000(iOException);
            return false;
        }
        return true;
    }

    @Override
    public void setAktivenHeld(DatenPluginHeld datenPluginHeld) {
        this.o00000 = (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)datenPluginHeld.getHeldObject();
        this.\u00d200000 = datenPluginHeld;
        if (this.o00000 != null) {
            this.o00000.OO0000().String(this.o00000);
            ArrayList<KonkreterZauber> arrayList = null;
            this.Object = new HashMap();
            if (this.o00000.\u00d5o0000().\u00d300000() > 0) {
                arrayList = new ArrayList<KonkreterZauber>(this.o00000.\u00d5o0000().\u00d200000());
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    this.Object.put(arrayList.get(i2), new DatenPluginZauberInfoImpl(arrayList.get(i2), this.o00000));
                }
            }
        }
    }

    @Override
    public void setKommentar(DatenPluginSonderfertigkeit datenPluginSonderfertigkeit, String string) {
        for (P p2 : this.o00000.\u00f5O0000()) {
            if (!p2.toString().equals(datenPluginSonderfertigkeit.toString())) continue;
            this.o00000.Stringsuper().o00000(p2.toString(), string);
        }
    }

    @Override
    public void setKommentar(DatenPluginVorteil datenPluginVorteil, String string) {
        Iterator<public> iterator = this.o00000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.toString().equals(datenPluginVorteil.getName())) continue;
            this.o00000.Stringsuper().o00000(public_.toString(), string);
        }
    }

    @Override
    public boolean wirdGegenstandBenutzt(DatenPluginGegenstand datenPluginGegenstand) {
        if (this.o00000 != null && (this.o00000.o00000(0).\u00d200000((F)datenPluginGegenstand.getObject()) || this.o00000.o00000(1).\u00d200000((F)datenPluginGegenstand.getObject()) || this.o00000.o00000(2).\u00d200000((F)datenPluginGegenstand.getObject()))) {
            return true;
        }
        return this.o00000 == null;
    }
}

