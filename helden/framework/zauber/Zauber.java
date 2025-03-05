/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.zauber;

import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.oooo.b_0;
import helden.framework.oooo.l_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_1;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import helden.framework.zauber.ZauberFabrik;
import helden.framework.zauber.ZauberVerbreitung;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zauber
extends oo0o_0
implements Comparable<Object> {
    public static final Zauber \u00d8\u00d6\u00d3000 = new Zauber("Abvenenum reine Speise", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("ob"), new oooo_1("LCD", 11), "+Mod");
    public static final Zauber \u00d8\u00d4\u00d3000 = new Zauber("Accuratum Zaubernadel", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("ob"), new oooo_1("LCD", 12), "+Mod");
    public static final Zauber o\u00d3\u00d3000 = new Zauber("Adamantium Erzstruktur", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("erob"), new oooo_1("LCD", 13), "");
    public static final Zauber \u00d4\u00f8\u00d3000 = new Zauber("Adlerauge Luchsenohr", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("eihl"), new oooo_1("LCD", 15), "");
    public static final Zauber \u00f4\u00f8\u00d2000 = new Zauber("Adlerschwinge Wolfsgestalt", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("fo"), new oooo_1("LCD", 16), "+Mod", "Adlerschwinge");
    public static final Zauber \u00d4O\u00d3000 = new Zauber("Aeolitus Windgebraus", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("euum"), new oooo_1("LCD", 18), "");
    public static final Zauber o\u00f4\u00d3000 = new Zauber("Aerofugo Vakuum", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("euum"), new oooo_1("LCD", 19), "");
    public static final Zauber whileStringnew = new Zauber("Aerogelo Atemqual", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("euum"), new oooo_1("LCD", 20), "");
    public static final Zauber \u00f5\u00d5\u00d4000 = new Zauber("Alpgestalt", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eshr"), new oooo_1("LCD", 21), "+MR");
    public static final Zauber \u00d5\u00f6\u00d4000 = new Zauber("Analys Arkanstruktur", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("hlme"), new oooo_1("LCD", 22), "+Mod");
    public static final Zauber \u00d5\u00d8\u00d3000 = new Zauber("\u00c4ngste lindern", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 23), "");
    public static final Zauber nullclassnew = new Zauber("Animatio stummer Diener", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("te"), new oooo_1("LCD", 24), "");
    public static final Zauber privateintnew = new Zauber("Applicatus Zauberspeicher", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("meob"), new oooo_1("LCD", 25), "");
    public static final Zauber \u00d3O\u00d4000 = new Zauber("Aquafaxius Wasserstrahl", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("ewsc"), new oooo_1("LCD", 122), "", "Elementare Geschosse");
    public static final Zauber \u00f8\u00f6\u00d3000 = new Zauber("Aquasphaero Wasserball", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ewscte"), new oooo_1("LCD", 124), "", "Elementare Explosionen");
    public static final Zauber privateinterfacenew = new Zauber("Arachnea Krabbeltier", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hb"), new oooo_1("LCD", 26), "");
    public static final Zauber nullpublicnew = new Zauber("Arcanovi Artefakt", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("meob"), new oooo_1("LCD", 27), "", "Arcanovi");
    public static final Zauber \u00f8\u00d2\u00d3000 = new Zauber("Archofaxius Erzstrahl", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("ersc"), new oooo_1("LCD", 122), "", "Elementare Geschosse");
    public static final Zauber privateObjectnew = new Zauber("Archosphaero Erzball", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("erscte"), new oooo_1("LCD", 124), "", "Elementare Explosionen");
    public static final Zauber \u00f8\u00f8\u00d2000 = new Zauber("Armatrutz", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eier"), new oooo_1("LCD", 28), "");
    public static final Zauber \u00f4\u00d5\u00d4000 = new Zauber("Atemnot", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("ei"), new oooo_1("LCD", 29), "+MR");
    public static final Zauber newfornew = new Zauber("Attributo", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.o\u00f5\u00d2000), o00O.o00000("ei"), new oooo_1("LCD", 30), "");
    public static final Zauber \u00d30\u00d5000 = new Zauber("Aufgeblasen Abgehoben", s_0.Object, new l_0(b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("eufo"), new oooo_1("LCD", 31), "+MR");
    public static final Zauber \u00f5\u00f4\u00d4000 = new Zauber("Auge des Limbus", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("krli"), new oooo_1("LCD", 32), "");
    public static final Zauber O\u00f5\u00d4000 = new Zauber("Aureolus G\u00fcldenglanz", s_0.\u00d500000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 33), "");
    public static final Zauber \u00f8\u00d6\u00d3000 = new Zauber("Auris Nasus Oculus", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 35), "");
    public static final Zauber \u00d4\u00d6\u00d4000 = new Zauber("Axxeleratus Blitzgeschwind", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ei"), new oooo_1("LCD", 36), "");
    public static final Zauber \u00f8o\u00d4000 = new Zauber("Balsam Salabunde", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("fohe"), new oooo_1("LCD", 37), "+Mod");
    public static final Zauber o0\u00d4000 = new Zauber("Band und Fessel", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("es"), new oooo_1("LCD", 38), "+MR");
    public static final Zauber \u00d3\u00f8\u00d3000 = new Zauber("Bannbaladin", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 39), "+MR");
    public static final Zauber \u00d3\u00f6\u00d4000 = new Zauber("B\u00e4renruhe Winterschlaf", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.privatedosuper, b_0.returnwhilesuper), o00O.o00000("fo"), new oooo_1("LCD", 40), "+Mod");
    public static final Zauber O\u00d2\u00d4000 = new Zauber("Beherrschung brechen", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("anhr"), new oooo_1("LCD", 41), "+Mod");
    public static final Zauber \u00d5\u00f4\u00d4000 = new Zauber("Beschw\u00f6rung vereiteln", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("anbe"), new oooo_1("LCD", 42), "+Mod");
    public static final Zauber \u00d8\u00f6\u00d3000 = new Zauber("Bewegung st\u00f6ren", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("ante"), new oooo_1("LCD", 43), "+Mod");
    public static final Zauber whilethisnew = new Zauber("Blendwerk", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 44), "");
    public static final Zauber \u00f4\u00f6\u00d4000 = new Zauber("Blick aufs Wesen", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hl"), new oooo_1("LCD", 45), "+MR");
    public static final Zauber \u00d3\u00f8\u00d2000 = new Zauber("Blick durch fremde Augen", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hlve"), new oooo_1("LCD", 46), "+MR");
    public static final Zauber \u00d40\u00d4000 = new Zauber("Blick in die Gedanken", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hl"), new oooo_1("LCD", 47), "+MR");
    public static final Zauber o\u00f4\u00d4000 = new Zauber("Blick in die Vergangenheit", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("hltp"), new oooo_1("LCD", 48), "");
    public static final Zauber O\u00d3\u00d4000 = new Zauber("Blitz dich find", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 49), "+MR");
    public static final Zauber forintnew = new Zauber("B\u00f6ser Blick", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 50), "+MR");
    public static final Zauber \u00d5\u00d2\u00d5000 = new Zauber("Brenne toter Stoff!", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("efob"), new oooo_1("LCD", 51), "", "Elementare Umformung");
    public static final Zauber O\u00d6\u00d4000 = new Zauber("Caldofrigo hei\u00df und kalt", s_0.\u00f600000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("efeeobum"), new oooo_1("LCD", 52), "");
    public static final Zauber \u00f80\u00d4000 = new Zauber("Chamaelioni Mimikry", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 54), "");
    public static final Zauber O0\u00d4000 = new Zauber("Chimaeroform Hybridgestalt", s_0.\u00f500000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("dsfo"), new oooo_1("LCD", 55), "+Mod");
    public static final Zauber \u00d5\u00d4\u00d4000 = new Zauber("Chronoklassis Urfossil", s_0.\u00f500000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("hbtp"), new oooo_1("LCD", 56), "+Mod");
    public static final Zauber o\u00f8\u00d3000 = new Zauber("Chrononautos Zeitenfahrt", s_0.\u00f500000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("tp"), new oooo_1("LCD", 57), "+Mod");
    public static final Zauber \u00d8\u00d8\u00d3000 = new Zauber("Claudibus Clavistibor", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.privatedosuper), o00O.o00000("ob"), new oooo_1("LCD", 58), "");
    public static final Zauber \u00d4\u00d2\u00d5000 = new Zauber("Corpofesso Gliederschmerz", s_0.Object, new l_0(b_0.newwhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("ei"), new oooo_1("LCD", 59), "+MR");
    public static final Zauber \u00f5\u00d6\u00d4000 = new Zauber("Corpofrigo K\u00e4lteschock", s_0.Object, new l_0(b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eiee"), new oooo_1("LCD", 60), "+MR");
    public static final Zauber o\u00f5\u00d3000 = new Zauber("Cryptographo Zauberschrift", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("obve"), new oooo_1("LCD", 61), "");
    public static final Zauber \u00f8\u00d2\u00d5000 = new Zauber("Custodosigil Diebesbann", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("efmeob"), new oooo_1("LCD", 62), "");
    public static final Zauber O\u00d8\u00d3000 = new Zauber("D\u00e4monenbann", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("anda"), new oooo_1("LCD", 63), "+Mod");
    public static final Zauber \u00f5O\u00d3000 = new Zauber("Delicioso Gaumenschmaus", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 64), "");
    public static final Zauber O\u00d4\u00d3000 = new Zauber("Desintegratus Pulverstaub", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("obsc"), new oooo_1("LCD", 65), "");
    public static final Zauber \u00f4\u00f4\u00d4000 = new Zauber("Destructibo Arcanitas", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("ankrme"), new oooo_1("LCD", 66), "+Mod");
    public static final Zauber o\u00d2\u00d4000 = new Zauber("Dichter und Denker", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 67), "+MR");
    public static final Zauber O0\u00d5000 = new Zauber("Dschinnenruf", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("elhb"), new oooo_1("LCD", 68), "+Mod");
    public static final Zauber \u00d5\u00f6\u00d3000 = new Zauber("Dunkelheit", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("um"), new oooo_1("LCD", 69), "");
    public static final Zauber \u00f8\u00f5\u00d3000 = new Zauber("Duplicatus Doppelbild", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 70), "+Mod");
    public static final Zauber \u00d30\u00d3000 = new Zauber("Ecliptifactus Schattenkraft", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("dafo"), new oooo_1("LCD", 71), "");
    public static final Zauber \u00d8\u00f5\u00d3000 = new Zauber("Eigenschaft wiederherstellen", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("anei"), new oooo_1("LCD", 73), "+Mod");
    public static final Zauber returnfornew = new Zauber("Eigne \u00c4ngste qu\u00e4len dich!", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eies"), new oooo_1("LCD", 74), "+MR");
    public static final Zauber \u00d8\u00d3\u00d4000 = new Zauber("Einfluss bannen", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("anes"), new oooo_1("LCD", 75), "+Mod");
    public static final Zauber thispublicnew = new Zauber("Eins mit der Natur", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eiel"), new oooo_1("LCD", 76), "");
    public static final Zauber \u00d8o\u00d5000 = new Zauber("Eisenrost und Patina", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("obtp"), new oooo_1("LCD", 77), "");
    public static final Zauber \u00d8O\u00d4000 = new Zauber("Eisesk\u00e4lte K\u00e4mpferherz", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ei"), new oooo_1("LCD", 78), "");
    public static final Zauber \u00f4\u00f6\u00d3000 = new Zauber("Elementarbann", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("anel"), new oooo_1("LCD", 79), "+Mod");
    public static final Zauber \u00f8\u00f5\u00d4000 = new Zauber("Elementarer Diener", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("elhb"), new oooo_1("LCD", 80), "+Mod");
    public static final Zauber \u00f4\u00f8\u00d3000 = new Zauber("Elfenstimme Fl\u00f6tenton", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ve"), new oooo_1("LCD", 81), "");
    public static final Zauber nullvoidnew = new Zauber("Erinnerung verlasse dich!", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 82), "+MR");
    public static final Zauber \u00f4\u00f4\u00d3000 = new Zauber("Exposami Lebenskraft", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("hl"), new oooo_1("LCD", 83), "+Mod");
    public static final Zauber o\u00d8\u00d3000 = new Zauber("Falkenauge Meisterschuss", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("ei"), new oooo_1("LCD", 84), "");
    public static final Zauber \u00d80\u00d5000 = new Zauber("Favilludo Funkentanz", s_0.\u00d500000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 85), "");
    public static final Zauber newthisObject = new Zauber("Feuerlauf", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eief"), new oooo_1("", 0), "", "Elementare Bewegungen");
    public static final Zauber \u00d8\u00f4\u00d3000 = new Zauber("Firnlauf", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eiee"), new oooo_1("LCD", 86), "", "Elementare Bewegungen");
    public static final Zauber Stringpublicnew = new Zauber("Flim Flam Funkel", s_0.\u00d500000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("um"), new oooo_1("LCD", 87), "");
    public static final Zauber \u00d5\u00f5\u00d3000 = new Zauber("Fluch der Pestilenz", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("db"), new oooo_1("LCD", 88), "+MR");
    public static final Zauber O\u00f6\u00d4000 = new Zauber("Foramen Foraminor", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("hlte"), new oooo_1("LCD", 89), "+Mod");
    public static final Zauber forinterfacenew = new Zauber("Fortifex arkane Wand", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("erum"), new oooo_1("LCD", 90), "");
    public static final Zauber returnthisnew = new Zauber("Frigifaxius Eisstrahl", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("eesc"), new oooo_1("LCD", 122), "", "Elementare Geschosse");
    public static final Zauber Oo\u00d3000 = new Zauber("Frigisphaero Eisball", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eescte"), new oooo_1("LCD", 124), "", "Elementare Explosionen");
    public static final Zauber \u00d5\u00d2\u00d3000 = new Zauber("Fulminictus Donnerkeil", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("krsc"), new oooo_1("LCD", 91), "");
    public static final Zauber \u00d3\u00d3\u00d4000 = new Zauber("Gardianum Zauberschild", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ankrme"), new oooo_1("LCD", 92), "");
    public static final Zauber \u00f4O\u00d4000 = new Zauber("Gedankenbilder Elfenruf", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ve"), new oooo_1("LCD", 94), "");
    public static final Zauber privatesupernew = new Zauber("Gef\u00e4\u00df der Jahre", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("fotp"), new oooo_1("LCD", 95), "");
    public static final Zauber \u00d3o\u00d3000 = new Zauber("Gefunden!", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("hl"), new oooo_1("LCD", 96), "+Mod");
    public static final Zauber ifthisObject = new Zauber("Geisterbann", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ange"), new oooo_1("LCD", 97), "+Mod");
    public static final Zauber nullinterfacesuper = new Zauber("Geisterruf", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("gehb"), new oooo_1("LCD", 98), "+Mod");
    public static final Zauber \u00f5\u00f5\u00d3000 = new Zauber("Gletscherwand", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ee"), new oooo_1("LCD", 275), "", "Elementare W\u00e4nde");
    public static final Zauber \u00f5\u00d2\u00d4000 = new Zauber("Granit und Marmor", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("erfo"), new oooo_1("LCD", 99), "+MR");
    public static final Zauber \u00f5\u00f4\u00d3000 = new Zauber("Gro\u00dfe Gier", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eshr"), new oooo_1("LCD", 100), "+MR");
    public static final Zauber \u00f5\u00d4\u00d4000 = new Zauber("Gro\u00dfe Verwirrung", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ei"), new oooo_1("LCD", 101), "+MR");
    public static final Zauber \u00f5\u00d8\u00d3000 = new Zauber("Halluzination", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 102), "+MR");
    public static final Zauber \u00d3O\u00d3000 = new Zauber("Harmlose Gestalt", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("esil"), new oooo_1("LCD", 103), "");
    public static final Zauber \u00f40\u00d3000 = new Zauber("Hartes schmelze!", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.privatedosuper), o00O.o00000("ewob"), new oooo_1("LCD", 104), "", "Elementare Umformung");
    public static final Zauber \u00d5\u00f8\u00d4000 = new Zauber("Haselbusch und Ginsterkraut", s_0.o00000, new l_0(b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("eiehfo"), new oooo_1("LCD", 105), "");
    public static final Zauber \u00d5O\u00d3000 = new Zauber("Heilkraft bannen", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("anhe"), new oooo_1("LCD", 107), "+Mod");
    public static final Zauber \u00d8O\u00d5000 = new Zauber("Hellsicht tr\u00fcben", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("anhl"), new oooo_1("LCD", 108), "+MR");
    public static final Zauber \u00d5\u00f8\u00d3000 = new Zauber("Herbeirufung vereiteln", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("anhb"), new oooo_1("LCD", 109), "+Mod");
    public static final Zauber \u00d3O\u00d5000 = new Zauber("Herr \u00fcber das Tierreich", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 110), "+MR");
    public static final Zauber nullObjectnew = new Zauber("Herzschlag ruhe!", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("dleies"), new oooo_1("LCD", 111), "+MR");
    public static final Zauber \u00f4\u00d2\u00d3000 = new Zauber("Hexenblick", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ve"), new oooo_1("LCD", 112), "");
    public static final Zauber \u00f8O\u00d5000 = new Zauber("Hexengalle", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("sc"), new oooo_1("LCD", 113), "");
    public static final Zauber O\u00f5\u00d3000 = new Zauber("Hexenholz", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.privatedosuper), o00O.o00000("te"), new oooo_1("LCD", 114), "");
    public static final Zauber \u00d5\u00f4\u00d3000 = new Zauber("Hexenknoten", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("esil"), new oooo_1("LCD", 115), "");
    public static final Zauber \u00d3\u00d3\u00d3000 = new Zauber("Hexenkrallen", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eifo"), new oooo_1("LCD", 116), "");
    public static final Zauber O\u00d5\u00d3000 = new Zauber("Hexenspeichel", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("he"), new oooo_1("LCD", 117), "");
    public static final Zauber iffornew = new Zauber("Hilfreiche Tatze, rettende Schwinge", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("esve"), new oooo_1("LCD", 118), "+MR");
    public static final Zauber Stringsupernew = new Zauber("H\u00f6llenpein zerrei\u00dfe dich!", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("es"), new oooo_1("LCD", 119), "+MR");
    public static final Zauber \u00f5O\u00d4000 = new Zauber("Holterdipolter", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("um"), new oooo_1("LCD", 120), "");
    public static final Zauber o\u00d2\u00d5000 = new Zauber("Horriphobus Schreckgestalt", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 121), "+MR");
    public static final Zauber \u00d8\u00d5\u00d4000 = new Zauber("Humofaxius Humusstrahl", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("ehsc"), new oooo_1("LCD", 122), "", "Elementare Geschosse");
    public static final Zauber o\u00d4\u00d3000 = new Zauber("Humosphaero Humusball", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ehscte"), new oooo_1("LCD", 124), "", "Elementare Explosionen");
    public static final Zauber \u00f5\u00d3\u00d4000 = new Zauber("Ignifaxius Flammenstrahl", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("efsc"), new oooo_1("LCD", 122), "", "Elementare Geschosse");
    public static final Zauber \u00d80\u00d3000 = new Zauber("Ignisphaero Feuerball", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("efscte"), new oooo_1("LCD", 124), "", "Elementare Explosionen");
    public static final Zauber whilenullnew = new Zauber("Ignorantia Ungesehn", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("esil"), new oooo_1("LCD", 125), "");
    public static final Zauber forpublicnew = new Zauber("Illusion aufl\u00f6sen", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("anil"), new oooo_1("LCD", 126), "");
    public static final Zauber \u00d5\u00d3\u00d4000 = new Zauber("Immortalis Lebenszeit", s_0.\u00f500000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("fotp"), new oooo_1("LCD", 127), "");
    public static final Zauber \u00f80\u00d5000 = new Zauber("Imperavi Handlungszwang", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 128), "+MR");
    public static final Zauber \u00f5o\u00d3000 = new Zauber("Impersona Maskenbild", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 129), "");
    public static final Zauber \u00d4\u00d3\u00d4000 = new Zauber("Infinitum Immerdar", s_0.\u00f500000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("metp"), new oooo_1("LCD", 130), "+Mod");
    public static final Zauber \u00d4\u00d5\u00d4000 = new Zauber("Invercano Spiegeltrick", s_0.\u00f500000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("ankrme"), new oooo_1("LCD", 131), "");
    public static final Zauber \u00f8\u00d5\u00d3000 = new Zauber("Invocatio maior", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("beda"), new oooo_1("LCD", 132), "+Mod");
    public static final Zauber \u00d4\u00d6\u00d3000 = new Zauber("Invocatio minor", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("beda"), new oooo_1("LCD", 133), "+Mod");
    public static final Zauber o0\u00d3000 = new Zauber("Iribaars Hand", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("dmessc"), new oooo_1("LCD", 134), "+MR");
    public static final Zauber \u00f4\u00f8\u00d4000 = new Zauber("Juckreiz, d\u00e4mlicher!", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 135), "+MR");
    public static final Zauber \u00d4o\u00d4000 = new Zauber("Karnifilio Raserei", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eies"), new oooo_1("LCD", 136), "+MR");
    public static final Zauber StringObjectnew = new Zauber("Katzenaugen", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("ei"), new oooo_1("LCD", 137), "");
    public static final Zauber O\u00d2\u00d5000 = new Zauber("Klarum Purum", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("fohe"), new oooo_1("LCD", 138), "+Mod");
    public static final Zauber \u00f5\u00f8\u00d2000 = new Zauber("Klickeradomms", s_0.\u00d500000, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.privatedosuper), o00O.o00000("te"), new oooo_1("LCD", 139), "");
    public static final Zauber \u00d4\u00f8\u00d2000 = new Zauber("Koboldgeschenk", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 140), "+MR");
    public static final Zauber \u00f40\u00d5000 = new Zauber("Koboldovision", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hlli"), new oooo_1("LCD", 141), "");
    public static final Zauber thisdonew = new Zauber("Komm Kobold Komm", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hb"), new oooo_1("LCD", 142), "");
    public static final Zauber \u00f4\u00d3\u00d4000 = new Zauber("K\u00f6rperlose Reise", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("live"), new oooo_1("LCD", 143), "");
    public static final Zauber \u00f50\u00d4000 = new Zauber("Krabbelnder Schrecken", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("dbhb"), new oooo_1("LCD", 144), "");
    public static final Zauber whilewhilenew = new Zauber("Kraft des Erzes", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("erob"), new oooo_1("LCD", 145), "", "Elementare Konzentration");
    public static final Zauber \u00d8\u00f5\u00d4000 = new Zauber("Kr\u00e4henruf", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eshbli"), new oooo_1("LCD", 146), "", "Tierruf");
    public static final Zauber ifprivatesuper = new Zauber("Kr\u00f6tensprung", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("ei"), new oooo_1("LCD", 148), "");
    public static final Zauber \u00f5o\u00d4000 = new Zauber("Kulminatio Kugelblitz", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("sc"), new oooo_1("LCD", 149), "");
    public static final Zauber \u00f8\u00d2\u00d4000 = new Zauber("Kusch!", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 150), "+MR");
    public static final Zauber O\u00d6\u00d3000 = new Zauber("Lach dich gesund", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eshe"), new oooo_1("LCD", 151), "");
    public static final Zauber O\u00d3\u00d3000 = new Zauber("Lachkrampf", s_0.Object, new l_0(b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 152), "+MR");
    public static final Zauber returnprivatenew = new Zauber("Langer Lulatsch", s_0.o00000, new l_0(b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("foob"), new oooo_1("LCD", 153), "+MR");
    public static final Zauber \u00d4\u00d5\u00d3000 = new Zauber("Last des Alters", s_0.\u00f600000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("fotp"), new oooo_1("LCD", 154), "+MR");
    public static final Zauber O\u00d8\u00d4000 = new Zauber("Leib der Erde", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("ehfo"), new oooo_1("LCD", 155), "", "Elementare Leiber");
    public static final Zauber \u00d4\u00f5\u00d3000 = new Zauber("Leib der Wogen", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("ewfo"), new oooo_1("LCD", 157), "", "Elementare Leiber");
    public static final Zauber \u00d5O\u00d4000 = new Zauber("Leib des Eises", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eefo"), new oooo_1("LCD", 159), "", "Elementare Leiber");
    public static final Zauber \u00d5o\u00d3000 = new Zauber("Leib des Erzes", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.\u00f4\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("erfo"), new oooo_1("LCD", 160), "", "Elementare Leiber");
    public static final Zauber \u00d4\u00f8\u00d4000 = new Zauber("Leib des Feuers", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("effo"), new oooo_1("LCD", 162), "", "Elementare Leiber");
    public static final Zauber \u00d8\u00f6\u00d4000 = new Zauber("Leib des Windes", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.\u00f4\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("eufo"), new oooo_1("LCD", 164), "", "Elementare Leiber");
    public static final Zauber whilethisObject = new Zauber("Leidensbund", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("heve"), new oooo_1("LCD", 165), "");
    public static final Zauber \u00f4O\u00d3000 = new Zauber("Levthans Feuer", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("esve"), new oooo_1("LCD", 166), "+MR");
    public static final Zauber o\u00d6\u00d4000 = new Zauber("Limbus versiegeln", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("anli"), new oooo_1("LCD", 167), "+Mod");
    public static final Zauber \u00d3\u00d8\u00d4000 = new Zauber("Lockruf und Feenf\u00fc\u00dfe", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("ilte"), new oooo_1("LCD", 168), "");
    public static final Zauber \u00d4\u00d3\u00d5000 = new Zauber("Lunge des Leviatan", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("he"), new oooo_1("LCD", 169), "");
    public static final Zauber \u00d4\u00d2\u00d3000 = new Zauber("Madas Spiegel", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("hlve"), new oooo_1("LCD", 170), "");
    public static final Zauber oO\u00d5000 = new Zauber("Magischer Raub", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("krve"), new oooo_1("LCD", 171), "+MR");
    public static final Zauber \u00f8\u00d6\u00d4000 = new Zauber("Mahlstrom", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("ewum"), new oooo_1("LCD", 172), "", "Elementare Wirbel");
    public static final Zauber \u00d5\u00d5\u00d4000 = new Zauber("Manifesto Element", s_0.\u00d500000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("el"), new oooo_1("LCD", 173), "+Mod");
    public static final Zauber \u00f8o\u00d5000 = new Zauber("Meister der Elemente", s_0.\u00f500000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("elhb"), new oooo_1("LCD", 174), "+Mod");
    public static final Zauber \u00d5\u00d6\u00d4000 = new Zauber("Meister minderer Geister", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hb"), new oooo_1("LCD", 175), "");
    public static final Zauber o\u00d5\u00d4000 = new Zauber("Memorabia Falsifir", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 176), "+Mod");
    public static final Zauber \u00d50\u00d4000 = new Zauber("Memorans Ged\u00e4chtniskraft", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("eihl"), new oooo_1("LCD", 177), "");
    public static final Zauber \u00d3\u00d3\u00d5000 = new Zauber("Menetekel Flammenschrift", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 178), "");
    public static final Zauber O\u00f4\u00d3000 = new Zauber("Metamagie neutralisieren", s_0.\u00f500000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("anme"), new oooo_1("LCD", 179), "+Mod");
    public static final Zauber \u00d5o\u00d4000 = new Zauber("Metamorpho Gletscherform", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.privatedosuper), o00O.o00000("eeob"), new oooo_1("LCD", 180), "", "Elementare Verformung");
    public static final Zauber returnStringnew = new Zauber("Metamorpho Felsenform", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.privatedosuper), o00O.o00000("erob"), new oooo_1("LCD", 180), "", "Elementare Verformung");
    public static final Zauber \u00f5\u00d5\u00d3000 = new Zauber("Motoricus", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.privatedosuper), o00O.o00000("te"), new oooo_1("LCD", 181), "+Mod");
    public static final Zauber \u00f4\u00d6\u00d3000 = new Zauber("Movimento Dauerlauf", s_0.\u00d500000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ei"), new oooo_1("LCD", 183), "");
    public static final Zauber Stringclassnew = new Zauber("Murks und Patz", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 184), "+MR");
    public static final Zauber whileprivatesuper = new Zauber("Nackedei", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("obte"), new oooo_1("LCD", 185), "+RS");
    public static final Zauber o\u00f8\u00d4000 = new Zauber("Nebelleib", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("euewfo"), new oooo_1("LCD", 186), "");
    public static final Zauber \u00d4\u00f6\u00d3000 = new Zauber("Nebelwand und Morgendunst", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("euewum"), new oooo_1("LCD", 187), "");
    public static final Zauber \u00d8\u00d2\u00d3000 = new Zauber("Nekropathia Seelenreise", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("geve"), new oooo_1("LCD", 188), "");
    public static final Zauber ififnew = new Zauber("Nihilogravo Schwerelos", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("um"), new oooo_1("LCD", 189), "");
    public static final Zauber \u00f4o\u00d3000 = new Zauber("Nuntiovolo Botenvogel", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("bedo"), new oooo_1("LCD", 190), "");
    public static final Zauber \u00f4\u00f5\u00d3000 = new Zauber("Objecto Obscuro", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("ob"), new oooo_1("LCD", 191), "");
    public static final Zauber \u00d8\u00d4\u00d4000 = new Zauber("Objectofixo", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.privatedosuper), o00O.o00000("obtp"), new oooo_1("LCD", 192), "");
    public static final Zauber oo\u00d4000 = new Zauber("Objectovoco", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ve"), new oooo_1("LCD", 193), "");
    public static final Zauber \u00d3\u00d4\u00d4000 = new Zauber("Objekt entzaubern", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("anob"), new oooo_1("LCD", 194), "+Mod");
    public static final Zauber \u00d3\u00d5\u00d3000 = new Zauber("Oculus Astralis", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hlkrmeli"), new oooo_1("LCD", 196), "");
    public static final Zauber \u00d3o\u00d4000 = new Zauber("Odem Arcanum", s_0.\u00d500000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("hlkr"), new oooo_1("LCD", 197), "+Mod");
    public static final Zauber \u00f8O\u00d3000 = new Zauber("Orcanofaxius Luftstrahl", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("eusc"), new oooo_1("LCD", 122), "", "Elementare Geschosse");
    public static final Zauber returnprivatesuper = new Zauber("Orcanosphaero Orkanball", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("euscte"), new oooo_1("LCD", 124), "", "Elementare Explosionen");
    public static final Zauber \u00d3\u00f8\u00d4000 = new Zauber("Pandaemonium", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("beda"), new oooo_1("LCD", 199), "");
    public static final Zauber O0\u00d3000 = new Zauber("Panik \u00fcberkomme euch!", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("dmes"), new oooo_1("LCD", 200), "");
    public static final Zauber \u00d8\u00d6\u00d4000 = new Zauber("Papperlapapp", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 201), "+MR");
    public static final Zauber \u00d5\u00d5\u00d3000 = new Zauber("Paralysis starr wie Stein", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("erfo"), new oooo_1("LCD", 202), "+MR");
    public static final Zauber thisinterfacenew = new Zauber("Pectetondo Zauberhaar", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("fo"), new oooo_1("LCD", 203), "");
    public static final Zauber \u00d5\u00d6\u00d3000 = new Zauber("Penetrizzel Tiefenblick", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("hl"), new oooo_1("LCD", 204), "");
    public static final Zauber \u00d4\u00f4\u00d3000 = new Zauber("Pentagramma Sph\u00e4renbann", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("anbedage"), new oooo_1("LCD", 205), "+Mod");
    public static final Zauber \u00f8\u00f8\u00d4000 = new Zauber("Pestilenz ersp\u00fcren", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hl"), new oooo_1("LCD", 207), "+Mod");
    public static final Zauber \u00f8\u00d3\u00d3000 = new Zauber("Pfeil des Feuers", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("efob"), new oooo_1("LCD", 208), "", "Elementare Verzauberungen der Geschosse");
    public static final Zauber OO\u00d5000 = new Zauber("Pfeil des Wassers", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ewob"), new oooo_1("LCD", 208), "", "Elementare Verzauberungen der Geschosse");
    public static final Zauber \u00d3\u00f4\u00d3000 = new Zauber("Pfeil des Erzes", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("erob"), new oooo_1("LCD", 208), "", "Elementare Verzauberungen der Geschosse");
    public static final Zauber \u00f4\u00f5\u00d4000 = new Zauber("Pfeil der Luft", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("euob"), new oooo_1("LCD", 208), "", "Elementare Verzauberungen der Geschosse");
    public static final Zauber o\u00d5\u00d3000 = new Zauber("Pfeil des Humus", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ehob"), new oooo_1("LCD", 208), "", "Elementare Verzauberungen der Geschosse");
    public static final Zauber forfloatnew = new Zauber("Pfeil des Eises", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eeob"), new oooo_1("LCD", 208), "", "Elementare Verzauberungen der Geschosse");
    public static final Zauber \u00d3o\u00d5000 = new Zauber("Planastrale Anderswelt", s_0.\u00f500000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.returnwhilesuper), o00O.o00000("li"), new oooo_1("LCD", 210), "");
    public static final Zauber \u00d4\u00d3\u00d3000 = new Zauber("Plumbumbarum schwerer Arm", s_0.\u00d400000, new l_0(b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("es"), new oooo_1("LCD", 211), "+Mod");
    public static final Zauber \u00d3\u00f5\u00d4000 = new Zauber("Projektimago Ebenbild", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ilve"), new oooo_1("LCD", 212), "+Mod");
    public static final Zauber privatepublicnew = new Zauber("Protectionis Kontrabann", s_0.\u00f500000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ankrme"), new oooo_1("LCD", 213), "");
    public static final Zauber \u00d4o\u00d5000 = new Zauber("Psychostabilis", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("anei"), new oooo_1("LCD", 214), "");
    public static final Zauber o\u00f5\u00d4000 = new Zauber("Radau", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eute"), new oooo_1("LCD", 215), "");
    public static final Zauber returnifnew = new Zauber("Reflectimago Spiegelschein", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 216), "");
    public static final Zauber \u00f8\u00f4\u00d3000 = new Zauber("Reptilea Natternest", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hb"), new oooo_1("LCD", 217), "");
    public static final Zauber \u00f8o\u00d3000 = new Zauber("Respondami", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 218), "+MR");
    public static final Zauber \u00f4\u00d8\u00d3000 = new Zauber("Reversalis Revidum", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("me"), new oooo_1("LCD", 219), "");
    public static final Zauber \u00d8\u00d5\u00d3000 = new Zauber("Ruhe K\u00f6rper, ruhe Geist", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("he"), new oooo_1("LCD", 220), "");
    public static final Zauber whilereturnnew = new Zauber("Salander Mutander", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("fo"), new oooo_1("LCD", 221), "+MR");
    public static final Zauber o\u00f6\u00d4000 = new Zauber("Sanftmut", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 222), "+MR");
    public static final Zauber privatefloatnew = new Zauber("Sapefacta Zauberschwamm", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("euewte"), new oooo_1("LCD", 223), "");
    public static final Zauber \u00d5\u00f5\u00d4000 = new Zauber("Satuarias Herrlichkeit", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eiil"), new oooo_1("LCD", 224), "");
    public static final Zauber \u00d40\u00d3000 = new Zauber("Schabernack", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 225), "+MR");
    public static final Zauber OO\u00d4000 = new Zauber("Schadenszauber bannen", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ansc"), new oooo_1("LCD", 226), "+Mod");
    public static final Zauber \u00f50\u00d3000 = new Zauber("Schelmenkleister", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("um"), new oooo_1("LCD", 227), "");
    public static final Zauber \u00f4\u00d2\u00d5000 = new Zauber("Schelmenlaune", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 228), "+Mod +MR");
    public static final Zauber \u00d8\u00d2\u00d4000 = new Zauber("Schelmenmaske", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 229), "");
    public static final Zauber \u00d3\u00d6\u00d3000 = new Zauber("Schelmenrausch", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 230), "+MR");
    public static final Zauber O\u00d3\u00d5000 = new Zauber("Schleier der Unwissenheit", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("eime"), new oooo_1("LCD", 231), "");
    public static final Zauber ifthisnew = new Zauber("Schwarz und Rot", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eisc"), new oooo_1("LCD", 232), "+MR");
    public static final Zauber \u00f4\u00d2\u00d4000 = new Zauber("Schwarzer Schrecken", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 233), "+MR");
    public static final Zauber returnthisObject = new Zauber("Seelentier erkennen", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hl"), new oooo_1("LCD", 234), "+MR");
    public static final Zauber newnullnew = new Zauber("Seelenwanderung", s_0.\u00f500000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eive"), new oooo_1("LCD", 235), "+2*MR");
    public static final Zauber \u00d8\u00d8\u00d4000 = new Zauber("Seidenweich Schuppengleich", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 236), "");
    public static final Zauber O\u00d5\u00d4000 = new Zauber("Seidenzunge Elfenwort", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 237), "+MR");
    public static final Zauber \u00f50\u00d5000 = new Zauber("Sensattacco Meisterstreich", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eihl"), new oooo_1("LCD", 238), "");
    public static final Zauber \u00f8\u00f8\u00d3000 = new Zauber("Sensibar Empathicus", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hl"), new oooo_1("LCD", 239), "+MR");
    public static final Zauber returnnullnew = new Zauber("Serpentialis Schlangenleib", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("fo"), new oooo_1("LCD", 240), "");
    public static final Zauber \u00d8\u00d3\u00d3000 = new Zauber("Silentium", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("um"), new oooo_1("LCD", 241), "");
    public static final Zauber \u00d5\u00d2\u00d4000 = new Zauber("Sinesigil unerkannt", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 242), "");
    public static final Zauber \u00f8\u00f4\u00d4000 = new Zauber("Skelettarius", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("dt"), new oooo_1("LCD", 243), "+Mod");
    public static final Zauber \u00f8\u00d4\u00d4000 = new Zauber("Solidirid Weg aus Licht", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("euum"), new oooo_1("LCD", 245), "");
    public static final Zauber \u00f4O\u00d5000 = new Zauber("Somnigravis tiefer Schlaf", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 246), "+MR");
    public static final Zauber \u00d3\u00d2\u00d4000 = new Zauber("Spinnenlauf", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("ei"), new oooo_1("LCD", 247), "");
    public static final Zauber \u00f4\u00d5\u00d3000 = new Zauber("Spurlos Trittlos", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("um"), new oooo_1("LCD", 248), "");
    public static final Zauber \u00d50\u00d3000 = new Zauber("Standfest Katzengleich", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("ei"), new oooo_1("LCD", 249), "");
    public static final Zauber whilefornew = new Zauber("Staub wandle!", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("er"), new oooo_1("LCD", 250), "+Mod");
    public static final Zauber newifnew = new Zauber("Stein wandle!", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("beda"), new oooo_1("LCD", 251), "+Mod");
    public static final Zauber \u00f4o\u00d4000 = new Zauber("Stillstand", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eeum"), new oooo_1("LCD", 252), "");
    public static final Zauber \u00f5\u00f8\u00d4000 = new Zauber("Sumus Elixiere", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("eh"), new oooo_1("LCD", 253), "");
    public static final Zauber \u00d4\u00f4\u00d4000 = new Zauber("Tauschrausch", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("li"), new oooo_1("LCD", 254), "");
    public static final Zauber \u00d8\u00f8\u00d3000 = new Zauber("Tempus Stasis", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.privatedosuper), o00O.o00000("tp"), new oooo_1("LCD", 255), "+Mod");
    public static final Zauber returnwhilenew = new Zauber("Tiere besprechen", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("fohe"), new oooo_1("LCD", 256), "+Mod");
    public static final Zauber \u00d4o\u00d3000 = new Zauber("Tiergedanken", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hlve"), new oooo_1("LCD", 257), "+MR");
    public static final Zauber \u00d5O\u00d5000 = new Zauber("Tlalucs Odem Pestgestank", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("bedasc"), new oooo_1("LCD", 258), "");
    public static final Zauber \u00f5\u00d4\u00d3000 = new Zauber("Totes handle!", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("bedt"), new oooo_1("LCD", 259), "+Mod");
    public static final Zauber \u00f40\u00d4000 = new Zauber("Transformatio Formgestalt", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.privatedosuper), o00O.o00000("ob"), new oooo_1("LCD", 260), "+Mod");
    public static final Zauber \u00d8\u00f8\u00d2000 = new Zauber("Transmutare K\u00f6rperform", s_0.o00000, new l_0(b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("fo"), new oooo_1("LCD", 261), "+MR");
    public static final Zauber ifwhilenew = new Zauber("Transversalis Teleport", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("li"), new oooo_1("LCD", 262), "");
    public static final Zauber \u00d5o\u00d5000 = new Zauber("Traumgestalt", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ve"), new oooo_1("LCD", 263), "+MR");
    public static final Zauber returnnewnew = new Zauber("Unber\u00fchrt von Satinav", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("obtp"), new oooo_1("LCD", 264), "+Mod");
    public static final Zauber ifnewnew = new Zauber("Unitatio Geistesbund", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("krve"), new oooo_1("LCD", 265), "");
    public static final Zauber \u00f4\u00d6\u00d4000 = new Zauber("Unsichtbarer J\u00e4ger", s_0.\u00f600000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 266), "");
    public static final Zauber \u00d8\u00f8\u00d4000 = new Zauber("Ver\u00e4nderung aufheben", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("anum"), new oooo_1("LCD", 267), "+Mod");
    public static final Zauber \u00d4\u00d2\u00d4000 = new Zauber("Verschwindibus", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("li"), new oooo_1("LCD", 268), "");
    public static final Zauber \u00d4\u00f6\u00d4000 = new Zauber("Verst\u00e4ndigung st\u00f6ren", s_0.Object, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("anve"), new oooo_1("LCD", 269), "+MR");
    public static final Zauber \u00d8\u00f4\u00d4000 = new Zauber("Verwandlung beenden", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("anfo"), new oooo_1("LCD", 270), "+Mod");
    public static final Zauber Stringvoidnew = new Zauber("Vipernblick", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("es"), new oooo_1("LCD", 271), "+MR");
    public static final Zauber nullsupernew = new Zauber("Visibili Vanitar", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("fo"), new oooo_1("LCD", 272), "");
    public static final Zauber newwhilenew = new Zauber("Vocolimbo hohler Klang", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 273), "");
    public static final Zauber fordonew = new Zauber("Vogelzwitschern Glockenspiel", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 274), "");
    public static final Zauber whilenewnew = new Zauber("Wand aus Dornen", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eh"), new oooo_1("LCD", 275), "", "Elementare W\u00e4nde");
    public static final Zauber Oo\u00d4000 = new Zauber("Wand aus Erz", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("er"), new oooo_1("LCD", 275), "", "Elementare W\u00e4nde");
    public static final Zauber whileifnew = new Zauber("Wand aus Flammen", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ef"), new oooo_1("LCD", 275), "", "Elementare W\u00e4nde");
    public static final Zauber \u00d8O\u00d3000 = new Zauber("Orkanwand", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eu"), new oooo_1("LCD", 275), "", "Elementare W\u00e4nde");
    public static final Zauber o\u00f6\u00d3000 = new Zauber("Wand aus Wogen", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("ew"), new oooo_1("LCD", 275), "", "Elementare W\u00e4nde");
    public static final Zauber \u00f5\u00d3\u00d3000 = new Zauber("Warmes Blut", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("eiefhl"), new oooo_1("LCD", 276), "");
    public static final Zauber \u00f5\u00d6\u00d3000 = new Zauber("Wasseratem", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("fo"), new oooo_1("LCD", 277), "");
    public static final Zauber \u00d3\u00f6\u00d3000 = new Zauber("Weiches erstarre!", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.privatedosuper), o00O.o00000("erum"), new oooo_1("LCD", 278), "", "Elementare Umformung");
    public static final Zauber \u00d5\u00d8\u00d4000 = new Zauber("Weihrauchwolke Wohlgeruch", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("LCD", 279), "");
    public static final Zauber \u00f8\u00d3\u00d4000 = new Zauber("Weisheit der B\u00e4ume", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ehfo"), new oooo_1("LCD", 280), "+Mod", "Elementare Weisheit");
    public static final Zauber \u00d8o\u00d4000 = new Zauber("Wei\u00dfe M\u00e4hn und goldener Huf", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("be"), new oooo_1("LCD", 281), "");
    public static final Zauber \u00d30\u00d4000 = new Zauber("Wellenlauf", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f4\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eiew"), new oooo_1("LCD", 282), "", "Elementare Bewegungen");
    public static final Zauber \u00f4o\u00d5000 = new Zauber("Wettermeisterschaft", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("euum"), new oooo_1("LCD", 283), "+Mod");
    public static final Zauber returnreturnnew = new Zauber("Widerwille Ungemach", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("esil"), new oooo_1("LCD", 285), "");
    public static final Zauber \u00d80\u00d4000 = new Zauber("Windhose", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("euum"), new oooo_1("LCD", 286), "", "Elementare Wirbel");
    public static final Zauber \u00d40\u00d5000 = new Zauber("Windstille", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("euum"), new oooo_1("LCD", 287), "+Mod");
    public static final Zauber thisObjectnew = new Zauber("Wipfellauf", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eieh"), new oooo_1("LCD", 288), "", "Elementare Bewegungen");
    public static final Zauber o\u00d3\u00d4000 = new Zauber("Xenographus Schriftenkunde", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("hl"), new oooo_1("LCD", 289), "");
    public static final Zauber privateinterfacesuper = new Zauber("Zagibu Ubigaz", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("erob"), new oooo_1("LCD", 290), "");
    public static final Zauber \u00f5O\u00d5000 = new Zauber("Zappenduster", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("anum"), new oooo_1("LCD", 291), "");
    public static final Zauber oO\u00d4000 = new Zauber("Zauberklinge Geisterspeer", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("krob"), new oooo_1("LCD", 292), "");
    public static final Zauber \u00d3\u00d2\u00d5000 = new Zauber("Zaubernahrung Hungerbann", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.returnwhilesuper), o00O.o00000("eies"), new oooo_1("LCD", 293), "+Mod");
    public static final Zauber thisintnew = new Zauber("Zauberwesen der Natur", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hbve"), new oooo_1("LCD", 294), "");
    public static final Zauber O\u00f6\u00d3000 = new Zauber("Zauberzwang", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hrsc"), new oooo_1("LCD", 295), "+MR");
    public static final Zauber newreturnnew = new Zauber("Zorn der Elemente", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("elsc"), new oooo_1("LCD", 296), "+Mod");
    public static final Zauber \u00d5\u00d3\u00d3000 = new Zauber("Zunge l\u00e4hmen", s_0.\u00d400000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("ei"), new oooo_1("LCD", 297), "+MR");
    public static final Zauber ifStringnew = new Zauber("Zwingtanz", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("hr"), new oooo_1("LCD", 298), "+MR");
    public static final Zauber nullinterfacenew = new Zauber("Niederh\u00f6llen Eisgestalt", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eefo"), new oooo_1("LCD", 65), "+MR");
    public static final Zauber privateclassnew = new Zauber("Seelenfeuer Lichterloh", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("effo"), new oooo_1("LCD", 65), "+MR");
    public static final Zauber \u00f4\u00d4\u00d4000 = new Zauber("Eiswirbel", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("eeum"), new oooo_1("LCD", 183), "", "Elementare Wirbel");
    public static final Zauber o\u00d3\u00d5000 = new Zauber("Sumpfstrudel", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("ehum"), new oooo_1("LCD", 183), "", "Elementare Wirbel");
    public static final Zauber \u00d4\u00d8\u00d3000 = new Zauber("Malmkreis", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("erum"), new oooo_1("LCD", 183), "", "Elementare Wirbel");
    public static final Zauber newthisnew = new Zauber("Feuersturm", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("efum"), new oooo_1("LCD", 172), "", "Elementare Wirbel");
    public static final Zauber \u00d4O\u00d5000 = new Zauber("Agrimothbann", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("andg"), new oooo_1("DDZ", 0), "+Mod", "D\u00e4monenbann");
    public static final Zauber \u00d4O\u00d4000 = new Zauber("Belzhorashbann", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("andb"), new oooo_1("DDZ", 0), "+Mod", "D\u00e4monenbann");
    public static final Zauber \u00d3\u00d6\u00d4000 = new Zauber("Bienenschwarm", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("fo"), new oooo_1("DDZ", 0), "");
    public static final Zauber \u00f4\u00d8\u00d4000 = new Zauber("Entfesselung des Getiers", s_0.\u00f600000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("fo"), new oooo_1("DDZ", 0), "+MR");
    public static final Zauber \u00d5\u00f8\u00d2000 = new Zauber("Gebieter der Tiefe", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("fo"), new oooo_1("DDZ", 0), "");
    public static final Zauber \u00f4\u00d4\u00d3000 = new Zauber("Geschoss der Niederh\u00f6llen", s_0.Object, new l_0(b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000, b_0.privatedosuper), o00O.o00000("dasc"), new oooo_1("DDZ", 0), "");
    public static final Zauber \u00d3\u00f4\u00d4000 = new Zauber("Grolmenseele", s_0.\u00f500000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("begete"), new oooo_1("DDZ", 0), "");
    public static final Zauber oO\u00d3000 = new Zauber("Hauch der Tiefen Tochter", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("efes"), new oooo_1("DDZ", 0), "+MR");
    public static final Zauber ifprivatenew = new Zauber("Hexagramma Dschinnenbann", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("anbeel"), new oooo_1("DDZ", 0), "+Mod");
    public static final Zauber \u00f5\u00f6\u00d3000 = new Zauber("Hornissenruf", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eshbli"), new oooo_1("DDZ", 0), "", "Tierruf");
    public static final Zauber \u00f5\u00d2\u00d5000 = new Zauber("Igniflumen Flammenspur", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("efsc"), new oooo_1("DDZ", 0), "", "Elementare Fl\u00fcsse");
    public static final Zauber O\u00f4\u00d4000 = new Zauber("Igniplano Fl\u00e4chenbrand", s_0.\u00f500000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("efscum"), new oooo_1("DDZ", 0), "");
    public static final Zauber \u00d3\u00d2\u00d3000 = new Zauber("Igniqueris Feuerkragen", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("efes"), new oooo_1("DDZ", 0), "+MR", "Elementare Strafen");
    public static final Zauber O\u00f8\u00d3000 = new Zauber("Leib aus tausend Fliegen", s_0.\u00f600000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("fo"), new oooo_1("DDZ", 0), "");
    public static final Zauber \u00f8\u00d5\u00d4000 = new Zauber("Seelenfeuer Lichterloh (DDZ)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.returnwhilesuper), o00O.o00000("effo"), new oooo_1("DDZ", 0), "+MR");
    public static final Zauber \u00f5\u00f6\u00d4000 = new Zauber("Schlangenruf", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eshbli"), new oooo_1("DDZ", 0), "", "Tierruf");
    public static final Zauber \u00d5\u00d4\u00d3000 = new Zauber("Sphaerovisio Schreckensbild", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("dalive"), new oooo_1("DDZ", 0), "");
    public static final Zauber o0\u00d5000 = new Zauber("Spinnennetz", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("ei"), new oooo_1("DDZ", 0), "");
    public static final Zauber \u00f4\u00d3\u00d3000 = new Zauber("Spinnenruf", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eshbli"), new oooo_1("DDZ", 0), "", "Tierruf");
    public static final Zauber forObjectnew = new Zauber("Tanz der Erl\u00f6sung", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("aneshr"), new oooo_1("DDZ", 0), "+Mod");
    public static final Zauber \u00f80\u00d3000 = new Zauber("Thargunitothhbann", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("andt"), new oooo_1("DDZ", 0), "+Mod", "D\u00e4monenbann");
    public static final Zauber newnewnew = new Zauber("Tierruf", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("eshbli"), new oooo_1("DDZ", 0), "", "Tierruf");
    public static final Zauber Stringinterfacenew = new Zauber("Unsichtbare Glut", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("ob"), new oooo_1("DDZ", 0), "");
    public static final Zauber thisfloatnew = new Zauber("Valetudo Lebenskraft", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("krhe"), new oooo_1("DDZ", 0), "");
    public static final Zauber newprivatenew = new Zauber("Weisheit der Steine", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("erfo"), new oooo_1("LCD", 280), "+Mod", "Elementare Weisheit");
    public static final Zauber \u00f5\u00d2\u00d3000 = new Zauber("Glacoflumen Fluss aus Eis", s_0.\u00f600000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eeum"), new oooo_1("EG", 0), "", "Elementare Fl\u00fcsse");
    public static final Zauber o\u00d8\u00d4000 = new Zauber("Aquaqueris Wasserfluch", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("ewsc"), new oooo_1("EG", 0), "+ MR", "Elementare Strafen");
    public static final Zauber Stringfloatnew = new Zauber("Aeropulvis sanfter Fall", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("eute"), new oooo_1("EG", 0), "");
    public static final Zauber \u00f8\u00f6\u00d4000 = new Zauber("Fesselranken", s_0.Object, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("ehum"), new oooo_1("EG", 0), "+MR");
    public static final Zauber OO\u00d3000 = new Zauber("Feuerm\u00e4hne Flammenhuf", s_0.\u00f600000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("hbef"), new oooo_1("EG", 0), "");
    public static final Zauber thisinterfacesuper = new Zauber("Ignifugo Feuerbann", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.returnwhilesuper, b_0.O\u00f5\u00d2000), o00O.o00000("efum"), new oooo_1("EG", 0), "");
    public static final Zauber nulldonew = new Zauber("Ignimorpho Feuerform", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("efob"), new oooo_1("EG", 0), "", "Elementare Verformung");
    public static final Zauber \u00d4\u00d8\u00d4000 = new Zauber("Kraft des Humus", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ehhe"), new oooo_1("EG", 0), "", "Elementare Konzentration");
    public static final Zauber o\u00d2\u00d3000 = new Zauber("Kraft des Eises", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("ehee"), new oooo_1("EG", 0), "", "Elementare Konzentration");
    public static final Zauber \u00d4\u00d4\u00d3000 = new Zauber("Kraft der Luft", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eheu"), new oooo_1("EG", 0), "", "Elementare Konzentration");
    public static final Zauber \u00d4\u00f5\u00d4000 = new Zauber("Stimmen des Windes", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("foeu"), new oooo_1("EG", 0), "", "Elementare Weisheit");
    public static final Zauber privatedonew = new Zauber("Eiskaltes Strategem", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("foee"), new oooo_1("EG", 0), "", "Elementare Weisheit");
    public static final Zauber o\u00d6\u00d3000 = new Zauber("Warmes Gefriere", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.privatedosuper), o00O.o00000("obee"), new oooo_1("EG", 0), "", "Elementare Umformung");
    public static final Zauber Stringintnew = new Zauber("Festes Verwehe", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.privatedosuper), o00O.o00000("obeu"), new oooo_1("EG", 0), "", "Elementare Umformung");
    public static final Zauber forinterfacesuper = new Zauber("Windgefl\u00fcster", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f8\u00f4\u00d2000), o00O.o00000("veeu"), new oooo_1("EG", 0), "");
    public static final Zauber \u00f5o\u00d5000 = new Zauber("Dornenkrallen", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eifoeh"), new oooo_1("", 0), "");
    public static final Zauber oo\u00d3000 = new Zauber("Adamantium Erzstruktur (Agm)", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgob"), new oooo_1("LCD", 13), "");
    public static final Zauber thissupernew = new Zauber("Aeolitus Windgebraus (Agm)", s_0.\u00d400000, new l_0(b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgum"), new oooo_1("LCD", 18), "");
    public static final Zauber o\u00d4\u00d4000 = new Zauber("Aerofugo Vakuum (Agm)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("dgum"), new oooo_1("LCD", 19), "");
    public static final Zauber \u00d8o\u00d3000 = new Zauber("Aerogelo Atemqual (Agm)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgum"), new oooo_1("LCD", 20), "");
    public static final Zauber \u00d50\u00d5000 = new Zauber("Armatrutz (Agm)", s_0.\u00d400000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("eidg"), new oooo_1("LCD", 28), "");
    public static final Zauber whileprivatenew = new Zauber("Brenne toter Stoff! (Agm)", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("dgob"), new oooo_1("LCD", 51), "");
    public static final Zauber thisclassnew = new Zauber("Caldofrigo hei\u00df und kalt (Agm)", s_0.\u00f600000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgobum"), new oooo_1("LCD", 52), "");
    public static final Zauber Oo\u00d5000 = new Zauber("Fortifex arkane Wand (Agm)", s_0.o00000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("dgum"), new oooo_1("LCD", 90), "");
    public static final Zauber O\u00f8\u00d4000 = new Zauber("Granit und Marmor (Agm)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgfo"), new oooo_1("LCD", 99), "+MR");
    public static final Zauber \u00d4\u00d4\u00d4000 = new Zauber("Humofaxius Humusstrahl (Agm)", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgsc"), new oooo_1("LCD", 122), "");
    public static final Zauber Stringinterfacesuper = new Zauber("Ignisphaero Feuerball (Agm)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgscte"), new oooo_1("LCD", 124), "");
    public static final Zauber \u00f5\u00f8\u00d3000 = new Zauber("Ignifaxius Flammenstrahl (Agm)", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgsc"), new oooo_1("LCD", 122), "");
    public static final Zauber \u00d8\u00d2\u00d5000 = new Zauber("Kraft des Erzes (Agm)", s_0.o00000, new l_0(b_0.newwhilesuper, b_0.returnwhilesuper, b_0.privatedosuper), o00O.o00000("dgob"), new oooo_1("LCD", 145), "");
    public static final Zauber nullintnew = new Zauber("Leib des Feuers (Agm)", s_0.\u00f600000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("dgfo"), new oooo_1("LCD", 162), "");
    public static final Zauber \u00f8\u00d8\u00d3000 = new Zauber("Orcanofaxius Luftstrahl (Agm)", s_0.Object, new l_0(b_0.newwhilesuper, b_0.O\u00f5\u00d2000, b_0.returnwhilesuper), o00O.o00000("dgsc"), new oooo_1("LCD", 122), "");
    public static final Zauber privatevoidnew = new Zauber("Sumus Elixiere (Agm)", s_0.Object, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("dg"), new oooo_1("LCD", 253), "");
    public static final Zauber O\u00d2\u00d3000 = new Zauber("Wand aus Dornen (Agm)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("dg"), new oooo_1("LCD", 275), "");
    public static final Zauber \u00d3\u00f5\u00d3000 = new Zauber("Wand aus Erz (Agm)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("dg"), new oooo_1("LCD", 275), "");
    public static final Zauber \u00d3\u00d5\u00d4000 = new Zauber("Weiches erstarre! (Agm)", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.privatedosuper), o00O.o00000("dgum"), new oooo_1("LCD", 278), "");
    public static final Zauber forsupernew = new Zauber("Windhose (Agm)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.privatedosuper), o00O.o00000("dgum"), new oooo_1("LCD", 286), "");
    public static final Zauber \u00f5\u00f5\u00d4000 = new Zauber("Umbraporta Schattent\u00fcre", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("dali"), new oooo_1("Q10", 0), "");
    public static final Zauber \u00f8\u00d4\u00d3000 = new Zauber("Tenebaro Schattentanz", s_0.\u00d500000, new l_0(b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000, b_0.O\u00f5\u00d2000), o00O.o00000("il"), new oooo_1("Q10", 163), "");
    public static final Zauber \u00f8O\u00d4000 = new Zauber("Pantenebrum", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("beda"), new oooo_1("Q10", 163), "");
    public static final Zauber \u00f5\u00d8\u00d4000 = new Zauber("Schattenodem", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("bedasc"), new oooo_1("Q10", 163), "");
    public static final Zauber \u00d3\u00d4\u00d3000 = new Zauber("Nuntiovolo Botenvogel (obsk.)", s_0.Object, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000), o00O.o00000("beda"), new oooo_1("Q10", 163), "");
    public static final Zauber \u00f8\u00d8\u00d4000 = new Zauber("Opacitas Schattenleib", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000, b_0.\u00f4\u00f4\u00d2000), o00O.o00000("da"), new oooo_1("Q10", 163), "");
    public static final Zauber thisvoidnew = new Zauber("Ecliptifactus Schattenkraft (obsk.)", s_0.o00000, new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.returnwhilesuper), o00O.o00000("dafo"), new oooo_1("Q10", 0), "");
    private o00O[] oo\u00d5000;
    private Map<String, o00O[]> O\u00d4\u00d4000 = new HashMap<String, o00O[]>();
    private K[] \u00d3\u00d8\u00d3000;
    private oooo_1 forvoidnew;
    private s_0 ifreturnnew;
    private String nullfloatnew;
    private boolean Stringdonew;
    private ArrayList<String> ifnullnew;
    private ArrayList<ZauberVerbreitung> forclassnew;
    private String newStringnew;

    public Zauber(String string, s_0 s_02, l_0 l_02, o00O[] o00OArray, oooo_1 oooo_12, String string2) {
        super(string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000, l_02);
        this.ifreturnnew = s_02;
        this.oo\u00d5000 = o00OArray;
        ZauberFabrik.getInstance().addZauberfertigkeit(this);
        this.forvoidnew = oooo_12;
        this.nullfloatnew = string2;
        this.Stringdonew = false;
        this.ifnullnew = null;
        this.newStringnew = null;
        this.forclassnew = new ArrayList();
    }

    public Zauber(String string, s_0 s_02, l_0 l_02, o00O[] o00OArray, oooo_1 oooo_12, String string2, String string3) {
        this(string, s_02, l_02, o00OArray, oooo_12, string2);
        this.newStringnew = string3;
    }

    public void addVerbreitung(K k2, Integer n) {
        this.o00000(k2, k2, n);
    }

    @Override
    public int compareTo(Object object) {
        return super.compareTo(object);
    }

    public String getHexalogie() {
        return this.newStringnew;
    }

    @Override
    public s_0 getKategorie(boolean bl) {
        return this.ifreturnnew;
    }

    public o00O[] getMerkmale(K k2) {
        if (k2 == null) {
            if (this.O\u00d4\u00d4000.size() == 0) {
                return this.oo\u00d5000;
            }
            ArrayList<o00O> arrayList = new ArrayList<o00O>();
            for (int i2 = 0; i2 < this.oo\u00d5000.length; ++i2) {
                if (arrayList.contains(this.oo\u00d5000[i2])) continue;
                arrayList.add(this.oo\u00d5000[i2]);
            }
            for (Map.Entry<String, o00O[]> o00OArray2 : this.O\u00d4\u00d4000.entrySet()) {
                o00O[] o00OArray = o00OArray2.getValue();
                for (int i2 = 0; i2 < o00OArray.length; ++i2) {
                    if (arrayList.contains(o00OArray[i2])) continue;
                    arrayList.add(o00OArray[i2]);
                }
            }
            o00O[] o00OArray = new o00O[arrayList.size()];
            return arrayList.toArray(o00OArray);
        }
        o00O[] o00OArray = this.O\u00d4\u00d4000.get(k2.toString());
        if (o00OArray != null) {
            return o00OArray;
        }
        return this.oo\u00d5000;
    }

    public String getMerkmaleString(K k2) {
        StringBuffer stringBuffer = new StringBuffer();
        o00O[] o00OArray = this.getMerkmale(k2);
        for (int i2 = 0; i2 < o00OArray.length; ++i2) {
            stringBuffer.append(o00OArray[i2].float());
            if (i2 >= o00OArray.length - 1) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    public String getModMR() {
        return this.nullfloatnew;
    }

    public String getQuelle() {
        return this.forvoidnew.toString();
    }

    public oooo_1 getQuellenObj() {
        return this.forvoidnew;
    }

    public K[] getRepraesentationen() {
        if (this.\u00d3\u00d8\u00d3000 == null) {
            ArrayList<K> arrayList = new ArrayList<K>();
            for (ZauberVerbreitung zauberVerbreitung : this.forclassnew) {
                if (arrayList.contains(zauberVerbreitung.getWelcheRep())) continue;
                arrayList.add(zauberVerbreitung.getWelcheRep());
            }
            this.\u00d3\u00d8\u00d3000 = new K[0];
            this.\u00d3\u00d8\u00d3000 = arrayList.toArray(this.\u00d3\u00d8\u00d3000);
        }
        return this.\u00d3\u00d8\u00d3000;
    }

    public ArrayList<String> getVarianten() {
        return this.ifnullnew;
    }

    public ArrayList<ZauberVerbreitung> getVerbreitung() {
        return this.forclassnew;
    }

    public ArrayList<ZauberVerbreitung> getVerbreitung(K k2) {
        ArrayList<ZauberVerbreitung> arrayList = new ArrayList<ZauberVerbreitung>();
        for (ZauberVerbreitung zauberVerbreitung : this.forclassnew) {
            if (!zauberVerbreitung.getWo().equals(k2)) continue;
            arrayList.add(zauberVerbreitung);
        }
        return arrayList;
    }

    public Integer getVerbreitung(K k2, K k3) {
        for (ZauberVerbreitung zauberVerbreitung : this.forclassnew) {
            if (!zauberVerbreitung.getWo().equals(k2) || !zauberVerbreitung.getWelcheRep().equals(k3)) continue;
            return zauberVerbreitung.getVerbreitung();
        }
        return new Integer(0);
    }

    public boolean hatMerkmal(o00O o00O2, K k2) {
        int n = 0;
        do {
            o00O o00O3;
            if (!(o00O3 = this.getMerkmale(k2)[n]).equals(o00O2)) continue;
            return true;
        } while (++n < this.getMerkmale(k2).length);
        return false;
    }

    public boolean hatMerkmalDaemonisch(K k2) {
        int n = 0;
        do {
            o00O o00O2;
            if (!(o00O2 = this.getMerkmale(k2)[n]).equals(o00O.\u00f8\u00d20000) && !o00O2.\u00f600000()) continue;
            return true;
        } while (++n < this.getMerkmale(k2).length);
        return false;
    }

    public boolean hatMerkmalElementar(K k2) {
        int n = 0;
        do {
            o00O o00O2;
            if (!(o00O2 = this.getMerkmale(k2)[n]).equals(o00O.\u00f4\u00d40000) && !o00O2.\u00d400000()) continue;
            return true;
        } while (++n < this.getMerkmale(k2).length);
        return false;
    }

    public boolean hatVarianten() {
        return this.Stringdonew;
    }

    public void setMerkamle(K k2, o00O[] o00OArray) {
        this.O\u00d4\u00d4000.put(k2.toString(), o00OArray);
    }

    public void setVarianten(ArrayList<String> arrayList) {
        this.setzeHatVarianten(arrayList != null);
        this.ifnullnew = arrayList;
    }

    public void setzeHatVarianten(boolean bl) {
        this.Stringdonew = bl;
    }

    void o00000(K k2, K k3, Integer n) {
        this.forclassnew.add(new ZauberVerbreitung(k2, k3, n));
    }
}

