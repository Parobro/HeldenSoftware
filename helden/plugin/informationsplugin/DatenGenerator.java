/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.informationsplugin;

import helden.Version;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.D.P;
import helden.framework.D.public;
import helden.framework.E.A;
import helden.framework.E.C.void;
import helden.framework.E.F;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.Einstellungen;
import helden.framework.HeldenMath;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.e.oooo_0;
import helden.framework.held.B;
import helden.framework.held.K;
import helden.framework.held.Object.private;
import helden.framework.held.oO0O;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberInfos;
import helden.plugin.informationsplugin.DatenContainer;
import helden.plugin.informationsplugin.DatenContainerImpl;
import helden.plugin.informationsplugin.EinzelInformationImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class DatenGenerator {
    private static DatenContainer o00000;
    private static K new;

    public static void addEinstellungen() {
        EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
        Map<String, String> map = einzelInformationImpl.getInfos();
        map.put("bereich", "proxy");
        map.put("port", Einstellungen.getInstance().getProxyPort());
        map.put("pwd", Einstellungen.getInstance().getProxyPwd());
        map.put("server", Einstellungen.getInstance().getProxyServer());
        map.put("user", Einstellungen.getInstance().getProxyUser());
        map.put("authentifikation", String.valueOf(Einstellungen.getInstance().getProxyAuthentifikation()));
        map.put("proxyverwenden", String.valueOf(Einstellungen.getInstance().getProxyVerwenden()));
        o00000.getEinstellungen().add(einzelInformationImpl);
    }

    public static DatenContainer genDaten(K k2) {
        new = k2;
        o00000 = new DatenContainerImpl();
        DatenGenerator.o00000();
        DatenGenerator.if();
        DatenGenerator.new();
        DatenGenerator.return();
        DatenGenerator.\u00d400000();
        DatenGenerator.\u00f500000();
        DatenGenerator.\u00d300000();
        DatenGenerator.\u00d800000();
        DatenGenerator.\u00d500000();
        DatenGenerator.\u00f400000();
        DatenGenerator.addEinstellungen();
        return o00000;
    }

    private static void \u00d800000() {
        for (int i2 = 0; i2 < 3; ++i2) {
            helden.framework.E.C.E e;
            if (new.OO0000().\u00d500000(i2 + 1) == null || (e = (helden.framework.E.C.E)new.OO0000().\u00d500000(i2 + 1).o00000(helden.framework.E.B.class, 0)) == null) continue;
            oO0O oO0O2 = new.OO0000();
            EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
            Map<String, String> map = einzelInformationImpl.getInfos();
            String string = oO0O2.\u00d500000(i2 + 1).OO0000();
            map.put("name", string);
            map.put("spalte2", oO0O2.\u00f500000(i2 + 1).super().O\u00d80000() + "/" + oO0O2.\u00f500000(i2 + 1).super().superclass());
            map.put("reichweite", e.\u00d6o0000().toString());
            map.put("tp", String.valueOf(e.\u00d8o0000().toString()));
            map.put("tpmod", e.\u00f6o0000().toString());
            map.put("at", String.valueOf(oO0O2.null(i2)));
            map.put("bereiche", "fernkampf");
            o00000.getWaffen().add(einzelInformationImpl);
        }
    }

    private static void \u00d400000() {
        for (F[] fArray : new.\u00d8o0000().new()) {
            for (int i2 = 0; i2 < new.\u00d8o0000().\u00d300000(); ++i2) {
                if (fArray[i2] == null) continue;
                F f2 = fArray[i2];
                EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
                Map<String, String> map = einzelInformationImpl.getInfos();
                map.put("name", f2.OO0000());
                map.put("anzahl", String.valueOf(f2.\u00f500000()));
                map.put("grundlage", f2.toString());
                map.put("gewicht", String.valueOf(f2.Object()));
                String string = "";
                Iterator<A> iterator = f2.\u00d500000().iterator();
                while (iterator.hasNext()) {
                    A a2 = iterator.next();
                    string = string + helden.framework.E.B.super(a2);
                    if (!iterator.hasNext()) continue;
                    string = string + ",";
                }
                if (string.equals("")) {
                    string = "sonst";
                }
                map.put("arten", string);
                o00000.getGegenstaende().add(einzelInformationImpl);
            }
        }
    }

    private static void \u00d300000() {
        for (int i2 = 0; i2 < 5; ++i2) {
            oooo_0 oooo_02;
            if (new.OO0000().\u00f8O0000(i2 + 1) == null || (oooo_02 = new.OO0000().\u00d3O0000(i2 + 1)) == null) continue;
            oO0O oO0O2 = new.OO0000();
            EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
            Map<String, String> map = einzelInformationImpl.getInfos();
            String string = oO0O2.\u00f8O0000(i2 + 1).OO0000();
            if (oO0O2.\u00d800000(i2 + 1) > 0) {
                string = string + "(S" + oO0O2.\u00d800000(i2 + 1) + ")";
            }
            map.put("name", string);
            map.put("spalte2", oooo_02.o00000().O\u00d80000() + "/" + oooo_02.o00000().superclass());
            String string2 = "";
            for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : oooo_02.\u00d200000().\u00d8\u00d50000()) {
                string2 = string2 + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d400000() + " ";
            }
            map.put("dk", string2);
            map.put("tp", String.valueOf(oooo_02.\u00d200000().\u00d500000()));
            map.put("tpkk", String.valueOf(oooo_02.\u00d200000().\u00d200000()));
            map.put("ini", String.valueOf(oooo_02.\u00d200000().\u00d300000()));
            map.put("wm", String.valueOf(oooo_02.\u00d200000().String()));
            map.put("at", String.valueOf(oO0O2.String(i2)));
            try {
                map.put("pa", String.valueOf(oO0O2.\u00d200000(i2)));
            }
            catch (B b) {
                map.put("pa", "");
            }
            int n = new.o00000(b_0.privatedosuper);
            String string3 = oooo_02.\u00d200000().\u00d500000().o00000(oooo_02.\u00d200000().\u00d200000().o00000(n)).toString();
            map.put("tpinkl", String.valueOf(string3));
            map.put("bereiche", "nahkampf");
            map.put("bfmin", String.valueOf(oooo_02.\u00d200000().o00000().\u00d400000()));
            map.put("bfakt", String.valueOf(oooo_02.\u00d200000().o00000().\u00d300000()));
            o00000.getWaffen().add(einzelInformationImpl);
        }
    }

    private static void \u00f400000() {
        for (int i2 = 0; i2 < 5; ++i2) {
            F f2 = new.OO0000().\u00f800000(i2 + 1);
            if (f2 == null) {
                return;
            }
            EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
            Map<String, String> map = einzelInformationImpl.getInfos();
            map.put("name", f2.OO0000());
            map.put("grundlage", f2.toString());
            helden.framework.E.C.B b = (helden.framework.E.C.B)f2.o00000(helden.framework.E.B.OO0000, 0);
            if (b == null) {
                return;
            }
            if (b.\u00d3O0000()) {
                map.put("be", "*");
                map.put("rs", "*");
            } else {
                map.put("be", String.valueOf(b.\u00f600000()));
                map.put("rs", String.valueOf(b.\u00d2O0000()));
            }
            map.put("bereiche", "R\u00fcstung");
            o00000.getWaffen().add(einzelInformationImpl);
        }
    }

    private static void \u00d500000() {
        for (int i2 = 0; i2 < 2; ++i2) {
            if (new.OO0000().\u00f5O0000(i2 + 1) == null) continue;
            void void_ = (void)new.OO0000().\u00f5O0000(i2 + 1).o00000(helden.framework.E.B.\u00d300000, 0);
            EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
            Map<String, String> map = einzelInformationImpl.getInfos();
            map.put("name", new.OO0000().\u00f5O0000(i2 + 1).OO0000());
            map.put("ini", String.valueOf(void_.nullnew()));
            map.put("mod", void_.\u00f5\u00d20000().toString());
            map.put("pa", String.valueOf(new.OO0000().\u00d600000(i2)));
            map.put("bfmin", String.valueOf(void_.\u00d8\u00d20000().\u00d400000()));
            map.put("bfakt", String.valueOf(void_.\u00d8\u00d20000().\u00d300000()));
            map.put("bf", String.valueOf(void_.\u00d8\u00d20000().\u00d400000()) + "/" + String.valueOf(void_.\u00d8\u00d20000().\u00d300000()));
            String string = helden.framework.E.B.super(new.OO0000().\u00f5O0000(i2 + 1).float());
            map.put("typ", string);
            map.put("bereiche", "schild");
            o00000.getWaffen().add(einzelInformationImpl);
        }
    }

    private static void \u00f500000() {
        Iterator<P> iterator = new.\u00f5O0000().iterator();
        while (iterator.hasNext()) {
            EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
            Map<String, String> map = einzelInformationImpl.getInfos();
            P p2 = iterator.next();
            String string = p2.toString();
            map.put("nameausfuehrlich", string);
            if (string.startsWith("Liturgie: ")) {
                string = string.substring(10);
            } else if (string.startsWith("Merkmalskenntnis: ")) {
                string = string.substring(18);
            } else if (string.startsWith("Repr\u00e4sentation: ")) {
                string = string.substring(16);
            } else if (string.startsWith("Ritual: ")) {
                string = string.substring(8);
            }
            map.put("name", string);
            String string2 = string;
            String string3 = new.Stringsuper().o00000(p2.toString());
            if (string3 != null && !string3.equals("")) {
                string2 = string2 + " (" + string3 + ")";
                map.put("kommentar", string3);
            } else {
                map.put("kommentar", "");
            }
            map.put("namemitkommentar", string2);
            string2 = "";
            if (p2.\u00f8O0000()) {
                string2 = string2 + "Talentspezialisierung,";
            }
            if (p2.\u00f5O0000()) {
                string2 = string2 + "Gel\u00e4ndekunde,";
            }
            if ((p2.\u00f5O0000() || p2.\u00d400000() == 0) && !p2.\u00f8O0000()) {
                string2 = string2 + "Sonst,";
            }
            if (p2.oo0000()) {
                string2 = string2 + "Nahkampf,";
                string2 = string2 + "Kampf,";
            }
            if (p2.\u00f4o0000()) {
                string2 = string2 + "Fernkampf,";
                string2 = string2 + "Kampf,";
            }
            if (p2.\u00d4o0000()) {
                string2 = string2 + "Man\u00f6ver,";
                string2 = string2 + "Kampf,";
            }
            if (p2.\u00f4O0000()) {
                string2 = string2 + "Magisch,";
                string2 = string2 + "Repr\u00e4sentation,";
            }
            if (p2.if()) {
                string2 = string2 + "Magisch,";
                string2 = string2 + "Merkmalskenntnis,";
            }
            if (p2.\u00d400000() == 12) {
                string2 = string2 + "Schamanenritual,";
            }
            if (p2.privatesuper() && (p2.returnnew() || p2.\u00f800000()) || p2.\u00d400000() == 12) {
                string2 = string2 + "Magisch,";
                string2 = string2 + "Ritual,";
            }
            if (p2.\u00d4\u00d20000()) {
                string2 = string2 + "Magisch,";
                string2 = string2 + "SonstMagisch,";
            }
            if (!(!p2.privatesuper() || p2.\u00f4O0000() || p2.\u00f800000() || p2.returnnew() || p2.\u00d4\u00d20000() || p2.if() || p2.\u00f4O0000() || p2.new())) {
                string2 = string2 + "Magisch,";
                string2 = string2 + "SonstMagisch,";
            }
            if (p2.new()) {
                string2 = string2 + "Magisch,";
                string2 = string2 + "Ritualkenntis,";
            }
            if (p2.\u00d3O0000()) {
                string2 = string2 + "Geweiht,";
                string2 = string2 + "Liturgie,";
                public public_ = (public)p2;
                map.put("grad", String.valueOf(public_.whilenew()));
            }
            if (p2.\u00d300000() && !p2.\u00d3O0000()) {
                if (p2.\u00d500000()) {
                    string2 = string2 + "Geweiht,";
                    string2 = string2 + "Liturgiekenntnis,";
                } else {
                    string2 = string2 + "SonstGeweiht,";
                }
            }
            if (string2.equals("")) {
                private.\u00d200000("Kein Bereich f\u00fcr " + p2.toString(), "sven");
                string2 = string2 + "Sonst,";
            }
            string2 = string2.substring(0, string2.length() - 1);
            map.put("bereiche", string2);
            o00000.getSF().add(einzelInformationImpl);
        }
    }

    private static void o00000() {
        Iterator<voidsuper> iterator = new.\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2;
            oo0o_0 oo0o_02 = iterator.next();
            EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
            Map<String, String> map = einzelInformationImpl.getInfos();
            String string = "";
            if (oo0o_02.getArt().toString().equals("Sprachen")) {
                string = oo0o_02.toString().substring(16);
            } else if (oo0o_02.getArt().toString().equals("Schriften")) {
                string = "L/S " + oo0o_02.toString().substring(16);
            } else if (oo0o_02.getArt().toString().equals("Ritualkenntnis")) {
                string = oo0o_02.toString().substring(16);
            } else if (oo0o_02.toString().startsWith("Liturgiekenntnis (")) {
                string = oo0o_02.toString().substring(18);
                string = string.substring(0, string.length() - 1);
            } else {
                string = oo0o_02.toString();
            }
            map.put("name", string);
            String string2 = "";
            if (new.\u00f8O0000().\u00d300000((voidsuper)oo0o_02)) {
                string2 = string2 + " (M+)";
            }
            if (new.\u00f8O0000().super((voidsuper)oo0o_02)) {
                string2 = string2 + " (M-)";
            }
            if (new.o00000(I.while) && ((M)new.\u00d500000().\u00d300000(I.while)).\u00f400000(oo0o_02)) {
                string2 = string2 + " (MH)";
            }
            if (new.\u00f8O0000().super(oo0o_02, new.\u00d500000())) {
                string2 = string2 + " (L)";
            }
            if ((voidsuper2 = (voidsuper)oo0o_02).\u00f5\u00d60000()) {
                string2 = string2 + " (B)";
            }
            map.put("basis", "" + voidsuper2.\u00f5\u00d60000());
            string2 = string2 + DatenGenerator.o00000((voidsuper)oo0o_02);
            map.put("nameausfuehrlich", string + " " + string2);
            try {
                string = String.valueOf(new.\u00d300000(oo0o_02));
            }
            catch (Exception exception) {
                string = "?";
            }
            map.put("wert", string);
            string = oo0o_02.getTalentprobe().o00000(0).O\u00d60000();
            string = string + "/";
            string = string + oo0o_02.getTalentprobe().o00000(1).O\u00d60000();
            string = string + "/";
            string = string + oo0o_02.getTalentprobe().o00000(2).O\u00d60000();
            map.put("probe", string);
            map.put("nameausfuehrlichmitprobe", map.get("nameausfuehrlich") + "(" + string + ")");
            if (oo0o_02 instanceof E) {
                int n = new.o00000((E)oo0o_02);
                if (n != 0) {
                    map.put("at", String.valueOf(n));
                }
                if ((n = new.new((E)oo0o_02)) != 0) {
                    map.put("pa", String.valueOf(n));
                }
            }
            string = "";
            if (oo0o_02 instanceof G) {
                map.put("sprachkomplexit\u00e4t", String.valueOf(((G)oo0o_02).\u00f5\u00f40000()));
            }
            if (oo0o_02 instanceof voidsuper) {
                map.put("behinderung", voidsuper2.superclass());
                map.put("mirakel+", String.valueOf(new.\u00f8O0000().\u00d300000(voidsuper2)));
                map.put("mirakel-", String.valueOf(new.\u00f8O0000().super(voidsuper2)));
            }
            map.put("bereiche", oo0o_02.getArt().toString());
            map.put("komplexit\u00e4t", oo0o_02.getKategorie(false).toString());
            map.put("lernkomplexit\u00e4t", new.new(oo0o_02).toString());
            o00000.getTalente().add(einzelInformationImpl);
        }
    }

    private static void new() {
        Iterator<helden.framework.C.public> iterator = new.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            helden.framework.C.public public_ = iterator.next();
            EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
            Map<String, String> map = einzelInformationImpl.getInfos();
            map.put("name", public_.oO0000());
            String string = public_.oO0000();
            String string2 = new.Stringsuper().o00000(public_.toString());
            if (string2 != null && !string2.equals("")) {
                string = string + " (" + string2 + ")";
                map.put("kommentar", string2);
            } else {
                map.put("kommentar", "");
            }
            map.put("namemitkommentar", string);
            map.put("istvorteil", String.valueOf(!public_.\u00d500000()));
            map.put("istnachteil", String.valueOf(public_.\u00d500000()));
            String string3 = "";
            if (public_.\u00f4O0000().Object()) {
                string3 = "Sonst";
            } else if (public_.\u00f4O0000().\u00d200000()) {
                string3 = "Magisch";
            } else if (public_.\u00f4O0000().o00000()) {
                string3 = "Geweiht";
            }
            if (public_.equals(I.\u00f5\u00f6O000)) {
                string3 = string3 + ",BEGABUNGMERKMAL";
            }
            if (public_.equals(I.\u00d8\u00f6O000)) {
                string3 = string3 + ",BEGABUNGRITUAL";
            }
            if (public_.equals(I.\u00f4\u00d20000)) {
                string3 = string3 + ",BEGABUNGTALENT";
            }
            if (public_.equals(I.\u00d5o0000)) {
                string3 = string3 + ",BEGABUNGTALENTGRUPPE";
            }
            if (public_.equals(I.O\u00d6o000)) {
                string3 = string3 + ",BEGABUNGFUERZAUBER";
            }
            if (public_.equals(I.O\u00d4O000)) {
                string3 = string3 + ",UNF\u00c4HIGKEITMERKMAL";
            }
            if (public_.equals(I.fordo)) {
                string3 = string3 + ",UNF\u00c4HIGKEITTALENT";
            }
            if (public_.equals(I.\u00d8\u00f8O000)) {
                string3 = string3 + ",UNF\u00c4HIGKEITTALENTGRUPPE";
            }
            map.put("bereiche", string3);
            o00000.getVorteile().add(einzelInformationImpl);
        }
    }

    private static void return() {
        int n;
        b_0 b_02;
        Map<String, String> map = o00000.getWerte();
        map.put("magisch", String.valueOf(new.oo0000()));
        map.put("geweiht", String.valueOf(new.\u00d8\u00d20000()));
        map.put("name", new.\u00f5o0000());
        map.put("rasse", new.o\u00d20000().toString());
        map.put("profession", new.\u00d800000().toString());
        map.put("professionkurz", DatenGenerator.o00000(new.\u00d800000()));
        map.put("kultur", new.\u00f800000().toString());
        map.put("augenfarbe", new.thissuper().getAugenFarbe());
        map.put("geburtstag", new.thissuper().getGeburtstagString());
        map.put("geschlecht", new.\u00d300000().toString());
        map.put("gr\u00f6sse", String.valueOf(new.thissuper().getGroesse()));
        map.put("gewicht", String.valueOf(new.thissuper().getGewicht(new.o00000(I.\u00f8\u00d2o000))));
        map.put("haarfarbe", new.thissuper().getHaarFarbe());
        map.put("apgesamt", String.valueOf(new.o\u00d30000()));
        map.put("apfrei", String.valueOf(new.\u00d400000()));
        map.put("apgenutzt", String.valueOf(new.o\u00d30000() - new.\u00d400000()));
        map.put("aspregeneration", new.\u00d3\u00d50000());
        map.put("stufe", String.valueOf(new.\u00d5O0000()));
        map.put("stufemax", String.valueOf(HeldenMath.getStufe(new.o\u00d30000())));
        String string = String.valueOf(new.\u00d5O0000());
        string = string + " [" + HeldenMath.getStufe(new.o\u00d30000()) + "]";
        map.put("stufelang", string);
        map.put("geschwindigkeit-start", String.valueOf(new.\u00d3\u00d30000().OO0000(b_0.O\u00f4\u00d2000)));
        map.put("geschwindigkeit-akt", String.valueOf(new.o00000(b_0.O\u00f4\u00d2000)));
        map.put("geschwindigkeit-modi", String.valueOf(new.\u00d3\u00d30000().\u00d200000(b_0.O\u00f4\u00d2000)));
        Iterator iterator = new.\u00d3\u00d30000().super();
        while (iterator.hasNext()) {
            b_02 = (b_0)iterator.next();
            try {
                int n2 = new.o00000(b_02);
                if (b_02.equals(b_0.\u00f4\u00f5\u00d2000) && !new.oo0000()) {
                    n2 = 0;
                }
                map.put(b_02.toString().toLowerCase() + "-" + "akt", String.valueOf(n2));
                if (!b_02.equals(b_0.\u00d4\u00f5\u00d2000)) {
                    n2 = new.\u00d3\u00d30000().OO0000(b_02);
                    map.put(b_02.toString().toLowerCase() + "-" + "start", String.valueOf(n2));
                }
                n2 = new.\u00d3\u00d30000().\u00d200000(b_02);
                map.put(b_02.toString().toLowerCase() + "-" + "modi", String.valueOf(n2));
            }
            catch (Exception exception) {
                private.\u00d200000("Eigenschaft: " + b_02.toString() + " " + exception.toString(), "sven");
            }
        }
        map.put(b_0.\u00d4\u00f5\u00d2000.toString().toLowerCase() + "-" + "start", "0");
        b_02 = null;
        try {
            b_02 = b_0.\u00d3\u00f4\u00d2000;
            int n3 = new.\u00d3\u00d30000().interface(b_02);
            map.put(b_02.toString().toLowerCase() + "-" + "kaufbar", String.valueOf(n3));
            b_02 = b_0.\u00f4\u00f5\u00d2000;
            n3 = new.\u00d3\u00d30000().interface(b_02);
            if (!new.oo0000()) {
                n3 = 0;
            }
            map.put(b_02.toString().toLowerCase() + "-" + "kaufbar", String.valueOf(n3));
            b_02 = b_0.thispublicsuper;
            n3 = new.\u00d3\u00d30000().interface(b_02);
            map.put(b_02.toString().toLowerCase() + "-" + "kaufbar", String.valueOf(n3));
            b_02 = b_0.\u00d4\u00f5\u00d2000;
            n3 = new.\u00d3\u00d30000().interface(b_02);
            map.put(b_02.toString().toLowerCase() + "-" + "kaufbar", String.valueOf(n3));
            b_02 = b_0.\u00d3\u00f4\u00d2000;
            n3 = new.\u00d3\u00d30000().\u00d200000(b_02);
            map.put(b_02.toString().toLowerCase() + "-" + "gekauft", String.valueOf(n3));
            b_02 = b_0.\u00f4\u00f5\u00d2000;
            n3 = new.\u00d3\u00d30000().\u00d200000(b_02);
            map.put(b_02.toString().toLowerCase() + "-" + "gekauft", String.valueOf(n3));
            b_02 = b_0.thispublicsuper;
            n3 = new.\u00d3\u00d30000().\u00d200000(b_02);
            map.put(b_02.toString().toLowerCase() + "-" + "gekauft", String.valueOf(n3));
            b_02 = b_0.\u00d4\u00f5\u00d2000;
            n3 = new.\u00d3\u00d30000().\u00d200000(b_02);
            map.put(b_02.toString().toLowerCase() + "-" + "gekauft", String.valueOf(n3));
        }
        catch (Exception exception) {
            private.\u00d200000("Eigenschaft: " + b_02.toString() + " " + exception.toString(), "sven");
        }
        int n4 = 0;
        if (new.o00000(I.\u00f8oO000)) {
            n4 += ((J)new.\u00d500000().\u00d300000(I.\u00f8oO000)).ObjectString();
        }
        if (new.o00000(I.\u00d5\u00f4O000)) {
            n4 += 7;
        }
        int n5 = (new.o00000(b_0.whilewhilesuper) + new.o00000(b_0.\u00f8\u00f4\u00d2000) + new.o00000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2;
        map.put("astralenergie-muinch/2", String.valueOf(n5));
        n5 = new.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000) - new.\u00d3\u00d30000().\u00d4O0000();
        map.put("astralenergie-professionmod", String.valueOf(n5 - n4));
        n5 = new.\u00d3\u00d30000().\u00d4O0000();
        map.put("astralenergie-grossemeditation", String.valueOf(n5));
        map.put("astralenergie-vornachteile", String.valueOf(n4));
        String string2 = "";
        Iterator<String> iterator2 = new.\u00f400000().getGeldStrings(false).iterator();
        while (iterator2.hasNext()) {
            String string3 = iterator2.next();
            string2 = string2 + string3;
            if (iterator2.hasNext()) {
                string2 = string2 + "; ";
            }
            String string4 = string3.substring(string3.indexOf(40) + 2);
            string4 = string4.substring(0, string4.indexOf(41) - 1);
        }
        map.put("geld", string2);
        map.put("rsgesamt", "" + new.OO0000().for());
        map.put("rsbe", "" + new.OO0000().\u00d300000());
        map.put("heldenversion", Version.getSoftwareVersion());
        map.put("stand", new.thissuper().getStand());
        map.put("titel", new.thissuper().getTitel());
        string2 = "";
        for (n = 0; n < 4; ++n) {
            string2 = string2 + new.thissuper().getAussehenText()[n] + " ";
            map.put("aussehen" + n, new.thissuper().getAussehenText()[n]);
        }
        map.put("aussehen", string2.trim());
        string2 = "";
        for (n = 0; n < 6; ++n) {
            string2 = string2 + new.thissuper().getFamilieText()[n] + " ";
            map.put("familie" + n, new.thissuper().getFamilieText()[n]);
        }
        map.put("familie", string2.trim());
        map.put("gpstart", "" + new.thissuper().getGPStart());
        map.put("gprest", "" + new.thissuper().getGPStart());
        map.put("gpwerte", "" + new.thissuper().getGpWerte());
        string2 = "";
        if (new.returnnew() != null) {
            string2 = new.returnnew();
        }
        map.put("gilde", string2);
    }

    private static void if() {
        Iterator<KonkreterZauber> iterator = new.\u00d5o0000().super();
        while (iterator.hasNext()) {
            KonkreterZauber konkreterZauber = iterator.next();
            EinzelInformationImpl einzelInformationImpl = new EinzelInformationImpl();
            Map<String, String> map = einzelInformationImpl.getInfos();
            map.put("name", konkreterZauber.getZaubername());
            map.put("variante", konkreterZauber.getVariante());
            String string = "";
            string = konkreterZauber.toString();
            map.put("nameausfuehrlich", string);
            string = konkreterZauber.getZaubername();
            if (!konkreterZauber.getVariante().equals("")) {
                string = string + " [" + konkreterZauber.getVariante() + "]";
            }
            map.put("namemitvariante", string);
            try {
                string = String.valueOf(new.\u00d300000(konkreterZauber));
            }
            catch (Exception exception) {
                string = "?";
            }
            map.put("wert", string);
            String string2 = "";
            Iterator<String> iterator2 = new.o00000(konkreterZauber).iterator();
            while (iterator2.hasNext()) {
                string2 = string2 + iterator2.next();
                if (!iterator2.hasNext()) continue;
                string2 = string2 + ", ";
            }
            map.put("spezialisierungen", string2);
            string = konkreterZauber.getTalentprobe().o00000(0).O\u00d60000();
            string = string + "/";
            string = string + konkreterZauber.getTalentprobe().o00000(1).O\u00d60000();
            string = string + "/";
            string = string + konkreterZauber.getTalentprobe().o00000(2).O\u00d60000();
            map.put("probe", string);
            map.put("bereiche", konkreterZauber.getArt().toString());
            map.put("komplexit\u00e4t", konkreterZauber.getKategorie(false).toString());
            map.put("lernkomplexit\u00e4t", new.new(konkreterZauber).toString());
            map.put("hauszauber", String.valueOf(new.\u00d5o0000().\u00d200000(konkreterZauber)));
            if (map.get("hauszauber").equals("true")) {
                map.put("hauszauberformatiert", "X");
            } else {
                map.put("hauszauberformatiert", " ");
            }
            map.put("repr\u00e4sentation", konkreterZauber.getRep().toString());
            map.put("merkmale", konkreterZauber.getMerkmaleString());
            ZauberInfos zauberInfos = new.\u00d5o0000().\u00d600000(konkreterZauber);
            map.put("zauberdauer", zauberInfos.getZauberdauer());
            map.put("kosten", zauberInfos.getKosten());
            map.put("reichweite", zauberInfos.getReichweite());
            map.put("wirkungsdauer", zauberInfos.getWirkungsdauer());
            map.put("anmerkung", zauberInfos.getAnmerkungen());
            map.put("quelle", konkreterZauber.getQuelle());
            oooo_1 oooo_12 = konkreterZauber.getZauber().getQuellenObj();
            map.put("quelle" + oooo_12.\u00d200000().toLowerCase(), "" + oooo_12.Object());
            o00000.getTalente().add(einzelInformationImpl);
        }
    }

    private static String o00000(super super_) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.addAll(new.\u00d800000().Object(String._o.\u00d300000));
        arrayList.addAll(new.\u00d800000().Object(String._o.\u00d500000));
        arrayList.addAll(new.\u00d800000().Object(String._o.\u00d200000));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string = ((super)iterator.next()).toString();
            int n = string.indexOf(":");
            if (n == -1) {
                stringBuffer.append(string);
            } else {
                stringBuffer.append(string.substring(0, n));
            }
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    private static String o00000(voidsuper voidsuper2) {
        String string = "";
        ArrayList<String> arrayList = new.o00000((oo0o_0)voidsuper2);
        if (arrayList != null && arrayList.size() > 0) {
            string = string + " (";
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String string2 = iterator.next();
                string = string + string2;
                if (!iterator.hasNext()) continue;
                string = string + ", ";
            }
            string = string + ")";
        }
        return string;
    }

    private DatenGenerator() {
    }
}

