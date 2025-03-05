/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.Version;
import helden.framework.DruckEinstellungen;
import helden.framework.DruckSeitenEintrag;
import helden.framework.Einstellungen;
import helden.framework.HeldEinstellungen;
import helden.framework.pfadeEinstellungen.PfadMapItem;
import helden.framework.startEvents.StartEvent;
import helden.gui.allgemein.new.I;
import helden.gui.allgemein.spielleiterBrief.SpielleiterAuswahl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.tree.TreePath;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HeldEinstellungenXML {
    private HeldEinstellungen new;
    private Document o00000;

    public HeldEinstellungenXML(Document document) {
        this.o00000 = document;
    }

    public HeldEinstellungenXML(HeldEinstellungen heldEinstellungen, Document document) {
        this.new = heldEinstellungen;
        this.o00000 = document;
    }

    public void getGlobaleEinstellungen(Element element) {
        Element element2;
        Object object;
        Element element3;
        Object object22;
        Object object3;
        Element element4 = this.o00000.createElement("lastversion");
        element4.setAttribute("name", Version.getVersion());
        element.appendChild(element4);
        Set<String> set = Einstellungen.getInstance().getPfade().getAll().keySet();
        Map<String, PfadMapItem> map = Einstellungen.getInstance().getPfade().getAll();
        for (String object42 : set) {
            object3 = this.o00000.createElement("pfad");
            this.o00000(object42, map.get(object42), (Element)object3);
            element.appendChild((Node)object3);
        }
        for (String string : Einstellungen.getInstance().getZuLoeschendeDateienList()) {
            object3 = this.o00000.createElement("delPfad");
            this.o00000(string, (Element)object3);
            element.appendChild((Node)object3);
        }
        Element element5 = this.o00000.createElement("hslocal");
        element5.setAttribute("name", "" + Einstellungen.getInstance().getPfade().isHsLocal());
        element.appendChild(element5);
        Set<String> set2 = Einstellungen.getInstance().getStartEventEinstellungen().getMap().keySet();
        object3 = Einstellungen.getInstance().getStartEventEinstellungen().getMap();
        Element element6 = this.o00000.createElement("startEvents");
        for (Object object22 : set2) {
            element3 = this.o00000.createElement("event");
            object = (StartEvent)object3.get(object22);
            ((StartEvent)object).resetWennNoetig();
            this.o00000((String)object22, ((StartEvent)object).getValue(), element3);
            element6.appendChild(element3);
        }
        element.appendChild(element6);
        Element element7 = this.o00000.createElement("profiMode");
        element7.setAttribute("name", "" + Einstellungen.getInstance().getPfade().isProfiMode());
        element.appendChild(element7);
        object22 = this.o00000.createElement("hilfeanzeigen");
        object22.setAttribute("name", "" + Einstellungen.getInstance().isHilfeAnzeigen());
        element.appendChild((Node)object22);
        element3 = this.o00000.createElement("gpStart");
        element3.setAttribute("name", "" + Einstellungen.getInstance().getGPStartwert());
        element.appendChild(element3);
        object = this.o00000.createElement("metaTalentAusgeben");
        object.setAttribute("name", "" + Einstellungen.getInstance().isMetaTalenteAusgebe());
        element.appendChild((Node)object);
        Element element8 = this.o00000.createElement("goettergeschenk");
        element8.setAttribute("name", "" + Einstellungen.getInstance().isGoettergeschnkeVergeben());
        element.appendChild(element8);
        Element element9 = this.o00000.createElement("heldNamenSignatur");
        element9.setAttribute("name", "" + Einstellungen.getInstance().isNamenAufSeiteDrucken());
        element.appendChild(element9);
        Element element10 = this.o00000.createElement("geldkreisedrucken");
        element10.setAttribute("name", "" + Einstellungen.getInstance().isGeldKreiseDrucken());
        element.appendChild(element10);
        Element element11 = this.o00000.createElement("tierfeld");
        element11.setAttribute("name", "" + Einstellungen.getInstance().getTiereDrucken());
        element.appendChild(element11);
        Element element12 = this.o00000.createElement("zauberKommentar");
        element12.setAttribute("name", "" + Einstellungen.getInstance().istZauberKommentar());
        element.appendChild(element12);
        Element element13 = this.o00000.createElement("neueBoegen");
        element13.setAttribute("name", "" + Einstellungen.getInstance().isNeueBoegen());
        element.appendChild(element13);
        Element element14 = this.o00000.createElement("alteBoegen");
        element14.setAttribute("name", "" + Einstellungen.getInstance().isAlteBoegen());
        element.appendChild(element14);
        Element element15 = this.o00000.createElement("frameMaximiert");
        element15.setAttribute("name", "" + Einstellungen.getInstance().isFrameMaximize());
        element.appendChild(element15);
        Element element16 = this.o00000.createElement("autoUpdate");
        element16.setAttribute("name", "" + Einstellungen.getInstance().isAutoUpdate());
        element.appendChild(element16);
        Element element17 = this.o00000.createElement("debianMode");
        element17.setAttribute("name", "" + Einstellungen.getInstance().isDebianMode());
        element.appendChild(element17);
        Element element18 = this.o00000.createElement("autoSaveNachErschaffung");
        element18.setAttribute("name", "" + Einstellungen.getInstance().isAutoSaveNachErschaffung());
        element.appendChild(element18);
        Element element19 = this.o00000.createElement("lookandfeel");
        element19.setAttribute("name", "" + Einstellungen.getInstance().getLookAndFeel());
        element.appendChild(element19);
        Element element20 = this.o00000.createElement("zauberQuelle");
        element20.setAttribute("name", "" + Einstellungen.getInstance().isZauberQuelledrucken());
        element.appendChild(element20);
        Element element21 = this.o00000.createElement("ignoriereRangeChecks");
        element21.setAttribute("name", "" + Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
        element.appendChild(element21);
        Element element22 = this.o00000.createElement("font");
        element22.setAttribute("name", "" + Einstellungen.getInstance().getDruckFont().getFontName());
        element22.setAttribute("fontgroesse", "" + Einstellungen.getInstance().getFontGroesse());
        element.appendChild(element22);
        Element element23 = this.o00000.createElement("guifont");
        element23.setAttribute("name", "" + Einstellungen.getInstance().getGUIFont().getFontName());
        element.appendChild(element23);
        if (Einstellungen.getInstance().istNSCSchmiede()) {
            element2 = this.o00000.createElement("nscSchmiede");
            element2.setAttribute("value", "true");
            element.appendChild(element2);
        }
        element2 = this.o00000.createElement("letzterPfad");
        element2.setAttribute("name", "" + Einstellungen.getInstance().getLetzterPfad());
        element.appendChild(element2);
        Element element24 = this.o00000.createElement("anzahlTalentAktivierung");
        element24.setAttribute("name", "" + Einstellungen.getInstance().getAnzahlAktivierbar());
        element.appendChild(element24);
        Element element25 = this.o00000.createElement("proxyServer");
        element25.setAttribute("name", "" + Einstellungen.getInstance().getProxyServer());
        element.appendChild(element25);
        Element element26 = this.o00000.createElement("proxyPort");
        element26.setAttribute("name", "" + Einstellungen.getInstance().getProxyPort());
        element.appendChild(element26);
        Element element27 = this.o00000.createElement("proxyVerwenden");
        element27.setAttribute("name", "" + Einstellungen.getInstance().getProxyVerwenden());
        element.appendChild(element27);
        Element element28 = this.o00000.createElement("proxyAuth");
        element28.setAttribute("name", "" + Einstellungen.getInstance().getProxyAuthentifikation());
        element.appendChild(element28);
        Element element29 = this.o00000.createElement("proxyUser");
        element29.setAttribute("name", "" + Einstellungen.getInstance().getProxyUser());
        element.appendChild(element29);
        Element element30 = this.o00000.createElement("proxyPwd");
        element30.setAttribute("name", "" + Einstellungen.getInstance().getProxyPwd());
        element.appendChild(element30);
        Element element31 = this.o00000.createElement("neueHeldenInTree");
        element31.setAttribute("name", "" + Einstellungen.getInstance().isNeueHeldenInTree());
        element.appendChild(element31);
        Element element32 = this.o00000.createElement("sortierung");
        element32.setAttribute("name", "" + Einstellungen.getInstance().getLastSort());
        element.appendChild(element32);
        Element element33 = this.o00000.createElement("ListeOderTree");
        element33.setAttribute("name", "" + Einstellungen.getInstance().getLastSelectedListeTree());
        element.appendChild(element33);
        Element element34 = this.o00000.createElement("preRelease");
        element34.setAttribute("name", "" + Einstellungen.getInstance().isPreRelease());
        element.appendChild(element34);
        Element element35 = this.o00000.createElement("selectedPath");
        TreePath treePath = Einstellungen.getInstance().getSelectedHeldPath();
        if (treePath != null) {
            this.\u00d200000(element35, (I)treePath.getLastPathComponent());
        }
        element.appendChild(element35);
        this.o00000(element);
        Element element36 = this.o00000.createElement("slbogen");
        List<SpielleiterAuswahl> list = Einstellungen.getInstance().getSlAuswahl();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Object[] objectArray;
            if (list.get(i2).getHeld() == null) continue;
            Element element37 = this.o00000.createElement("SLheld");
            element37.setAttribute("name", list.get(i2).getHeld().\u00f4o0000());
            for (Object object4 : objectArray = list.get(i2).getAusgewaehlte().keySet().toArray()) {
                Element element38 = this.o00000.createElement("talent");
                element38.setAttribute("name", (String)object4);
                element37.appendChild(element38);
            }
            element36.appendChild(element37);
        }
        element.appendChild(element36);
        if (Einstellungen.getInstance().hatVoreinstellungen()) {
            this.\u00d200000(element);
        }
    }

    public void getGruppenBaschreibung(TreePath treePath) {
        Element element;
        Element element2 = this.o00000.createElement("tree");
        I i2 = (I)treePath.getLastPathComponent();
        if (i2.isLeaf()) {
            i2 = (I)i2.getParent();
        }
        int n = 0;
        Element element3 = element2;
        while (treePath.getPath()[n] != i2) {
            element = this.o00000.createElement("gruppe");
            element.setAttribute("name", "" + ((I)treePath.getPath()[n]).o00000());
            element3.appendChild(element);
            element3 = element;
            ++n;
        }
        element = this.o00000.createElement("gruppe");
        element.setAttribute("name", "" + i2.o00000());
        element3.appendChild(element);
        element3 = element;
        this.o00000(element3, i2);
        this.o00000.appendChild(element2);
    }

    public void getSpezifischeEinstellungen(Element element) {
        if (this.new != null) {
            Element element2 = this.o00000.createElement("HeldenName");
            element2.setAttribute("name", this.new.getHeldName());
            element.appendChild(element2);
        } else {
            Element element3 = this.o00000.createElement("HeldenName");
            element3.setAttribute("name", "NULL");
            element.appendChild(element3);
        }
    }

    public Element getXMLElement() {
        Element element = this.o00000.createElement("HeldEinstellungen");
        this.getSpezifischeEinstellungen(element);
        return element;
    }

    public Element getXMLGlobalElement() {
        Element element = this.o00000.createElement("Global");
        this.getGlobaleEinstellungen(element);
        return element;
    }

    private void \u00d200000(Element element) {
        Element element2 = this.o00000.createElement("preselect");
        Element element3 = this.o00000.createElement("user");
        element3.setAttribute("name", Einstellungen.getInstance().getPreselectUsername());
        element2.appendChild(element3);
        Element element4 = this.o00000.createElement("meister");
        element4.setAttribute("name", Einstellungen.getInstance().getPreselectMeister());
        element2.appendChild(element4);
        Element element5 = this.o00000.createElement("besitzer");
        element5.setAttribute("name", Einstellungen.getInstance().getPreselectBesitzer());
        element2.appendChild(element5);
        Element element6 = this.o00000.createElement("rasse");
        element6.setAttribute("name", Einstellungen.getInstance().getPreselectRasse());
        element2.appendChild(element6);
        Element element7 = this.o00000.createElement("kultur");
        element7.setAttribute("name", Einstellungen.getInstance().getPreselectKultur());
        element2.appendChild(element7);
        Element element8 = this.o00000.createElement("profession");
        element8.setAttribute("name", Einstellungen.getInstance().getPreselectProfession());
        element2.appendChild(element8);
        Element element9 = this.o00000.createElement("sichtbarkeit");
        element9.setAttribute("value", Einstellungen.getInstance().getPreselectSichtbarkeit());
        element2.appendChild(element9);
        Element element10 = this.o00000.createElement("ueberschreiben");
        element10.setAttribute("value", "" + Einstellungen.getInstance().getPreselectUeberschreiben());
        element2.appendChild(element10);
        Element element11 = this.o00000.createElement("minstufe");
        element11.setAttribute("value", "" + Einstellungen.getInstance().getPreselectMinStufe());
        element2.appendChild(element11);
        Element element12 = this.o00000.createElement("maxstufe");
        element12.setAttribute("value", "" + Einstellungen.getInstance().getPreselectMaxStufe());
        element2.appendChild(element12);
        element.appendChild(element2);
    }

    private void o00000(String string, Element element) {
        element.setAttribute("name", string);
    }

    private void o00000(String string, PfadMapItem pfadMapItem, Element element) {
        element.setAttribute("name", string);
        element.setAttribute("customPfad", pfadMapItem.getCustomPfad());
    }

    private void o00000(String string, long l2, Element element) {
        element.setAttribute("key", string);
        element.setAttribute("value", l2 + "");
    }

    private void o00000(Element element) {
        Element element2 = this.o00000.createElement("seitenwahlallgemein");
        DruckEinstellungen druckEinstellungen = Einstellungen.getInstance().getDruckEinstellungentAllegemein();
        element2.setAttribute("buch", "" + druckEinstellungen.isBuchdruck());
        element2.setAttribute("zonenreustung", "" + druckEinstellungen.isZonenRuestung());
        element2.setAttribute("stufe40", "" + druckEinstellungen.isDsa40stufe());
        element2.setAttribute("meta", "" + druckEinstellungen.isMetatalentedrucken());
        element2.setAttribute("zauberkommentar", "" + druckEinstellungen.isZauberkommentar());
        element2.setAttribute("tierfeld", "" + druckEinstellungen.isTierfeld());
        element2.setAttribute("geldkreise", "" + druckEinstellungen.isGeldkreise());
        element2.setAttribute("signieren", "" + druckEinstellungen.isSignieren());
        element2.setAttribute("hintergrundpfad", "" + druckEinstellungen.getBackgroudPath());
        element2.setAttribute("zrsteiler", "" + druckEinstellungen.getZonenRSTeiler());
        Iterator<Long> iterator = Einstellungen.getInstance().getSeiteAuswahlIter();
        while (iterator.hasNext()) {
            String string = iterator.next().toString();
            Element element3 = this.o00000.createElement("seitenwahl");
            druckEinstellungen = Einstellungen.getInstance().getSeitenEinstellungen(string);
            element3.setAttribute("id", string);
            element3.setAttribute("buch", "" + druckEinstellungen.isBuchdruck());
            element3.setAttribute("zonenreustung", "" + druckEinstellungen.isZonenRuestung());
            element3.setAttribute("hintergrundpfad", "" + druckEinstellungen.getBackgroudPath());
            element3.setAttribute("wundmaennchenpfad", "" + druckEinstellungen.getWundmaennchenPfad());
            element3.setAttribute("stufe40", "" + druckEinstellungen.isDsa40stufe());
            element3.setAttribute("meta", "" + druckEinstellungen.isMetatalentedrucken());
            element3.setAttribute("metaWDE", "" + druckEinstellungen.isMetaWDEdrucken());
            element3.setAttribute("zauberkommentar", "" + druckEinstellungen.isZauberkommentar());
            element3.setAttribute("tierfeld", "" + druckEinstellungen.isTierfeld());
            element3.setAttribute("geldkreise", "" + druckEinstellungen.isGeldkreise());
            element3.setAttribute("aspleiste", "" + druckEinstellungen.isAspLeiste());
            element3.setAttribute("signieren", "" + druckEinstellungen.isSignieren());
            element3.setAttribute("zrsteiler", "" + druckEinstellungen.getZonenRSTeiler());
            element3.setAttribute("blockfarbe", "" + Integer.toString(druckEinstellungen.getBlockfarbe().getRGB()));
            for (DruckSeitenEintrag druckSeitenEintrag : druckEinstellungen.getSet()) {
                Element element4 = this.o00000.createElement("DruckSeitenEintrag");
                element4.setAttribute("name", druckSeitenEintrag.getBezeichner());
                element4.setAttribute("drucken", druckSeitenEintrag.isDrucken() + "");
                element4.setAttribute("bild", druckSeitenEintrag.getBildpath());
                element4.setAttribute("hash", druckSeitenEintrag.getLastPrintHash());
                element3.appendChild(element4);
            }
            element.appendChild(element3);
        }
    }

    private Element \u00d200000(Element element, I i2) {
        if (i2 == null) {
            return element;
        }
        Element element2 = null;
        if (i2.isRoot()) {
            Element element3 = this.o00000.createElement("gruppe");
            element3.setAttribute("name", "" + i2.o00000());
            element.appendChild(element3);
            return element3;
        }
        element2 = this.\u00d200000(element, (I)i2.getParent());
        if (i2.isLeaf()) {
            Element element4 = this.o00000.createElement("heldID");
            element4.setAttribute("id", "" + i2.\u00d200000());
            element2.appendChild(element4);
            return element4;
        }
        Element element5 = this.o00000.createElement("gruppe");
        element5.setAttribute("name", "" + i2.o00000());
        element2.appendChild(element5);
        return element5;
    }

    private void o00000(Element element, I i2) {
        for (int i3 = 0; i3 < i2.getChildCount(); ++i3) {
            Element element2;
            if (i2.getChildAt(i3).isLeaf()) {
                element2 = this.o00000.createElement("heldID");
                element2.setAttribute("id", "" + ((I)i2.getChildAt(i3)).\u00d200000());
                element.appendChild(element2);
                continue;
            }
            element2 = this.o00000.createElement("gruppe");
            element2.setAttribute("name", "" + ((I)i2.getChildAt(i3)).o00000());
            this.o00000(element2, (I)i2.getChildAt(i3));
            element.appendChild(element2);
        }
    }
}

