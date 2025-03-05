/*
 * Decompiled with CFR 0.152.
 */
package helden.model;

import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.int.C;
import helden.framework.int.OooO;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.werkzeug.MyHashMap;
import helden.model.DDZKulturen.AlMada;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.AndergastNostria;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.Brillantzwerge;
import helden.model.DDZKulturen.Brobim;
import helden.model.DDZKulturen.Cyclopea;
import helden.model.DDZKulturen.Darna;
import helden.model.DDZKulturen.DiamantenesSultanat;
import helden.model.DDZKulturen.Dschungelstaemme;
import helden.model.DDZKulturen.Elem;
import helden.model.DDZKulturen.Erzzwerge;
import helden.model.DDZKulturen.Gjalskerlaender;
import helden.model.DDZKulturen.Grolmensippe;
import helden.model.DDZKulturen.Haranija;
import helden.model.DDZKulturen.Hjaldinger;
import helden.model.DDZKulturen.Koschzwerge;
import helden.model.DDZKulturen.Nivesenstaemme;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Nortreisch;
import helden.model.DDZKulturen.Serrach;
import helden.model.DDZKulturen.Steppenelfensippe;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.DDZKulturen.Tocamuyac;
import helden.model.DDZKulturen.Tulamidenlande;
import helden.model.DDZKulturen.VerloreneStaemme;
import helden.model.DDZKulturen.Wuestenstaemme;
import helden.model.kultur.Almada;
import helden.model.kultur.Amazonenburg;
import helden.model.kultur.Ambosszwerge;
import helden.model.kultur.Aranien;
import helden.model.kultur.ArchaischeAchaz;
import helden.model.kultur.AuelfenSippe;
import helden.model.kultur.Bornland;
import helden.model.kultur.Bukanier;
import helden.model.kultur.EigeneKultur;
import helden.model.kultur.ElfischeSiedlung;
import helden.model.kultur.Ferkina;
import helden.model.kultur.FestumerGhetto;
import helden.model.kultur.FirnelfenSippe;
import helden.model.kultur.Fjarninger;
import helden.model.kultur.Garetien;
import helden.model.kultur.Goblinbande;
import helden.model.kultur.Goblinstamm;
import helden.model.kultur.Horasreich;
import helden.model.kultur.Huegelzwerge;
import helden.model.kultur.Maraskan;
import helden.model.kultur.Mhanadistan;
import helden.model.kultur.Miniwatu;
import helden.model.kultur.Mittelreich;
import helden.model.kultur.Norbardensippe;
import helden.model.kultur.Novadis;
import helden.model.kultur.NuanaaeLi;
import helden.model.kultur.Orkland;
import helden.model.kultur.StammesAchaz;
import helden.model.kultur.SteppenelfenSippe;
import helden.model.kultur.Svellttal;
import helden.model.kultur.SvellttalOkkupanten;
import helden.model.kultur.Thorwal;
import helden.model.kultur.Trollzacken;
import helden.model.kultur.TulamidischeStadtstaaten;
import helden.model.kultur.WaldelfenSippe;
import helden.model.kultur.WaldinselUtulus;
import helden.model.kultur.Yurach;
import helden.model.kultur.Zahori;
import helden.model.kultur.Zyklopeninseln;
import helden.model.myranor.kultur.BaeuerlicheKultur;
import helden.model.myranor.kultur.BarbarischeKultur;
import helden.model.myranor.kultur.HoefischeKultur;
import helden.model.myranor.kultur.MaritimeKultur;
import helden.model.myranor.kultur.NomadischeKultur;
import helden.model.myranor.kultur.StaedtischeKultur;
import helden.model.myranor.kultur.VagabundischeKultur;
import helden.model.tharun.kultur.Conossos;
import helden.model.tharun.kultur.Hashandra;
import helden.model.tharun.kultur.IlshiVailen;
import helden.model.tharun.kultur.Jue;
import helden.model.tharun.kultur.Kuum;
import helden.model.tharun.kultur.Lania;
import helden.model.tharun.kultur.Memonhab;
import helden.model.tharun.kultur.Tharun;
import helden.model.tharun.kultur.Thuara;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public final class KulturFabrik {
    private static HashMap<String, String> Object;
    private static HashMap<String, OooO> \u00d400000;
    private static MyHashMap<String, C> \u00d200000;
    private static ArrayList<String> o00000;

    public static void aktualisiereEigeneKulturen() {
        Object = null;
        \u00d400000 = null;
        \u00d200000 = null;
    }

    public static Vector<OooO> getEigeneKulturen(Geschlecht geschlecht) {
        Object object;
        Object object2;
        Serializable serializable;
        if (\u00d200000 == null) {
            \u00d200000 = new MyHashMap();
            serializable = new File(Einstellungen.getInstance().getPfade().getPfad("mods") + "/Kultur");
            object2 = new FilenameFilter(){

                @Override
                public boolean accept(File file, String string) {
                    return string.toLowerCase().endsWith(".xml");
                }
            };
            o00000 = new ArrayList();
            ArrayList arrayList = new ArrayList();
            File[] fileArray = ((File)serializable).listFiles((FilenameFilter)object2);
            if (fileArray != null) {
                for (File comparable2 : fileArray) {
                    C c = ModsDatenParser.getInstance().einlesenFile(comparable2, "eigenekultur");
                    if (c == null || o00000.contains(c.o\u00f60000())) continue;
                    c.\u00f500000(comparable2.getAbsolutePath());
                    if (c.o\u00f80000() != null) {
                        arrayList.add(c);
                    } else {
                        for (String string : c.\u00d5\u00f60000()) {
                            \u00d200000.put(string, c);
                        }
                    }
                    for (String string : c.\u00d5\u00f60000()) {
                        o00000.add(string);
                    }
                }
                object = arrayList.iterator();
                while (object.hasNext()) {
                    C c = (C)object.next();
                    String string = c.o\u00f80000();
                    C c2 = (C)\u00d200000.get(string);
                    if (c2 == null) continue;
                    c2.o00000(c);
                }
            }
        }
        serializable = new Vector<OooO>(\u00d200000.size());
        object2 = new ArrayList();
        for (File[] fileArray : \u00d200000.values()) {
            object = ModsDatenParser.getInstance().einlesenRKPVariante(fileArray.\u00d2\u00f60000());
            if (((ArrayList)object2).contains(((C)object).o\u00f60000())) continue;
            ((ArrayList)object2).add(((C)object).o\u00f60000());
            ((C)object).\u00f500000(fileArray.\u00d5\u00f50000());
            for (C c : fileArray.floatnull()) {
                C c3 = ModsDatenParser.getInstance().einlesenRKPVariante(c.\u00d2\u00f60000());
                c3.\u00f500000(c.\u00d5\u00f50000());
                ((C)object).o00000(c3);
            }
            ((Vector)serializable).add(new EigeneKultur(geschlecht, (C)object));
        }
        return serializable;
    }

    public static ArrayList<OooO> getEingebauteKulturen(Geschlecht geschlecht) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Garetien(geschlecht));
        arrayList.add(new Mittelreich(geschlecht));
        arrayList.add(new helden.model.kultur.AndergastNostria(geschlecht));
        arrayList.add(new Bornland(geschlecht));
        arrayList.add(new Svellttal(geschlecht));
        arrayList.add(new Zyklopeninseln(geschlecht));
        arrayList.add(new Amazonenburg(geschlecht));
        arrayList.add(new Aranien(geschlecht));
        arrayList.add(new Mhanadistan(geschlecht));
        arrayList.add(new TulamidischeStadtstaaten(geschlecht));
        arrayList.add(new Novadis(geschlecht));
        arrayList.add(new Ferkina(geschlecht));
        arrayList.add(new Zahori(geschlecht));
        arrayList.add(new Thorwal(geschlecht));
        arrayList.add(new helden.model.kultur.Gjalskerlaender(geschlecht));
        arrayList.add(new Fjarninger(geschlecht));
        arrayList.add(new helden.model.kultur.Dschungelstaemme(geschlecht));
        arrayList.add(new helden.model.kultur.VerloreneStaemme(geschlecht));
        arrayList.add(new WaldinselUtulus(geschlecht));
        arrayList.add(new Miniwatu(geschlecht));
        arrayList.add(new helden.model.kultur.Tocamuyac(geschlecht));
        arrayList.add(new helden.model.kultur.Darna(geschlecht));
        arrayList.add(new Maraskan(geschlecht));
        arrayList.add(new helden.model.kultur.Suedaventurien(geschlecht));
        arrayList.add(new Bukanier(geschlecht));
        arrayList.add(new helden.model.kultur.Nivesenstaemme(geschlecht));
        arrayList.add(new Norbardensippe(geschlecht));
        arrayList.add(new Trollzacken(geschlecht));
        arrayList.add(new Ambosszwerge(geschlecht));
        arrayList.add(new helden.model.kultur.Erzzwerge(geschlecht));
        arrayList.add(new Huegelzwerge(geschlecht));
        arrayList.add(new helden.model.kultur.Brillantzwerge(geschlecht));
        arrayList.add(new AuelfenSippe(geschlecht));
        arrayList.add(new ElfischeSiedlung(geschlecht));
        arrayList.add(new SteppenelfenSippe(geschlecht));
        arrayList.add(new WaldelfenSippe(geschlecht));
        arrayList.add(new FirnelfenSippe(geschlecht));
        arrayList.add(new Orkland(geschlecht));
        arrayList.add(new Yurach(geschlecht));
        arrayList.add(new SvellttalOkkupanten(geschlecht));
        arrayList.add(new Goblinstamm(geschlecht));
        arrayList.add(new Goblinbande(geschlecht));
        arrayList.add(new FestumerGhetto(geschlecht));
        arrayList.add(new ArchaischeAchaz(geschlecht));
        arrayList.add(new StammesAchaz(geschlecht));
        arrayList.add(new Almada(geschlecht));
        arrayList.add(new Horasreich(geschlecht));
        arrayList.add(new NuanaaeLi(geschlecht));
        arrayList.add(new helden.model.kultur.Brobim(geschlecht));
        arrayList.add(new helden.model.DDZKulturen.Ambosszwerge(geschlecht));
        arrayList.add(new Brobim(geschlecht));
        arrayList.add(new BosparanischesReich(geschlecht));
        arrayList.add(new Brillantzwerge(geschlecht));
        arrayList.add(new Cyclopea(geschlecht));
        arrayList.add(new DiamantenesSultanat(geschlecht));
        arrayList.add(new Elem(geschlecht));
        arrayList.add(new Erzzwerge(geschlecht));
        arrayList.add(new Hjaldinger(geschlecht));
        arrayList.add(new Koschzwerge(geschlecht));
        arrayList.add(new Tulamidenlande(geschlecht));
        arrayList.add(new AlMada(geschlecht));
        arrayList.add(new Wuestenstaemme(geschlecht));
        arrayList.add(new Nivesenstaemme(geschlecht));
        arrayList.add(new Nordprovinzen(geschlecht));
        arrayList.add(new Steppenelfensippe(geschlecht));
        arrayList.add(new helden.model.DDZKulturen.Trollzacken(geschlecht));
        arrayList.add(new Alhanien(geschlecht));
        arrayList.add(new Haranija(geschlecht));
        arrayList.add(new Suedaventurien(geschlecht));
        arrayList.add(new Grolmensippe(geschlecht));
        arrayList.add(new AndergastNostria(geschlecht));
        arrayList.add(new Darna(geschlecht));
        arrayList.add(new Dschungelstaemme(geschlecht));
        arrayList.add(new helden.model.DDZKulturen.Orkland(geschlecht));
        arrayList.add(new helden.model.DDZKulturen.Ferkina(geschlecht));
        arrayList.add(new helden.model.DDZKulturen.Fjarninger(geschlecht));
        arrayList.add(new Gjalskerlaender(geschlecht));
        arrayList.add(new helden.model.DDZKulturen.Goblinbande(geschlecht));
        arrayList.add(new Nortreisch(geschlecht));
        arrayList.add(new Serrach(geschlecht));
        arrayList.add(new Tocamuyac(geschlecht));
        arrayList.add(new VerloreneStaemme(geschlecht));
        arrayList.add(new helden.model.DDZKulturen.WaldinselUtulus(geschlecht));
        arrayList.add(new helden.model.DDZKulturen.Yurach(geschlecht));
        arrayList.addAll(KulturFabrik.getMyranor(geschlecht));
        arrayList.addAll(KulturFabrik.getTharun(geschlecht));
        return arrayList;
    }

    public static OooO getKultur(OooO oooO2, Geschlecht geschlecht) {
        for (OooO oooO3 : KulturFabrik.getKulturen(geschlecht)) {
            if (!oooO3.getClass().equals(oooO2.getClass())) continue;
            if (oooO3 instanceof EigeneKultur) {
                String string;
                String string2 = ((EigeneKultur)oooO2).getID();
                if (!string2.equals(string = ((EigeneKultur)oooO3).getID())) continue;
                return oooO3;
            }
            return oooO3;
        }
        throw new IllegalArgumentException("Kultur nicht vorhanden");
    }

    public static OooO getKulturByID(String string) {
        if (\u00d400000 == null) {
            KulturFabrik.o00000();
        }
        return \u00d400000.get(string);
    }

    public static ArrayList<OooO> getKulturen(Geschlecht geschlecht) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        if (Object == null) {
            KulturFabrik.o00000();
        }
        arrayList.addAll(KulturFabrik.getEingebauteKulturen(geschlecht));
        arrayList.addAll(KulturFabrik.getEigeneKulturen(geschlecht));
        return arrayList;
    }

    public static ArrayList<OooO> getKulturen(Settings settings, Geschlecht geschlecht) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        if (Object == null) {
            KulturFabrik.o00000();
        }
        for (OooO oooO2 : KulturFabrik.getEingebauteKulturen(geschlecht)) {
            if (!settings.contains(oooO2, null)) continue;
            arrayList.add(oooO2);
        }
        arrayList.addAll(KulturFabrik.getEigeneKulturen(geschlecht));
        return arrayList;
    }

    public static OooO getLeerKultur(Geschlecht geschlecht) {
        OooO oooO2 = null;
        try {
            Class<?> clazz = Class.forName("test.helper.LeerKultur");
            Constructor<?> constructor = clazz.getConstructor(Geschlecht.class);
            oooO2 = (OooO)constructor.newInstance(new Object[]{geschlecht});
        }
        catch (ClassNotFoundException classNotFoundException) {
        }
        catch (SecurityException securityException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            // empty catch block
        }
        return oooO2;
    }

    public static ArrayList<OooO> getMyranor(Geschlecht geschlecht) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BarbarischeKultur(geschlecht));
        arrayList.add(new BaeuerlicheKultur(geschlecht));
        arrayList.add(new HoefischeKultur(geschlecht));
        arrayList.add(new MaritimeKultur(geschlecht));
        arrayList.add(new NomadischeKultur(geschlecht));
        arrayList.add(new StaedtischeKultur(geschlecht));
        arrayList.add(new VagabundischeKultur(geschlecht));
        return arrayList;
    }

    public static String getNamebyID(String string) {
        if (Object == null) {
            KulturFabrik.o00000();
        }
        if (Object.get(string) != null) {
            return Object.get(string);
        }
        return string;
    }

    public static ArrayList<OooO> getTharun(Geschlecht geschlecht) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new Conossos(geschlecht));
        arrayList.add(new Hashandra(geschlecht));
        arrayList.add(new Jue(geschlecht));
        arrayList.add(new IlshiVailen(geschlecht));
        arrayList.add(new Kuum(geschlecht));
        arrayList.add(new Lania(geschlecht));
        arrayList.add(new Memonhab(geschlecht));
        arrayList.add(new Thuara(geschlecht));
        arrayList.add(new Tharun(geschlecht));
        return arrayList;
    }

    public static boolean isErweiterungBekannt(String string) {
        if (o00000 == null) {
            KulturFabrik.getEigeneKulturen(Geschlecht.\u00d400000);
        }
        return o00000.contains(string);
    }

    public static void kulturListeNeuerstellen() {
        Object = null;
    }

    private static void o00000() {
        if (Object == null) {
            Object = new HashMap();
        }
        if (\u00d400000 == null) {
            \u00d400000 = new HashMap();
        }
        for (OooO oooO2 : KulturFabrik.getKulturen(Geschlecht.\u00d300000)) {
            for (String string : oooO2.getIDs()) {
                Object.put(string, oooO2.toString());
                \u00d400000.put(string, oooO2);
            }
        }
        for (OooO oooO2 : KulturFabrik.getKulturen(Geschlecht.\u00d400000)) {
            for (String string : oooO2.getIDs()) {
                Object.put(string, oooO2.toString());
                \u00d400000.put(string, oooO2);
            }
        }
    }

    private KulturFabrik() {
    }
}

