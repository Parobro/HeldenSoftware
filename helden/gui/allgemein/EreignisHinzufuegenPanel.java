/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.comm.CommUtilities;
import helden.framework.A.A;
import helden.framework.A.Object;
import helden.framework.A.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.D.P;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.allgemein.EreignisHinzufuegenController;
import helden.gui.components.JScrollPaneFast;
import helden.gui.icons.IconFactory;
import helden.gui.ooOO.oOOOo;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class EreignisHinzufuegenPanel
extends JPanel {
    private JButton for;
    private JButton private;
    private JTextField \u00d5O0000;
    private GridBagLayout \u00f600000;
    private GridBagConstraints[] \u00d600000 = new GridBagConstraints[4];
    private EreignisHinzufuegenController \u00f500000;
    private int \u00d3O0000;
    private JComboBox \u00d200000 = new JComboBox();
    private JSpinner \u00d800000;
    private JSpinner o00000;
    private JPanel oO0000;
    private JSpinner null;
    private JSpinner String;
    private K \u00d2O0000;
    private ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d300000;
    private JComboBox \u00d500000;
    private JButton \u00f800000;

    public EreignisHinzufuegenPanel(oOOOo oOOOo2, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00f600000 = new GridBagLayout();
        this.\u00d300000 = new ArrayList();
        this.o00000();
        this.\u00d800000 = new JSpinner();
        this.o00000 = new JSpinner();
        this.String = new JSpinner();
        this.\u00d5O0000 = new JTextField();
        this.null = new JSpinner();
        this.oO0000 = new JPanel();
        this.setLayout(new BorderLayout());
        this.\u00f500000 = new EreignisHinzufuegenController(this, oOOOo2, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.\u00d2O0000 = (K)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.addInhalt();
        this.createNavigationsPanel();
    }

    public void addAnwendungen() {
        java.lang.Object object;
        this.\u00d300000.clear();
        OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO("Abenteuerpunkte (Hinzugewinn)", 0, true, 0, true, 1, false, "Zugewinn (Gesamt + Freie AP)", 0, true);
        this.\u00d300000.add(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO("Abenteuerpunkte (Ausgaben)", 0, true, 0, true, -1, false, "Ausgaben (Freie AP)", 0, true);
        this.\u00d300000.add(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO("Balsam Salabunde, Rettung von der Schwelle des Todes (Patient)", 0, true, 0, true, 0, true, null, -1, false);
        this.\u00d300000.add(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO("Transmutare K\u00f6rperform (Verwandelter)", 0, true, 0, true, 0, true, null, -1, false);
        this.\u00d300000.add(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        Iterator<P> iterator = this.\u00d2O0000.\u00f5O0000().iterator();
        while (iterator.hasNext()) {
            this.\u00d300000.addAll(iterator.next().thissuper());
        }
        Iterator<KonkreterZauber> iterator2 = this.\u00d2O0000.\u00d5o0000().super();
        while (iterator2.hasNext()) {
            object = iterator2.next();
            this.\u00d300000.addAll(((oo0o_0)object).getAnwendungen());
        }
        ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO("Sonstiges Ereignis (Verlust)", -1, false, -1, false, -1, false, "Verlust (Gesamt + Freie AP)", -1, false);
        this.\u00d300000.add(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO("Sonstiges Ereignis (Hinzugewinn)", 1, false, 1, false, 1, false, "Zugewinn (Gesamt + Freie AP)", 1, false);
        this.\u00d300000.add(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        Collections.sort(this.\u00d300000, new Object());
        this.\u00d200000.removeAllItems();
        object = this.\u00d300000.iterator();
        while (object.hasNext()) {
            this.\u00d200000.addItem(((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object.next()).o00000());
        }
        this.\u00d200000.setSelectedIndex(1);
    }

    public void addInhalt() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.\u00f600000);
        this.addAnwendungen();
        JLabel jLabel = new JLabel();
        jLabel.setText("Anwendung: ");
        this.\u00d600000[0].gridy = this.\u00d3O0000;
        this.\u00f600000.setConstraints(jLabel, this.\u00d600000[0]);
        jPanel.add(jLabel);
        this.\u00d600000[1].gridwidth = 2;
        this.\u00d600000[1].gridy = this.\u00d3O0000++;
        this.\u00d200000.addActionListener(this.\u00f500000);
        this.\u00f600000.setConstraints(this.\u00d200000, this.\u00d600000[1]);
        jPanel.add(this.\u00d200000);
        this.\u00d600000[1].gridwidth = 1;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("AP: ");
        this.\u00d600000[0].gridy = this.\u00d3O0000;
        this.\u00f600000.setConstraints(jLabel2, this.\u00d600000[0]);
        jPanel.add(jLabel2);
        this.\u00d600000[1].gridy = this.\u00d3O0000;
        this.\u00f600000.setConstraints(this.\u00d800000, this.\u00d600000[1]);
        jPanel.add(this.\u00d800000);
        this.\u00d600000[2].gridy = this.\u00d3O0000++;
        this.\u00f600000.setConstraints(this.getAPCB(), this.\u00d600000[2]);
        jPanel.add(this.getAPCB());
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Karma: ");
        this.\u00d600000[0].gridy = this.\u00d3O0000;
        this.\u00f600000.setConstraints(jLabel3, this.\u00d600000[0]);
        jPanel.add(jLabel3);
        this.\u00d600000[1].gridy = this.\u00d3O0000++;
        this.\u00f600000.setConstraints(this.o00000, this.\u00d600000[1]);
        jPanel.add(this.o00000);
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Astrale: ");
        this.\u00d600000[0].gridy = this.\u00d3O0000;
        this.\u00f600000.setConstraints(jLabel4, this.\u00d600000[0]);
        jPanel.add(jLabel4);
        this.\u00d600000[1].gridy = this.\u00d3O0000++;
        this.\u00f600000.setConstraints(this.String, this.\u00d600000[1]);
        jPanel.add(this.String);
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("LeP: ");
        this.\u00d600000[0].gridy = this.\u00d3O0000;
        this.\u00f600000.setConstraints(jLabel5, this.\u00d600000[0]);
        jPanel.add(jLabel5);
        this.\u00d600000[1].gridy = this.\u00d3O0000++;
        this.\u00f600000.setConstraints(this.null, this.\u00d600000[1]);
        jPanel.add(this.null);
        ++this.\u00d3O0000;
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("Kommentar: ");
        this.\u00d600000[0].gridy = this.\u00d3O0000;
        this.\u00f600000.setConstraints(jLabel6, this.\u00d600000[0]);
        jPanel.add(jLabel6);
        this.\u00d600000[1].gridwidth = 2;
        this.\u00d600000[1].gridy = this.\u00d3O0000++;
        this.\u00f600000.setConstraints(this.\u00d5O0000, this.\u00d600000[1]);
        jPanel.add(this.\u00d5O0000);
        this.\u00d600000[1].gridwidth = 1;
        this.updateWerte();
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
        for (A a2 : this.\u00d2O0000.\u00d8O0000()) {
            String string = a2.\u00d3O0000() + " \n-- " + a2.private();
            this.oO0000.add(new JTextArea(string));
        }
    }

    public boolean ausfuehren() {
        int n;
        int n2 = (Integer)this.o00000.getValue();
        int n3 = (Integer)this.String.getValue();
        int n4 = (Integer)this.null.getValue();
        int n5 = 0;
        int n6 = 0;
        int n7 = (Integer)this.\u00d800000.getValue();
        String string = "";
        if (this.getAPCB().getSelectedItem() != null) {
            string = this.getAPCB().getSelectedItem().toString();
        }
        if ("Ausgaben (Freie AP)".equals(string)) {
            n6 = n7;
        } else if ("Verlust (Gesamt + Freie AP)".equals(string)) {
            n6 = n7;
            n5 = n7;
        } else if ("Zugewinn (Gesamt + Freie AP)".equals(string)) {
            n6 = n7;
            n5 = n7;
        }
        String string2 = "";
        if (this.\u00d2O0000.o00000(b_0.\u00d4\u00f5\u00d2000) < -n2) {
            string2 = string2 + "Nicht gen\u00fcgend Karmapunkte\n";
        }
        if (this.\u00d2O0000.o00000(b_0.\u00f4\u00f5\u00d2000) < -n3) {
            string2 = string2 + "Nicht gen\u00fcgend Astralpunkte\n";
        }
        if (this.\u00d2O0000.o00000(b_0.\u00d3\u00f4\u00d2000) < -n4) {
            string2 = string2 + "Nicht gen\u00fcgend Lebenspunkte\n";
        }
        if (this.\u00d2O0000.\u00d400000() < -n6) {
            string2 = string2 + "Nicht gen\u00fcgend verf\u00fcgbare Abenteuerpunkte\n";
        }
        if (this.\u00d2O0000.o\u00d30000() < -n5) {
            string2 = string2 + "Nicht gen\u00fcgend Abenteuerpunkte\n";
        }
        if (!string2.equals("")) {
            JOptionPane.showMessageDialog(this, string2, "Aktion nicht ausf\u00fchrbar", 0);
            return false;
        }
        A a2 = new A("Ereignis eingeben", (java.lang.Object)this.\u00d200000.getSelectedItem().toString(), this.\u00d5O0000.getText(), (Integer)n2, (Integer)n4, (Integer)n6, (Integer)n3, "", "");
        if (n5 != 0 || n6 != 0) {
            a2.o00000(true);
            a2.o00000(a2.private() + " Gesamt AP: " + n5 + " Verf\u00fcgbare AP: " + n6);
        }
        this.\u00d2O0000.o00000(a2);
        if (n2 != 0) {
            n = this.\u00d2O0000.\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000);
            this.\u00d2O0000.\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000, n += n2);
        }
        if (n3 < 0) {
            n = this.\u00d2O0000.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000);
            this.\u00d2O0000.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000, n += n3);
        }
        if (n3 > 0) {
            this.\u00d2O0000.\u00d3\u00d30000().\u00d300000(n3);
        }
        if (n4 != 0) {
            n = this.\u00d2O0000.\u00d3\u00d30000().super(b_0.\u00d3\u00f4\u00d2000);
            this.\u00d2O0000.\u00d3\u00d30000().super(b_0.\u00d3\u00f4\u00d2000, n += n4);
        }
        if (n5 != 0) {
            helden.framework.held.object.oooo_1 oooo_12 = new helden.framework.held.object.oooo_1(this.\u00d2O0000);
            int n8 = this.\u00d2O0000.\u00d400000();
            oooo_12.\u00d200000(this.\u00d2O0000.o\u00d30000() + n5);
            this.\u00d2O0000.new(n8);
        }
        if (n6 != 0) {
            this.\u00d2O0000.new(this.\u00d2O0000.\u00d400000() + n6);
        }
        return true;
    }

    public void createNavigationsPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.getOkButton());
        jPanel.add(this.getAbbrechenButton());
        jPanel.add(this.\u00d200000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton getAbbrechenButton() {
        if (this.private == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.private = new JButton("Abbrechen", imageIcon);
            this.private.setName("Abbrechen");
            this.private.addActionListener(this.\u00f500000);
        }
        return this.private;
    }

    public JComboBox getAPCB() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JComboBox<String>(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.if());
        }
        return this.\u00d500000;
    }

    public JComboBox getComboBox() {
        return this.\u00d200000;
    }

    public EreignisHinzufuegenController getController() {
        return this.\u00f500000;
    }

    public JFormattedTextField getFormattedTextFieldFromSpinner(JSpinner jSpinner) {
        JComponent jComponent = jSpinner.getEditor();
        if (jComponent instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor defaultEditor = (JSpinner.DefaultEditor)jComponent;
            return defaultEditor.getTextField();
        }
        return null;
    }

    public JButton getOkButton() {
        if (this.for == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.for = new JButton("OK", imageIcon);
            this.for.setName("OK");
            this.for.addActionListener(this.\u00f500000);
        }
        return this.for;
    }

    public void setSpinnerNumberModell(JSpinner jSpinner, int n, boolean bl) {
        SpinnerNumberModel spinnerNumberModel = null;
        jSpinner.setEnabled(n != 0);
        if (!bl) {
            if (n >= 0) {
                if (n == 1) {
                    n = 0;
                }
                spinnerNumberModel = new SpinnerNumberModel(n, 0, 9999, 1);
            } else {
                if (n == -1) {
                    n = 0;
                }
                spinnerNumberModel = new SpinnerNumberModel(n, -9999, 0, 1);
            }
        } else {
            spinnerNumberModel = new SpinnerNumberModel(n, n, n, 1);
        }
        jSpinner.setValue(n);
        jSpinner.setModel(spinnerNumberModel);
        jSpinner.setEditor(new JSpinner.NumberEditor(jSpinner));
        JFormattedTextField jFormattedTextField = this.getFormattedTextFieldFromSpinner(jSpinner);
        if (jFormattedTextField != null) {
            jFormattedTextField.setColumns(6);
            jFormattedTextField.setHorizontalAlignment(4);
        }
    }

    public void updateWerte() {
        OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = this.\u00d300000.get(this.\u00d200000.getSelectedIndex());
        String string = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.return();
        this.getAPCB().setSelectedItem(string);
        this.getAPCB().setEnabled(string == null && ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d300000() != 0);
        this.setSpinnerNumberModell(this.\u00d800000, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d300000(), ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d800000());
        this.setSpinnerNumberModell(this.o00000, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d500000(), ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f400000());
        this.setSpinnerNumberModell(this.String, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d400000(), ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.new());
        this.setSpinnerNumberModell(this.null, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f800000(), ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f500000());
    }

    private Component \u00d200000() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new JButton("<html>Hilfe<br>", IconFactory.getFragezeichen());
            this.\u00f800000.setMnemonic('H');
            this.\u00f800000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String string = "http://wiki.helden-software.de/Steigern/Men%C3%BC/Steigern/Ereignis_hinzuf%C3%BCgen";
                    CommUtilities.showInBrowser(string);
                }
            });
            this.\u00f800000.setToolTipText("Der Hilfetext wird im Browser ge\u00f6ffnet");
        }
        return this.\u00f800000;
    }

    private void o00000() {
        this.\u00d3O0000 = 0;
        this.\u00d600000[0] = new GridBagConstraints();
        this.\u00d600000[0].gridx = 0;
        this.\u00d600000[0].anchor = 13;
        this.\u00d600000[0].insets.top = 3;
        this.\u00d600000[0].insets.bottom = 2;
        this.\u00d600000[0].insets.right = 3;
        this.\u00d600000[0].insets.left = 5;
        this.\u00d600000[1] = new GridBagConstraints();
        this.\u00d600000[1].weightx = 1.0;
        this.\u00d600000[1].gridx = 1;
        this.\u00d600000[1].anchor = 17;
        this.\u00d600000[1].fill = 1;
        this.\u00d600000[1].insets.top = 3;
        this.\u00d600000[1].insets.bottom = 2;
        this.\u00d600000[1].insets.right = 5;
        this.\u00d600000[1].gridwidth = 1;
        this.\u00d600000[2] = new GridBagConstraints();
        this.\u00d600000[2].weightx = 1.0;
        this.\u00d600000[2].gridx = 2;
        this.\u00d600000[2].anchor = 17;
        this.\u00d600000[2].insets.top = 3;
        this.\u00d600000[2].insets.bottom = 2;
        this.\u00d600000[2].insets.right = 1;
        this.\u00d600000[3] = new GridBagConstraints();
        this.\u00d600000[3].weightx = 1.0;
        this.\u00d600000[3].gridx = 3;
        this.\u00d600000[3].anchor = 17;
        this.\u00d600000[3].insets.top = 3;
        this.\u00d600000[3].insets.bottom = 2;
        this.\u00d600000[3].insets.right = 1;
    }
}

