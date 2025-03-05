/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung;

import helden.comm.CommUtilities;
import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.oooo_0;
import helden.framework.int.P;
import helden.framework.settings.Setting;
import helden.framework.settings.Settings;
import helden.gui.A;
import helden.gui.allgemein.ExampleFileFilter;
import helden.gui.allgemein.Utils;
import helden.gui.erschaffung.dialoge.ExtTabbedPane;
import helden.gui.erschaffung.dialoge.JTabbedPaneWithVisible;
import helden.gui.erschaffung.dialoge.tabellenDialog.ErschaffungsJTable;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenTabModell;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.gui.erschaffung.werkzeug.Laden;
import helden.gui.erschaffung.werkzeug.Speichern;
import helden.gui.erschaffung.werkzeug.TestTemplate;
import helden.gui.erschaffung.zustaende.AussehenZustand;
import helden.gui.erschaffung.zustaende.AuswahlZustand;
import helden.gui.erschaffung.zustaende.BGBZustand;
import helden.gui.erschaffung.zustaende.EigenschaftenZustand;
import helden.gui.erschaffung.zustaende.ErschaffungsZustand;
import helden.gui.erschaffung.zustaende.GeschlechtZustand;
import helden.gui.erschaffung.zustaende.KostenUebersichtZustand;
import helden.gui.erschaffung.zustaende.KulturZustand;
import helden.gui.erschaffung.zustaende.LadenZustand;
import helden.gui.erschaffung.zustaende.ProfessionsZustand;
import helden.gui.erschaffung.zustaende.RassenZustand;
import helden.gui.erschaffung.zustaende.SettingsZustand;
import helden.gui.erschaffung.zustaende.SonderfertigkeitenZustand;
import helden.gui.erschaffung.zustaende.SpeichernZustand;
import helden.gui.erschaffung.zustaende.TalenteZustand;
import helden.gui.erschaffung.zustaende.VerbilligteSonderfertigkeitenZustand;
import helden.gui.erschaffung.zustaende.VeteranZustand;
import helden.gui.erschaffung.zustaende.VorteilZustand;
import helden.gui.erschaffung.zustaende.ZauberZustand;
import helden.gui.icons.IconFactory;
import helden.model.KulturFabrik;
import helden.model.ProfessionenFabrik;
import helden.model.RassenFabrik;
import helden.model.profession.Kristallomant;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HauptDialog
extends JDialog
implements ChangeListener,
ActionListener,
PropertyChangeListener {
    private HEW2 \u00d400000;
    private ZauberZustand OO0000;
    private ArrayList<ErschaffungsZustand> oO0000;
    private ArrayList<ErschaffungsZustand> if;
    private ExtTabbedPane \u00d4O0000;
    private JSplitPane \u00d8O0000;
    private A return;
    private JLabel \u00d300000;
    private JTabbedPaneWithVisible new;
    private HashMap<String, JTextField> while;
    private HashMap<String, JLabel> \u00f500000;
    private PropertyChangeSupport \u00d500000 = new PropertyChangeSupport(this);
    private Color \u00f4O0000;
    private int \u00d3O0000 = -1;
    private int \u00d5O0000 = -1;
    private ErschaffungsJTable o00000;
    private JPanel thissuper;
    private Font \u00f800000 = new Font("Dialog", 1, 10);
    private JPanel \u00d800000;
    private int \u00f400000;

    public static GridBagConstraints getConstraints(int n, int n2, int n3) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = n3;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.gridx = n;
        return gridBagConstraints;
    }

    public HauptDialog(A a2, boolean bl) {
        super((Frame)a2, false);
        if (!Einstellungen.getInstance().getLookAndFeel().equals("helden.gui.laf.DSAMetalLookAndFeel")) {
            JOptionPane.showMessageDialog(this, "Das von ihnen ausgew\u00e4hlte Layout kann zu Problemen\nbei der Darstellung f\u00fchren\n\nSollten sie Darstellungsfehler bemerken, w\u00e4hlen sie \nunter 'Einstellung/Look and Feel' bitte das Layout DSA aus\n", "Nicht untersch\u00fctztes Layout", 1);
        }
        this.\u00f4O0000 = new JLabel().getBackground();
        this.while = new HashMap();
        this.\u00f500000 = new HashMap();
        this.new = new JTabbedPaneWithVisible();
        this.new.setTabPlacement(2);
        this.\u00d4O0000 = new ExtTabbedPane(this.new);
        this.\u00d4O0000.setName("MainTab");
        this.return = a2;
        this.\u00d400000 = new HEW2(this.\u00d500000);
        this.\u00d500000.addPropertyChangeListener(this);
        this.\u00d300000 = new JLabel();
        this.\u00d300000.setAlignmentX(0.0f);
        this.\u00d300000.setAlignmentY(0.0f);
        this.setSize(1000, 600);
        this.getContentPane().setLayout(new BorderLayout());
        this.\u00d300000();
        Utils.zentriere(this);
        this.new.setTabPlacement(2);
        this.if = new ArrayList();
        this.oO0000 = new ArrayList();
        this.super(new LadenZustand(this, this.\u00d400000), false);
        this.super(new SettingsZustand(this.\u00d400000), false);
        this.super(new GeschlechtZustand(this.\u00d400000), true);
        this.super(new RassenZustand(this.\u00d400000), false);
        this.super(new KulturZustand(this.\u00d400000), false);
        this.super(new ProfessionsZustand(this.\u00d400000), false);
        this.super(new BGBZustand(this.\u00d400000), false);
        this.super(new VeteranZustand(this.\u00d400000), false);
        this.super(new AussehenZustand(this.\u00d400000), true);
        this.super(new AuswahlZustand(this.\u00d400000), true);
        this.super(new EigenschaftenZustand(this.\u00d400000), false);
        this.super(new VorteilZustand(this.\u00d400000), false);
        this.super(new VerbilligteSonderfertigkeitenZustand(this.\u00d400000), false);
        this.super(new SonderfertigkeitenZustand(this.\u00d400000), false);
        this.super(new TalenteZustand(this.\u00d400000), false);
        this.OO0000 = new ZauberZustand(this.\u00d400000);
        this.super(this.OO0000, false);
        this.super(new KostenUebersichtZustand(this.\u00d400000), true);
        if (bl) {
            this.new.setSelectedIndex(0);
        } else {
            this.new.setSelectedIndex(1);
        }
        this.showNewPhase();
        this.panelAktualisieren();
        this.new.addChangeListener(this);
        this.setVisible(true);
        this.\u00d400000.fireUpdate();
        this.\u00d400000();
        oooo_0.\u00f400000("HeldenErschaffung gestartet");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ErschaffungsZustand erschaffungsZustand = this.oO0000.get(this.new.getSelectedIndex());
        if (actionEvent.getSource().equals(erschaffungsZustand.getHilfe())) {
            String string = "http://wiki.helden-software.de/Erschaffen5/" + erschaffungsZustand.getBezeichner().replace(' ', '_');
            CommUtilities.showInBrowser(string);
            return;
        }
        boolean bl = false;
        if (actionEvent != null && actionEvent.getSource().equals(erschaffungsZustand.getZurueck())) {
            this.geheZumNaechstenVorherigenGueltigenTab();
        }
        if (actionEvent != null && actionEvent.getSource().equals(erschaffungsZustand.getSpeichern())) {
            this.\u00d200000();
        }
        switch (this.\u00d400000.getPhase()) {
            case \u00d200000: {
                if (actionEvent == null || !actionEvent.getSource().equals(erschaffungsZustand.getVor())) break;
                if (this.new.getSelectedIndex() == this.\u00d5O0000 && this.\u00d400000.getBGBProfession() != null && this.\u00d400000.getBGBProfession().istZeitaufwendig() && this.\u00d400000.getHauptProfession().istZeitaufwendig()) {
                    JOptionPane.showMessageDialog(this, "Der Held ist noch nicht regelkonform.\nAus diesem Grund kann die Erschaffung\nnicht fortgesetzt werden!", "Regelpr\u00fcfung", 2);
                    return;
                }
                bl = this.geheZumNaechstenGueltigenTab();
                break;
            }
            case \u00d400000: {
                AuswahlZustand auswahlZustand = (AuswahlZustand)this.oO0000.get(this.\u00d3O0000);
                if (!auswahlZustand.auswahlGueltig()) {
                    return;
                }
                if (auswahlZustand.naechsteAuswahl()) break;
                bl = true;
                this.new.setSelectedIndex(this.new.getSelectedIndex() + 1);
                break;
            }
            case super: {
                if (actionEvent == null || !actionEvent.getSource().equals(erschaffungsZustand.getVor())) break;
                if (this.new.getSelectedIndex() == this.\u00d5O0000) {
                    if (!this.\u00d400000.getPruefer().hatFehler()) {
                        this.\u00d400000.heldAbschliessen();
                        this.return.super((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)this.\u00d400000.getHeld(), true);
                        this.setVisible(false);
                        if (this.\u00d400000.getPruefer().pruefe().size() <= 0) break;
                        JOptionPane.showMessageDialog(this, "Bei dem Helden unterliegen einige Punkte einer Meistergenehmigung.\nEine Liste ist \u00fcber \"Steigern/Ereignisse Anzeigen\" abrufbar.", "Meistergenehmigung", 2);
                        break;
                    }
                    JOptionPane.showMessageDialog(this, "Der Held ist noch nicht regelkonform.\nAus diesem Grund kann die Erschaffung\nnoch nicht beendet werden.", "Regelpr\u00fcfung", 2);
                    return;
                }
                bl = this.geheZumNaechstenGueltigenTab();
                break;
            }
            default: {
                if (actionEvent != null && !actionEvent.getSource().equals(erschaffungsZustand.getVor())) break;
                bl = this.geheZumNaechstenGueltigenTab();
            }
        }
        if (bl) {
            this.\u00d400000.naechstePhase();
            this.showNewPhase();
            if (this.\u00d400000.getPhase() == HEW2.PHASEN.\u00d400000 && !((AuswahlZustand)this.oO0000.get(this.new.getSelectedIndex())).naechsteAuswahl()) {
                this.\u00d400000.naechstePhase();
                this.showNewPhase();
            }
            if (this.\u00d400000.getPhase() == HEW2.PHASEN.super && this.\u00d400000.getPhase() != HEW2.PHASEN.\u00d200000 && this.\u00d400000.getPhase() != HEW2.PHASEN.class) {
                this.\u00d400000.recalc();
            }
        }
        this.panelAktualisieren();
    }

    public int addKostenInfo(JPanel jPanel, String string, int n) {
        jPanel.add((Component)this.getLabel(string), HauptDialog.getConstraints(0, n++, 2));
        jPanel.add((Component)this.getTextField(string + "-akt"), HauptDialog.getConstraints(0, n, 1));
        jPanel.add((Component)this.getTextField(string), HauptDialog.getConstraints(1, n++, 1));
        return n;
    }

    public void addToGPPanel(String string) {
        this.\u00d800000.add((Component)this.getLabel(string.toString()), HauptDialog.getConstraints(0, this.\u00f400000++, 2));
        this.\u00d800000.add((Component)this.getTextField(string.toString() + "-akt"), HauptDialog.getConstraints(0, this.\u00f400000, 1));
        this.\u00d800000.add((Component)this.getTextField(string.toString()), HauptDialog.getConstraints(1, this.\u00f400000++, 1));
    }

    public void fillZusatzPanel() {
        this.\u00d800000 = this.\u00d4O0000.getZusatzPanel();
        this.\u00d800000.setLayout(new GridBagLayout());
        this.\u00d800000.setName("Talent-Generierungspunkte-Panel");
        this.\u00f400000 = 0;
        this.addToGPPanel(KostenArt.int.toString());
        this.\u00d800000.add((Component)this.getLabel(KostenArt.\u00f600000.toString()), HauptDialog.getConstraints(0, this.\u00f400000++, 2));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.\u00f600000.toString() + "-akt"), HauptDialog.getConstraints(0, this.\u00f400000, 1));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.\u00f600000.toString()), HauptDialog.getConstraints(1, this.\u00f400000++, 1));
        this.\u00d800000.add((Component)this.getLabel(KostenArt.\u00f800000.toString()), HauptDialog.getConstraints(0, this.\u00f400000++, 2));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.\u00f800000.toString() + "-akt"), HauptDialog.getConstraints(0, this.\u00f400000, 1));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.\u00f800000.toString()), HauptDialog.getConstraints(1, this.\u00f400000++, 1));
        this.\u00d800000.add((Component)this.getLabel(KostenArt.\u00d300000.toString()), HauptDialog.getConstraints(0, this.\u00f400000++, 2));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.\u00d300000.toString() + "-akt"), HauptDialog.getConstraints(0, this.\u00f400000, 1));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.\u00d300000.toString()), HauptDialog.getConstraints(1, this.\u00f400000++, 1));
        this.\u00d800000.add((Component)this.getLabel(KostenArt.\u00f400000.toString()), HauptDialog.getConstraints(0, this.\u00f400000++, 2));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.\u00f400000.toString() + "-akt"), HauptDialog.getConstraints(0, this.\u00f400000, 1));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.\u00f400000.toString()), HauptDialog.getConstraints(1, this.\u00f400000++, 1));
        this.\u00d800000.add((Component)this.getLabel(KostenArt.class.toString()), HauptDialog.getConstraints(0, this.\u00f400000++, 2));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.class.toString() + "-akt"), HauptDialog.getConstraints(0, this.\u00f400000, 1));
        this.\u00d800000.add((Component)this.getTextField(KostenArt.class.toString()), HauptDialog.getConstraints(1, this.\u00f400000++, 1));
        this.\u00d800000.add((Component)this.getLabel("Merkmal Obj"), HauptDialog.getConstraints(0, this.\u00f400000++, 2));
        this.\u00d800000.add((Component)this.getTextField("merkmalobj"), HauptDialog.getConstraints(0, this.\u00f400000++, 1));
        this.\u00f400000 = this.addKostenInfo(this.\u00d800000, "Nachteile", this.\u00f400000);
        this.\u00f400000 = this.addKostenInfo(this.\u00d800000, "Schlechte Eigenschaften", this.\u00f400000);
        this.\u00f400000 = this.addKostenInfo(this.\u00d800000, "Eigenschaften", this.\u00f400000);
        GridBagConstraints gridBagConstraints = HauptDialog.getConstraints(1, this.\u00f400000++, 1);
        gridBagConstraints.anchor = 17;
        gridBagConstraints.fill = 1;
        this.\u00d800000.add(Box.createHorizontalGlue(), gridBagConstraints);
        this.getLabel(KostenArt.int.toString()).setVisible(true);
        this.getTextField(KostenArt.int.toString()).setVisible(true);
        this.getTextField(KostenArt.int.toString() + "-akt").setVisible(true);
    }

    public boolean geheZumNaechstenGueltigenTab() {
        boolean bl = false;
        do {
            if (this.new.getSelectedIndex() == this.\u00d5O0000) {
                bl = true;
            }
            this.new.setSelectedIndex(this.new.getSelectedIndex() + 1);
        } while (!bl && !this.oO0000.get(this.new.getSelectedIndex()).isActive());
        return bl;
    }

    public void geheZumNaechstenVorherigenGueltigenTab() {
        do {
            this.new.setSelectedIndex(this.new.getSelectedIndex() - 1);
        } while (!this.oO0000.get(this.new.getSelectedIndex()).isActive());
    }

    public AuswahlZustand getAuswahlZustand() {
        ErschaffungsZustand erschaffungsZustand = this.oO0000.get(this.new.getSelectedIndex());
        if (erschaffungsZustand instanceof AuswahlZustand) {
            return (AuswahlZustand)erschaffungsZustand;
        }
        return null;
    }

    public JPanel getAuswahlZustandPanel() {
        ErschaffungsZustand erschaffungsZustand = this.oO0000.get(this.new.getSelectedIndex());
        if (erschaffungsZustand instanceof AuswahlZustand) {
            return ((AuswahlZustand)erschaffungsZustand).getAuswahlpanel();
        }
        return null;
    }

    public ArrayList<Hinweis> getFehlerListe() {
        ErschaffungsZustand erschaffungsZustand = this.oO0000.get(this.new.getSelectedIndex());
        ArrayList<Hinweis> arrayList = erschaffungsZustand.getFehler();
        if (arrayList == null) {
            return new ArrayList<Hinweis>();
        }
        return arrayList;
    }

    public JLabel getLabel(String string) {
        JLabel jLabel = this.\u00f500000.get(string);
        if (jLabel == null) {
            String string2 = string;
            if (string.contains(" ")) {
                string2 = "<html>" + string.replace(" ", "<br>");
            }
            jLabel = new JLabel(string2);
            jLabel.setVisible(false);
            jLabel.setFont(this.\u00f800000);
            this.\u00f500000.put(string, jLabel);
        }
        return jLabel;
    }

    public JTextField getTextField(String string) {
        JTextField jTextField = this.while.get(string);
        if (jTextField == null) {
            jTextField = new JTextField();
            jTextField.setFont(this.\u00f800000);
            jTextField.setColumns(4);
            jTextField.setEditable(false);
            jTextField.setVisible(false);
            this.while.put(string, jTextField);
            jTextField.setText("    ");
            if (string.endsWith("-akt")) {
                jTextField.setToolTipText("Bereits genutzte Punkte.");
            } else {
                jTextField.setToolTipText("Insgesamt zur Verf\u00fcgung stehende Punkte.");
            }
        }
        return jTextField;
    }

    public HEW2 getWerkezug() {
        return this.\u00d400000;
    }

    public void laden() {
        if (this.\u00d400000.getPhase() == HEW2.PHASEN.class) {
            JFileChooser jFileChooser = new JFileChooser(Einstellungen.getInstance().getLetzterPfad());
            ExampleFileFilter exampleFileFilter = new ExampleFileFilter();
            exampleFileFilter.addExtension("erschaffung.hld");
            exampleFileFilter.setDescription(".hld");
            jFileChooser.setFileFilter(exampleFileFilter);
            if (jFileChooser.showOpenDialog(this.return) == 0) {
                Einstellungen.getInstance().setLetzterPfad(jFileChooser.getSelectedFile().getPath());
                String string = jFileChooser.getSelectedFile().getAbsolutePath();
                this.laden(string);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kann an dieser Stelle nicht laden!", "Ladefehler", 1);
        }
    }

    public boolean laden(String string) {
        Laden laden = new Laden(this.\u00d400000, string);
        if (!laden.isLadeFehler()) {
            this.showNewPhase();
            this.showNewPhase();
            this.showNewPhase();
            this.\u00d400000.\u00f400000 = HEW2.PHASEN.super;
            this.new.setSelectedIndex(10);
            this.updateNavi();
            this.panelAktualisieren();
        }
        return !laden.isLadeFehler();
    }

    public void panelAktualisieren() {
        this.oO0000.get(this.new.getSelectedIndex()).wirdJetztDargstellt();
        this.updateAnzeige();
        this.updateNavi();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (this.\u00d400000.isRecalcRunning()) {
            return;
        }
        if (propertyChangeEvent.getPropertyName().equals("ANZEIGE")) {
            this.\u00d400000.beruecksichtigeSonstigePunkteQuellen();
            this.updateAnzeige();
        }
        if (propertyChangeEvent.getPropertyName().equals("NAVI")) {
            this.updateNavi();
        }
    }

    public void showNewPhase() {
        int n = this.\u00d5O0000;
        this.\u00d3O0000 = n + 1;
        do {
            if (this.new.getComponentAt(++n) == null) {
                this.new.setComponentAt(n, this.oO0000.get(n).getPanelInklNavi(this));
            }
            this.new.revalidate();
        } while (!this.if.contains(this.oO0000.get(n)));
        this.\u00d5O0000 = n;
    }

    public void speichern(String string) {
        if (this.\u00d400000.getPhase() == HEW2.PHASEN.super) {
            Speichern speichern = new Speichern(this.\u00d400000);
            speichern.save(string);
        }
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (this.\u00d400000.getPhase() != HEW2.PHASEN.\u00d200000 && this.\u00d400000.getPhase() != HEW2.PHASEN.class) {
            this.\u00d400000.recalc();
        }
        this.panelAktualisieren();
    }

    public void updateAnzeige() {
        Object object;
        this.updateNavi();
        this.getTextField(KostenArt.int.toString() + "-akt").setText("" + this.\u00d400000.getKosten().getKosten(KostenArt.int));
        this.getTextField(KostenArt.int.toString()).setText("" + this.\u00d400000.getKosten().getVerfuegbarePunkte(KostenArt.int));
        if (this.\u00d400000.getPhase() == HEW2.PHASEN.super) {
            object = this.oO0000.get(this.new.getSelectedIndex());
            this.updateKostenInfo("Nachteile", ((ErschaffungsZustand)object).getBezeichner().equals("Vor- und Nachteile"), this.\u00d400000.getHswVorteile().getGPNachteile(), this.\u00d400000.getHswVorteile().getMaxGPNachteile());
            this.updateKostenInfo("Eigenschaften", ((ErschaffungsZustand)object).getBezeichner().equals("Eigenschaften"), this.\u00d400000.getHswEigenschaften().getEigenschaftenGP(), this.\u00d400000.getHswEigenschaften().erlaubteAnzahlGPinEigenschaften());
            this.updateKostenInfo("Schlechte Eigenschaften", ((ErschaffungsZustand)object).getBezeichner().equals("Vor- und Nachteile"), this.\u00d400000.getHswVorteile().getGPSchlechteEigenschaften(), this.\u00d400000.getHswVorteile().getMaxGPSchlechteEigenschaften());
            for (KostenArt kostenArt : this.\u00d400000.getKosten().getAlleKostenArten()) {
                if (kostenArt.getVerfuegbarePunkte() == -1) {
                    this.updateKostenInfo(kostenArt.toString(), this.\u00d400000.getKosten().getVerfuegbarePunkte(kostenArt) > 0, this.\u00d400000.getKosten().getKosten(kostenArt), this.\u00d400000.getKosten().getVerfuegbarePunkte(kostenArt));
                    continue;
                }
                KostenEntry.kostenBereich kostenBereich2 = null;
                if (((ErschaffungsZustand)object).getBezeichner().equals("verbilligte SF")) {
                    kostenBereich2 = KostenEntry.kostenBereich.\u00d800000;
                }
                if (((ErschaffungsZustand)object).getBezeichner().equals("Sonderfertigkeiten")) {
                    kostenBereich2 = KostenEntry.kostenBereich.class;
                }
                if (((ErschaffungsZustand)object).getBezeichner().equals("Talente")) {
                    kostenBereich2 = KostenEntry.kostenBereich.\u00d600000;
                }
                this.updateKostenInfo(kostenArt.toString(), kostenArt.getNutzbareBereiche().contains((Object)kostenBereich2) && this.\u00d400000.getKosten().getVerfuegbarePunkte(kostenArt) > 0, this.\u00d400000.getKosten().getKosten(kostenArt), this.\u00d400000.getKosten().getVerfuegbarePunkte(kostenArt));
            }
            if (this.\u00d400000.getHauptProfession().hatProfession(Kristallomant.class) != null) {
                this.getTextField("merkmalobj").setText(this.\u00d400000.getHswZauber().getZauberMitMerkmal(o00O.\u00d200000) + "%");
                boolean bl = ((ErschaffungsZustand)object).getBezeichner().equals("Zauber");
                this.getTextField("merkmalobj").setVisible(bl);
                this.getLabel("Merkmal Obj").setVisible(bl);
            }
            this.validate();
        }
        object = this.o00000.getModel();
        ((ZweiTabellenTabModell)object).aktualisiereAlles();
    }

    public void updateKostenInfo(String string, boolean bl, int n, int n2) {
        if (this.\u00f500000.get(string) == null) {
            this.addToGPPanel(string);
        }
        this.getLabel(string).setVisible(bl);
        this.getTextField(string + "-akt").setText("" + n);
        this.getTextField(string + "-akt").setVisible(bl);
        if (n2 < n) {
            this.getTextField(string + "-akt").setBackground(Color.RED);
        } else {
            this.getTextField(string + "-akt").setBackground(this.\u00f4O0000);
        }
        this.getTextField(string).setText("" + n2);
        this.getTextField(string).setVisible(bl);
    }

    public void updateNavi() {
        Object object;
        int n;
        for (n = 0; n < this.new.getTabCount(); ++n) {
            if (this.new.getComponentAt(n) == null) {
                this.new.setEnabledAt(n, false);
                continue;
            }
            object = this.oO0000.get(n);
            this.new.setEnabledAt(n, ((ErschaffungsZustand)object).isActive());
            if (((ErschaffungsZustand)object).isActive()) {
                ArrayList<Hinweis> arrayList = ((ErschaffungsZustand)object).getFehler();
                boolean bl = false;
                if (arrayList != null) {
                    for (Hinweis hinweis : ((ErschaffungsZustand)object).getFehler()) {
                        if (!hinweis.getHinweisart().equals((Object)Hinweis.HinweisArt.o00000)) continue;
                        bl = true;
                    }
                }
                if (bl) {
                    this.new.setIconAt(n, IconFactory.getIconWarnung());
                } else {
                    this.new.setIconAt(n, null);
                }
            }
            this.new.setToolTipTextAt(n, ((ErschaffungsZustand)object).getBezeichner());
        }
        n = this.new.getSelectedIndex();
        if (n == -1) {
            return;
        }
        if (n == this.\u00d3O0000) {
            this.oO0000.get(n).getZurueck().setEnabled(false);
            this.oO0000.get(n).getZurueck().setVisible(false);
        }
        switch (this.\u00d400000.getPhase()) {
            case class: {
                if (n == this.\u00d5O0000) {
                    this.oO0000.get(n).getVor().setText("<html>Erschaffung<br>starten");
                    if (!this.\u00d400000.isGeschlechtGesetzt()) {
                        this.oO0000.get(n).getVor().setEnabled(false);
                        this.oO0000.get(n).getSpeichern().setEnabled(false);
                    }
                }
                this.oO0000.get(n).getSpeichern().setEnabled(false);
                break;
            }
            case \u00d200000: {
                this.oO0000.get(n).getVor().setText("Weiter");
                this.oO0000.get(n).getSpeichern().setEnabled(false);
                if (n != this.\u00d5O0000) break;
                this.oO0000.get(n).getVor().setEnabled(!this.\u00d400000.getPruefer().sindFehlerVorhanden());
                break;
            }
            case \u00d400000: {
                this.oO0000.get(n).getVor().setText("Weiter");
                this.oO0000.get(n).getSpeichern().setEnabled(false);
                break;
            }
            case super: {
                this.oO0000.get(n).getSpeichern().setEnabled(true);
                if (n != this.\u00d5O0000) break;
                this.oO0000.get(n).getVor().setText("Fertigstellen");
                break;
            }
        }
        if (this.oO0000.get(this.new.getSelectedIndex()).getVor().getParent() != null) {
            this.oO0000.get(this.new.getSelectedIndex()).getVor().getParent().validate();
        }
        this.thissuper.removeAll();
        this.thissuper.add((Component)this.super(), "North");
        this.thissuper.add((Component)this.\u00d300000, "Center");
        this.thissuper.revalidate();
        this.\u00d300000.setText(this.oO0000.get(n).getHelp());
        object = "";
        if (this.\u00d400000.getSetting() != null && this.\u00d400000.getSetting().getHauptSetting() != null) {
            object = (String)object + this.\u00d400000.getSetting().getHauptSetting().getName() + ": ";
        }
        if (this.\u00d400000.getRasse() != null) {
            object = (String)object + this.\u00d400000.getRasse().toString();
        }
        if (this.\u00d400000.getKultur() != null) {
            if (!((String)object).equals("")) {
                object = (String)object + ", ";
            }
            object = (String)object + this.\u00d400000.getKultur().toString() + "";
        }
        if (this.\u00d400000.getHauptProfession() != null) {
            if (!((String)object).equals("")) {
                object = (String)object + ", ";
            }
            object = (String)object + this.\u00d400000.getHauptProfession().toString() + "";
        }
        if (this.\u00d400000.isBGB() && this.\u00d400000.getBGBProfession() != null) {
            if (!((String)object).equals("")) {
                object = (String)object + ", ";
            }
            object = (String)object + this.\u00d400000.getBGBProfession().toString() + "";
        }
        this.setTitle((String)object);
        this.validate();
    }

    private void super(ErschaffungsZustand erschaffungsZustand, boolean bl) {
        this.oO0000.add(erschaffungsZustand);
        if (bl) {
            this.if.add(erschaffungsZustand);
        }
        this.new.addTab(erschaffungsZustand.getBezeichner(), null);
    }

    private void \u00d300000() {
        this.thissuper = new JPanel();
        this.thissuper.setLayout(new BorderLayout());
        this.thissuper.add((Component)this.super(), "North");
        this.thissuper.add((Component)this.\u00d300000, "Center");
        this.\u00d8O0000 = new JSplitPane(1, this.\u00d4O0000, this.thissuper);
        this.\u00d8O0000.setDividerLocation(780);
        this.getContentPane().add((Component)this.\u00d8O0000, "Center");
        this.fillZusatzPanel();
    }

    private JTable super() {
        if (this.o00000 == null) {
            TabellenDefinition tabellenDefinition = new TabellenDefinition(){

                @Override
                public int getAnzahl() {
                    return HauptDialog.this.getFehlerListe().size();
                }
            };
            ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
            arrayList.add(new SpaltenDefinition("", 30, false, voidsuper.class, SpaltenDefinition.ART.null, "X"){

                @Override
                public Object getData(int n) {
                    return HauptDialog.this.getFehlerListe().get(n);
                }

                @Override
                public JPanel getPanel(Object object) {
                    Hinweis hinweis = (Hinweis)object;
                    JPanel jPanel = new JPanel();
                    jPanel.setLayout(new GridBagLayout());
                    if (hinweis.getHinweisart().equals((Object)Hinweis.HinweisArt.o00000)) {
                        jPanel.add((Component)new JLabel(IconFactory.getIconWarnung()), HauptDialog.getConstraints(0, 0, 1));
                    }
                    if (hinweis.getHinweisart().equals((Object)Hinweis.HinweisArt.\u00d200000)) {
                        jPanel.add((Component)new JLabel(IconFactory.getFragezeichen()), HauptDialog.getConstraints(0, 0, 1));
                    }
                    return jPanel;
                }
            });
            arrayList.add(new SpaltenDefinition("", 300, false, String.class, SpaltenDefinition.ART.o00000){

                @Override
                public Object getData(int n) {
                    return HauptDialog.this.getFehlerListe().get(n);
                }
            });
            this.o00000 = new ErschaffungsJTable(tabellenDefinition);
        }
        return this.o00000;
    }

    private void \u00d400000() {
        if (Einstellungen.getInstance().isTestMode()) {
            ActionListener actionListener = new ActionListener(){

                @Override
                public final void actionPerformed(ActionEvent actionEvent) {
                    HauptDialog.this.\u00d400000.heldAbschliessen();
                    HauptDialog.this.return.super((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)HauptDialog.this.\u00d400000.getHeld(), true);
                    HauptDialog.this.setVisible(false);
                }
            };
            KeyStroke keyStroke = KeyStroke.getKeyStroke(27, 9, true);
            this.getRootPane().registerKeyboardAction(actionListener, keyStroke, 1);
            this.getRootPane().registerKeyboardAction(new ActionListener(){

                @Override
                public final void actionPerformed(ActionEvent actionEvent) {
                    TestTemplate.run(HauptDialog.this.\u00d400000);
                }
            }, KeyStroke.getKeyStroke(84, 9, true), 1);
            this.getRootPane().registerKeyboardAction(new ActionListener(){

                @Override
                public final void actionPerformed(ActionEvent actionEvent) {
                    HauptDialog.this.laden();
                }
            }, KeyStroke.getKeyStroke(76, 9, true), 1);
            this.getRootPane().registerKeyboardAction(new ActionListener(){

                @Override
                public final void actionPerformed(ActionEvent actionEvent) {
                    HauptDialog.this.\u00d400000.setSetting(Settings.getSettingsBySetting(Setting.returnsuper));
                    HauptDialog.this.\u00d400000.setGeschlecht(Geschlecht.\u00d400000);
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().setEnabled(true);
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().doClick();
                    HauptDialog.this.\u00d400000.setzeModifizierer(RassenFabrik.getLeerRasse(Geschlecht.\u00d400000), new ArrayList<P>());
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().setEnabled(true);
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().doClick();
                    HauptDialog.this.\u00d400000.setzeModifizierer(KulturFabrik.getLeerKultur(Geschlecht.\u00d400000), new ArrayList<P>());
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().setEnabled(true);
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().doClick();
                    HauptDialog.this.\u00d400000.setzeModifizierer(ProfessionenFabrik.getLeerProfession(Geschlecht.\u00d400000, G.\u00f5\u00f6\u00f5000, G.\u00f8\u00f8\u00f4000), new ArrayList<P>());
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().setEnabled(true);
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().doClick();
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().setEnabled(true);
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().doClick();
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().setEnabled(true);
                    ((ErschaffungsZustand)HauptDialog.this.oO0000.get(HauptDialog.this.new.getSelectedIndex())).getVor().doClick();
                }
            }, KeyStroke.getKeyStroke(39, 9, true), 1);
        }
    }

    private void \u00d200000() {
        new SpeichernZustand(this, this.\u00d400000);
    }
}

