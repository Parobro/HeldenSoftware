/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.druckeinstellungen;

import helden.framework.DruckEinstellungen;
import helden.framework.DruckSeitenEintrag;
import helden.framework.Einstellungen;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.A;
import helden.gui.allgemein.druckeinstellungen.SeitenEintrag;
import helden.gui.allgemein.druckeinstellungen.Utils;
import helden.gui.oooo_1;
import helden.gui.super.o0oo_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DruckeinstellungenPanel
extends JDialog {
    private static Map<String, SeitenEintrag> \u00d3o0000 = new HashMap<String, SeitenEintrag>();
    private JPanel \u00d2O0000;
    private JPanel \u00d6O0000;
    private JButton \u00d2o0000;
    private JButton \u00f4O0000;
    private JScrollPane \u00f400000;
    private JPanel interface;
    private JLabel \u00d8o0000;
    private JLabel \u00f6O0000;
    private JLabel \u00d6o0000;
    private JLabel do;
    private JLabel \u00d200000;
    private JLabel class;
    private JLabel \u00f600000;
    private JCheckBox Objectsuper;
    private JCheckBox \u00d8O0000;
    private JCheckBox \u00d4O0000;
    private JCheckBox \u00d3O0000;
    private JCheckBox OO0000;
    private JCheckBox \u00d4o0000;
    private JComboBox \u00f8O0000;
    private DruckEinstellungen floatsuper = null;
    private o0oo_0 \u00d300000;
    private JButton \u00f800000;
    private JLabel \u00f4o0000;
    private JCheckBox voidsuper;
    private JLabel int;
    private JCheckBox \u00d800000;
    private JLabel Oo0000;
    private JCheckBox \u00d400000;
    private JButton \u00d600000;
    private JLabel super;

    public static String getVaildFilePfad() {
        for (String string : \u00d3o0000.keySet()) {
            SeitenEintrag seitenEintrag = \u00d3o0000.get(string);
            if (seitenEintrag.getBildPath().equals("")) continue;
            return seitenEintrag.getBildPath();
        }
        return "";
    }

    public DruckeinstellungenPanel() {
        this.Oo0000();
        this.\u00f4o0000();
    }

    public DruckeinstellungenPanel(A a2, o0oo_0 o0oo_02) {
        super(a2);
        this.setModal(true);
        this.setTitle("Druckeinstellungen von: " + a2.\u00d2O0000().\u00f5o0000());
        this.floatsuper = Einstellungen.getInstance().getSeitenEinstellungen(a2.\u00d2O0000().\u00f4o0000());
        this.\u00d300000 = o0oo_02;
        this.Oo0000();
        this.\u00f4o0000();
    }

    public void zeigePanel() {
        this.setLocationRelativeTo(null);
        this.setSize(700, 430);
        this.setVisible(true);
    }

    protected void speichern() {
        this.floatsuper.setMetatalentedrucken(this.\u00d5O0000().isSelected());
        this.floatsuper.setMetaWDEdrucken(this.if().isSelected());
        this.floatsuper.setBuchdruck(this.OO0000().isSelected());
        this.floatsuper.setZonenruestung(this.Stringsuper().isSelected());
        this.floatsuper.setDsa40stufe(this.oo0000().isSelected());
        this.floatsuper.setZauberkommentar(this.\u00d500000().isSelected());
        this.floatsuper.setGeldkreise(this.return().isSelected());
        this.floatsuper.setSignieren(this.\u00f500000().isSelected());
        this.floatsuper.setASPLeiste(this.\u00d4O0000().isSelected());
        this.floatsuper.setZonenRSTeiler(Integer.parseInt(this.\u00f800000().getSelectedItem().toString()));
        this.floatsuper.getSet().clear();
        Object object = \u00d3o0000.keySet().iterator();
        while (object.hasNext()) {
            String string = object.next();
            SeitenEintrag seitenEintrag = \u00d3o0000.get(string);
            this.floatsuper.getSet().add(new DruckSeitenEintrag(seitenEintrag.getBezeichner(), seitenEintrag.isDrucken(), seitenEintrag.getBildPath()));
        }
        if (this.\u00d300000 != null) {
            this.\u00d300000.\u00d5\u00d20000();
        }
        if ((object = (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)A.\u00d4O0000().int().getSelectedValue()) != null) {
            object.o00000(0).String((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object);
            object.o00000(1).String((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object);
            object.o00000(2).String((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object);
        }
        this.setVisible(false);
    }

    private JButton thissuper() {
        if (this.\u00f4O0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00f4O0000 = new JButton("Abbrechen", imageIcon);
            this.\u00f4O0000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    DruckeinstellungenPanel.this.setVisible(false);
                    DruckeinstellungenPanel.this.dispose();
                }
            });
        }
        return this.\u00f4O0000;
    }

    private JButton \u00d5o0000() {
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new JButton("Farbw\u00e4hler");
            this.\u00f800000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    Color color = JColorChooser.showDialog(A.\u00d4O0000(), "Farbe w\u00e4hlen", DruckeinstellungenPanel.this.floatsuper.getBlockfarbe());
                    if (color != null) {
                        DruckeinstellungenPanel.this.floatsuper.setBlockfarbe(color);
                    }
                }
            });
        }
        return this.\u00f800000;
    }

    private JButton \u00f5O0000() {
        if (this.\u00d2o0000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d2o0000 = new JButton("Speichern", imageIcon);
            this.\u00d2o0000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    DruckeinstellungenPanel.this.speichern();
                }
            });
        }
        return this.\u00d2o0000;
    }

    private JButton \u00d3O0000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JButton("Wundm\u00e4nnchen");
            this.\u00d600000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    DruckeinstellungenPanel.this.forsuper();
                }
            });
        }
        return this.\u00d600000;
    }

    private JCheckBox OO0000() {
        if (this.\u00d8O0000 == null) {
            this.\u00d8O0000 = new JCheckBox("");
        }
        return this.\u00d8O0000;
    }

    private JCheckBox return() {
        if (this.\u00d3O0000 == null) {
            this.\u00d3O0000 = new JCheckBox("");
        }
        return this.\u00d3O0000;
    }

    private JCheckBox \u00d4O0000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JCheckBox("");
        }
        return this.\u00d800000;
    }

    private JLabel \u00d800000() {
        if (this.\u00f6O0000 == null) {
            this.\u00f6O0000 = new JLabel("Als Buch drucken");
        }
        return this.\u00f6O0000;
    }

    private JLabel nullsuper() {
        if (this.int == null) {
            this.int = new JLabel("ASP Leiste");
        }
        return this.int;
    }

    private JLabel \u00d400000() {
        if (this.do == null) {
            this.do = new JLabel("Geldkreise");
        }
        return this.do;
    }

    private JLabel \u00f4O0000() {
        if (this.\u00d8o0000 == null) {
            this.\u00d8o0000 = new JLabel("Metatalente");
        }
        return this.\u00d8o0000;
    }

    private JLabel while() {
        if (this.Oo0000 == null) {
            this.Oo0000 = new JLabel("Metatalente WDE");
        }
        return this.Oo0000;
    }

    private JLabel \u00d8o0000() {
        if (this.super == null) {
            this.super = new JLabel("145 px X 131 px");
            this.super.setFont(new Font("Lucida Grande", 0, 9));
        }
        return this.super;
    }

    private JLabel oO0000() {
        if (this.class == null) {
            this.class = new JLabel("Seiten signieren");
        }
        return this.class;
    }

    private JLabel o00000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JLabel("Stufen (DSA 4.0)");
        }
        return this.\u00d200000;
    }

    private JLabel new() {
        if (this.\u00f4o0000 == null) {
            this.\u00f4o0000 = new JLabel("Zauberkommentare");
        }
        return this.\u00f4o0000;
    }

    private JLabel \u00d300000() {
        if (this.\u00d6o0000 == null) {
            this.\u00d6o0000 = new JLabel("Zonenr\u00fcstung");
        }
        return this.\u00d6o0000;
    }

    private JLabel \u00f400000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JLabel("Zonenr\u00fcstung Teiler");
        }
        return this.\u00f600000;
    }

    private JCheckBox \u00d5O0000() {
        if (this.Objectsuper == null) {
            this.Objectsuper = new JCheckBox("");
        }
        return this.Objectsuper;
    }

    private JCheckBox if() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JCheckBox("");
        }
        return this.\u00d400000;
    }

    private JPanel \u00d3o0000() {
        if (this.\u00d6O0000 == null) {
            this.\u00d6O0000 = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
            gridBagLayout.rowHeights = new int[]{0, 0};
            gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
            this.\u00d6O0000.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            this.\u00d6O0000.add((Component)this.\u00f5O0000(), gridBagConstraints);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints2.gridx = 3;
            gridBagConstraints2.gridy = 0;
            this.\u00d6O0000.add((Component)this.thissuper(), gridBagConstraints2);
        }
        return this.\u00d6O0000;
    }

    private JPanel \u00d4o0000() {
        if (this.interface == null) {
            this.interface = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0, 0, 0};
            gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
            this.interface.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.interface.add((Component)this.\u00f4O0000(), gridBagConstraints);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.gridy = 0;
            this.interface.add((Component)this.\u00d5O0000(), gridBagConstraints2);
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.gridy = 1;
            this.interface.add((Component)this.while(), gridBagConstraints3);
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints4.gridx = 1;
            gridBagConstraints4.gridy = 1;
            this.interface.add((Component)this.if(), gridBagConstraints4);
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints5.gridx = 0;
            gridBagConstraints5.gridy = 2;
            this.interface.add((Component)this.\u00d800000(), gridBagConstraints5);
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints6.gridx = 1;
            gridBagConstraints6.gridy = 2;
            this.interface.add((Component)this.OO0000(), gridBagConstraints6);
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints7.gridx = 0;
            gridBagConstraints7.gridy = 3;
            this.interface.add((Component)this.\u00d300000(), gridBagConstraints7);
            GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
            gridBagConstraints8.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints8.gridx = 1;
            gridBagConstraints8.gridy = 3;
            this.interface.add((Component)this.Stringsuper(), gridBagConstraints8);
            GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
            gridBagConstraints9.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints9.gridx = 0;
            gridBagConstraints9.gridy = 4;
            this.interface.add((Component)this.\u00d400000(), gridBagConstraints9);
            GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
            gridBagConstraints10.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints10.gridx = 1;
            gridBagConstraints10.gridy = 4;
            this.interface.add((Component)this.return(), gridBagConstraints10);
            GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
            gridBagConstraints11.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints11.gridx = 0;
            gridBagConstraints11.gridy = 5;
            this.interface.add((Component)this.o00000(), gridBagConstraints11);
            GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
            gridBagConstraints12.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints12.gridx = 1;
            gridBagConstraints12.gridy = 5;
            this.interface.add((Component)this.oo0000(), gridBagConstraints12);
            GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
            gridBagConstraints13.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints13.gridx = 0;
            gridBagConstraints13.gridy = 6;
            this.interface.add((Component)this.oO0000(), gridBagConstraints13);
            GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
            gridBagConstraints14.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints14.gridx = 1;
            gridBagConstraints14.gridy = 6;
            this.interface.add((Component)this.\u00f500000(), gridBagConstraints14);
            GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
            gridBagConstraints15.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints15.gridx = 0;
            gridBagConstraints15.gridy = 7;
            this.interface.add((Component)this.new(), gridBagConstraints15);
            GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
            gridBagConstraints16.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints16.gridx = 1;
            gridBagConstraints16.gridy = 7;
            this.interface.add((Component)this.\u00d500000(), gridBagConstraints16);
            GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
            gridBagConstraints17.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints17.gridx = 0;
            gridBagConstraints17.gridy = 8;
            this.interface.add((Component)this.nullsuper(), gridBagConstraints17);
            GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
            gridBagConstraints18.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints18.gridx = 1;
            gridBagConstraints18.gridy = 8;
            this.interface.add((Component)this.\u00d4O0000(), gridBagConstraints18);
            GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
            gridBagConstraints19.insets = new Insets(0, 0, 5, 5);
            gridBagConstraints19.gridx = 0;
            gridBagConstraints19.gridy = 9;
            this.interface.add((Component)this.\u00f400000(), gridBagConstraints19);
            GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
            gridBagConstraints20.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints20.gridwidth = 2;
            gridBagConstraints20.fill = 2;
            gridBagConstraints20.gridx = 0;
            gridBagConstraints20.gridy = 10;
            this.interface.add((Component)this.\u00f800000(), gridBagConstraints20);
            GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
            gridBagConstraints21.fill = 2;
            gridBagConstraints21.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints21.gridwidth = 2;
            gridBagConstraints21.gridx = 0;
            gridBagConstraints21.gridy = 11;
            this.interface.add((Component)this.\u00d5o0000(), gridBagConstraints21);
            GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
            gridBagConstraints22.insets = new Insets(0, 0, 5, 0);
            gridBagConstraints22.fill = 2;
            gridBagConstraints22.gridwidth = 2;
            gridBagConstraints22.gridx = 0;
            gridBagConstraints22.gridy = 12;
            this.interface.add((Component)this.\u00d3O0000(), gridBagConstraints22);
            GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
            gridBagConstraints23.gridwidth = 2;
            gridBagConstraints23.insets = new Insets(0, 0, 0, 5);
            gridBagConstraints23.gridx = 0;
            gridBagConstraints23.gridy = 13;
            this.interface.add((Component)this.\u00d8o0000(), gridBagConstraints23);
        }
        return this.interface;
    }

    private JScrollPane \u00f8O0000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JScrollPane();
            this.\u00f400000.setVerticalScrollBarPolicy(22);
            this.\u00f400000.setHorizontalScrollBarPolicy(31);
            this.\u00f400000.getVerticalScrollBar().setUnitIncrement(16);
            this.\u00f400000.setViewportView(this.\u00d8O0000());
        }
        return this.\u00f400000;
    }

    private JPanel \u00d8O0000() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0};
            gridBagLayout.rowHeights = new int[]{0};
            gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
            this.\u00d2O0000.setLayout(gridBagLayout);
        }
        return this.\u00d2O0000;
    }

    private JCheckBox \u00f500000() {
        if (this.\u00d4o0000 == null) {
            this.\u00d4o0000 = new JCheckBox("");
        }
        return this.\u00d4o0000;
    }

    private JCheckBox oo0000() {
        if (this.OO0000 == null) {
            this.OO0000 = new JCheckBox("");
        }
        return this.OO0000;
    }

    private JCheckBox \u00d500000() {
        if (this.voidsuper == null) {
            this.voidsuper = new JCheckBox("");
        }
        return this.voidsuper;
    }

    private JComboBox \u00f800000() {
        if (this.\u00f8O0000 == null) {
            this.\u00f8O0000 = new JComboBox();
            DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel)this.\u00f8O0000.getModel();
            defaultComboBoxModel.addElement("20");
            defaultComboBoxModel.addElement("15");
        }
        return this.\u00f8O0000;
    }

    private JCheckBox Stringsuper() {
        if (this.\u00d4O0000 == null) {
            this.\u00d4O0000 = new JCheckBox("");
        }
        return this.\u00d4O0000;
    }

    private void \u00f4o0000() {
        int n = 0;
        for (G g2 : oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().return()) {
            DruckSeitenEintrag druckSeitenEintrag = this.floatsuper.getSeitenEinstellungen(g2.new());
            SeitenEintrag seitenEintrag = druckSeitenEintrag != null ? new SeitenEintrag(druckSeitenEintrag.isDrucken(), g2.new(), druckSeitenEintrag.getBildpath(), g2.\u00d300000()) : new SeitenEintrag(true, g2.new(), "", g2.\u00d300000());
            \u00d3o0000.put(seitenEintrag.getBezeichner(), seitenEintrag);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 2;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = n++;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            this.\u00d8O0000().add((Component)seitenEintrag, gridBagConstraints);
        }
        this.\u00d5O0000().setSelected(this.floatsuper.isMetatalentedrucken());
        this.if().setSelected(this.floatsuper.isMetaWDEdrucken());
        this.OO0000().setSelected(this.floatsuper.isBuchdruck());
        this.Stringsuper().setSelected(this.floatsuper.isZonenRuestung());
        this.oo0000().setSelected(this.floatsuper.isDsa40stufe());
        this.return().setSelected(this.floatsuper.isGeldkreise());
        this.\u00f500000().setSelected(this.floatsuper.isSignieren());
        this.\u00f800000().setSelectedItem(this.floatsuper.getZonenRSTeiler() + "");
        this.\u00d500000().setSelected(this.floatsuper.isZauberkommentar());
        this.\u00d4O0000().setSelected(this.floatsuper.isAspLeiste());
    }

    private void Oo0000() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 136, 0};
        gridBagLayout.rowHeights = new int[]{0, 22, 0};
        gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
        this.getContentPane().setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.getContentPane().add((Component)this.\u00f8O0000(), gridBagConstraints);
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.gridy = 0;
        this.getContentPane().add((Component)this.\u00d4o0000(), gridBagConstraints2);
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 2;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.fill = 1;
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 1;
        this.getContentPane().add((Component)this.\u00d3o0000(), gridBagConstraints3);
    }

    private void forsuper() {
        Object[] objectArray = new Object[]{"Bild w\u00e4hlen", "Kein Bild verwenden", "Abbrechen"};
        int n = JOptionPane.showOptionDialog(this, "Die Zonenwundkreise auf dem Kampfbogen werden durch das hier gew\u00e4hlte Bild ersetzt.", "Wundm\u00e4nnchen", 1, 3, null, objectArray, objectArray[1]);
        if (0 == n) {
            JFileChooser jFileChooser = new JFileChooser(this.floatsuper.getWundmaennchenPfad());
            jFileChooser.setSelectedFile(new File(this.floatsuper.getWundmaennchenPfad()));
            jFileChooser.setAcceptAllFileFilterUsed(false);
            jFileChooser.addChoosableFileFilter(new FileFilter(){

                @Override
                public boolean accept(File file) {
                    if (file.isDirectory()) {
                        return true;
                    }
                    String string = Utils.getExtension(file);
                    if (string != null) {
                        return string.equals("jpeg") || string.equals("jpg") || string.equals("png");
                    }
                    return false;
                }

                @Override
                public String getDescription() {
                    return "Nur Bilder";
                }
            });
            int n2 = jFileChooser.showSaveDialog(this);
            if (0 == n2) {
                File file = jFileChooser.getSelectedFile();
                this.floatsuper.setWundmaennchenPfad(file.getAbsolutePath());
                JOptionPane.showMessageDialog(this, "Das Bild " + file.getAbsolutePath() + " wurde ausgew\u00e4hlt");
            }
        } else if (1 == n) {
            this.floatsuper.setWundmaennchenPfad("");
        }
    }
}

