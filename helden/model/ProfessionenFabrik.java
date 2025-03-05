/*
 * Decompiled with CFR 0.152.
 */
package helden.model;

import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.object.oooo_0;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.int.C;
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.werkzeug.MyHashMap;
import helden.model.DDZprofessionen.AlhanischeZauberPriesterin;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.Bettler;
import helden.model.DDZprofessionen.BosMagier;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Dieb;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Einbrecher;
import helden.model.DDZprofessionen.Elitekaempfer;
import helden.model.DDZprofessionen.Feilscher;
import helden.model.DDZprofessionen.Fernhaendler;
import helden.model.DDZprofessionen.Fuhrmann;
import helden.model.DDZprofessionen.Gaukler;
import helden.model.DDZprofessionen.Gelehrter;
import helden.model.DDZprofessionen.Geode;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grenzjaeger;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hoefling;
import helden.model.DDZprofessionen.Hofkuenstler;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Karawanenfuehrer;
import helden.model.DDZprofessionen.Kophta;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Lakai;
import helden.model.DDZprofessionen.Legionaer;
import helden.model.DDZprofessionen.Mudramul;
import helden.model.DDZprofessionen.OlafjordMagier;
import helden.model.DDZprofessionen.Privatlehrer;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Rattenfaenger;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Schreiber;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.DDZprofessionen.Tageloehner;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.DDZprofessionen.Wirt;
import helden.model.DDZprofessionen.Wundarzt;
import helden.model.myranor.profession.Akrobat;
import helden.model.myranor.profession.Alshinjira;
import helden.model.myranor.profession.Athlet;
import helden.model.myranor.profession.Aygon;
import helden.model.myranor.profession.BaLoa;
import helden.model.myranor.profession.Bashide;
import helden.model.myranor.profession.Biagha;
import helden.model.myranor.profession.Falschgesicht;
import helden.model.myranor.profession.Geisterwerker;
import helden.model.myranor.profession.Gladiator;
import helden.model.myranor.profession.Gossenschlaeger;
import helden.model.myranor.profession.Heiler;
import helden.model.myranor.profession.IcemnaOptimat;
import helden.model.myranor.profession.Landarbeiter;
import helden.model.myranor.profession.Leibwaechter;
import helden.model.myranor.profession.LeonirAnimist;
import helden.model.myranor.profession.Lichtweberin;
import helden.model.myranor.profession.Makshamant;
import helden.model.myranor.profession.Matrose;
import helden.model.myranor.profession.Medizinmann;
import helden.model.myranor.profession.MinotaurenAnimist;
import helden.model.myranor.profession.Monddeuter;
import helden.model.myranor.profession.Optimat;
import helden.model.myranor.profession.Ordnungshueter;
import helden.model.myranor.profession.Reiter;
import helden.model.myranor.profession.Runenmeister;
import helden.model.myranor.profession.Sadhaka;
import helden.model.myranor.profession.Saithakenner;
import helden.model.myranor.profession.Saithyar;
import helden.model.myranor.profession.Sammler;
import helden.model.myranor.profession.Satudur;
import helden.model.myranor.profession.Schankdiener;
import helden.model.myranor.profession.Schiffskaempfer;
import helden.model.myranor.profession.Scholar;
import helden.model.myranor.profession.Schwerstarbeiter;
import helden.model.myranor.profession.Shanwada;
import helden.model.myranor.profession.Sherkumar;
import helden.model.myranor.profession.Shindramatha;
import helden.model.myranor.profession.Shurhokach;
import helden.model.myranor.profession.SibylleMantiker;
import helden.model.myranor.profession.Soldaten;
import helden.model.myranor.profession.Stammespriester;
import helden.model.myranor.profession.Sternensaenger;
import helden.model.myranor.profession.Taucher;
import helden.model.myranor.profession.Tempelpriester;
import helden.model.myranor.profession.Tempelwaechter;
import helden.model.myranor.profession.Thulnail;
import helden.model.myranor.profession.UnabhaengigerMagier;
import helden.model.myranor.profession.Verkuender;
import helden.model.myranor.profession.Viehtreiber;
import helden.model.myranor.profession.Wanderhaendler;
import helden.model.myranor.profession.Wanderprediger;
import helden.model.myranor.profession.Weihertaenzer;
import helden.model.myranor.profession.Wellenkind;
import helden.model.myranor.profession.Wildniskrieger;
import helden.model.myranor.profession.Windfluesterer;
import helden.model.myranor.profession.Yachzuq;
import helden.model.myranor.profession.Zharzhuri;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Ausrufer;
import helden.model.profession.Bader;
import helden.model.profession.Bauer;
import helden.model.profession.Bergmann;
import helden.model.profession.Bewahrer;
import helden.model.profession.Bordmagus;
import helden.model.profession.Derwisch;
import helden.model.profession.Domestik;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.EigeneProfession;
import helden.model.profession.Entdecker;
import helden.model.profession.FaehnrichFusskaemper;
import helden.model.profession.FaehnrichKavallerie;
import helden.model.profession.FaehnrichSee;
import helden.model.profession.Fischer;
import helden.model.profession.Former;
import helden.model.profession.Gardist;
import helden.model.profession.Geweihter;
import helden.model.profession.Godi;
import helden.model.profession.Heilari;
import helden.model.profession.Herold;
import helden.model.profession.Hexe;
import helden.model.profession.Hirte;
import helden.model.profession.Jahrmarktskaempfer;
import helden.model.profession.Kaempfer;
import helden.model.profession.KaempferUdw;
import helden.model.profession.Krieger;
import helden.model.profession.Kristallomant;
import helden.model.profession.Kurtisane;
import helden.model.profession.Legendensaenger;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Ritter;
import helden.model.profession.Schamane;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Schiffer;
import helden.model.profession.Schriftsteller;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Seefahrer;
import helden.model.profession.Soldat;
import helden.model.profession.Spitzel;
import helden.model.profession.Stabsfaehnrich;
import helden.model.profession.Streuner;
import helden.model.profession.Taugenichts;
import helden.model.profession.Tierkrieger;
import helden.model.profession.Wildnislaeufer;
import helden.model.profession.WindUndWettermagus;
import helden.model.profession.Zaubertaenzer;
import helden.model.profession.Zauberweber;
import helden.model.profession.Zibilja;
import helden.model.tharun.profession.Brigantai;
import helden.model.tharun.profession.ConossischerBauernguerai;
import helden.model.tharun.profession.IlshitischerAdliger;
import helden.model.tharun.profession.Kymanai;
import helden.model.tharun.profession.LanianischeHalbeGuerai;
import helden.model.tharun.profession.Masha;
import helden.model.tharun.profession.Maturai;
import helden.model.tharun.profession.NiedererAzaraiderNanurta;
import helden.model.tharun.profession.NiedererAzaraidesArkanZin;
import helden.model.tharun.profession.NiedererAzaraidesNuminoru;
import helden.model.tharun.profession.NiedererAzaraidesOjoSombri;
import helden.model.tharun.profession.NiedererAzaraidesPateshi;
import helden.model.tharun.profession.NiedererAzaraidesShinXirit;
import helden.model.tharun.profession.NiedererAzaraidesSindayru;
import helden.model.tharun.profession.NiedererAzaraidesZirraku;
import helden.model.tharun.profession.NiedererGuerai;
import helden.model.tharun.profession.Numinai;
import helden.model.tharun.profession.ThuarischeNahamkiim;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public final class ProfessionenFabrik {
    private static HashMap<String, String> \u00d400000;
    private static HashMap<String, super> o00000;
    private static MyHashMap<String, C> Object;
    private static ArrayList<String> \u00d200000;

    public static void aktualisiereEigeneProfessionen() {
        \u00d400000 = null;
        o00000 = null;
        Object = null;
    }

    public static Vector<super> getAlleDDZProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.addAll(ProfessionenFabrik.getDDZProfessionenKampf(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getDDZProfessionenPriester(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getDDZProfessionenMagisch(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getAlleMyranorProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.addAll(ProfessionenFabrik.getMyranorProfessionenKampf(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getMyranorProfessionenReiseWildnis(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getMyranorProfessionenGesellschaft(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getMyranorProfessionenHandwerker(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getMyranorProfessionenPriester(geschlecht, voidsuper2, voidsuper3));
        vector.addAll(ProfessionenFabrik.getMyranorProfessionenMagisch(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static ArrayList<super> getAlleProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        ArrayList<super> arrayList = new ArrayList<super>();
        if (\u00d400000 == null) {
            ProfessionenFabrik.o00000();
        }
        arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getMagischeProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getKlerikaleProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getEigeneProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getAlleDDZProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getAlleMyranorProfessionen(geschlecht, voidsuper2, voidsuper3));
        arrayList.addAll(ProfessionenFabrik.getAllTharunPRofessionen(geschlecht, voidsuper2, voidsuper3));
        return arrayList;
    }

    public static ArrayList<super> getAlleProfessionen(Settings settings, Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        ArrayList<super> arrayList = new ArrayList<super>();
        for (super super_ : ProfessionenFabrik.getAlleProfessionen(geschlecht, voidsuper2, voidsuper3)) {
            if (!settings.contains(super_, null) && super_.istIntern()) continue;
            arrayList.add(super_);
        }
        return arrayList;
    }

    public static Vector<super> getAllTharunPRofessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new Brigantai(geschlecht, voidsuper2, voidsuper3));
        vector.add(new ConossischerBauernguerai(geschlecht, voidsuper2, voidsuper3));
        vector.add(new LanianischeHalbeGuerai(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererGuerai(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Numinai(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Masha(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Maturai(geschlecht, voidsuper2, voidsuper3));
        vector.add(new IlshitischerAdliger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new ThuarischeNahamkiim(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererAzaraidesOjoSombri(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererAzaraidesPateshi(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererAzaraidesSindayru(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererAzaraidesShinXirit(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererAzaraidesZirraku(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererAzaraidesNuminoru(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererAzaraidesArkanZin(geschlecht, voidsuper2, voidsuper3));
        vector.add(new NiedererAzaraiderNanurta(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Kymanai(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getDDZProfessionenGesellschaft(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new helden.model.DDZprofessionen.Ausrufer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Barde(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Bettler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Dieb(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Einbrecher(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Gaukler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Haendler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Taugenichts(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Hofkuenstler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Hoefling(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Kurtisane(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Privatlehrer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Spitzel(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Streuner(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Wirt(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getDDZProfessionenHandwerkWissen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new helden.model.DDZprofessionen.Bader(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Bauer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Bergmann(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Edelhandwerker(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Handwerker(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Lakai(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Rattenfaenger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schreiber(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Tageloehner(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Tierbaendiger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Wundarzt(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Gelehrter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Feilscher(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getDDZProfessionenKampf(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new Legionaer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Elitekaempfer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Soldat(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Soeldner(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Gladiator(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Gardist(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Stammeskrieger(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getDDZProfessionenMagisch(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new TochterSatu(geschlecht, voidsuper2, voidsuper3));
        vector.add(new AlhanischeZauberPriesterin(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Kophta(geschlecht, voidsuper2, voidsuper3));
        vector.add(new BosMagier(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Mudramul(geschlecht, voidsuper2, voidsuper3));
        vector.add(new OlafjordMagier(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Druide(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Geode(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Alchemist(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getDDZProfessionenPriester(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new Goetterdiener(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getDDZProfessionenReiseWildnis(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new helden.model.DDZprofessionen.Entdecker(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Botenreiter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Fernhaendler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Fischer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Fuhrmann(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Grenzjaeger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Grosswildjaeger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Hirte(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Jaeger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Karawanenfuehrer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Kundschafter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Prospektor(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Schiffer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schmuggler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.DDZprofessionen.Seefahrer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Strassenraeuber(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static synchronized Vector<super> getEigeneProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Object object;
        Object object2;
        Serializable serializable;
        if (Object == null) {
            Object = new MyHashMap();
            serializable = new File(Einstellungen.getInstance().getPfade().getPfad("mods") + "/Profession");
            object2 = new FilenameFilter(){

                @Override
                public boolean accept(File file, String string) {
                    return string.toLowerCase().endsWith(".xml");
                }
            };
            \u00d200000 = new ArrayList();
            ArrayList arrayList = new ArrayList();
            File[] fileArray = ((File)serializable).listFiles((FilenameFilter)object2);
            if (fileArray != null) {
                for (File comparable2 : fileArray) {
                    try {
                        C c = ModsDatenParser.getInstance().einlesenFile(comparable2, "eigeneprofession");
                        if (c == null || \u00d200000.contains(c.o\u00f60000())) continue;
                        c.\u00f500000(comparable2.getAbsolutePath());
                        if (c.o\u00f80000() != null) {
                            arrayList.add(c);
                        } else {
                            for (String string : c.\u00d5\u00f60000()) {
                                Object.put(string, c);
                            }
                        }
                        for (String string : c.\u00d5\u00f60000()) {
                            \u00d200000.add(string);
                        }
                    }
                    catch (Exception exception) {
                        oooo_0.\u00f500000("Fehler beim Zugriff auf die Datei: " + comparable2);
                        oooo_0.o00000(exception);
                    }
                }
                object = arrayList.iterator();
                while (object.hasNext()) {
                    C c = (C)object.next();
                    String string = c.o\u00f80000();
                    C c2 = (C)Object.get(string);
                    if (c2 == null) continue;
                    c2.o00000(c);
                }
            }
        }
        serializable = new Vector<super>(Object.size());
        object2 = new ArrayList();
        for (File[] fileArray : Object.values()) {
            object = ModsDatenParser.getInstance().einlesenRKPVariante(fileArray.\u00d2\u00f60000());
            if (((ArrayList)object2).contains(((C)object).o\u00f60000())) continue;
            ((ArrayList)object2).add(((C)object).o\u00f60000());
            ((C)object).\u00f500000(fileArray.\u00d5\u00f50000());
            for (C c : fileArray.floatnull()) {
                C c3 = ModsDatenParser.getInstance().einlesenRKPVariante(c.\u00d2\u00f60000());
                c3.\u00f500000(c.\u00d5\u00f50000());
                ((C)object).o00000(c3);
            }
            ((Vector)serializable).add(new EigeneProfession((C)object, geschlecht, voidsuper2, voidsuper3));
        }
        return serializable;
    }

    public static Vector<super> getGesellschaftlicheProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>(16);
        vector.add(new Ausrufer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Barde(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Bettler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Dieb(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Einbrecher(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Gaukler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Haendler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Herold(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Hofkuenstler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Hoefling(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Kurtisane(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Privatlehrer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schriftsteller(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Spitzel(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Streuner(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Taugenichts(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getHandwerklicheProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>(13);
        vector.add(new Bader(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Bauer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Bergmann(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Domestik(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Edelhandwerker(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Gelehrter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Handwerker(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Rattenfaenger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Schreiber(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Tageloehner(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Tierbaendiger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Wirt(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Wundarzt(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<L> getKlerikaleProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<L> vector = new Vector<L>(3);
        vector.add(new Geweihter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Ordenskrieger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schamane(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getKriegerischeProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>(10);
        vector.add(new Amazone(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Gladiator(geschlecht, voidsuper2, voidsuper3));
        vector.add(new FaehnrichFusskaemper(geschlecht, voidsuper2, voidsuper3));
        vector.add(new FaehnrichKavallerie(geschlecht, voidsuper2, voidsuper3));
        vector.add(new FaehnrichSee(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Gardist(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Jahrmarktskaempfer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Krieger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Ritter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schwertgeselle(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Soldat(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Soeldner(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Stammeskrieger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Stabsfaehnrich(geschlecht, voidsuper2, voidsuper3));
        vector.add(new KaempferUdw(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static super getLeerProfession(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super super_ = null;
        try {
            Class<?> clazz = Class.forName("test.helper.LeerProfession");
            Constructor<?> constructor = clazz.getConstructor(Geschlecht.class, voidsuper.class, voidsuper.class);
            super_ = (super)constructor.newInstance(new Object[]{geschlecht, voidsuper2, voidsuper3});
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
        return super_;
    }

    public static Vector<super> getMagischeProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>(19);
        vector.add(new helden.model.profession.Druide(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Bewahrer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Former(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Kaempfer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Legendensaenger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Wildnislaeufer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Zauberweber(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Geode(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Hexe(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Kristallomant(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Alchemist(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Derwisch(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Tierkrieger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Magier(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Scharlatan(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schelm(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Zaubertaenzer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Zibilja(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Lehrmeister(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Bordmagus(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Godi(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Heilari(geschlecht, voidsuper2, voidsuper3));
        vector.add(new WindUndWettermagus(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getMyranorProfessionenGesellschaft(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new Akrobat(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.myranor.profession.Haendler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.myranor.profession.Hoefling(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.myranor.profession.Streuner(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Verkuender(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getMyranorProfessionenHandwerker(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new helden.model.myranor.profession.Dieb(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.myranor.profession.Handwerker(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Heiler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schankdiener(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Scholar(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.myranor.profession.Schreiber(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schwerstarbeiter(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getMyranorProfessionenKampf(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new Athlet(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Gladiator(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Gossenschlaeger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Leibwaechter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Ordnungshueter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schiffskaempfer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Soldaten(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Wildniskrieger(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getMyranorProfessionenMagisch(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new Alshinjira(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Aygon(geschlecht, voidsuper2, voidsuper3));
        vector.add(new BaLoa(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Bashide(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Biagha(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Falschgesicht(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Lichtweberin(geschlecht, voidsuper2, voidsuper3));
        vector.add(new LeonirAnimist(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Geisterwerker(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Makshamant(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Medizinmann(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Monddeuter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new IcemnaOptimat(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Optimat(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Runenmeister(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Sadhaka(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Saithakenner(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Saithyar(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Satudur(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Shanwada(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Sherkumar(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Shindramatha(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Shurhokach(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Sternensaenger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Thulnail(geschlecht, voidsuper2, voidsuper3));
        vector.add(new UnabhaengigerMagier(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Weihertaenzer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Wellenkind(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Windfluesterer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Yachzuq(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.myranor.profession.Zaubertaenzer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Zharzhuri(geschlecht, voidsuper2, voidsuper3));
        vector.add(new MinotaurenAnimist(geschlecht, voidsuper2, voidsuper3));
        vector.add(new SibylleMantiker(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getMyranorProfessionenPriester(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new Stammespriester(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Tempelpriester(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Tempelwaechter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Wanderprediger(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static Vector<super> getMyranorProfessionenReiseWildnis(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>();
        vector.add(new helden.model.myranor.profession.Jaeger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Landarbeiter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Matrose(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Reiter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Sammler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Taucher(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Viehtreiber(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Wanderhaendler(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static String getNamebyID(String string) {
        if (\u00d400000 == null) {
            ProfessionenFabrik.o00000();
        }
        if (\u00d400000.get(string) != null) {
            return \u00d400000.get(string);
        }
        return string;
    }

    public static super getProfession(super super_, Geschlecht geschlecht, OooO oooO2) {
        super super_2 = ProfessionenFabrik.getProfession(super_, geschlecht, oooO2.getMuttersprache(), oooO2.getSchrift());
        super_2.setKulturZweitLehrsprache(oooO2.getZweitLehrsprache());
        return super_2;
    }

    public static super getProfession(super super_, Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Class<?> clazz = super_.getClass();
        for (super super_2 : ProfessionenFabrik.getAlleProfessionen(geschlecht, voidsuper2, voidsuper3)) {
            if (!super_2.getClass().equals(clazz)) continue;
            if (super_2 instanceof EigeneProfession) {
                String string;
                String string2 = ((EigeneProfession)super_2).getID();
                if (!string2.equals(string = ((EigeneProfession)super_).getID())) continue;
                return super_2;
            }
            return super_2;
        }
        throw new IllegalArgumentException("Profession nicht vorhanden");
    }

    public static super getProfessionByID(String string) {
        if (\u00d400000 == null) {
            ProfessionenFabrik.o00000();
        }
        return o00000.get(string);
    }

    public static Vector<super> getReisendeProfessionen(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        Vector<super> vector = new Vector<super>(15);
        vector.add(new helden.model.profession.Botenreiter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Entdecker(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Fernhaendler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Fischer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Fuhrmann(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Grenzjaeger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Grosswildjaeger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Hirte(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Jaeger(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Karawanenfuehrer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Kundschafter(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Prospektor(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Schiffer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Schmuggler(geschlecht, voidsuper2, voidsuper3));
        vector.add(new Seefahrer(geschlecht, voidsuper2, voidsuper3));
        vector.add(new helden.model.profession.Strassenraeuber(geschlecht, voidsuper2, voidsuper3));
        return vector;
    }

    public static boolean isErweiterungBekannt(String string) {
        if (\u00d200000 == null) {
            ProfessionenFabrik.getEigeneProfessionen(Geschlecht.\u00d400000, G.\u00d8\u00f8\u00f4000, G.\u00d3\u00d2\u00f5000);
        }
        return \u00d200000.contains(string);
    }

    public static void professionsListeNeuerstellen() {
        \u00d400000 = null;
    }

    private static void o00000() {
        \u00d400000 = new HashMap();
        o00000 = new HashMap();
        for (super super_ : ProfessionenFabrik.getAlleProfessionen(Geschlecht.\u00d300000, G.whilewhileString, G.\u00d8\u00d8\u00f5000)) {
            for (String string : super_.getIDs()) {
                \u00d400000.put(string, super_.toString());
                o00000.put(string, super_);
            }
        }
        for (super super_ : ProfessionenFabrik.getAlleProfessionen(Geschlecht.\u00d400000, G.whilewhileString, G.\u00d8\u00d8\u00f5000)) {
            for (String string : super_.getIDs()) {
                \u00d400000.put(string, super_.toString());
                o00000.put(string, super_);
            }
        }
    }

    private ProfessionenFabrik() {
    }
}

