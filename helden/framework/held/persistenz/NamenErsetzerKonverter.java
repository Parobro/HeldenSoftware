/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.framework.D.F;
import helden.framework.D.OoOO.whilesuper;
import helden.framework.OOoO.R;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.private;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public final class NamenErsetzerKonverter {
    private static NamenErsetzerKonverter \u00d300000;
    private HashMap<String, R> o00000 = new HashMap();
    private HashMap<String, R> \u00d200000;

    public static NamenErsetzerKonverter getInstance() {
        if (\u00d300000 == null) {
            \u00d300000 = new NamenErsetzerKonverter();
        }
        return \u00d300000;
    }

    private NamenErsetzerKonverter() {
        this.o00000.put("KampfDiskus", new R(50201, "Kampfdiskus"));
        this.o00000.put("Eitrger Kr\u00f6tenschemel", new R(50201, "Eitriger Kr\u00f6tenschemel"));
        this.o00000.put("Jagdmesse", new R(50201, "Jagdmesser"));
        this.o00000.put("Hettenhaube mit Gesichtsschutz", new R(50201, "Kettenhaube mit Gesichtsschutz"));
        this.o00000.put("Horesischer Reiterharnisch", new R(50201, "Horasischer Reiterharnisch"));
        this.o00000.put("Sonnenzepter", new R(50201, "Sonnenszepter"));
        this.o00000.put("Tranportkiste (30 Stein)", new R(50201, "Transportkiste (30 Stein)"));
        this.o00000.put("Tranportkiste mit Eisenb\u00e4ndern (30 Stein)", new R(50201, "Transportkiste mit Eisenb\u00e4ndern (30 Stein)"));
        this.o00000.put("Satuariensbush (K)", new R(50201, "Satuariensbusch (K)"));
        this.o00000.put("Chestus", new R(50204, "Cestus"));
        this.o00000.put("Chrattac-Kurzschwert", new R(50204, "Chrattac-Krummschwert"));
        this.o00000.put("Myrnex", new R(50204, "Myrmex"));
        this.o00000.put("Skorpionsstachel", new R(50204, "Skorpionstachel"));
        this.o00000.put("Spitzhake", new R(50204, "Spitzhacke"));
        this.o00000.put("Windschinge", new R(50204, "Windschwinge"));
        this.o00000.put("Tonfa", new R(50204, "TonFa"));
        this.o00000.put("Resieschlitten, zweisp\u00e4nnig", new R(50500, "Reiseschlitten, zweisp\u00e4nnig"));
        this.o00000.put("Resieschlitten, vierp\u00e4nnig", new R(50500, "Reiseschlitten, vierp\u00e4nnig"));
        this.o00000.put("St\u00f6rebranter", new R(50500, "Stoerrebrandter"));
        this.o00000.put("Seegelboot", new R(50501, "Segelboot"));
        this.o00000.put("Streitwage", new R(50501, "Streitwagen"));
        this.o00000.put("Glettscherwand", new R(50201, "Gletscherwand"));
        this.o00000.put("Wand aus Luft", new R(50201, "Orkanwand"));
        this.o00000.put("Wand aus Wasser", new R(50201, "Wand aus Wogen"));
        this.o00000.put("WINDHOSE", new R(50201, "Windhose"));
        this.o00000.put("Corpofresso", new R(50201, "Corpofesso"));
        this.o00000.put("Klickeradoms", new R(50201, "Klickeradomms"));
        this.o00000.put("Chronoautos Zeitenfahrt", new R(50201, "Chrononautos Zeitenfahrt"));
        this.o00000.put("Unsichtbare J\u00e4ger", new R(50207, "Unsichtbarer J\u00e4ger"));
        this.o00000.put("Entfesselung des Getieres", new R(50207, "Entfesselung des Getiers"));
        this.o00000.put("Tolpatsch", new R(50201, "Tollpatsch"));
        this.o00000.put("Lesen/Schreiben Isdira", new R(50201, G.\u00d3\u00f4\u00f5000.toString()));
        this.o00000.put("Brettspiel", new R(50201, voidsuper.\u00f4o\u00d6000.toString()));
        this.o00000.put("Lesen/Schreiben Imperiale Zeichen", new R(50201, G.\u00d40\u00f6000.toString()));
        this.o00000.put("Sprachen kennen Aureliani", new R(50201, G.\u00f4\u00d3\u00f5000.toString()));
        this.o00000.put("Lesen/Schreiben Mahrische Glypen", new R(50201, G.\u00d3\u00f5\u00f5000.toString()));
        this.o00000.put("Rakai-Priester", new R(50201, "Rikai-Priester"));
        this.o00000.put("Essalio Fedorion", new R(50201, "Essalio Fedorino"));
        this.o00000.put("Travia aus Thorwal", new R(50201, "Travia aus Thorwal (UdW)"));
        this.o00000.put("Rahja aus  Teshkal (Andergast)", new R(50201, "Rahja aus Teshkal (Andergast) (UdW)"));
        this.o00000.put("Rahja aus Andergast/Nostria", new R(50201, "Rahja aus Andergast/Nostria (UdW)"));
        this.o00000.put("Ifirn aus Thorwal", new R(50201, "Ifirn aus Thorwal (UdW)"));
        this.o00000.put("Firun aus Thorwal", new R(50201, "Firun aus Thorwal (UdW)"));
        this.o00000.put("Freie K\u00e4mpferschule der Trutzburg zu Prem", new R(50201, "Freie K\u00e4mpferschule der Trutzburg zu Prem (UdW)"));
        this.o00000.put("K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Bogskari", new R(50201, "K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Bogskari (UdW)"));
        this.o00000.put("K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Fotskari", new R(50201, "K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Fotskari (UdW)"));
        this.o00000.put("K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Herverkmader", new R(50201, "K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Herverkmader (UdW)"));
        this.o00000.put("K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Mangskari", new R(50201, "K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Mangskari (UdW)"));
        this.o00000.put("K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Riddari", new R(50201, "K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Riddari (UdW)"));
        this.o00000.put("K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Sjahskari", new R(50201, "K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Sjahskari (UdW)"));
        this.o00000.put("st\u00e4dtischer Bogensch\u00fctze", new R(50201, "st\u00e4dtischer Bogensch\u00fctze (UdW)"));
        this.o00000.put("st\u00e4dtische Bogensch\u00fctzin", new R(50201, "st\u00e4dtische Bogensch\u00fctzin (UdW)"));
        this.o00000.put("Skalde aus der Runajasko", new R(50201, "Skalde aus der Runajasko (UdW)"));
        this.o00000.put("Skaldin aus der Runajasko", new R(50201, "Skaldin aus der Runajasko (UdW)"));
        this.o00000.put("K\u00e4mpferschule Rekkerskola in Enqui", new R(50201, "K\u00e4mpferschule Rekkerskola in Enqui (UdW)"));
        this.o00000.put("Premer Sees\u00f6ldnerin", new R(50201, "Premer Sees\u00f6ldnerin (UdW)"));
        this.o00000.put("Premer Sees\u00f6ldner", new R(50201, "Premer Sees\u00f6ldner (UdW)"));
        this.o00000.put("Knappe aus Andergast/Nostria", new R(50201, "Knappe aus Andergast/Nostria (UdW)"));
        this.o00000.put("Knappin aus Andergast/Nostria", new R(50201, "Knappin aus Andergast/Nostria (UdW)"));
        this.o00000.put("traditionelle Schiffbauerin", new R(50201, "traditionelle Schiffbauerin (UdW)"));
        this.o00000.put("traditionelle Schiffbauer", new R(50201, "traditionelle Schiffbauer (UdW)"));
        this.o00000.put("Elementarzauberer Eis (V)", new R(50202, "Elementarzauberer Eis (Z)"));
        this.o00000.put("Elementarzauberer Erz (V)", new R(50202, "Elementarzauberer Erz (Z)"));
        this.o00000.put("Elementarzauberer Humus (V)", new R(50202, "Elementarzauberer Humus (Z)"));
        this.o00000.put("Elementarzauberer Eis (V)", new R(50202, "Elementarzauberer Eis (Z)"));
        this.o00000.put("Elementarzauberer Luft (V)", new R(50202, "Elementarzauberer Luft (Z)"));
        this.o00000.put("Elementarzauberer Wasser (V)", new R(50202, "Elementarzauberer Wasser (Z)"));
        this.o00000.put("Diener Bishariels", new R(50206, "Diener Bishdariels"));
        this.o00000.put("alchim. Destiallation", new R(50201, "alchim. Destillation"));
        this.o00000.put("Drachglut", new R(50201, "Drachenglut"));
        this.o00000.put("Ausgew\u00e4lte", new R(50201, "Ausgew\u00e4hlte"));
        this.o00000.put("Kobioldisch", new R(50206, "Koboldisch"));
        this.o00000.put("Dreschpflegel", new R(50201, "Dreschflegel"));
        this.o00000.put("Kuslisker Lamellar", new R(50201, "Kusliker Lamellar"));
        this.o00000.put("Feuerstein & Stahl", new R(50201, "Feuerstein u Stahl"));
        this.o00000.put("Halsband & Leine", new R(50201, "Halsband und Leine"));
        this.o00000.put("Kleine Truhe, Eisenb. & Schloss (50 Stein)", new R(50201, "Kleine Truhe, Eisenb. Schloss (50 Stein)"));
        this.o00000.put("Nadel & Garn, Sortiment", new R(50201, "Nadel und Garn, Sortiment"));
        this.o00000.put("Z\u00fcgel & Zaumzeug", new R(50201, "Z\u00fcgel und Zaumzeug"));
        this.o00000.put("Armschiene links, Bronze", new R(50208, "Armschiene (links), Bronze"));
        this.o00000.put("Armschiene rechts, Bronze", new R(50208, "Armschiene (rechts), Bronze"));
        this.o00000.put("Armschienen links, Stahl", new R(50208, "Armschiene (links), Stahl"));
        this.o00000.put("Armschienen rechts, Stahl", new R(50208, "Armschiene (rechts), Stahl"));
        this.o00000.put("Beinschienen (links), Leder", new R(50208, "Beinschiene (links), Leder"));
        this.o00000.put("Beinschienen (rechts), Leder", new R(50208, "Beinschiene (rechts), Leder"));
        this.o00000.put("Beinschienen, Bronze", new R(50208, "Beinschienen (Paar), Bronze"));
        this.o00000.put("Beinschienen, Stahl", new R(50208, "Beinschienen (Paar), Stahl"));
        this.o00000.put("Armschienen, Blutb\u00fcffelleder", new R(50208, "Armschienen (Paar), Blutb\u00fcffelleder"));
        this.o00000.put("Armschienen, Chitin/Kochleder", new R(50208, "Armschienen (Paar), Chitin/Kochleder"));
        this.o00000.put("Armschienen, Chratholz", new R(50208, "Armschienen (Paar), Chratholz"));
        this.o00000.put("Armschienen, Karettan", new R(50208, "Armschienen (Paar), Karettan"));
        this.o00000.put("Armschienen, Stahl/Edelbronze", new R(50208, "Armschienen (Paar), Stahl/Edelbronze"));
        this.o00000.put("Beinschienen, Blutb\u00fcffelleder", new R(50208, "Beinschienen (Paar), Blutb\u00fcffelleder"));
        this.o00000.put("Beinschienen, Chitin/Kochleder", new R(50208, "Beinschienen (Paar), Chitin/Kochleder"));
        this.o00000.put("Beinschienen, Chratholz", new R(50208, "Beinschienen (Paar), Chratholz"));
        this.o00000.put("Beinschienen, Karettan", new R(50208, "Beinschienen (Paar), Karettan"));
        this.o00000.put("Beinschienen, Stahl/Edelbronze", new R(50208, "Beinschienen (Paar), Stahl/Edelbronze"));
        this.o00000.put("Panzerbein", new R(50208, "Panzerbeine (Paar)"));
        this.o00000.put("Panzerhandschuhe links", new R(50208, "Panzerhandschuh (links)"));
        this.o00000.put("Panzerhandschuhe rechts", new R(50208, "Panzerhandschuh (rechts)"));
        this.o00000.put("Panzerschuh", new R(50208, "Panzerschuhe (Paar)"));
        this.o00000.put("Plattenschulter links", new R(50208, "Plattenschulter (links)"));
        this.o00000.put("Plattenschulter rechts", new R(50208, "Plattenschulter (rechts)"));
        this.o00000.put("Plattenarm links", new R(50208, "Plattenarm (links)"));
        this.o00000.put("Plattenarm rechts", new R(50208, "Plattenarm (rechts)"));
        this.o00000.put("Clim\u00e4renmeister", new R(50201, "Chim\u00e4renmeister"));
        this.o00000.put("Liturgie: Seelenpr\u00fcfung (IV)", new R(50201, "Liturgie: Aurapr\u00fcfung"));
        this.o00000.put("Liturgie: Seelenpr\u00fcfung (V)", new R(50201, "Liturgie: Gro\u00dfe Seelenpr\u00fcfung"));
        this.o00000.put("Kugelzauber: Kugel der Illusionisten", new R(50201, "Kugelzauber: Kugel des Illusionisten"));
        this.o00000.put("Siedendes Blut", new R(50201, "Ritual: Siedendes Blut"));
        this.o00000.put("Keulenritual: Apport der Keule", new R(50201, "Apport"));
        this.o00000.put("Ritualkenntnis Seher", new R(50201, "Ritualkenntnis: Seher"));
        this.o00000.put("Liturgie: Erhebung des Untoten", new R(50201, "Liturgie: Erheben des Unoten"));
        this.o00000.put("Liturgie: Tanz der Ersch\u00f6pfung", new R(50201, "Liturgie: Tanz der Sch\u00f6pfung"));
        this.o00000.put("Liturgie: F\u00fcrbitten des Heiligen Theb\u00fbn", new R(50201, "Liturgie: F\u00fcrbitten des Heiligen Therb\u00fbn"));
        this.o00000.put("Liturgie: Auge Xeledonos - Xeledons Helles Licht", new R(50208, "Liturgie: Auge Xeledons - Xeledons Helles Licht"));
        this.o00000.put("Liturgie: Gro\u00dfes Tabu (Siegel Borons)", new R(50208, "Liturgie: Gro\u00dfes Tabu (Siegel Borons (IV))"));
        this.o00000.put("Liturgie: Kamaluqs Fluch", new R(50208, "Liturgie: Kamaluqs Fluch (Sippenfluch)"));
        this.o00000.put("Liturgie: Kamaluqs Fluch (V)", new R(50208, "Liturgie: Kamaluqs Fluch (Sippenfluch) (V)"));
        this.o00000.put("Liturgie: Kamaluqs Fluch (VI)", new R(50208, "Liturgie: Kamaluqs Fluch (Sippenfluch) (VI)"));
        this.o00000.put("Liturgie: Grispelz' Fruchtbarkeit (Tsas Wundersame Fruchtbarkeit", new R(50208, "Liturgie: Grispelz' Fruchtbarkeit (Tsas Wundersame Fruchtbarkeit)"));
        this.o00000.put("Liturgie: Gorfangs Fluch", new R(50208, "Liturgie: Gorfangs Fluch (Sippenfluch)"));
        this.o00000.put("Liturgie: Gorfangs Fluch (V)", new R(50208, "Liturgie: Gorfangs Fluch (Sippenfluch) (V)"));
        this.o00000.put("Liturgie: Gorfangs Fluch (VI)", new R(50208, "Liturgie: Gorfangs Fluch (Sippenfluch) (VI)"));
        this.o00000.put("Liturgie: Tairachs Fluch", new R(50208, "Liturgie: Tairachs Fluch (Sippenfluch)"));
        this.o00000.put("Liturgie: Tairachs Fluch (V)", new R(50208, "Liturgie: Tairachs Fluch (Sippenfluch) (V)"));
        this.o00000.put("Liturgie: Tairachs Fluch (VI)", new R(50208, "Liturgie: Tairachs Fluch (Sippenfluch) (VI)"));
        this.o00000.put("Liturgie: Visar Blutbann (V) (Sippenfluch)", new R(50208, "Liturgie: Visar Blutbann (Sippenfluch) (V)"));
        this.o00000.put("Liturgie: Visar Blutbann (VI) (Sippenfluch)", new R(50208, "Liturgie: Visar Blutbann (Sippenfluch) (VI)"));
        this.o00000.put("Liturgie: Rahjas heitere Gelassenheit (Segen der Heiligen Noiona (IV))", new R(50208, "Liturgie: Rahjas heitere Gelassenheit (Segen der Heiligen Noiona) (IV)"));
        this.o00000.put("Liturgie: Erl\u00f6sung des Tapams (Borons s\u00fc\u00dfe Gnade (V)))", new R(50208, "Liturgie: Erl\u00f6sung des Tapams (Borons s\u00fc\u00dfe Gnade) (V)"));
        this.o00000.put("Liturgie: Heilung des Tapams (Segen der Heiligen Noiona (IV))", new R(50208, "Liturgie: Heilung des Tapams (Segen der Heiligen Noiona) (IV)"));
        this.o00000.put("Liturgie: Traum der Seele (Bishdariels Auge (III))", new R(50208, "Liturgie: Traum der Seele (Bishdariels Auge) (III)"));
        this.o00000.put("Liturgie: Traum der Seele (Bishdariels Auge (IV))", new R(50208, "Liturgie: Traum der Seele (Bishdariels Auge) (IV)"));
        this.o00000.put("Liturgie: Visars Vergessen (Borons s\u00fc\u00dfe Gnade (V))", new R(50208, "Liturgie: Visars Vergessen (Borons s\u00fc\u00dfe Gnade) (V)"));
        this.o00000.put("Liturgie: Taya des Tr\u00e4umenden (Kleine Liturgie des Hl. Nemekath))", new R(50208, "Liturgie: Taya des Tr\u00e4umenden (Kleine Liturgie des Hl. Nemekath)"));
        this.o00000.put("Liturgie: Segen des Heiligen Badilak (Segen der Heiligen Noiona (IV))", new R(50208, "Liturgie: Segen des Heiligen Badilak (Segen der Heiligen Noiona) (IV)"));
        this.o00000.put("Liturgie: Schattengestalt (IV))", new R(50208, "Liturgie: Schattengestalt (IV)"));
        this.o00000.put("Liturgie: Speisung der hungernden Seele", new R(50208, "Liturgie: Speisung der hungernden Seelen"));
        this.o00000.put("Liturgie: Speisung der hungernden Seele (IV)", new R(50208, "Liturgie: Speisung der hungernden Seelen (IV)"));
        this.o00000.put("Liturgie: Marbos Gnade (Etilias Gnade)", new R(50208, "Liturgie: Marbos Gnade"));
        this.o00000.put("Bogenzabuer: Seilkn\u00fcpfer", new R(50401, "Bogenzauber: Seilkn\u00fcpfer"));
        this.o00000.put("Kasemit", new R(50201, "Kasimit"));
        this.o00000.put("Norbardensippe in Thorwal", new R(50201, "Norbardensippe in Thorwal (UdW)"));
        this.o00000.put("Sippe", new R(50201, "Sippe (UdW)"));
        this.o00000.put("Ottajasko", new R(50201, "Ottajasko (UdW)"));
        this.o00000.put("S\u00f6ldnerottajasko Hammerfaust in Vinay/Brabak", new R(50201, "S\u00f6ldnerottajasko Hammerfaust in Vinay/Brabak (UdW)"));
        this.o00000.put("S\u00f6ldnerottajasko Hammerfaust in Askja/Regenwald", new R(50201, "S\u00f6ldnerottajasko Hammerfaust in Askja/Regenwald (UdW)"));
        this.o00000.put("S\u00f6ldnerottajasko Drachen von Llanka, heimatlos", new R(50201, "S\u00f6ldnerottajasko Drachen von Llanka, heimatlos (UdW)"));
        this.o00000.put("Sippe aus dem Binnenland", new R(50201, "Sippe aus dem Binnenland (UdW)"));
        this.o00000.put("helden.model.profession.Knappe", new R(50201, "helden.model.profession.Ritter"));
        this.o00000.put("helden.model.profession.Faehnrich#Infantrie-F\u00e4hnrich aus AlAnfa", new R(50201, "helden.model.profession.FaehnrichFusskaemper"));
        this.o00000.put("helden.model.profession.Faehnrich#Infantrie-F\u00e4hnrich aus Albenhus", new R(50201, "helden.model.profession.FaehnrichFusskaemper"));
        this.o00000.put("helden.model.profession.Faehnrich#F\u00e4hnrich der Festumer Infantrie", new R(50201, "helden.model.profession.FaehnrichFusskaemper"));
        this.o00000.put("helden.model.profession.Faehnrich#Kavallerie-F\u00e4hnrich aus Neetha", new R(50201, "helden.model.profession.FaehnrichFusskaemper"));
        this.o00000.put("helden.model.profession.Faehnrich#Garether Infantrie-F\u00e4hnrich", new R(50201, "helden.model.profession.FaehnrichFusskaemper"));
        this.o00000.put("helden.model.profession.Faehnrich#Infantrie-F\u00e4hnrich aus Honingen", new R(50201, "helden.model.profession.FaehnrichFusskaemper"));
        this.o00000.put("helden.model.profession.Faehnrich#Garether Kavallerie-F\u00e4hnrich", new R(50201, "helden.model.profession.FaehnrichKavallerie"));
        this.o00000.put("helden.model.profession.Faehnrich#Kavallerie-F\u00e4hnrich aus Ragath", new R(50201, "helden.model.profession.FaehnrichKavallerie"));
        this.o00000.put("helden.model.profession.Faehnrich#F\u00e4hnrich zur See aus Al'Anfa", new R(50201, "helden.model.profession.FaehnrichSee"));
        this.o00000.put("helden.model.profession.Faehnrich#F\u00e4hnrich zur See aus Methumis", new R(50201, "helden.model.profession.FaehnrichSee"));
        this.o00000.put("helden.model.profession.Faehnrich#F\u00e4hnrich zur See aus Havena", new R(50201, "helden.model.profession.FaehnrichSee"));
        this.o00000.put("helden.model.profession.Faehnrich#F\u00e4hnrich zur See aus Festum", new R(50201, "helden.model.profession.FaehnrichSee"));
        this.o00000.put("helden.model.profession.Faehnrich#F\u00e4hnrich zur See aus Grangor", new R(50201, "helden.model.profession.FaehnrichSee"));
        this.o00000.put("helden.model.profession.Faehnrich#F\u00e4hnrich zur See aus Harben", new R(50201, "helden.model.profession.FaehnrichSee"));
        this.o00000.put("helden.model.profession.Faehnrich#Stabsf\u00e4hnrich aus Wehrheim", new R(50201, "helden.model.profession.Stabsfaehnrich"));
        this.o00000.put("helden.model.profession.Faehnrich#Stabsf\u00e4hnrich aus Vinsalt", new R(50201, "helden.model.profession.Stabsfaehnrich"));
        this.o00000.put("helden.model.DDZRassen.Utulu", new R(50201, "helden.model.rasse.Utulu"));
        this.o00000.put("helden.model.DDZRassen.Tulamide", new R(50201, "helden.model.rasse.Tulamide"));
        this.o00000.put("Ferkina Besessener (Stier)", new R(50208, "Ferkina Besessener"));
        this.o00000.put("Ferkina Besessener (Khoramsbestie)", new R(50208, "Ferkina Besessener"));
        this.o00000.put("Ferkina Besessener (Bergl\u00f6we)", new R(50208, "Ferkina Besessener"));
        this.o00000.put("Ferkina Besessener (Raschtulsluchs)", new R(50208, "Ferkina Besessener"));
        this.o00000.put("Ferkina Besessener (Widder)", new R(50208, "Ferkina Besessener"));
        this.o00000.put("Federhut mir breiter Krempe", new R(50502, "Federhut mit breiter Krempe"));
        this.o00000.put("Sprachen kennen Eupheran-Code", new R(50503, "Sprachen kennen Eupherban-Code"));
        this.o00000.put("Sprachen kennen Eupheran-Haussprache", new R(50503, "Sprachen kennen Eupherban-Haussprache"));
        this.\u00d200000 = new HashMap();
        String string = null;
        try {
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("helden/framework/held/persistenz/ersetzungstabelle.csv");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
            while (null != (string = bufferedReader.readLine())) {
                String[] stringArray = string.split("\",\"");
                String string2 = stringArray[0].substring(1);
                String string3 = stringArray[1];
                String string4 = stringArray[2].substring(0, stringArray[2].length() - 2);
                this.\u00d200000.put(string3, new R(string4.split("#")[0], string4.split("#")[1], string2));
            }
        }
        catch (Exception exception) {
            private.\u00d200000("Error in Line " + string, "alle");
            throw new RuntimeException(exception.toString());
        }
    }

    public R getKorrigiereRKP(String string) {
        return this.\u00d200000.get(string);
    }

    public String korrigiere(String string, Integer n) {
        R r = this.o00000.get(string);
        if (r == null) {
            return string;
        }
        if (n == null || (Integer)r.o00000(0) >= n) {
            return r.o00000(1).toString();
        }
        return string;
    }

    public void korrigiereWahrerName(int n, F f2, ArrayList arrayList) {
        if (n <= 50202 && arrayList.size() == 2 && f2 instanceof whilesuper && ((whilesuper)f2).o\u00d60000().super()) {
            arrayList.add(0, "");
        }
    }
}

