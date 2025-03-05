/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.settings;

import helden.framework.Geschlecht;
import helden.framework.held.object.oooo_0;
import helden.framework.held.persistenz.BasisXMLParser;
import helden.framework.int.P;
import helden.framework.settings.Settings;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum Setting {
    \u00d8O0000("helden/framework/settings/settingSpielhilfenMyranor.xml"),
    o00000("helden/framework/settings/settingsbote.xml"),
    oO0000("helden/framework/settings/settingSpielhilfenDSA.xml"),
    \u00f5O0000("helden/framework/settings/settingSpielhilfenDDZ.xml"),
    \u00d5O0000("helden/framework/settings/settingescheundkork.xml"),
    \u00d800000("helden/framework/settings/settingsudw.xml"),
    \u00f6O0000("helden/framework/settings/settingswda.xml"),
    returnsuper("helden/framework/settings/settings.xml"),
    newsuper("helden/framework/settings/settingsddz.xml"),
    \u00f600000("helden/framework/settings/settingsMyranor.xml"),
    \u00d600000("helden/framework/settings/settingstiere.xml"),
    \u00f500000("helden/framework/settings/settingswesenMyranor.xml"),
    \u00f800000("helden/framework/settings/settingswesenAventurien.xml"),
    \u00f8O0000("helden/framework/settings/settingsTharun.xml");

    private static HashMap<String, Setting> \u00d2O0000;
    private static ArrayList<Setting> \u00d6O0000;
    protected HashSet<String> \u00d200000 = new HashSet();
    protected HashSet<String> for = new HashSet();
    private boolean null = false;
    protected String oo0000 = "";
    protected String \u00d3O0000;
    protected ArrayList<Setting> String = new ArrayList();
    private ArrayList<String> \u00d300000 = new ArrayList();
    protected String \u00d500000 = "";

    public static Setting getByName(String string) {
        Setting.initAll();
        return \u00d2O0000.get(string);
    }

    public static ArrayList<Setting> getHauptSettings() {
        ArrayList<Setting> arrayList = new ArrayList<Setting>();
        for (Setting setting : Setting.getSettings()) {
            if (!setting.isHauptsetting()) continue;
            try {
                arrayList.add(setting);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return arrayList;
    }

    public static synchronized ArrayList<Setting> getSettings() {
        if (\u00d6O0000 == null) {
            \u00d6O0000 = new ArrayList();
            for (Setting setting : Setting.values()) {
                \u00d6O0000.add(setting);
            }
        }
        return \u00d6O0000;
    }

    public static void initAll() {
        if (\u00d2O0000 == null) {
            \u00d2O0000 = new HashMap();
            for (Setting setting : Setting.values()) {
                setting.parse();
            }
        }
    }

    private Setting(String string2) {
        this.\u00d3O0000 = string2;
    }

    public boolean contains(String string) {
        return this.\u00d200000.contains(string);
    }

    public boolean containsAsExcluded(String string) {
        return this.for.contains(string);
    }

    public String getBeschreibung() {
        return this.\u00d500000;
    }

    public ArrayList<String> getBuecher() {
        return this.\u00d300000;
    }

    public HashSet<String> getExcluded() {
        return this.for;
    }

    public HashSet<String> getIncluded() {
        return this.\u00d200000;
    }

    public String getName() {
        return this.oo0000;
    }

    public ArrayList<Setting> getOptionaleSettings() {
        return this.String;
    }

    public boolean isHauptsetting() {
        return this.null;
    }

    public void parse() {
        try {
            BasisXMLParser basisXMLParser = new BasisXMLParser();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            Document document = null;
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            ProtectionDomain protectionDomain = ((Object)((Object)this)).getClass().getProtectionDomain();
            CodeSource codeSource = protectionDomain.getCodeSource();
            document = documentBuilder.parse(new URLClassLoader(new URL[]{codeSource.getLocation()}).getResourceAsStream(this.\u00d3O0000));
            NodeList nodeList = document.getElementsByTagName("setting");
            if (nodeList.getLength() != 1) {
                oooo_0.\u00f500000("Fehler in " + this.\u00d3O0000);
            }
            Node node = nodeList.item(0);
            this.getIncluded().add("P00");
            this.getIncluded().add("K00");
            this.getIncluded().add("R00");
            this.oo0000 = basisXMLParser.getString(node, "name");
            this.null = basisXMLParser.getString(node, "hauptsetting", "").equals("true");
            for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
                String string;
                Node node2 = node.getChildNodes().item(i2);
                if (node2.getNodeName().equals("include")) {
                    string = basisXMLParser.getString(node2, "id");
                    char c = string.charAt(0);
                    if (string.contains("#") && (c == 'P' || c == 'K' || c == 'R' || c == 'S')) {
                        String string2 = string.substring(0, string.indexOf(35));
                        this.getIncluded().add(string2);
                    }
                    this.getIncluded().add(string);
                    continue;
                }
                if (node2.getNodeName().equals("exclude")) {
                    string = basisXMLParser.getString(node2, "id");
                    this.getExcluded().add(string);
                    continue;
                }
                if (node2.getNodeName().equals("support")) {
                    string = basisXMLParser.getString(node2, "name");
                    Setting setting = Setting.getByName(string);
                    if (setting != null) {
                        this.getOptionaleSettings().add(setting);
                        continue;
                    }
                    oooo_0.\u00f500000("Setting " + (Object)((Object)setting) + " nicht gefunden!");
                    continue;
                }
                if (node2.getNodeName().equals("beschreibung")) {
                    this.\u00d500000 = node2.getFirstChild().getTextContent();
                    continue;
                }
                if (!node2.getNodeName().equals("buch")) continue;
                this.\u00d300000.add(node2.getFirstChild().getTextContent());
            }
            \u00d2O0000.put(this.oo0000, this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            oooo_0.o00000(exception);
            return;
        }
    }

    public void setOptionaleSettings(ArrayList<Setting> arrayList) {
        this.String = arrayList;
    }

    protected Settings.RESULT checkModifizererRESULT(String string, P p2) {
        if (this.for.contains(string) && p2 == null) {
            return Settings.RESULT.o00000;
        }
        if (this.for.contains(string + "#*")) {
            return Settings.RESULT.o00000;
        }
        if (p2 != null && this.for.contains(string + "#" + p2.getBezeichner(Geschlecht.\u00d400000))) {
            return Settings.RESULT.o00000;
        }
        if (this.\u00d200000.contains(string) && p2 == null) {
            return Settings.RESULT.Object;
        }
        if (this.\u00d200000.contains(string + "#*")) {
            return Settings.RESULT.Object;
        }
        if (p2 != null && this.\u00d200000.contains(string + "#" + p2.getBezeichner(Geschlecht.\u00d400000))) {
            return Settings.RESULT.Object;
        }
        return Settings.RESULT.\u00d400000;
    }

    static {
        \u00d2O0000 = null;
    }
}

