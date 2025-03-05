/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.druckeinstellungen;

import helden.gui.allgemein.druckeinstellungen.DruckeinstellungenPanel;
import helden.gui.allgemein.druckeinstellungen.Utils;
import helden.gui.components.JTextFieldWithMenu;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SeitenEintrag
extends JPanel {
    private boolean void = false;
    private String \u00d200000 = "";
    private String o00000 = "";
    private JLabel \u00f400000;
    private JCheckBox \u00d600000;
    private JTextField Object;
    private JButton \u00d400000;
    private boolean \u00d500000;

    public SeitenEintrag() {
        this(true, "Default eintrag", "", true);
    }

    public SeitenEintrag(boolean bl, String string, String string2, boolean bl2) {
        this.void = bl;
        this.\u00d200000 = string2;
        this.o00000 = string;
        this.\u00d500000 = bl2;
        this.class();
    }

    public String getBezeichner() {
        return this.o00000;
    }

    public String getBildPath() {
        return this.super().getText();
    }

    public boolean isDrucken() {
        return this.void;
    }

    private JButton \u00d200000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JButton("Bild w\u00e4hlen");
        }
        return this.\u00d400000;
    }

    private JCheckBox \u00d300000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JCheckBox("");
            this.\u00d600000.setSelected(this.void);
        }
        return this.\u00d600000;
    }

    private JLabel \u00d400000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JLabel(this.o00000);
        }
        return this.\u00f400000;
    }

    private JTextField super() {
        if (this.Object == null) {
            this.Object = new JTextFieldWithMenu(this.\u00d200000);
            this.Object.setColumns(10);
        }
        return this.Object;
    }

    private void class() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{200, 0, 0, 0, 0, 0, 0};
        gridBagLayout.rowHeights = new int[]{0, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
        this.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.add((Component)this.\u00d400000(), gridBagConstraints);
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints2.gridx = 2;
        gridBagConstraints2.gridy = 0;
        this.add((Component)this.\u00d300000(), gridBagConstraints2);
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.gridx = 3;
        gridBagConstraints3.gridy = 0;
        this.add((Component)this.super(), gridBagConstraints3);
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints4.gridx = 4;
        gridBagConstraints4.gridy = 0;
        this.add((Component)this.\u00d200000(), gridBagConstraints4);
        if (!this.\u00d500000) {
            this.\u00d200000().setEnabled(false);
            this.super().setText("");
            this.super().setEnabled(false);
        }
        this.\u00d600000();
    }

    private void \u00d600000() {
        this.\u00d300000().addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SeitenEintrag.this.void = SeitenEintrag.this.\u00d300000().isSelected();
            }
        });
        this.\u00d200000().addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser jFileChooser = new JFileChooser();
                String string = SeitenEintrag.this.super().getText();
                if (string.equals("")) {
                    string = DruckeinstellungenPanel.getVaildFilePfad();
                }
                File file = new File(string);
                jFileChooser.setSelectedFile(file);
                jFileChooser.setAcceptAllFileFilterUsed(false);
                jFileChooser.setFileFilter(new FileFilter(){

                    @Override
                    public boolean accept(File file) {
                        if (file.isDirectory()) {
                            return true;
                        }
                        String string = Utils.getExtension(file);
                        if (string != null) {
                            return string.equals("tiff") || string.equals("tif") || string.equals("gif") || string.equals("jpeg") || string.equals("jpg") || string.equals("png");
                        }
                        return false;
                    }

                    @Override
                    public String getDescription() {
                        return "Nur Bilder";
                    }
                });
                int n = jFileChooser.showOpenDialog(SeitenEintrag.this);
                if (n == 0) {
                    File file2 = jFileChooser.getSelectedFile();
                    SeitenEintrag.this.\u00d200000 = file2.getAbsolutePath();
                    SeitenEintrag.this.super().setText(SeitenEintrag.this.\u00d200000);
                }
            }
        });
    }
}

