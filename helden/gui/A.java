/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import helden.Fehlermeldung;
import helden.Helden;
import helden.Version;
import helden.comm.CommUtilities;
import helden.framework.D.while;
import helden.framework.Einstellungen;
import helden.framework.ExternesProgramm;
import helden.framework.HeldEinstellungen;
import helden.framework.OooO.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.Object.R;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.a_0;
import helden.framework.held.persistenz.XMLPersistierer;
import helden.gui.F.oOOO;
import helden.gui.J;
import helden.gui.O;
import helden.gui.String;
import helden.gui.allgemein.Utils;
import helden.gui.allgemein.druckeinstellungen.DruckeinstellungenPanel;
import helden.gui.class;
import helden.gui.components.JScrollPaneFast;
import helden.gui.components.TextAreaWithHyperlinkSupport;
import helden.gui.ooOO.$A;
import helden.gui.ooOO.A.OoOO;
import helden.gui.ooOO.B;
import helden.gui.ooOO.C;
import helden.gui.ooOO.DA;
import helden.gui.ooOO.FA;
import helden.gui.ooOO.G;
import helden.gui.ooOO.IA;
import helden.gui.ooOO.KA;
import helden.gui.ooOO.M;
import helden.gui.ooOO.N;
import helden.gui.ooOO.O00O;
import helden.gui.ooOO.OO0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.ooOO.OOo0;
import helden.gui.ooOO.ObjectObject;
import helden.gui.ooOO.Objectnew;
import helden.gui.ooOO.Oo00;
import helden.gui.ooOO.S;
import helden.gui.ooOO.Stringnew;
import helden.gui.ooOO.Stringsuper;
import helden.gui.ooOO.Z;
import helden.gui.ooOO.classsuper;
import helden.gui.ooOO.d;
import helden.gui.ooOO.float;
import helden.gui.ooOO.ifsuper;
import helden.gui.ooOO.interface;
import helden.gui.ooOO.intnew;
import helden.gui.ooOO.j;
import helden.gui.ooOO.newObject;
import helden.gui.ooOO.nullObject;
import helden.gui.ooOO.o0OOo;
import helden.gui.ooOO.oO0Oo;
import helden.gui.ooOO.oOOOo;
import helden.gui.ooOO.publicnew;
import helden.gui.ooOO.u;
import helden.gui.ooOO.y;
import helden.gui.oooo.b_0;
import helden.gui.oooo.c_0;
import helden.gui.oooo.i_0;
import helden.gui.oooo.n_0;
import helden.gui.oooo.o0oo_0;
import helden.gui.oooo.oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.gui.oooo.oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.oooo.ooo0_0;
import helden.gui.oooo.ooo0_1;
import helden.gui.oooo.oooo_0;
import helden.gui.oooo.oooo_1;
import helden.gui.oooo.oooo_2;
import helden.gui.oooo.ooooo_0;
import helden.gui.oooo.s_0;
import helden.gui.oooo.t_0;
import helden.gui.oooo.z_0;
import helden.gui.return;
import helden.gui.super.super;
import helden.plugin.HeldenPluginFactory;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class A
extends JFrame
implements ListSelectionListener,
ActionListener {
    private static A o00000 = null;
    private super \u00d200000;
    private return \u00d600000;
    private JMenu \u00d300000;
    private helden.gui.B \u00d500000;
    private JComboBox \u00d800000;
    private java.lang.String \u00f600000;
    private helden.gui.allgemein.new.OoOO \u00f800000;
    private JTabbedPane String;
    private JMenu \u00f500000;
    private JMenu null;

    public static A \u00d4O0000() {
        if (o00000 == null) {
            throw new NullPointerException("Frame nicht initialisiert!");
        }
        return o00000;
    }

    public static A \u00d200000(Helden helden) {
        return new A(helden);
    }

    public static void super(Helden helden) {
        if (o00000 != null) {
            throw new RuntimeException("Frame ist schon initialisiert!");
        }
        new A(helden);
    }

    private A(Helden helden) {
        o00000 = this;
        this.interface();
        if (Version.isTESTVERSION()) {
            this.setTitle("Helden " + Version.getVersion() + " Achtung Entwicklerversion! Lauff\u00e4hig bis " + Version.getTESTENDE());
        } else {
            this.setTitle("Helden " + Version.getVersion());
        }
        this.\u00f600000 = "";
        Dimension dimension = new Dimension(helden.gui.oooo_1.o00000(950), helden.gui.oooo_1.o00000(580));
        this.setSize(dimension);
        this.setDefaultCloseOperation(0);
        this.\u00f800000();
        this.\u00d500000 = helden.gui.B.\u00d200000();
        this.\u00d500000.super(this);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add((Component)this.super(), "North");
        a_0.class().super(new XMLPersistierer());
        this.class();
        this.\u00d200000 = new super(this);
        a_0.class().int();
        i_0.o00000(this).o00000();
        this.\u00d200000.oO0000().o00000(this);
        this.Objectsuper().getModel().addChangeListener(new O(this));
        this.Objectsuper().setSelectedIndex(Einstellungen.getInstance().getLastSelectedListeTree());
        HeldenPluginFactory.initPlugins(this.null, this);
        this.\u00d200000.float();
        JSplitPane jSplitPane = new JSplitPane(1, this.Objectsuper(), this.\u00d200000);
        jSplitPane.setDividerLocation(175);
        jSplitPane.setOneTouchExpandable(true);
        jPanel.add((Component)jSplitPane, "Center");
        this.setContentPane(jPanel);
        jPanel.add((Component)this.\u00d6O0000(), "South");
        Utils.zentriere(this);
        if (Einstellungen.getInstance().isFrameMaximize()) {
            boolean bl = this.getToolkit().isFrameStateSupported(6);
            Dimension dimension2 = this.getSize();
            if (bl) {
                this.setExtendedState(super.getExtendedState() | 6);
                if (this.getSize().equals(dimension2)) {
                    bl = false;
                }
            }
            if (!bl) {
                this.setSize(this.getToolkit().getScreenSize());
            }
        }
        this.\u00d300000.setVisible(Einstellungen.getInstance().istNSCSchmiede());
        this.addWindowListener(helden);
        SwingUtilities.updateComponentTreeUI(this);
        J.\u00d300000();
        this.setVisible(true);
    }

    private void class() {
        Einstellungen einstellungen = Einstellungen.getInstance();
        java.lang.String string = einstellungen.getPfade().getPfad("einstellungsPfad");
        File file = new File(string);
        if (!file.exists()) {
            S.super(null).\u00d300000();
        } else {
            try {
                ArrayList<HeldEinstellungen> arrayList = a_0.class().\u00d200000(file);
                einstellungen.setHeldEinstellungen(arrayList);
                UIManager.setLookAndFeel(einstellungen.getLookAndFeel());
            }
            catch (FileNotFoundException fileNotFoundException) {
                J.\u00d300000();
                JOptionPane.showMessageDialog(null, "<html>Ein Zugriff auf die folgende Datei war nicht m\u00f6glich:<br>" + string + "<br>Bitte pr\u00fcfen sie die Berechtigungen dieser Datei.<br>" + "<br><br><br>" + fileNotFoundException.getMessage(), "Fehler beim Laden der Konfiguration", 0);
                System.exit(255);
            }
            catch (Exception exception) {
                Fehlermeldung fehlermeldung = new Fehlermeldung();
                fehlermeldung.handle(exception);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.\u00d300000().getSelectedItem().equals("A-Z")) {
            this.int().new("A-Z");
        } else if (this.\u00d300000().getSelectedItem().equals("Z-A")) {
            this.int().new("Z-A");
        } else {
            this.int().new("None");
        }
    }

    public void \u00f400000() {
        this.\u00f6O0000().\u00d400000();
        this.int().new();
    }

    public void super(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00f6O0000().o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.int().\u00d300000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
    }

    public ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d3O0000() {
        return this.int().\u00d300000();
    }

    public java.lang.String OO0000() {
        return this.\u00d200000.void();
    }

    public void \u00f600000() {
        if (this.int().getSelectedIndex() < 0) {
            JDialog jDialog = new JDialog(this, "Neuer Held?", true);
            JButton jButton = new JButton(nullObject.o00000(this, jDialog));
            JButton jButton2 = new JButton(t_0.o00000(this, jDialog));
            jButton.setHorizontalAlignment(2);
            jButton2.setHorizontalAlignment(2);
            jButton.setHorizontalTextPosition(2);
            jButton2.setHorizontalTextPosition(2);
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new BorderLayout());
            jPanel.add((Component)jButton, "North");
            jPanel.add((Component)jButton2, "Center");
            jDialog.getContentPane().add(jPanel);
            jDialog.setSize(420, 120);
            jDialog.setResizable(false);
            Utils.zentriere(jDialog);
            jDialog.setVisible(true);
        }
    }

    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO super(java.lang.String string) {
        return this.int().\u00d300000(string);
    }

    public return int() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new return(this);
            helden.gui.C c = new helden.gui.C(this);
            this.\u00d600000.addMouseListener(c);
        }
        return this.\u00d600000;
    }

    public JTabbedPane Objectsuper() {
        if (this.String == null) {
            this.String = new JTabbedPane();
            JPanel jPanel = new JPanel();
            JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.int());
            jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
            jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
            jScrollPaneFast.setMinimumSize(new Dimension(150, 10));
            jPanel.setLayout(new BorderLayout());
            jPanel.add((Component)this.\u00d300000(), "North");
            jPanel.add((Component)jScrollPaneFast, "Center");
            this.String.addTab("Liste", jPanel);
            this.String.addTab("Gruppen", this.\u00f6O0000());
        }
        return this.String;
    }

    public super \u00d600000() {
        return this.\u00d200000;
    }

    public helden.gui.allgemein.new.OoOO \u00f6O0000() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new helden.gui.allgemein.new.OoOO(this.int(), true);
        }
        return this.\u00f800000;
    }

    public helden.gui.B do() {
        return this.\u00d500000;
    }

    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d2O0000() {
        return (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)this.int().getSelectedValue();
    }

    public JComboBox \u00d300000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JComboBox();
            this.\u00d800000.addItem("A-Z");
            this.\u00d800000.addItem("Z-A");
            this.\u00d800000.addItem("Datum");
            this.\u00d800000.setSelectedItem("Datum");
            this.\u00d800000.addActionListener(this);
        }
        return this.\u00d800000;
    }

    public boolean \u00d200000(java.lang.String string) {
        return this.int().\u00d400000(string);
    }

    public void \u00d800000() {
        this.\u00d200000.\u00f400000().\u00d5\u00d20000();
        this.\u00d600000().\u00d500000();
        this.\u00d200000();
    }

    public void \u00f4O0000() {
        HeldenPluginFactory.initPlugins(this.null, this);
    }

    public void \u00d300000(java.lang.String string) {
        this.\u00f6O0000().o00000(this.super(string));
        this.int().\u00d300000(this.super(string));
        this.\u00d200000();
    }

    public void \u00d400000() {
        this.dispatchEvent(new WindowEvent(this, 201));
    }

    public void super(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, boolean bl) {
        this.int().o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, bl);
        boolean bl2 = !this.\u00d200000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000()) && Einstellungen.getInstance().isNeueHeldenInTree();
        this.\u00d200000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        if (bl2) {
            this.\u00f6O0000().\u00d200000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
        if (bl) {
            this.int().setSelectedValue(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, true);
            this.\u00d200000();
        }
    }

    public void super(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, boolean bl, boolean bl2) {
        boolean bl3;
        this.int().o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, bl);
        this.\u00d200000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        boolean bl4 = bl3 = bl2 && Einstellungen.getInstance().isNeueHeldenInTree();
        if (bl3) {
            this.\u00f6O0000().\u00d200000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
        if (bl) {
            this.int().setSelectedValue(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, true);
            this.\u00d200000();
        }
    }

    public void super(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO3) {
        this.int().o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO3);
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = this.\u00d2O0000();
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 != null && this.\u00f600000 != oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000()) {
            this.\u00f600000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000();
            this.\u00d8O0000();
        }
        this.\u00d200000();
    }

    public void \u00d8O0000() {
        OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = this.\u00d2O0000();
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 != null) {
            this.\u00d600000().o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
    }

    private void \u00f800000() {
        JMenu jMenu;
        Cloneable cloneable;
        JCheckBoxMenuItem jCheckBoxMenuItem;
        JCheckBoxMenuItem jCheckBoxMenuItem2;
        JMenu jMenu2;
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu3 = new JMenu("Datei");
        jMenu3.add(nullObject.o00000(this)).setAccelerator(KeyStroke.getKeyStroke("control N"));
        jMenu3.add(ooo0_0.o00000(this)).setAccelerator(KeyStroke.getKeyStroke("control F"));
        jMenu3.add(t_0.o00000(this));
        jMenu3.add(oooo_0.o00000(this)).setAccelerator(KeyStroke.getKeyStroke("control E"));
        jMenu3.addSeparator();
        jMenu3.add(i_0.o00000(this));
        if (!Einstellungen.getInstance().isVerderben()) {
            jMenu3.add(S.super(this)).setAccelerator(KeyStroke.getKeyStroke("control S"));
        }
        jMenu3.addSeparator();
        JMenu jMenu4 = new JMenu("Importieren");
        jMenu4.add(oO0Oo.o00000(this)).setAccelerator(KeyStroke.getKeyStroke("control I"));
        jMenu4.add(new Stringsuper(this));
        jMenu3.add(jMenu4);
        this.\u00f500000 = new JMenu("Exportieren");
        this.\u00f500000.add(u.o00000(this, false));
        this.\u00f500000.add(u.o00000(this, true));
        this.\u00f500000.add(publicnew.o00000(this, false));
        this.\u00f500000.add(publicnew.o00000(this, true));
        this.\u00f500000.add(C.o00000(this));
        this.\u00f500000.add($A.super(this));
        this.\u00f500000.add(oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0.o00000(this));
        jMenu3.add(this.\u00f500000);
        jMenu3.add(helden.gui.E.A.o00000(this)).setAccelerator(KeyStroke.getKeyStroke("control H"));
        jMenu3.addSeparator();
        jMenu3.add(ooo0_1.o00000(this));
        jMenu3.add(FA.o00000(this)).setAccelerator(KeyStroke.getKeyStroke("control P"));
        jMenu3.add(G.\u00d200000(this));
        jMenu3.addSeparator();
        jMenu3.add(OO0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000(this)).setAccelerator(KeyStroke.getKeyStroke("control Q"));
        jMenuBar.add(jMenu3);
        JMenu jMenu5 = new JMenu("Bearbeiten");
        jMenu5.add(float.o00000(this));
        jMenu5.add(class.o00000(this));
        jMenu5.add(Objectnew.o00000(this));
        jMenu5.add(Oo00.o00000(this));
        jMenu5.add(n_0.o00000(this));
        jMenu5.add(IA.o00000(this));
        jMenuBar.add(jMenu5);
        JMenu jMenu6 = new JMenu("Steigern");
        jMenu6.add(ObjectObject.o00000(this));
        jMenu6.add(helden.gui.H.A.o00000(this));
        jMenu6.add(helden.gui.h.super.oooo_0.o00000(this));
        jMenu6.add(helden.gui.H.B.A.o00000(this));
        jMenu6.add(helden.gui.H.C.super(this));
        jMenu6.add(z_0.o00000(this));
        jMenu6.add(helden.gui.ooOO.A.o00000(this));
        jMenu6.addSeparator();
        jMenu6.add(oOOOo.super(this));
        jMenu6.add(Stringnew.super(this));
        jMenuBar.add(jMenu6);
        if (!Einstellungen.getInstance().isVerderben()) {
            jMenu2 = new JMenu("Spielleiter");
            jMenu2.add(N.o00000(this));
            jMenu2.add(KA.o00000(this));
            jMenuBar.add(jMenu2);
        }
        jMenu2 = new JMenu("Einstellungen");
        JMenu jMenu7 = new JMenu("Drucken");
        jMenu7.add(intnew.o00000(this));
        jMenu7.add(M.o00000(this));
        JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem();
        jCheckBoxMenuItem3.setAction(b_0.o00000(jCheckBoxMenuItem3));
        jMenu7.add(jCheckBoxMenuItem3);
        JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem();
        jCheckBoxMenuItem4.setAction(classsuper.o00000(jCheckBoxMenuItem4));
        jMenu7.add(jCheckBoxMenuItem4);
        JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem();
        JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem();
        jCheckBoxMenuItem5.setAction(j.super(jCheckBoxMenuItem5));
        jMenu7.add(jCheckBoxMenuItem5);
        jCheckBoxMenuItem6.setAction(B.o00000(jCheckBoxMenuItem6));
        jMenu7.add(jCheckBoxMenuItem6);
        JMenuItem jMenuItem = new JMenuItem("Druckseiteneinstellungen ...");
        jMenuItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DruckeinstellungenPanel druckeinstellungenPanel = new DruckeinstellungenPanel(A.\u00d4O0000(), null);
                druckeinstellungenPanel.zeigePanel();
            }
        });
        jMenu7.add(jMenuItem);
        jMenu2.add(jMenu7);
        jMenu2.add(y.super(this));
        jMenu2.add(Z.o00000(this));
        jMenu2.add(helden.gui.ooOO.return.o00000(this));
        JMenu jMenu8 = new JMenu("Updater");
        if (!Einstellungen.getInstance().isDebianMode()) {
            jCheckBoxMenuItem2 = new JCheckBoxMenuItem();
            jCheckBoxMenuItem2.setAction(ooooo_0.o00000(jCheckBoxMenuItem2));
            jMenu8.add(jCheckBoxMenuItem2);
            jCheckBoxMenuItem = new JCheckBoxMenuItem();
            jCheckBoxMenuItem.setAction(oooo_2.o00000(jCheckBoxMenuItem, this));
            jMenu8.add(jCheckBoxMenuItem);
            jMenu8.add(OOo0.super(this));
        } else {
            jMenu8.setEnabled(false);
            jMenu8.setToolTipText("Beim Debianpaket nicht n\u00f6tig!");
        }
        jMenu2.add(jMenu8);
        jCheckBoxMenuItem2 = new JCheckBoxMenuItem();
        jCheckBoxMenuItem2.setAction(o0OOo.o00000(jCheckBoxMenuItem2));
        jMenu2.add(jCheckBoxMenuItem2);
        jMenu2.add(c_0.o00000(this));
        jCheckBoxMenuItem = new JCheckBoxMenuItem();
        jCheckBoxMenuItem.setAction(O00O.o00000(jCheckBoxMenuItem));
        jMenu2.add(jCheckBoxMenuItem);
        JCheckBoxMenuItem jCheckBoxMenuItem7 = new JCheckBoxMenuItem();
        jCheckBoxMenuItem7.setAction(d.o00000(jCheckBoxMenuItem7));
        jMenu2.add(jCheckBoxMenuItem7);
        jCheckBoxMenuItem7.setToolTipText("Wird erst nach einem Neustart wirksam");
        JCheckBoxMenuItem jCheckBoxMenuItem8 = new JCheckBoxMenuItem();
        jCheckBoxMenuItem8.setAction(oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super(jCheckBoxMenuItem8));
        jMenu2.add(jCheckBoxMenuItem8);
        jMenu2.add(s_0.o00000(this));
        JMenu jMenu9 = new JMenu("Look and Feel");
        ArrayList<oooo_1> arrayList = oooo_1.o00000(this);
        int n = arrayList.size();
        for (int i2 = 0; i2 < n; ++i2) {
            cloneable = arrayList.get(i2);
            jMenu9.add((Action)((Object)cloneable));
        }
        jMenu9.addSeparator();
        jMenu9.add(o0oo_0.new(this));
        jMenu2.add(jMenu9);
        jMenuBar.add(jMenu2);
        R r = new R();
        cloneable = r.o00000();
        if (((ArrayList)cloneable).size() > 0) {
            jMenu = new JMenu("Programme");
            Iterator iterator = ((ArrayList)cloneable).iterator();
            while (iterator.hasNext()) {
                ExternesProgramm externesProgramm = (ExternesProgramm)iterator.next();
                jMenu.add(helden.gui.oooo_0.o00000(this, externesProgramm));
            }
            jMenuBar.add(jMenu);
        }
        this.null = new JMenu("Erweiterungen");
        jMenuBar.add(this.null);
        this.\u00d300000 = new JMenu("Schmiede");
        this.\u00d300000.add(helden.gui.F.B.o00000(this));
        this.\u00d300000.add(oOOO.o00000(this));
        this.\u00d300000.setVisible(false);
        jMenuBar.add(this.\u00d300000);
        this.super(jMenuBar);
        jMenu = new JMenu("Hilfe");
        jMenu.add(ifsuper.o00000(this, 0));
        jMenu.add(ifsuper.o00000(this, 1));
        jMenu.add(ifsuper.o00000(this, 2));
        jMenu.add(ifsuper.o00000(this, 3));
        jMenu.add(ifsuper.o00000(this, 4));
        jMenu.addSeparator();
        jMenu.add(interface.o00000(this));
        jMenuBar.add(jMenu);
        this.setJMenuBar(jMenuBar);
        this.\u00d200000();
    }

    private void \u00d200000() {
        if (this.int().getModel().getSize() == 0) {
            this.\u00f500000.setEnabled(false);
            Objectnew.o00000(this).setEnabled(false);
            Oo00.o00000(this).setEnabled(false);
            n_0.o00000(this).setEnabled(false);
            float.o00000(this).setEnabled(false);
            IA.o00000(this).setEnabled(false);
            z_0.o00000(this).setEnabled(false);
            helden.gui.ooOO.A.o00000(this).setEnabled(false);
            DA.o00000(this).setEnabled(false);
            helden.gui.H.B.A.o00000(this).setEnabled(false);
            helden.gui.H.C.super(this).setEnabled(false);
            ObjectObject.o00000(this).setEnabled(false);
            helden.gui.H.A.o00000(this).setEnabled(false);
            oOOOo.super(this).setEnabled(false);
            Stringnew.super(this).setEnabled(false);
        } else {
            this.\u00f500000.setEnabled(true);
            Objectnew.o00000(this).setEnabled(true);
            Oo00.o00000(this).setEnabled(true);
            n_0.o00000(this).setEnabled(true);
            float.o00000(this).setEnabled(true);
            IA.o00000(this).setEnabled(true);
            helden.gui.H.B.A.o00000(this).setEnabled(true);
            if (this.\u00d2O0000() != null) {
                ObjectObject.o00000(this).setEnabled(this.\u00d2O0000().new(while.StringthisString.toString()));
                z_0.o00000(this).setEnabled(this.\u00d2O0000().new(while.nullfor.toString()));
                DA.o00000(this).setEnabled(!this.\u00d2O0000().\u00d8\u00d20000());
                helden.gui.h.super.oooo_0.o00000(this).setEnabled(!this.\u00d2O0000().\u00d8\u00d20000());
                helden.gui.H.A.o00000(this).setEnabled(this.\u00d2O0000().\u00d3O0000());
                helden.gui.H.C.super(this).setEnabled(o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000(this.\u00d2O0000()));
                helden.gui.ooOO.A.o00000(this).setEnabled(this.\u00d2O0000().\u00d400000() > 0);
                float.o00000(this).o00000();
                oOOOo.super(this).setEnabled(true);
                Stringnew.super(this).setEnabled(true);
            }
        }
    }

    private void super(JMenuBar jMenuBar) {
        JMenu jMenu = null;
        if (!Einstellungen.getInstance().isTestMode()) {
            return;
        }
        CommUtilities commUtilities = new CommUtilities();
        File file = commUtilities.getJarPath();
        if (!file.isDirectory()) {
            return;
        }
        File[] fileArray = (file = new File(file, "helden/gui/actions/devel".replace('/', File.separatorChar))).listFiles();
        if (fileArray == null) {
            return;
        }
        for (File file2 : fileArray) {
            if (!file2.toString().endsWith(".class") || file2.toString().endsWith("BasisDeveloperAction.class") || file2.toString().endsWith("StatsBasic.class") || file2.toString().contains("$")) continue;
            try {
                URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{file2.toURL()});
                java.lang.String string = "helden.gui.actions.devel." + file2.getName().toString().replace(".class", "");
                System.out.println(string);
                Class<?> clazz = uRLClassLoader.loadClass(string);
                OoOO ooOO2 = (OoOO)clazz.newInstance();
                ooOO2.o00000(this);
                if (jMenu == null) {
                    jMenu = new JMenu("Entwickler");
                    jMenuBar.add(jMenu);
                }
                jMenu.add(ooOO2);
            }
            catch (MalformedURLException malformedURLException) {
                malformedURLException.printStackTrace();
            }
            catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            catch (InstantiationException instantiationException) {
                instantiationException.printStackTrace();
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
    }

    private JPanel \u00d6O0000() {
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.add((Component)new TextAreaWithHyperlinkSupport("<html><body>Zufrieden mit der Helden-Software? <a href=\"http://www.helden-software.de/index.php/spenden/\">Uns unterst\u00fctzen</a><br><b>Probleme?</b> Nutze den gr\u00fcnen Hilfe-Button und schaue dir <a href=\"http://wiki.helden-software.de/Bugs\"> wiki.helden-software.de/Bugs</a> an.<br>"), "West");
        JProgressBar jProgressBar = new JProgressBar();
        jProgressBar.setStringPainted(true);
        helden.framework.held.Object.Z z = new helden.framework.held.Object.Z(jProgressBar);
        new Thread(z).start();
        jPanel.add((Component)jProgressBar, "East");
        return jPanel;
    }

    private JToolBar super() {
        JToolBar jToolBar = new JToolBar();
        jToolBar.add(new String(nullObject.o00000(this)));
        jToolBar.add(new String(i_0.o00000(this)));
        if (!Einstellungen.getInstance().isVerderben()) {
            jToolBar.add(new String(S.super(this)));
        }
        jToolBar.add(new String(ooo0_1.o00000(this)));
        jToolBar.add(new String(Objectnew.o00000(this)));
        if (!Einstellungen.getInstance().isVerderben()) {
            jToolBar.add(new String(FA.o00000(this)));
        }
        Dimension dimension = new Dimension(5, 15);
        Dimension dimension2 = new Dimension(5, 15);
        Dimension dimension3 = new Dimension(Short.MAX_VALUE, 15);
        jToolBar.add(new Box.Filler(dimension, dimension2, dimension3));
        jToolBar.add(new String(newObject.super(this)));
        jToolBar.add(new String(interface.o00000(this)));
        jToolBar.add(new String(OO0OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000(this)));
        return jToolBar;
    }

    private void interface() {
        helden.framework.held.Object.A a2 = new helden.framework.held.Object.A("SPLASH", new Random().nextInt(12) + 1);
        Image image = a2.o00000();
        this.setIconImage(image);
    }

    private void \u00d200000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.int().new(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
    }
}

