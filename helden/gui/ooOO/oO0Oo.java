/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.E.F;
import helden.framework.Einstellungen;
import helden.framework.OOoO.R;
import helden.framework.held.K;
import helden.framework.held.Object.I;
import helden.framework.held.Object.OOoo;
import helden.framework.held.Object.Y;
import helden.framework.held.Object.private;
import helden.framework.held.Object.super.OoOO;
import helden.framework.held.Object.super.super;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.a_0;
import helden.framework.held.object.oooo_0;
import helden.framework.held.persistenz.BasisXMLParser;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.held.persistenz.XMLParser;
import helden.framework.int.C;
import helden.gui.A;
import helden.gui.B;
import helden.gui.OooO;
import helden.gui.allgemein.ExampleFileFilter;
import helden.gui.allgemein.Utils;
import helden.gui.components.JScrollPaneFast;
import helden.model.KulturFabrik;
import helden.model.ProfessionenFabrik;
import helden.model.RassenFabrik;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oO0Oo
extends AbstractAction {
    private static oO0Oo o00000;
    private A \u00d200000;

    public static oO0Oo o00000(A a2) {
        if (o00000 == null) {
            o00000 = new oO0Oo(a2);
        }
        return o00000;
    }

    private oO0Oo(A a2) {
        super("Importieren aus Datei", OooO.\u00d300000().\u00d400000());
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        File file = this.o00000();
        if (file == null) {
            return;
        }
        Einstellungen.getInstance().setLetzterPfad(file.getParentFile().toString());
        if (!this.\u00d600000(file)) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Import fehlgeschlagen, Unbekanntes Dateiformat!", "Fehler beim Import", 0);
        }
    }

    public String \u00f600000(File file) {
        String string;
        Document document;
        Object object;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            object = documentBuilderFactory.newDocumentBuilder();
            document = ((DocumentBuilder)object).parse(file);
        }
        catch (Exception exception) {
            oooo_0.o00000(exception);
            return "";
        }
        object = document.getElementsByTagName("helden");
        if (object.getLength() > 0 && object.item(0).getAttributes().getNamedItem("Version") != null) {
            string = object.item(0).getAttributes().getNamedItem("Version").getNodeValue();
            if (string.startsWith("5.")) {
                return "helden5";
            }
            if (string.startsWith("4.")) {
                return "helden4";
            }
        }
        if ((object = document.getElementsByTagName("Infos")).getLength() > 0 && object.item(0).getAttributes().getNamedItem("Version") != null && (string = object.item(0).getAttributes().getNamedItem("Version").getNodeValue()).startsWith("5.")) {
            return "infoXML";
        }
        object = document.getElementsByTagName("eigeneprofession");
        if (object.getLength() > 0 && object.item(0).getAttributes().getNamedItem("Version") != null && (string = object.item(0).getAttributes().getNamedItem("Version").getNodeValue()).startsWith("5.")) {
            return "eigeneprofession5";
        }
        object = document.getElementsByTagName("eigenekultur");
        if (object.getLength() > 0 && object.item(0).getAttributes().getNamedItem("Version") != null && (string = object.item(0).getAttributes().getNamedItem("Version").getNodeValue()).startsWith("5.")) {
            return "eigenekultur5";
        }
        object = document.getElementsByTagName("eigenerasse");
        if (object.getLength() > 0 && object.item(0).getAttributes().getNamedItem("Version") != null && (string = object.item(0).getAttributes().getNamedItem("Version").getNodeValue()).startsWith("5.")) {
            return "eigenerasse5";
        }
        object = document.getElementsByTagName("eigenegegenstaende");
        if (object.getLength() > 0) {
            return "eigenegegenstaende";
        }
        return "";
    }

    public void OO0000(File file) {
        Object object;
        Serializable serializable;
        this.\u00d200000.setCursor(new Cursor(3));
        StringBuffer stringBuffer = new StringBuffer();
        try {
            B.\u00d200000().super(0, 10, "Helden laden & auf die Konvertierung vorbereiten");
            serializable = super.o00000().o00000(file, this.\u00d200000);
            B.\u00d200000().\u00d300000();
            B.\u00d200000().super(0, 10, "Helden importieren");
            object = serializable.iterator();
            int n = 0;
            while (object.hasNext()) {
                boolean bl;
                B.\u00d200000().super(serializable.size(), ++n);
                OoOO ooOO2 = object.next();
                K k2 = ooOO2.\u00d500000();
                boolean bl2 = bl = k2 != null;
                if (ooOO2.\u00d400000().size() > 0) {
                    if (!bl) {
                        stringBuffer.append("<font color=darkred>");
                    }
                    stringBuffer.append("<h1>" + ooOO2.new() + "</h1>");
                    for (String string : ooOO2.\u00d400000()) {
                        stringBuffer.append(string + "<br>");
                        if (!bl) continue;
                        k2.o00000(new helden.framework.A.A("DSA 4.0 Import", "", string));
                    }
                    if (!bl) {
                        stringBuffer.append("<b>Held wurde nicht importiert!</b></font>");
                    }
                    stringBuffer.append("<hr>");
                } else if (bl) {
                    k2.o00000(new helden.framework.A.A("DSA 4.0 Import", "", ""));
                }
                if (k2 == null) continue;
                if (this.\u00d200000.\u00d200000(k2.\u00f4o0000()) && JOptionPane.showConfirmDialog(this.\u00d200000, "Soll der Held " + k2.toString() + " ersetzt werden?", "Held ist schon in der Liste", 0) == 0) {
                    this.\u00d200000.\u00d300000(k2.\u00f4o0000());
                }
                this.\u00d200000.super((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)k2, !object.hasNext());
                this.\u00d200000.int().setSelectedValue(k2, false);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Folgender Fehler ist aufgetreten:\n" + exception.getMessage(), "Fehler beim Laden der Helden", 0);
            private.\u00d200000("Fehler: " + exception.getMessage(), "sven");
        }
        B.\u00d200000().\u00d300000();
        this.\u00d200000.setCursor(new Cursor(0));
        if (!stringBuffer.toString().equals("")) {
            serializable = new JLabel("<html><body>" + stringBuffer.toString());
            object = new JScrollPaneFast((Component)serializable);
            JDialog jDialog = new JDialog(Utils.getFrame(this.\u00d200000), "Konverter", true);
            jDialog.add((Component)object);
            jDialog.setSize(600, 450);
            Utils.zentriere(jDialog);
            jDialog.setVisible(true);
        }
    }

    public void \u00d400000(File file) {
        Document document;
        Object object;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            object = documentBuilderFactory.newDocumentBuilder();
            document = ((DocumentBuilder)object).parse(file);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Import fehlgeschlagen, Unbekanntes Dateiformat!", "Fehler beim Import\n" + exception.getMessage(), 0);
            return;
        }
        object = new XMLParser(null);
        NodeList nodeList = document.getElementsByTagName("eigeneprofession");
        if (nodeList.getLength() > 0) {
            C c = ModsDatenParser.getInstance().einlesenRKPVariante(nodeList.item(0));
            c.publicnull();
            if (!ProfessionenFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                ((XMLParser)object).saveXML(nodeList.item(0), c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Profession");
                ProfessionenFabrik.aktualisiereEigeneProfessionen();
            }
        }
    }

    public void Object(File file) {
        Document document;
        Object object;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            object = documentBuilderFactory.newDocumentBuilder();
            document = ((DocumentBuilder)object).parse(file);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Import fehlgeschlagen, Unbekanntes Dateiformat!", "Fehler beim Import\n" + exception.getMessage(), 0);
            return;
        }
        object = new XMLParser(null);
        NodeList nodeList = document.getElementsByTagName("eigenerasse");
        if (nodeList.getLength() > 0) {
            C c = ModsDatenParser.getInstance().einlesenRKPVariante(nodeList.item(0));
            c.publicnull();
            if (!RassenFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                ((XMLParser)object).saveXML(nodeList.item(0), c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Rasse");
                RassenFabrik.aktualisiereEigeneRassen();
            }
        }
    }

    public void \u00f400000(File file) {
        this.\u00d200000.setCursor(new Cursor(3));
        B.\u00d200000().super(0, 10, "Heldgruppe laden");
        try {
            I i2 = new I();
            ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = i2.o00000(file);
            Y y2 = i2.\u00d200000();
            Iterator<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = arrayList.iterator();
            OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = null;
            boolean bl = false;
            while (iterator.hasNext()) {
                oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
                if (this.\u00d200000.super(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000()) == null) continue;
                bl = true;
            }
            if (bl) {
                Object object;
                int n = JOptionPane.showConfirmDialog(this.\u00d200000, "Es sind Helden gefunden worden die schon Existieren.\nSollen diese Helden ersetzt werden?\nWenn ja, dann gehen \u00c4nderungen seit dem Speichern der Gruppe verloren.\nWenn nein, werden den Helden neue ID's gegeben.", "", 1);
                if (n == 2) {
                    return;
                }
                if (n == 0) {
                    iterator = arrayList.iterator();
                    oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = null;
                    while (iterator.hasNext()) {
                        oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
                        object = this.\u00d200000.super(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                        if (object != null) {
                            this.\u00d200000.int().\u00d300000((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object);
                        }
                        this.\u00d200000.super(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, !iterator.hasNext());
                    }
                    this.\u00d200000.\u00f6O0000().o00000(y2);
                    ((DefaultTreeModel)this.\u00d200000.\u00f6O0000().\u00d200000().getModel()).reload();
                }
                if (n == 1) {
                    iterator = arrayList.iterator();
                    oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = null;
                    object = new HashMap<String, String>();
                    while (iterator.hasNext()) {
                        oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
                        String string = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000();
                        this.\u00d200000.super(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, !iterator.hasNext());
                        ((HashMap)object).put(string, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                    }
                    this.o00000((HashMap<String, String>)object, y2);
                    this.\u00d200000.\u00f6O0000().o00000(y2);
                    ((DefaultTreeModel)this.\u00d200000.\u00f6O0000().\u00d200000().getModel()).reload();
                }
            } else {
                iterator = arrayList.iterator();
                oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = null;
                while (iterator.hasNext()) {
                    oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
                    this.\u00d200000.super(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, !iterator.hasNext());
                }
                this.\u00d200000.\u00f6O0000().o00000(y2);
                ((DefaultTreeModel)this.\u00d200000.\u00f6O0000().\u00d200000().getModel()).reload();
            }
            this.\u00d200000.int().new(Einstellungen.getInstance().getLastSort());
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.\u00d200000, exception.getMessage(), "Fehler beim Laden der Heldengruppe", 0);
            exception.printStackTrace();
        }
        this.\u00d200000.setCursor(new Cursor(0));
        if (a_0.class().\u00f800000()) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Folgende Helden konnten nicht geladen werden:\n\n" + a_0.class().\u00d600000() + "\n\n" + "Diese Helden gehen unwiederbringlich verloren, " + "wenn sie auf Speichern gehen!\n\n" + "Zur L\u00f6sung dieses Problemes, k\u00f6nnen sie sich an die Programmierer wenden.\n" + "http://forum.helden-software.de/", "Fehler beim Laden", 0);
        }
        B.\u00d200000().\u00d300000();
    }

    public boolean o00000(File file, String string) {
        try {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry zipEntry = zipFile.getEntry(string);
            zipFile.close();
            return zipEntry != null;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean void(File file) {
        try {
            JarFile jarFile = new JarFile(file);
            String string = jarFile.getManifest().getMainAttributes().getValue("HeldenPluginClass");
            jarFile.close();
            return string != null;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean float(File file) {
        try {
            ZipFile zipFile = new ZipFile(file);
            zipFile.close();
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    public boolean \u00d600000(File file) {
        boolean bl = this.float(file);
        boolean bl2 = this.void(file);
        String string = "";
        if (!bl) {
            string = this.\u00f600000(file);
        }
        if (bl2) {
            bl = false;
        }
        if (bl && this.o00000(file, "held.xml.tree")) {
            this.\u00f400000(file);
            return true;
        }
        if (bl && (this.o00000(file, "hb1.JPG") || this.o00000(file, "hb1.jpg"))) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Sie versuchen Hintergr\u00fcnde der Version 4.7.x zu importieren.\nAufgrund eines ge\u00e4nderten Layouts ist dieses nicht m\u00f6glich.\nBei Fragen: http://forum.helden-software.de", "", 0);
            return true;
        }
        if (bl && (this.o00000(file, "hshb1.JPG") || this.o00000(file, "hshb1.jpg"))) {
            this.o00000(file);
            return true;
        }
        if (string.equals("helden5")) {
            this.\u00f500000(file);
            return true;
        }
        if (string.equals("helden4")) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Sie versuchen DSA 4.0 Helden zu importieren.\nDieses funktioniert nicht in allen F\u00e4llen korrekt.\nEs kann sein, dass Helden \u00fcberhaupt nicht importiert werden k\u00f6nnen oder\ndass Helden fehlerhaft importiert wird.\n\nNach dem Import erhalten sie eine Liste aller Probleme, die bei dem\nImport aufgetreten sind. \u00dcber den Men\u00fcpunkt Steigern/Ereignisse anzeigen\nk\u00f6nnen sie sich sp\u00e4ter f\u00fcr jeden Helden diese Probleme nochmal anschauen.\nGgf. sind \u00c4nderungen mit Hilfe des Editor (Datei/Einen Helden Editieren)\nnowendig\n \n\nZur Funktionsweise: Es wird versucht Rassen, Kulturen, Professionen,\nVorteile, Nachteile und Sonderfertigkeiten entsprechend den DSA 4.1 Regeln\numzustellen.\n\nBeispiele zur Verdeutlichung:\n- Wenn der Held Gef\u00e4\u00df der Sterne hat, erh\u00e4lt der Held gem\u00e4\u00df den DSA 4.1\n  Regeln mehr Astrale, kauft Astrale zuk\u00fcnftig zu normalen Kosten und\n  die Grenze f\u00fcr den Zukauf ist nicht mehr 1,5xCH.\n- Wenn der Held als Profession Bergmann hat, entf\u00e4llt der +1 Modifikator\n  auf KK oder KO. Der Held verliert also einen Eigenschaftspunkt.\n- Meisterliche Zauberkontrolle wird zu Meisterliche Zauberkontrolle 2.\n", "", 0);
            this.OO0000(file);
            return true;
        }
        if (string.equals("infoXML")) {
            OOoo.o00000().o00000(file);
            JOptionPane.showMessageDialog(this.\u00d200000, "Die Infos wurden importiert!");
            OOoo.o00000().new();
            return true;
        }
        if (string.equals("eigeneprofession5")) {
            this.\u00d400000(file);
            return true;
        }
        if (string.equals("eigenerasse5")) {
            this.Object(file);
            return true;
        }
        if (string.equals("eigenekultur5")) {
            this.\u00d200000(file);
            return true;
        }
        if (string.equals("eigenegegenstaende")) {
            return this.\u00d500000(file);
        }
        if (bl2) {
            int n;
            File file2 = new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad"), file.getName());
            String string2 = "Soll das Plugin " + file.getName() + "\n" + "nach " + Einstellungen.getInstance().getPfade().getPfad("pluginPfad") + "\n" + "installiert werden?";
            if (file2.exists()) {
                string2 = "Das Plugin " + file.getName() + " ist bereits vorhanden.\n" + "Soll es \u00fcberschrieben werden?";
            }
            if ((n = JOptionPane.showConfirmDialog(this.\u00d200000, string2, "Plugin Installation", 0)) != 0) {
                return true;
            }
            File file3 = new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad"));
            file3.mkdirs();
            boolean bl3 = this.o00000(file.getAbsoluteFile().toString(), file2.getAbsoluteFile().toString());
            if (bl3) {
                JOptionPane.showMessageDialog(this.\u00d200000, "Um das Plugin nutzen zu k\u00f6nnen,\nist ein Neustart des Programmes notwendig!", "Neustart erforderlich", 0);
            } else {
                JOptionPane.showMessageDialog(this.\u00d200000, "Beim Installieren des Plugins ist ein Fehler aufgetreten", "Fehler", 0);
            }
            return true;
        }
        if (bl) {
            boolean bl4 = false;
            try {
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
                byte[] byArray = new byte[16384];
                while (enumeration.hasMoreElements()) {
                    ZipEntry zipEntry = enumeration.nextElement();
                    try {
                        int n;
                        if (zipEntry.isDirectory()) continue;
                        System.out.println(zipEntry.getName());
                        File file4 = File.createTempFile("heldensoftwaretmp-", ".tmp");
                        file4.deleteOnExit();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file4));
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                        while ((n = bufferedInputStream.read(byArray)) > 0) {
                            bufferedOutputStream.write(byArray, 0, n);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        bufferedInputStream.close();
                        boolean bl5 = this.\u00d600000(file4);
                        bl4 = bl4 || bl5;
                        file4.delete();
                    }
                    catch (Exception exception) {
                        oooo_0.\u00f500000("Kann " + zipEntry.getName() + " nicht entpacken!\n");
                        oooo_0.o00000(exception);
                    }
                }
                zipFile.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (bl4) {
                return true;
            }
        }
        return false;
    }

    private void o00000(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n;
        byte[] byArray = new byte[65535];
        while ((n = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean o00000(String string, String string2) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(string);
            fileOutputStream = new FileOutputStream(string2);
            this.o00000(fileInputStream, fileOutputStream);
            boolean bl = true;
            return bl;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                }
                catch (IOException iOException) {}
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                }
                catch (IOException iOException) {}
            }
        }
        return false;
    }

    private File o00000() {
        JFileChooser jFileChooser = new JFileChooser(Einstellungen.getInstance().getLetzterPfad());
        jFileChooser.addChoosableFileFilter(new ExampleFileFilter("zip.hgd", "Heldengruppen"));
        jFileChooser.addChoosableFileFilter(new ExampleFileFilter("xml.zip", "xml", "XML-Daten"));
        jFileChooser.addChoosableFileFilter(new ExampleFileFilter("jar", "Plugins"));
        jFileChooser.addChoosableFileFilter(new ExampleFileFilter("zip.hld", "Heldendatenbank"));
        jFileChooser.addChoosableFileFilter(new ExampleFileFilter("zip", "Hintergr\u00fcnde"));
        String[] stringArray = new String[]{"xml", "zip.hgd", "xml.zip", "jar", "zip.hld", "zip"};
        jFileChooser.setFileFilter(new ExampleFileFilter(stringArray, "Alle Heldenformate"));
        jFileChooser.setFileSelectionMode(0);
        if (jFileChooser.showOpenDialog(this.\u00d200000) != 0) {
            return null;
        }
        File file = jFileChooser.getSelectedFile();
        if (!file.exists() || file.isDirectory()) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Import fehlgeschlagen, Datei existiert nicht!", "Fehler beim Import", 0);
            return null;
        }
        return file;
    }

    private void \u00d200000(File file) {
        Document document;
        Object object;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            object = documentBuilderFactory.newDocumentBuilder();
            document = ((DocumentBuilder)object).parse(file);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Import fehlgeschlagen, Unbekanntes Dateiformat!", "Fehler beim Import\n" + exception.getMessage(), 0);
            return;
        }
        object = new XMLParser(null);
        NodeList nodeList = document.getElementsByTagName("eigenekultur");
        if (nodeList.getLength() > 0) {
            C c = ModsDatenParser.getInstance().einlesenRKPVariante(nodeList.item(0));
            c.publicnull();
            if (!KulturFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                ((XMLParser)object).saveXML(nodeList.item(0), c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Kultur");
                KulturFabrik.aktualisiereEigeneKulturen();
            }
        }
    }

    private boolean \u00d500000(File file) {
        BasisXMLParser basisXMLParser = new BasisXMLParser();
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            NodeList nodeList = document.getElementsByTagName("gegenstand");
            for (int i2 = 0; nodeList != null && i2 < nodeList.getLength(); ++i2) {
                Node node = nodeList.item(i2);
                R r = basisXMLParser.getGegenstand(null, node);
                System.out.println(r.toString());
                this.\u00d200000.\u00d2O0000().\u00d8o0000().new((F)r.o00000(0));
            }
            this.\u00d200000.\u00d800000();
        }
        catch (Exception exception) {
            oooo_0.o00000(exception);
            return false;
        }
        return true;
    }

    private void \u00f500000(File file) {
        this.\u00d200000.setCursor(new Cursor(3));
        try {
            int n = a_0.class().\u00d800000();
            B.\u00d200000().super(0, 10, "Held laden");
            ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = a_0.class().super(file);
            B.\u00d200000().\u00d300000();
            if (a_0.class().\u00f800000() && n != a_0.class().\u00d800000()) {
                JOptionPane.showMessageDialog(this.\u00d200000, "Import fehlgeschlagen", "Fehler beim Import des Helden", 0);
            } else {
                Iterator<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
                    if (this.\u00d200000.\u00d200000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000()) && JOptionPane.showConfirmDialog(this.\u00d200000, "Soll der Held " + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString() + " ersetzt werden?", "Held ist schon in der Liste", 0) == 0) {
                        this.\u00d200000.\u00d300000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                    }
                    this.\u00d200000.super(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, !iterator.hasNext());
                    this.\u00d200000.int().setSelectedValue(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, true);
                }
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.\u00d200000, exception.getMessage(), "Fehler beim Laden der Helden", 0);
            exception.printStackTrace();
            B.\u00d200000().\u00d300000();
        }
        this.\u00d200000.setCursor(new Cursor(0));
    }

    private void o00000(File file) {
        Object object;
        String string = file.getName().substring(0, file.getName().lastIndexOf("."));
        File file2 = new File(Einstellungen.getInstance().getPfade().getPfad("hintergruende"), string);
        if (!file2.exists()) {
            object = "Soll der Hintergrund '" + string + "'\n" + "nach " + Einstellungen.getInstance().getPfade().getPfad("hintergruende") + "\n" + "installiert werden?";
            int n = JOptionPane.showConfirmDialog(this.\u00d200000, object, "Plugin Installation", 0);
            if (n != 0) {
                return;
            }
        } else {
            String string2 = "Der Hintergrund '" + string + "' ist bereits vorhanden.\n" + "Kann den Hintergrund nicht\n" + "nach " + Einstellungen.getInstance().getPfade().getPfad("hintergruende") + " installieren\n";
            JOptionPane.showMessageDialog(this.\u00d200000, string2, "Kann Hintergrund nicht installieren", 0);
            return;
        }
        file2.mkdirs();
        try {
            object = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumeration = ((ZipFile)object).entries();
            byte[] byArray = new byte[16384];
            while (enumeration.hasMoreElements()) {
                int n;
                ZipEntry zipEntry = enumeration.nextElement();
                if (zipEntry.isDirectory()) continue;
                String string3 = new File(zipEntry.getName()).getName().toLowerCase();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file2, string3)));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(((ZipFile)object).getInputStream(zipEntry));
                while ((n = bufferedInputStream.read(byArray)) > 0) {
                    bufferedOutputStream.write(byArray, 0, n);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
            }
            ((ZipFile)object).close();
        }
        catch (Exception exception) {
            return;
        }
        JOptionPane.showMessageDialog(this.\u00d200000, "Der Hintergrund wurde erfolgreich installiert.\nAb sofort ist er \u00fcber den Menupunkt\nEinstellungen\\Drucken\\Seiten / Hintergrund w\u00e4hlen\nnutzbar\n", "Hintergrund installiert", 1);
    }

    private void o00000(HashMap<String, String> hashMap, Y y2) {
        if (y2 != null) {
            for (int i2 = 0; i2 < y2.o00000().size(); ++i2) {
                if (y2.o00000().get(i2).\u00d300000()) {
                    y2.o00000().get(i2).o00000(hashMap.get(y2.o00000().get(i2).new()));
                }
                if (y2.o00000().get(i2).\u00d300000()) continue;
                this.o00000(hashMap, y2.o00000().get(i2));
            }
        }
    }
}

