/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

import helden.framework.DruckEinstellungen;
import helden.framework.HeldEinstellungen;
import helden.framework.held.Object.Y;
import helden.framework.pfadeEinstellungen.PfadEinstellungen;
import helden.framework.startEvents.StartEventEinstellungen;
import helden.gui.allgemein.spielleiterBrief.SpielleiterAuswahl;
import helden.gui.laf.DSAMetalLookAndFeel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Einstellungen {
    private static Einstellungen \u00f8\u00d30000;
    private PropertyChangeSupport \u00f4O0000;
    private boolean \u00f8o0000 = false;
    private List<SpielleiterAuswahl> Stringsuper = new ArrayList<SpielleiterAuswahl>();
    private Properties whilenew;
    private boolean Oo0000 = false;
    private Font \u00d3O0000;
    private Font \u00d5\u00d40000;
    private int o\u00d30000;
    private boolean \u00d8\u00d20000;
    private ArrayList<HeldEinstellungen> o00000;
    private String \u00d5o0000;
    private boolean nullsuper = true;
    private boolean \u00d3\u00d20000 = true;
    private String \u00d300000 = "";
    private String \u00f4\u00d40000 = "";
    private boolean \u00d4\u00d30000 = true;
    private boolean \u00d4\u00d20000 = false;
    private boolean returnnew = false;
    private String if;
    private String \u00d5O0000;
    private String \u00d4o0000;
    private String \u00d3o0000;
    private boolean \u00f4o0000 = false;
    private HashMap<Long, DruckEinstellungen> \u00d400000;
    private DruckEinstellungen thisObject;
    private boolean privateObject;
    private String \u00f5\u00d20000;
    private boolean \u00f5o0000;
    private boolean \u00f5\u00d40000;
    private boolean ifnew = false;
    private String new;
    private String oo0000;
    private String \u00f8O0000;
    private String \u00f8\u00d20000;
    private String StringObject;
    private String return;
    private Integer o\u00d40000;
    private Integer \u00d4\u00d40000;
    private String O\u00d20000;
    private String \u00f5O0000;
    private boolean \u00d5\u00d20000;
    private int \u00d3\u00d40000 = 5;
    private boolean OO0000;
    private boolean \u00d4O0000;
    private Y \u00f500000;
    private DefaultTreeModel \u00d8o0000;
    private TreePath \u00f800000;
    private int \u00f4\u00d30000;
    private String O\u00d40000;
    private TreePath \u00d800000;
    private Y \u00f400000;
    private BufferedImage \u00d8\u00d30000;
    private String \u00f8\u00d40000 = null;
    private boolean forObject = false;
    private boolean while = true;
    private String \u00d500000 = "alle";
    private boolean privatesuper = false;
    private boolean \u00f5\u00d30000 = true;
    private boolean \u00d8\u00d40000 = true;
    private PfadEinstellungen \u00d3\u00d30000;
    private ArrayList<String> forsuper;
    private ArrayList<String> \u00d5\u00d30000;
    private ArrayList<String> newnew;
    private boolean nullObject = true;
    private int thissuper = 0;
    private StartEventEinstellungen \u00f4\u00d20000;
    private String[] o\u00d20000;
    private boolean O\u00d30000 = false;
    private boolean \u00d8O0000 = false;
    private boolean O\u00d50000 = false;
    private boolean oO0000 = false;

    public static Einstellungen getInstance() {
        if (\u00f8\u00d30000 == null) {
            \u00f8\u00d30000 = new Einstellungen();
        }
        return \u00f8\u00d30000;
    }

    private Einstellungen() {
        this.\u00f4O0000 = new PropertyChangeSupport(this);
        this.whilenew = new Properties();
        this.setGPStartwert(110);
        this.\u00d3\u00d30000 = new PfadEinstellungen(this.\u00f4O0000);
        this.\u00d3O0000 = new Font("Serif", 0, 9);
        this.\u00d5\u00d40000 = new Font("Serif", 0, 9);
        this.o\u00d30000 = 0;
        this.\u00d8\u00d20000 = true;
        this.\u00d5o0000 = "";
        this.if = "";
        this.\u00d5O0000 = "";
        this.\u00d4o0000 = "";
        this.\u00d3o0000 = "";
        this.thisObject = new DruckEinstellungen();
        this.\u00d400000 = new HashMap();
        this.\u00f5\u00d20000 = DSAMetalLookAndFeel.class.getName();
        this.\u00f5o0000 = false;
        this.\u00f5\u00d40000 = false;
        this.OO0000 = false;
        this.\u00d4O0000 = true;
        this.\u00f4\u00d30000 = 0;
        this.O\u00d40000 = "time";
    }

    public void addListener(PropertyChangeListener propertyChangeListener) {
        this.\u00f4O0000.addPropertyChangeListener(propertyChangeListener);
    }

    public String getActor() {
        return this.\u00d500000;
    }

    public int getAnzahlAktivierbar() {
        return this.\u00d3\u00d40000;
    }

    public String[] getArgs() {
        return this.o\u00d20000;
    }

    public boolean getBuchdruck() {
        return this.privateObject;
    }

    public DruckEinstellungen getDruckEinstellungentAllegemein() {
        return this.thisObject;
    }

    public Font getDruckFont() {
        return this.\u00d3O0000;
    }

    public int getEigenschaftenMaximum() {
        String string = this.whilenew.getProperty("Eigenschaft-Maximum");
        return Integer.parseInt(string);
    }

    public int getFontGroesse() {
        return this.o\u00d30000;
    }

    public int getGPStartwert() {
        String string = this.whilenew.getProperty("GP-Startwert");
        return Integer.parseInt(string);
    }

    public boolean getGrau() {
        return this.\u00d4\u00d30000;
    }

    public Font getGUIFont() {
        return this.\u00d5\u00d40000;
    }

    public ArrayList<HeldEinstellungen> getHeldEinstellungen() {
        return this.o00000;
    }

    public BufferedImage getHintergundFuerGUI() {
        if (this.\u00d8\u00d30000 == null) {
            String string = "helden/gui/icons/back.jpg";
            try {
                this.\u00d8\u00d30000 = ImageIO.read(Thread.currentThread().getContextClassLoader().getResource(string));
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return this.\u00d8\u00d30000;
    }

    public ArrayList<String> getJarParameterList() {
        if (this.forsuper == null) {
            this.forsuper = new ArrayList();
        }
        return this.forsuper;
    }

    public int getLastSelectedListeTree() {
        return this.\u00f4\u00d30000;
    }

    public String getLastSort() {
        return this.O\u00d40000;
    }

    public String getLastVersion() {
        return this.\u00f8\u00d40000;
    }

    public String getLetzterPfad() {
        return this.\u00d5o0000;
    }

    public String getLookAndFeel() {
        return this.\u00f5\u00d20000;
    }

    public int getMaxEigenschaftenGP() {
        String string = this.whilenew.getProperty("Eigenschaften-GP");
        return Integer.parseInt(string);
    }

    public PfadEinstellungen getPfade() {
        return this.\u00d3\u00d30000;
    }

    public int getPortNummer() {
        return this.thissuper;
    }

    public String getPreselectBesitzer() {
        return this.return;
    }

    public String getPreselectKultur() {
        return this.\u00f8O0000;
    }

    public Integer getPreselectMaxStufe() {
        return this.o\u00d40000;
    }

    public String getPreselectMeister() {
        return this.O\u00d20000;
    }

    public Integer getPreselectMinStufe() {
        return this.\u00d4\u00d40000;
    }

    public String getPreselectProfession() {
        return this.StringObject;
    }

    public String getPreselectRasse() {
        return this.\u00f8\u00d20000;
    }

    public String getPreselectServer() {
        return this.\u00f5O0000;
    }

    public String getPreselectSichtbarkeit() {
        return this.oo0000;
    }

    public boolean getPreselectUeberschreiben() {
        return this.\u00d5\u00d20000;
    }

    public String getPreselectUsername() {
        return this.new;
    }

    public boolean getProxyAuthentifikation() {
        return this.returnnew;
    }

    public String getProxyPort() {
        return this.\u00d5O0000;
    }

    public String getProxyPwd() {
        return this.\u00d3o0000;
    }

    public String getProxyServer() {
        return this.if;
    }

    public String getProxyUser() {
        return this.\u00d4o0000;
    }

    public boolean getProxyVerwenden() {
        return this.\u00d4\u00d20000;
    }

    public Iterator<Long> getSeiteAuswahlIter() {
        return this.\u00d400000.keySet().iterator();
    }

    public DruckEinstellungen getSeitenEinstellungen(String string) {
        Long l2 = new Long(Long.parseLong(string));
        if (this.\u00d400000.get(l2) == null) {
            this.\u00d400000.put(l2, this.thisObject.getClone());
        }
        return this.\u00d400000.get(l2);
    }

    public TreePath getSelectedHeldPath() {
        return this.\u00d800000;
    }

    public Y getSelectetPathNote() {
        return this.\u00f400000;
    }

    public List<SpielleiterAuswahl> getSlAuswahl() {
        return this.Stringsuper;
    }

    public StartEventEinstellungen getStartEventEinstellungen() {
        if (this.\u00f4\u00d20000 == null) {
            this.\u00f4\u00d20000 = new StartEventEinstellungen();
        }
        return this.\u00f4\u00d20000;
    }

    public boolean getTiereDrucken() {
        return this.getDruckEinstellungentAllegemein().isTierfeld();
    }

    public DefaultTreeModel getTreeModel() {
        return this.\u00d8o0000;
    }

    public Y getTreeRootNote() {
        return this.\u00f500000;
    }

    public TreePath getTreeSelectionPath() {
        return this.\u00f800000;
    }

    public String getUsername() {
        return this.\u00d300000;
    }

    public String getUserpasswort() {
        return this.\u00f4\u00d40000;
    }

    public ArrayList<String> getVMParameterList() {
        if (this.\u00d5\u00d30000 == null) {
            this.\u00d5\u00d30000 = new ArrayList();
        }
        return this.\u00d5\u00d30000;
    }

    public ArrayList<String> getZuLoeschendeDateienList() {
        if (this.newnew == null) {
            this.newnew = new ArrayList();
        }
        return this.newnew;
    }

    public boolean hatVoreinstellungen() {
        return this.ifnew;
    }

    public boolean isAlteBoegen() {
        return this.\u00f5\u00d30000;
    }

    public boolean isAutoSaveNachErschaffung() {
        return this.oO0000;
    }

    public boolean isAutoUpdate() {
        return this.nullObject;
    }

    public boolean isDebianMode() {
        return this.\u00d8O0000;
    }

    public boolean isFehler() {
        return this.OO0000;
    }

    public boolean isFrameMaximize() {
        return this.\u00f4o0000;
    }

    public boolean isGeldKreiseDrucken() {
        return this.getDruckEinstellungentAllegemein().isGeldkreise();
    }

    public boolean isGoettergeschnkeVergeben() {
        return this.\u00f8o0000;
    }

    public boolean isHilfeAnzeigen() {
        return this.while;
    }

    public boolean isIgnoriereAlleLaengenChecks() {
        return this.O\u00d30000;
    }

    public boolean isInfoWochenTimer() {
        return this.privatesuper;
    }

    public boolean isInit() {
        return this.\u00d3\u00d20000;
    }

    public boolean isMetaTalenteAusgebe() {
        return this.getDruckEinstellungentAllegemein().isMetatalentedrucken();
    }

    public boolean isNamenAufSeiteDrucken() {
        return this.getDruckEinstellungentAllegemein().isSignieren();
    }

    public boolean isNeueBoegen() {
        return this.\u00d8\u00d40000;
    }

    public boolean isNeueHeldenInTree() {
        return this.\u00d4O0000;
    }

    public boolean isPreRelease() {
        return this.forObject;
    }

    public boolean istEmbeddedFont() {
        return false;
    }

    public boolean isTestMode() {
        return this.\u00f5\u00d40000;
    }

    public boolean istNSCSchmiede() {
        return this.Oo0000;
    }

    public boolean istZauberKommentar() {
        return this.getDruckEinstellungentAllegemein().isZauberkommentar();
    }

    public boolean isVerderben() {
        return this.\u00f5o0000;
    }

    public boolean isZauberQuelledrucken() {
        return this.nullsuper;
    }

    public boolean isZusatzInfoSpeichern() {
        return this.\u00d8\u00d20000;
    }

    public void resetFehler() {
        this.OO0000 = false;
    }

    public void setActor(String string) {
        this.\u00d500000 = string;
    }

    public void setAlteBoegen(boolean bl) {
        this.\u00f5\u00d30000 = bl;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setAnzahlAktivierbar(int n) {
        this.\u00d3\u00d40000 = n;
    }

    public void setArgs(String[] stringArray) {
        this.o\u00d20000 = stringArray;
    }

    public void setAutoSaveNachErschaffung(boolean bl) {
        this.oO0000 = bl;
    }

    public void setAutoUpdate(boolean bl) {
        this.nullObject = bl;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setBuchdruck(boolean bl) {
        this.privateObject = bl;
    }

    public void setDebianMode(boolean bl) {
        if (!this.O\u00d50000) {
            this.\u00d8O0000 = bl;
            this.O\u00d50000 = true;
        }
    }

    public void setFehler() {
        this.OO0000 = true;
    }

    public void setFontGroesse(int n) {
        this.o\u00d30000 = n;
    }

    public void setFontOhneWarnung(Font font) {
        this.\u00d3O0000 = font;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setFrameMaximize(boolean bl) {
        this.\u00f4o0000 = bl;
    }

    public void setGeldKreiseDrucken(boolean bl) {
        this.getDruckEinstellungentAllegemein().setGeldkreise(bl);
    }

    public void setGoettergeschnkeVergeben(boolean bl) {
        this.\u00f8o0000 = bl;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setGPStartwert(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("GP kleiner 0");
        }
        String string = "" + n;
        this.whilenew.setProperty("GP-Startwert", string);
        if (n <= 119) {
            this.whilenew.setProperty("Eigenschaften-GP", "100");
            this.whilenew.setProperty("Eigenschaft-Maximum", "14");
        } else if (n <= 129) {
            this.whilenew.setProperty("Eigenschaften-GP", "110");
            this.whilenew.setProperty("Eigenschaft-Maximum", "15");
        } else if (n <= 139) {
            this.whilenew.setProperty("Eigenschaften-GP", "115");
            this.whilenew.setProperty("Eigenschaft-Maximum", "15");
        } else {
            this.whilenew.setProperty("Eigenschaften-GP", "120");
            this.whilenew.setProperty("Eigenschaft-Maximum", "16");
        }
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setGrau(boolean bl) {
        this.\u00d4\u00d30000 = bl;
    }

    public void setGuiFont(Font font) {
        this.\u00d5\u00d40000 = font;
        this.\u00f4O0000.firePropertyChange("Change_Font", true, false);
    }

    public void setHeldEinstellungen(ArrayList<HeldEinstellungen> arrayList) {
        this.o00000 = arrayList;
    }

    public void setHilfeAnzeigen(boolean bl) {
        this.while = bl;
    }

    public void setIgnoriereAlleLaengenChecks(boolean bl) {
        this.O\u00d30000 = bl;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setInfoWochenTimer(boolean bl) {
        this.privatesuper = bl;
    }

    public void setInitFalse() {
        this.\u00d3\u00d20000 = false;
    }

    public void setIstNSCSchmiede(boolean bl) {
        this.Oo0000 = bl;
    }

    public void setLastSelectedListeTree(int n) {
        this.\u00f4\u00d30000 = n;
    }

    public void setLastSort(String string) {
        this.O\u00d40000 = string;
    }

    public void setLastVersion(String string) {
        this.\u00f8\u00d40000 = string;
    }

    public void setLetzterPfad(String string) {
        this.\u00d5o0000 = string;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setLookAndFeel(String string) {
        this.\u00f5\u00d20000 = string;
    }

    public void setMetaTalenteAusgebe(boolean bl) {
        this.getDruckEinstellungentAllegemein().setMetatalentedrucken(bl);
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setNameAufSeiteDrucken(boolean bl) {
        this.getDruckEinstellungentAllegemein().setSignieren(bl);
    }

    public void setNeueBoegen(boolean bl) {
        this.\u00d8\u00d40000 = bl;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setNeueHeldenInTree(boolean bl) {
        this.\u00d4O0000 = bl;
    }

    public void setPort(String string) {
        try {
            this.thissuper = Integer.parseInt(string);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Die Portnummer ist ung\u00fcltig!", "Programmende!", 0);
        }
    }

    public void setPreRelease(boolean bl) {
        this.forObject = bl;
    }

    public void setPreselectBesitzer(String string) {
        this.return = string;
    }

    public void setPreselectKultur(String string) {
        this.\u00f8O0000 = string;
    }

    public void setPreselectMaxStufe(Integer n) {
        this.o\u00d40000 = n;
    }

    public void setPreselectMeister(String string) {
        this.O\u00d20000 = string;
    }

    public void setPreselectMinStufe(Integer n) {
        this.\u00d4\u00d40000 = n;
    }

    public void setPreselectProfession(String string) {
        this.StringObject = string;
    }

    public void setPreselectRasse(String string) {
        this.\u00f8\u00d20000 = string;
    }

    public void setPreselectServer(String string) {
        this.\u00f5O0000 = string;
    }

    public void setPreselectSichtbarkeit(String string) {
        this.oo0000 = string;
    }

    public void setPreselectUeberschreiben(boolean bl) {
        this.\u00d5\u00d20000 = bl;
    }

    public void setPreselectUsername(String string) {
        this.new = string;
    }

    public void setProxyAuthentifikation(boolean bl) {
        this.returnnew = bl;
    }

    public void setProxyPort(String string) {
        this.\u00d5O0000 = string;
    }

    public void setProxyPwd(String string) {
        this.\u00d3o0000 = string;
    }

    public void setProxyServer(String string) {
        this.if = string;
    }

    public void setProxyUser(String string) {
        this.\u00d4o0000 = string;
    }

    public void setProxyVerwenden(boolean bl) {
        this.\u00d4\u00d20000 = bl;
    }

    public void setSeitenEinstellungen(String string, DruckEinstellungen druckEinstellungen) {
        Long l2 = new Long(Long.parseLong(string));
        this.\u00d400000.put(l2, druckEinstellungen);
    }

    public void setSelectedHeldPath(TreePath treePath) {
        this.\u00d800000 = treePath;
    }

    public void setSelectetPathNote(Y y2) {
        this.\u00f400000 = y2;
    }

    public void setSLAuswahl(List<SpielleiterAuswahl> list) {
        this.Stringsuper = list;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }

    public void setTestMode(boolean bl) {
        this.\u00f5\u00d40000 = bl;
    }

    public void setTiereDrucken(boolean bl) {
        this.getDruckEinstellungentAllegemein().setTierfeld(bl);
    }

    public void setTreeModel(DefaultTreeModel defaultTreeModel) {
        this.\u00d8o0000 = defaultTreeModel;
    }

    public void setTreeRootNote(Y y2) {
        this.\u00f500000 = y2;
    }

    public void setTreeSelectionPath(TreePath treePath) {
        this.\u00f800000 = treePath;
    }

    public void setUsername(String string) {
        this.\u00d300000 = string;
    }

    public void setUserpasswort(String string) {
        this.\u00f4\u00d40000 = string;
    }

    public void setVerderben(boolean bl) {
        this.\u00f5o0000 = bl;
    }

    public void setVoreinstellungen(boolean bl) {
        this.ifnew = bl;
    }

    public void setZauberKommentar(boolean bl) {
        this.getDruckEinstellungentAllegemein().setZauberkommentar(bl);
    }

    public void setZauberQuelledrucken(boolean bl) {
        this.nullsuper = bl;
    }

    public void setZusatzInfoSpeichern(boolean bl) {
        this.\u00d8\u00d20000 = bl;
        this.\u00f4O0000.firePropertyChange("Change", true, false);
    }
}

