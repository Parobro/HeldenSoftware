/*
 * Decompiled with CFR 0.152.
 */
package helden.model;

import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.int.C;
import helden.framework.int.o0oo_0;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.werkzeug.MyHashMap;
import helden.model.DDZRassen.AlHani;
import helden.model.DDZRassen.Grolm;
import helden.model.DDZRassen.Gueldenlaender;
import helden.model.DDZRassen.Ork;
import helden.model.myranor.rasse.Amaunir;
import helden.model.myranor.rasse.Ashariel;
import helden.model.myranor.rasse.BanBargui;
import helden.model.myranor.rasse.Bansumiter;
import helden.model.myranor.rasse.Baramune;
import helden.model.myranor.rasse.Dorinther;
import helden.model.myranor.rasse.GRolmur;
import helden.model.myranor.rasse.Hippocampir;
import helden.model.myranor.rasse.Hjaldinger;
import helden.model.myranor.rasse.Kynokephalen;
import helden.model.myranor.rasse.Leonir;
import helden.model.myranor.rasse.Loualil;
import helden.model.myranor.rasse.Lutraa;
import helden.model.myranor.rasse.Lyncil;
import helden.model.myranor.rasse.Menschen;
import helden.model.myranor.rasse.Mholuren;
import helden.model.myranor.rasse.Minotauren;
import helden.model.myranor.rasse.Neristu;
import helden.model.myranor.rasse.Norkosh;
import helden.model.myranor.rasse.Pardir;
import helden.model.myranor.rasse.Pristiden;
import helden.model.myranor.rasse.Ravesaran;
import helden.model.myranor.rasse.Risso;
import helden.model.myranor.rasse.Ruritirna;
import helden.model.myranor.rasse.Satyare;
import helden.model.myranor.rasse.Schneepardir;
import helden.model.myranor.rasse.Shingwa;
import helden.model.myranor.rasse.Shinoqi;
import helden.model.myranor.rasse.Tighrir;
import helden.model.myranor.rasse.Tritonen;
import helden.model.myranor.rasse.Vesai;
import helden.model.myranor.rasse.Wolfalben;
import helden.model.myranor.rasse.Zentauren;
import helden.model.myranor.rasse.Ziliten;
import helden.model.myranor.rasse.Zwerge;
import helden.model.rasse.Achaz;
import helden.model.rasse.Auelf;
import helden.model.rasse.EigeneRasse;
import helden.model.rasse.Firnelf;
import helden.model.rasse.Goblin;
import helden.model.rasse.Halbelf;
import helden.model.rasse.Halbork;
import helden.model.rasse.Mittellaender;
import helden.model.rasse.Nivese;
import helden.model.rasse.Norbarde;
import helden.model.rasse.Thorwaler;
import helden.model.rasse.Trollzacker;
import helden.model.rasse.Tulamide;
import helden.model.rasse.Utulu;
import helden.model.rasse.Waldelf;
import helden.model.rasse.Waldmensch;
import helden.model.rasse.Zwerg;
import helden.model.tharun.rasse.Conossis;
import helden.model.tharun.rasse.Hashandri;
import helden.model.tharun.rasse.Ilshiten;
import helden.model.tharun.rasse.Jueiten;
import helden.model.tharun.rasse.Lanier;
import helden.model.tharun.rasse.Memonhabiter;
import helden.model.tharun.rasse.Tharuner;
import helden.model.tharun.rasse.Thuaris;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class RassenFabrik {
    private static HashMap<String, String> \u00d400000;
    private static HashMap<String, o0oo_0> new;
    private static MyHashMap<String, C> \u00d300000;
    private static ArrayList<String> o00000;

    public static void aktualisiereEigeneRassen() {
        \u00d400000 = null;
        new = null;
        \u00d300000 = null;
    }

    public static ArrayList<o0oo_0> getDDZRassen(Geschlecht geschlecht) {
        ArrayList<o0oo_0> arrayList = new ArrayList<o0oo_0>();
        arrayList.add(new AlHani(geschlecht));
        arrayList.add(new Gueldenlaender(geschlecht));
        arrayList.add(new helden.model.DDZRassen.Hjaldinger(geschlecht));
        arrayList.add(new Grolm(geschlecht));
        arrayList.add(new Ork(geschlecht));
        return arrayList;
    }

    public static Vector<o0oo_0> getEigeneRassen(Geschlecht geschlecht) {
        Object object;
        Object object2;
        Serializable serializable;
        if (\u00d300000 == null) {
            \u00d300000 = new MyHashMap();
            serializable = new File(Einstellungen.getInstance().getPfade().getPfad("mods") + "/Rasse");
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
                    C c = ModsDatenParser.getInstance().einlesenFile(comparable2, "eigenerasse");
                    if (c == null || o00000.contains(c.o\u00f60000())) continue;
                    c.\u00f500000(comparable2.getAbsolutePath());
                    if (c.o\u00f80000() != null) {
                        arrayList.add(c);
                    } else {
                        for (String string : c.\u00d5\u00f60000()) {
                            \u00d300000.put(string, c);
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
                    C c2 = (C)\u00d300000.get(string);
                    if (c2 == null) continue;
                    c2.o00000(c);
                }
            }
        }
        serializable = new Vector<o0oo_0>(\u00d300000.size());
        object2 = new ArrayList();
        for (File[] fileArray : \u00d300000.values()) {
            object = ModsDatenParser.getInstance().einlesenRKPVariante(fileArray.\u00d2\u00f60000());
            if (((ArrayList)object2).contains(((C)object).o\u00f60000())) continue;
            ((ArrayList)object2).add(((C)object).o\u00f60000());
            ((C)object).\u00f500000(fileArray.\u00d5\u00f50000());
            for (C c : fileArray.floatnull()) {
                C c3 = ModsDatenParser.getInstance().einlesenRKPVariante(c.\u00d2\u00f60000());
                c3.\u00f500000(c.\u00d5\u00f50000());
                ((C)object).o00000(c3);
            }
            ((Vector)serializable).add(new EigeneRasse((C)object, geschlecht));
        }
        return serializable;
    }

    public static o0oo_0 getLeerRasse(Geschlecht geschlecht) {
        o0oo_0 o0oo_02 = null;
        try {
            Class<?> clazz = Class.forName("test.helper.LeerRasse");
            Constructor<?> constructor = clazz.getConstructor(Geschlecht.class);
            o0oo_02 = (o0oo_0)constructor.newInstance(new Object[]{geschlecht});
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
        return o0oo_02;
    }

    public static ArrayList<o0oo_0> getMyranorRassen(Geschlecht geschlecht) {
        ArrayList<o0oo_0> arrayList = new ArrayList<o0oo_0>();
        arrayList.add(new Amaunir(geschlecht));
        arrayList.add(new Ashariel(geschlecht));
        arrayList.add(new BanBargui(geschlecht));
        arrayList.add(new Bansumiter(geschlecht));
        arrayList.add(new Baramune(geschlecht));
        arrayList.add(new Dorinther(geschlecht));
        arrayList.add(new GRolmur(geschlecht));
        arrayList.add(new Hjaldinger(geschlecht));
        arrayList.add(new Kynokephalen(geschlecht));
        arrayList.add(new Leonir(geschlecht));
        arrayList.add(new Loualil(geschlecht));
        arrayList.add(new Lutraa(geschlecht));
        arrayList.add(new Lyncil(geschlecht));
        arrayList.add(new Menschen(geschlecht));
        arrayList.add(new Minotauren(geschlecht));
        arrayList.add(new Neristu(geschlecht));
        arrayList.add(new Pardir(geschlecht));
        arrayList.add(new Ravesaran(geschlecht));
        arrayList.add(new Risso(geschlecht));
        arrayList.add(new Satyare(geschlecht));
        arrayList.add(new Schneepardir(geschlecht));
        arrayList.add(new Shingwa(geschlecht));
        arrayList.add(new Shinoqi(geschlecht));
        arrayList.add(new Tighrir(geschlecht));
        arrayList.add(new Vesai(geschlecht));
        arrayList.add(new Wolfalben(geschlecht));
        arrayList.add(new Zentauren(geschlecht));
        arrayList.add(new Zwerge(geschlecht));
        arrayList.add(new Hippocampir(geschlecht));
        arrayList.add(new Mholuren(geschlecht));
        arrayList.add(new Norkosh(geschlecht));
        arrayList.add(new Pristiden(geschlecht));
        arrayList.add(new Ruritirna(geschlecht));
        arrayList.add(new Tritonen(geschlecht));
        arrayList.add(new Ziliten(geschlecht));
        return arrayList;
    }

    public static String getNamebyID(String string) {
        if (\u00d400000 == null) {
            \u00d400000 = new HashMap();
            RassenFabrik.o00000();
        }
        if (\u00d400000.get(string) != null) {
            return \u00d400000.get(string);
        }
        return string;
    }

    public static o0oo_0 getRasse(o0oo_0 o0oo_02, Geschlecht geschlecht) {
        for (o0oo_0 o0oo_03 : RassenFabrik.getRassen(geschlecht, false)) {
            if (!o0oo_03.getClass().equals(o0oo_02.getClass())) continue;
            if (o0oo_02 instanceof EigeneRasse) {
                String string;
                String string2 = ((EigeneRasse)o0oo_02).getID();
                if (!string2.equals(string = ((EigeneRasse)o0oo_03).getID())) continue;
                return o0oo_03;
            }
            return o0oo_03;
        }
        throw new IllegalArgumentException("Rasse nicht vorhanden");
    }

    public static o0oo_0 getRasseByID(String string) {
        if (\u00d400000 == null) {
            RassenFabrik.o00000();
        }
        return new.get(string);
    }

    public static ArrayList<o0oo_0> getRassen(Geschlecht geschlecht, boolean bl) {
        if (\u00d400000 == null) {
            \u00d400000 = new HashMap();
            RassenFabrik.o00000();
        }
        if (geschlecht.equals((Object)Geschlecht.\u00d400000)) {
            ArrayList<o0oo_0> arrayList = new ArrayList<o0oo_0>();
            arrayList.add(new Mittellaender(geschlecht));
            arrayList.add(new Tulamide(geschlecht));
            arrayList.add(new Thorwaler(geschlecht));
            arrayList.add(new Nivese(geschlecht));
            arrayList.add(new Norbarde(geschlecht));
            arrayList.add(new Trollzacker(geschlecht));
            arrayList.add(new Waldmensch(geschlecht));
            arrayList.add(new Utulu(geschlecht));
            arrayList.add(new Zwerg(geschlecht));
            arrayList.add(new Auelf(geschlecht));
            arrayList.add(new Waldelf(geschlecht));
            arrayList.add(new Firnelf(geschlecht));
            arrayList.add(new Halbelf(geschlecht));
            arrayList.addAll(RassenFabrik.getEigeneRassen(geschlecht));
            if (!bl) {
                arrayList.add(new helden.model.rasse.Ork(geschlecht));
                arrayList.add(new Halbork(geschlecht));
                arrayList.add(new Goblin(geschlecht));
                arrayList.add(new Achaz(geschlecht));
            }
            arrayList.addAll(RassenFabrik.getDDZRassen(geschlecht));
            arrayList.addAll(RassenFabrik.getMyranorRassen(geschlecht));
            arrayList.addAll(RassenFabrik.getTharunRassen(geschlecht));
            return arrayList;
        }
        ArrayList<o0oo_0> arrayList = new ArrayList<o0oo_0>();
        arrayList.add(new Mittellaender(geschlecht));
        arrayList.add(new Tulamide(geschlecht));
        arrayList.add(new Thorwaler(geschlecht));
        arrayList.add(new Nivese(geschlecht));
        arrayList.add(new Norbarde(geschlecht));
        arrayList.add(new Trollzacker(geschlecht));
        arrayList.add(new Waldmensch(geschlecht));
        arrayList.add(new Utulu(geschlecht));
        arrayList.add(new Zwerg(geschlecht));
        arrayList.add(new Auelf(geschlecht));
        arrayList.add(new Waldelf(geschlecht));
        arrayList.add(new Firnelf(geschlecht));
        arrayList.add(new Halbelf(geschlecht));
        arrayList.addAll(RassenFabrik.getEigeneRassen(geschlecht));
        if (!bl) {
            arrayList.add(new helden.model.rasse.Ork(geschlecht));
            arrayList.add(new Halbork(geschlecht));
            arrayList.add(new Goblin(geschlecht));
            arrayList.add(new Achaz(geschlecht));
        }
        arrayList.addAll(RassenFabrik.getDDZRassen(geschlecht));
        arrayList.addAll(RassenFabrik.getMyranorRassen(geschlecht));
        arrayList.addAll(RassenFabrik.getTharunRassen(geschlecht));
        return arrayList;
    }

    public static ArrayList<o0oo_0> getRassen(Settings settings, Geschlecht geschlecht, boolean bl) {
        ArrayList<o0oo_0> arrayList = new ArrayList<o0oo_0>();
        for (o0oo_0 o0oo_02 : RassenFabrik.getRassen(geschlecht, bl)) {
            if (!settings.contains(o0oo_02, null) && o0oo_02.istIntern()) continue;
            arrayList.add(o0oo_02);
        }
        return arrayList;
    }

    public static ArrayList<o0oo_0> getTharunRassen(Geschlecht geschlecht) {
        ArrayList<o0oo_0> arrayList = new ArrayList<o0oo_0>();
        arrayList.add(new Conossis(geschlecht));
        arrayList.add(new Hashandri(geschlecht));
        arrayList.add(new Ilshiten(geschlecht));
        arrayList.add(new Jueiten(geschlecht));
        arrayList.add(new Lanier(geschlecht));
        arrayList.add(new Memonhabiter(geschlecht));
        arrayList.add(new Tharuner(geschlecht));
        arrayList.add(new Thuaris(geschlecht));
        return arrayList;
    }

    public static boolean isErweiterungBekannt(String string) {
        if (o00000 == null) {
            RassenFabrik.getEigeneRassen(Geschlecht.\u00d400000);
        }
        return o00000.contains(string);
    }

    public static void rassenListeNeuerstellen() {
        \u00d400000 = null;
    }

    private static void o00000() {
        new = new HashMap();
        for (o0oo_0 o0oo_02 : RassenFabrik.getRassen(Geschlecht.\u00d300000, false)) {
            for (String string : o0oo_02.getIDs()) {
                \u00d400000.put(string, o0oo_02.toString());
                new.put(string, o0oo_02);
            }
        }
        for (o0oo_0 o0oo_02 : RassenFabrik.getRassen(Geschlecht.\u00d400000, false)) {
            for (String string : o0oo_02.getIDs()) {
                \u00d400000.put(string, o0oo_02.toString());
                new.put(string, o0oo_02);
            }
        }
    }

    private RassenFabrik() {
    }
}

