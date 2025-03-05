/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.pfadeEinstellungen;

import helden.framework.held.Object.M;
import helden.framework.pfadeEinstellungen.PfadMapItem;
import helden.framework.pfadeEinstellungen.PfadNichtGefundenException;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PfadEinstellungen {
    private PropertyChangeSupport o00000;
    private Map<String, PfadMapItem> \u00d500000 = new HashMap<String, PfadMapItem>();
    private String String = "";
    private boolean \u00d800000 = false;
    private boolean \u00d300000 = false;
    private boolean \u00d600000 = false;
    private boolean \u00d200000 = false;

    public PfadEinstellungen(PropertyChangeSupport propertyChangeSupport) {
        this.o00000 = propertyChangeSupport;
        this.\u00d200000();
    }

    public Map<String, PfadMapItem> getAll() {
        return this.\u00d500000;
    }

    public String getJarPath() {
        String string;
        File file = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
        try {
            string = URLDecoder.decode(file.getAbsoluteFile().toString(), "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            string = file.getAbsoluteFile().toString();
        }
        string = string.substring(0, string.lastIndexOf(System.getProperty("file.separator")));
        return string;
    }

    public String getPfad(String string) {
        if (string.equals("epPfad")) {
            return this.String;
        }
        PfadMapItem pfadMapItem = this.\u00d500000.get(string);
        if (pfadMapItem == null) {
            throw new PfadNichtGefundenException(string);
        }
        if (this.isEPAktive() && string.equals("einstellungsPfad")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.String);
            stringBuilder.append(System.getProperty("file.separator"));
            stringBuilder.append(pfadMapItem.getLokalPfad());
            this.mkDirs(stringBuilder.toString(), pfadMapItem.isFile());
            return stringBuilder.toString();
        }
        if (this.isHsLocal()) {
            if (string.equals("einstellungsPfad")) {
                String string2 = pfadMapItem.getCustomPfad();
                this.mkDirs(string2, pfadMapItem.isFile());
                return string2;
            }
            String string3 = this.getJarPath() + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + pfadMapItem.getLokalPfad();
            this.mkDirs(string3, pfadMapItem.isFile());
            return string3;
        }
        if (!pfadMapItem.getCustomPfad().equals("")) {
            String string4 = pfadMapItem.getCustomPfad();
            this.mkDirs(string4, pfadMapItem.isFile());
            return string4;
        }
        String string5 = pfadMapItem.getDefaultPfad();
        this.mkDirs(string5, pfadMapItem.isFile());
        return string5;
    }

    public boolean isEPAktive() {
        return !this.String.equals("");
    }

    public boolean isHsLocal() {
        return this.\u00d800000;
    }

    public boolean isProfiMode() {
        return this.\u00d300000;
    }

    public boolean mkDirs(String string, boolean bl) {
        File file = new File(string);
        if (bl) {
            if (file.isDirectory()) {
                file.delete();
                file = new File(string);
            }
            file = file.getParentFile();
        }
        return file.mkdirs();
    }

    public boolean pfadMigration(String string, String string2) {
        if (string.equals("modRasse")) {
            M.\u00d200000(string2, this.getPfad("mods") + "/Rasse", true);
            return true;
        }
        if (string.equals("modKultur")) {
            M.\u00d200000(string2, this.getPfad("mods") + "/Kultur", true);
            return true;
        }
        if (string.equals("modProfession")) {
            M.\u00d200000(string2, this.getPfad("mods") + "/Profession", true);
            return true;
        }
        return false;
    }

    public void setHsLocal(boolean bl) {
        if (!this.\u00d200000) {
            this.\u00d800000 = bl;
        }
    }

    public void setHsLocalUeberParameter(boolean bl) {
        this.\u00d800000 = bl;
        this.\u00d200000 = true;
        this.\u00d600000 = true;
        this.\u00d500000.get("einstellungsPfad").setCustomPfad(new File(".heldEinstellungen4_1.xml").getAbsolutePath());
    }

    public void setPath(String string, String string2) {
        if (this.\u00d600000 && string.equals("einstellungsPfad")) {
            return;
        }
        if (this.pfadMigration(string, string2)) {
            return;
        }
        if (this.\u00d500000.containsKey(string)) {
            this.\u00d500000.get(string).setCustomPfad(string2);
            if (string.equals("pluginPfad")) {
                this.super();
            }
            this.o00000.firePropertyChange("Change", true, false);
        }
    }

    public void setPfadePerEP(String string) {
        this.String = string;
    }

    public void setProfiMode(boolean bl) {
        this.\u00d300000 = bl;
    }

    private void \u00d200000() {
        PfadMapItem pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + ".heldEinstellungen4_1.xml", ".heldEinstellungen4_1.xml", true);
        if (new File(".heldEinstellungen4_1.xml").exists()) {
            pfadMapItem.setCustomPfad(new File(".heldEinstellungen4_1.xml").getAbsolutePath());
            this.\u00d600000 = true;
        }
        this.\u00d500000.put("einstellungsPfad", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "plugins", "plugins");
        this.\u00d500000.put("pluginPfad", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "helden.zip.hld", "helden.zip.hld", true);
        this.\u00d500000.put("heldenPfad", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "charakterbilder", "charakterbilder");
        this.\u00d500000.put("heldBildPfad", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "hintergruende", "hintergruende");
        this.\u00d500000.put("hintergruende", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "mods", "mods");
        this.\u00d500000.put("mods", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "erschaffungsSaves", "erschaffungsSaves");
        this.\u00d500000.put("erschaffungsSavesPfad", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "hilfeTexte", "hilfeTexte");
        this.\u00d500000.put("hilfeTextePfad", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "daten", "daten");
        this.\u00d500000.put("daten", pfadMapItem);
        pfadMapItem = new PfadMapItem(System.getProperty("user.home") + System.getProperty("file.separator") + "helden" + System.getProperty("file.separator") + "logs", "logs");
        this.\u00d500000.put("logs", pfadMapItem);
    }

    private void super() {
        String string;
        String string2;
        File file = new File("plugins");
        try {
            string2 = file.getCanonicalPath();
            string = new File(this.getPfad("pluginPfad")).getCanonicalPath();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        if (file.exists() && !string2.equals(string) && !this.isHsLocal()) {
            M.o00000(file.getAbsolutePath(), this.getPfad("pluginPfad"), false);
            M.o00000(file, true);
            JOptionPane.showMessageDialog(null, "Die Plugins wurden aus dem lokalem Pluginpfad in den neuen Pluginpfad verschoben!", "Info", 1);
        }
    }
}

