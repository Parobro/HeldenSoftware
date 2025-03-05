/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.bedingungen;

import helden.framework.C.I;
import helden.framework.D.H;
import helden.framework.D.OoOO.E;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OOoO.L;
import helden.framework.OOoO.if;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.held.object.oooo_0;
import helden.framework.int.super;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Setting;
import helden.framework.zauber.KonkreterZauber;
import helden.model.KulturFabrik;
import helden.model.RassenFabrik;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Bedingung
extends AbstraktBedingung {
    private boolean \u00f800000;
    private BedingungsArten private;
    private U for;
    private K \u00d200000;
    private Integer \u00f5O0000;
    private Integer \u00d2O0000;
    private I \u00f500000;
    private H \u00d3O0000;
    private P \u00d300000;
    private MagieLevel \u00d5O0000;
    private Class \u00f8O0000;
    private String returnsuper;
    private String null;
    private String String;
    private o00O \u00d500000;
    private Setting oO0000;
    private E \u00f6O0000;
    private Geschlecht \u00d8O0000;
    private List<String> \u00d6O0000;
    private int[] o00000;
    private Object[] newsuper;
    private if \u00f600000;
    private L \u00d800000;
    private oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 \u00d600000;

    public static BedingungsVerknuepfung AND(AbstraktBedingung ... abstraktBedingungArray) {
        return BedingungsVerknuepfung.AND(abstraktBedingungArray);
    }

    public static Bedingung hat(U u2, Integer n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.oo0000);
        bedingung.setWert(new Integer(n));
        bedingung.setAbstrakteEigenschaft(u2);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static AbstraktBedingung hat(Geschlecht geschlecht) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f400000);
        bedingung.setGeschlecht(geschlecht);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hat(Setting setting) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d4o0000);
        bedingung.super(setting);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hat(H h2) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d300000);
        bedingung.setSfbezeichner(h2);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hat(P p2) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f5O0000);
        bedingung.setSonderfertigkeit(p2);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hat(I i2) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f8O0000);
        bedingung.setVorteil(i2);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hat(I i2, int n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.new);
        bedingung.setVorteil(i2);
        bedingung.setWert(n);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hat(I i2, String string) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d8o0000);
        bedingung.setVorteil(i2);
        bedingung.setVariante(string);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatAnimistischRKW(Integer n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.nullsuper);
        bedingung.setWert(n);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static AbstraktBedingung hatEigenschaftenDesGeweihten(String string, int n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d500000);
        bedingung.setVariante(string);
        bedingung.setWert(n);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatGegenstand(String string) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.return);
        bedingung.setVariante(string);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static AbstraktBedingung hatKampfSF(int n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d8O0000);
        bedingung.setWert(n);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatKarma() {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d3o0000);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatKeinKarma() {
        Bedingung bedingung = Bedingung.hatKarma();
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatKulturID(String string) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.forsuper);
        bedingung.setVariante(null);
        bedingung.setKultur(string);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatKulturID(String string, String string2) {
        Bedingung bedingung = Bedingung.hatKulturID(string);
        bedingung.setVariante(string2);
        return bedingung;
    }

    public static Bedingung hatLeiteigenschaft(Integer n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.o00000);
        bedingung.setWert(new Integer(n));
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatLkW(Integer n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f500000);
        bedingung.setWert(n);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static AbstraktBedingung hatMirakelPlusTalente(List<String> list, int ... nArray) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f4o0000);
        bedingung.setMirakelPlus(list, nArray);
        return bedingung;
    }

    public static Bedingung hatMKoderBegabung(E e) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f4O0000);
        bedingung.setMerkmale(e);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatMyrZauber(L l2, int n, Object ... objectArray) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d3O0000);
        bedingung.setWert(n);
        bedingung.\u00d800000 = l2;
        bedingung.newsuper = objectArray;
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatNicht(U u2, Integer n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.oo0000);
        bedingung.setWert(new Integer(n));
        bedingung.setAbstrakteEigenschaft(u2);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNicht(Setting setting) {
        Bedingung bedingung = Bedingung.hat(setting);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNicht(H h2) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d300000);
        bedingung.setSfbezeichner(h2);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNicht(P p2) {
        Bedingung bedingung = Bedingung.hat(p2);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNicht(I i2) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f8O0000);
        bedingung.setVorteil(i2);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNicht(I i2, int n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.new);
        bedingung.setVorteil(i2);
        bedingung.setWert(n);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static AbstraktBedingung hatNichtBegabungDaemonisch() {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d4O0000);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static AbstraktBedingung hatNichtEigenschaftenDesGeweihten(String string, int n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d500000);
        bedingung.setVariante(string);
        bedingung.setWert(n);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNichtHauszauber(KonkreterZauber konkreterZauber) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.thissuper);
        bedingung.setAbstrakteEigenschaft(konkreterZauber);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNichtKulturID(String string) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.forsuper);
        bedingung.setKultur(string);
        bedingung.setVariante(null);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNichtKulturID(String string, String string2) {
        Bedingung bedingung = Bedingung.hatNichtKulturID(string);
        bedingung.setVariante(string2);
        return bedingung;
    }

    public static Bedingung hatNichtProfession(Class clazz) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f800000);
        bedingung.setProfession(clazz);
        bedingung.setVariante(null);
        bedingung.setNegieren(true);
        return bedingung;
    }

    public static Bedingung hatNichtProfession(Class clazz, helden.framework.int.P p2) {
        Bedingung bedingung = Bedingung.hatNichtProfession(clazz);
        bedingung.setVariante(p2.toString());
        return bedingung;
    }

    public static Bedingung hatProfession(Class clazz) {
        Bedingung bedingung = new Bedingung();
        if (!super.class.isAssignableFrom(clazz)) {
            oooo_0.\u00f500000(clazz.toString() + " ist keine Instance von Profession");
        }
        bedingung.setBedingungsArt(BedingungsArten.\u00f800000);
        bedingung.setProfession(clazz);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatProfession(Class clazz, String string) {
        Bedingung bedingung = Bedingung.hatProfession(clazz);
        bedingung.setVariante(string);
        return bedingung;
    }

    public static Bedingung hatProfession(Class clazz, helden.framework.int.P p2) {
        Bedingung bedingung = Bedingung.hatProfession(clazz);
        bedingung.setVariante(p2.toString());
        return bedingung;
    }

    public static Bedingung hatRassenID(String string) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.privatesuper);
        bedingung.setRasse(string);
        bedingung.setVariante(null);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatSchrift(Integer n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d800000);
        bedingung.setWert(n);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatSfAuswahl(H h2, Object ... objectArray) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.Stringsuper);
        bedingung.\u00d3O0000 = h2;
        bedingung.setNegieren(false);
        bedingung.newsuper = objectArray;
        return bedingung;
    }

    public static AbstraktBedingung hatTalente(int n, int n2, voidsuper ... voidsuperArray) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.if);
        bedingung.setAnzahl(n);
        bedingung.setWert(n2);
        bedingung.newsuper = voidsuperArray;
        return bedingung;
    }

    public static AbstraktBedingung hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, int n, int n2) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.while);
        bedingung.setWert(n2);
        bedingung.setAnzahl(n);
        bedingung.setTalentart(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static AbstraktBedingung hatZfWinMerkmal(o00O o00O2, int n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d5O0000);
        bedingung.setWert(n);
        bedingung.setMerkmal(o00O2);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static Bedingung hatZfWinRepraesentation(K k2, Integer n) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d5o0000);
        bedingung.setWert(n);
        bedingung.setRep(k2);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static BedingungsVerknuepfung istHalbgott() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(I.\u00f8\u00d50000), Bedingung.hat(while.\u00d6\u00d8\u00d8000)));
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(while.\u00f5\u00f4\u00f6000), Bedingung.hat(while.\u00d8\u00f5\u00d5000), Bedingung.hat(while.\u00d3oo000), Bedingung.hat(while.forStringString), Bedingung.hat(while.\u00f8\u00d3O000)));
        return bedingungsVerknuepfung;
    }

    public static BedingungsVerknuepfung istHranga() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.ifvoid));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.\u00d20\u00d3000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.\u00f6\u00d2\u00f4000));
        return bedingungsVerknuepfung;
    }

    public static Bedingung istMindestens(MagieLevel magieLevel) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.OO0000);
        bedingung.setMagielevel(magieLevel);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static BedingungsVerknuepfung istMyranischerGott() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(Setting.getByName("Myranor")));
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(I.\u00f5\u00d60000), Bedingung.hat(while.\u00d8\u00d6\u00d5000)));
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(while.\u00f6\u00d2\u00d8000), Bedingung.hat(while.returnpublicString), Bedingung.hat(while.returnvoidclass), Bedingung.hat(while.newsupersuper), Bedingung.hat(while.\u00d8\u00d4o000), Bedingung.hat(while.\u00d60\u00d4000), Bedingung.hat(while.o\u00d8\u00f4000)));
        return bedingungsVerknuepfung;
    }

    public static BedingungsVerknuepfung istNichtFreiWaehlbar() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00f5o0000);
        bedingungsVerknuepfung.addBedingung(bedingung);
        return bedingungsVerknuepfung;
    }

    public static BedingungsVerknuepfung istOktade() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(I.\u00f5\u00d60000), Bedingung.hat(while.\u00d8\u00d6\u00d5000)));
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(while.forStringclass), Bedingung.hat(while.\u00d3\u00d4\u00d6000), Bedingung.hat(while.\u00d8\u00d5\u00d3000), Bedingung.hat(while.\u00d5\u00f4\u00f5000), Bedingung.hat(while.\u00f5\u00d8o000), Bedingung.hat(while.\u00d3\u00d3\u00d3000), Bedingung.hat(while.\u00f6\u00d5o000), Bedingung.hat(while.StringnullObject)));
        return bedingungsVerknuepfung;
    }

    public static Bedingung istSchamane() {
        return Bedingung.istMindestens(MagieLevel.\u00d600000);
    }

    public static BedingungsVerknuepfung istTharunischerGott() {
        return BedingungsVerknuepfung.AND(Bedingung.hat(Setting.\u00f8O0000), new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(I.iffor)), new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(while.\u00f6\u00f6\u00f4000), Bedingung.hat(while.\u00f8\u00d8\u00d5000), Bedingung.hat(while.\u00f8\u00d4\u00d8000), Bedingung.hat(while.returnpublic), Bedingung.hat(while.\u00d6\u00d5o000), Bedingung.hat(while.\u00d3\u00d2\u00f6000), Bedingung.hat(while.\u00f80\u00f5000), Bedingung.hat(while.\u00f5\u00f80000)));
    }

    public static BedingungsVerknuepfung istZwoelfGoettlich() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(Setting.getByName("DSA4.1")));
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(I.\u00d3\u00f5O000), Bedingung.hat(while.o\u00d4\u00d4000)));
        bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(while.returnObjectsuper), Bedingung.hat(while.\u00f6\u00d8\u00f6000), Bedingung.hat(while.\u00d8\u00d8o000), Bedingung.hat(while.\u00f8\u00d3\u00d5000), Bedingung.hat(while.\u00d3\u00d5\u00d5000), Bedingung.hat(while.\u00d6O\u00d2000), Bedingung.hat(while.\u00d3\u00d6\u00f4000), Bedingung.hat(while.oO\u00d3000), Bedingung.hat(while.returnpublicString), Bedingung.hat(while.oo\u00f5000), Bedingung.hat(while.\u00d3O\u00d4000), Bedingung.hat(while.\u00f5\u00d6\u00f6000)));
        return bedingungsVerknuepfung;
    }

    public static Bedingung merkmalskenntis(P p2) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.\u00d400000);
        bedingung.setSonderfertigkeit(p2);
        bedingung.setNegieren(false);
        return bedingung;
    }

    public static BedingungsVerknuepfung OR(AbstraktBedingung ... abstraktBedingungArray) {
        return BedingungsVerknuepfung.OR(abstraktBedingungArray);
    }

    public static Bedingung repraesentation(P p2) {
        Bedingung bedingung = new Bedingung();
        bedingung.setBedingungsArt(BedingungsArten.oO0000);
        bedingung.setSonderfertigkeit(p2);
        bedingung.setNegieren(false);
        return bedingung;
    }

    protected Bedingung() {
    }

    public U getAbstrakteEigenschaft() {
        return this.for;
    }

    public Integer getAnzahl() {
        return this.\u00d2O0000;
    }

    public Object[] getAuswahlen() {
        return this.newsuper;
    }

    public BedingungsArten getBedingungsArt() {
        return this.private;
    }

    public Geschlecht getGeschlecht() {
        return this.\u00d8O0000;
    }

    public String getKultur() {
        return this.returnsuper;
    }

    public List<String> getList() {
        return this.\u00d6O0000;
    }

    public MagieLevel getMagielevel() {
        return this.\u00d5O0000;
    }

    public o00O getMerkmal() {
        return this.\u00d500000;
    }

    public E getMerkmale() {
        return this.\u00f6O0000;
    }

    public L getMyrzauberart() {
        return this.\u00d800000;
    }

    public int[] getNoetigeTalentWerte() {
        return this.o00000;
    }

    public Class getProfession() {
        return this.\u00f8O0000;
    }

    public String getRasse() {
        return this.null;
    }

    public K getRep() {
        return this.\u00d200000;
    }

    public Setting getSettings() {
        return this.oO0000;
    }

    public H getSfbezeichner() {
        return this.\u00d3O0000;
    }

    public P getSonderfertigkeit() {
        return this.\u00d300000;
    }

    public if getSphaere() {
        return this.\u00f600000;
    }

    public oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 getTalentart() {
        return this.\u00d600000;
    }

    public String getVariante() {
        return this.String;
    }

    public I getVorteil() {
        return this.\u00f500000;
    }

    public Integer getWert() {
        return this.\u00f5O0000;
    }

    public boolean isNegieren() {
        return this.\u00f800000;
    }

    public Bedingung negiere() {
        this.setNegieren(this.isNegieren());
        return this;
    }

    public void setAnzahl(Integer n) {
        this.\u00d2O0000 = n;
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.\u00d8O0000 = geschlecht;
    }

    public void setKultur(String string) {
        this.returnsuper = string;
    }

    public void setList(List<String> list) {
        this.\u00d6O0000 = list;
    }

    public void setMagielevel(MagieLevel magieLevel) {
        this.\u00d5O0000 = magieLevel;
    }

    public void setMerkmal(o00O o00O2) {
        this.\u00d500000 = o00O2;
    }

    public void setMerkmale(E e) {
        this.\u00f6O0000 = e;
    }

    public void setMirakelPlus(List<String> list, int[] nArray) {
        this.o00000 = nArray;
        this.\u00d6O0000 = list;
    }

    public void setNoetigeTalentWerte(int[] nArray) {
        this.o00000 = nArray;
    }

    public void setRasse(String string) {
        this.null = string;
    }

    public void setRep(K k2) {
        this.\u00d200000 = k2;
    }

    public void setTalentart(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) {
        this.\u00d600000 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12;
    }

    public void setVariante(String string) {
        this.String = string;
    }

    @Override
    public String toString() {
        switch (this.private) {
            case oo0000: {
                if (this.\u00f800000) {
                    return this.for + "<" + this.\u00f5O0000;
                }
                return this.for + ">=" + this.\u00f5O0000;
            }
            case \u00f8O0000: {
                String string = this.getVorteil().toString();
                if (this.\u00f800000) {
                    string = "kein " + string;
                }
                return string;
            }
            case \u00d8o0000: {
                String string = this.getVorteil().toString() + " (" + this.String + ")";
                if (this.\u00f800000) {
                    string = "kein " + string;
                }
                return string;
            }
            case new: {
                String string = this.getVorteil().toString();
                string = this.\u00f800000 ? string + " < " : string + " >= ";
                string = string + this.getWert();
                return string;
            }
            case \u00d800000: {
                String string = ">=";
                if (this.\u00f800000) {
                    string = "<";
                }
                return "eine Schrift" + string + this.\u00f5O0000;
            }
            case OO0000: {
                String string = "";
                if (this.\u00f800000) {
                    string = "nicht ";
                }
                if (this.getMagielevel().equals((Object)MagieLevel.\u00d300000) || this.getMagielevel().equals((Object)MagieLevel.\u00d800000)) {
                    string = string + " mindestens ";
                }
                return string + this.getMagielevel().toString();
            }
            case \u00f500000: {
                String string = ">=";
                if (this.\u00f800000) {
                    string = "<";
                }
                return "Liturgiekenntnis" + string + this.\u00f5O0000;
            }
            case nullsuper: {
                String string = ">=";
                if (this.\u00f800000) {
                    string = "<";
                }
                return "Animistische Ritualkenntnis" + string + this.\u00f5O0000;
            }
            case \u00d300000: {
                String string = "";
                if (this.\u00f800000) {
                    string = "nicht ";
                }
                return string + this.getSfbezeichner().toString();
            }
            case \u00f800000: {
                String string = "";
                if (this.\u00f800000) {
                    string = "nicht ";
                }
                string = string + this.getProfession().getName();
                if (this.getVariante() != null) {
                    string = string + "/" + this.getVariante();
                }
                return string;
            }
            case \u00d5o0000: {
                String string = ">=";
                if (this.\u00f800000) {
                    string = "<";
                }
                return "ZfW(" + this.getRep() + ") " + string + this.\u00f5O0000;
            }
            case \u00d5O0000: {
                String string = ">=";
                if (this.\u00f800000) {
                    string = "<";
                }
                return "ZfW(" + this.getMerkmal() + ") " + string + this.\u00f5O0000;
            }
            case o00000: {
                String string = ">=";
                if (this.\u00f800000) {
                    string = "<";
                }
                return "Leiteigenschaft " + string + this.\u00f5O0000;
            }
            case \u00d400000: {
                String string = "";
                if (this.\u00f800000) {
                    string = "nicht ";
                }
                return string + "Voraussetzungen f\u00fcr Merkmalskenntnis";
            }
            case \u00f5O0000: {
                String string = "";
                if (this.\u00f800000) {
                    string = "nicht ";
                }
                return string + this.getSonderfertigkeit().toString();
            }
            case \u00d4o0000: {
                String string = "";
                if (this.\u00f800000) {
                    string = "nicht ";
                }
                return string + this.getSettings().toString();
            }
            case \u00d3o0000: {
                if (this.\u00f800000) {
                    return "hat kein Karma";
                }
                return "hat Karma";
            }
            case \u00f4O0000: {
                if (this.\u00f800000) {
                    return "hat nicht MK/Begabung [" + this.getMerkmale() + "]";
                }
                return "hat MK/Begabung [" + this.getMerkmale() + "]";
            }
            case \u00d4O0000: {
                if (this.\u00f800000) {
                    return "hat keine Begabung d\u00e4moisch";
                }
                return "hat eine Begabung d\u00e4moisch";
            }
            case \u00f400000: {
                if (this.\u00f800000) {
                    return "nicht " + this.getGeschlecht().toString();
                }
                return this.getGeschlecht().toString();
            }
            case \u00f4o0000: {
                String string = this.\u00f800000 ? "nicht Mirkael Talente auf Taw: " : "Mirkael Talente auf folgende Taw: ";
                for (int n : this.getNoetigeTalentWerte()) {
                    string = string + n + " ";
                }
                return string;
            }
            case \u00d500000: {
                if (this.\u00f800000) {
                    return "hat nicht die n\u00f6tigen Engeschaften " + this.getWert() + " von" + this.getVariante();
                }
                return "hat die n\u00f6tigen Eigeschaften " + this.getWert() + " von" + this.getVariante();
            }
            case Stringsuper: {
                String string = "" + this.\u00d3O0000;
                for (Object object : this.newsuper) {
                    string = string + " " + object;
                }
                if (this.\u00f800000) {
                    return "hat nicht " + string;
                }
                return "hat " + string;
            }
            case oO0000: {
                String string = "Sondervoraussetzungen f\u00fcr Repr\u00e4sentationen";
                if (this.\u00f800000) {
                    return "hat nicht " + string;
                }
                return "hat " + string;
            }
            case \u00d8O0000: {
                return "Kampfsonderfertigkeit " + this.getWert() + " AP";
            }
            case while: {
                return this.\u00d2O0000 + "x Talent(" + this.\u00d600000 + ") auf mindestens " + this.\u00f5O0000;
            }
            case privatesuper: {
                String string = RassenFabrik.getRasseByID(this.null).toString();
                if (this.\u00f800000) {
                    return "hat nicht " + string;
                }
                return "hat " + string;
            }
            case forsuper: {
                String string = KulturFabrik.getKulturByID(this.returnsuper).toString();
                if (this.\u00f800000) {
                    return "hat nicht " + string;
                }
                return "hat " + string;
            }
            case \u00d3O0000: {
                String string = "Myr. Zauber " + (Object)((Object)this.getMyrzauberart()) + " auf " + this.getWert();
                if (this.newsuper == null || this.newsuper.length > 0) {
                    // empty if block
                }
                if (this.\u00f800000) {
                    return "hat nicht " + string;
                }
                return "hat " + string;
            }
        }
        return "fehlt[" + (Object)((Object)this.private) + "]!";
    }

    @Override
    public String toStringFormatiertHTML() {
        return "<html><body>" + this.toStringFormatiert(0).replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\n", "<br>").replace(" ", "&nbsp;");
    }

    protected void setAbstrakteEigenschaft(U u2) {
        this.for = u2;
    }

    protected void setBedingungsArt(BedingungsArten bedingungsArten) {
        this.private = bedingungsArten;
    }

    protected void setNegieren(boolean bl) {
        this.\u00f800000 = bl;
    }

    protected void setProfession(Class clazz) {
        this.\u00f8O0000 = clazz;
    }

    protected void setSfbezeichner(H h2) {
        this.\u00d3O0000 = h2;
    }

    protected void setSonderfertigkeit(P p2) {
        this.\u00d300000 = p2;
    }

    protected void setVorteil(I i2) {
        this.\u00f500000 = i2;
    }

    protected void setWert(Integer n) {
        this.\u00f5O0000 = n;
    }

    private void super(Setting setting) {
        this.oO0000 = setting;
    }

    public static enum MagieLevel {
        \u00d800000,
        \u00d300000,
        \u00d500000,
        String,
        \u00d600000,
        o00000;

    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum BedingungsArten {
        oo0000,
        \u00d300000,
        \u00f8O0000,
        \u00d800000,
        OO0000,
        \u00f500000,
        \u00f800000,
        \u00d5o0000,
        o00000,
        \u00d400000,
        oO0000,
        forsuper,
        \u00f5O0000,
        \u00f5o0000,
        \u00d3o0000,
        privatesuper,
        \u00d5O0000,
        new,
        \u00d4o0000,
        thissuper,
        \u00f4O0000,
        \u00d4O0000,
        \u00f400000,
        \u00f4o0000,
        \u00d8o0000,
        \u00d500000,
        Stringsuper,
        nullsuper,
        \u00d3O0000,
        \u00d8O0000,
        while,
        if,
        return;

    }
}

