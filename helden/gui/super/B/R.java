/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.framework.Einstellungen;
import helden.framework.held.object.oooo_1;
import helden.framework.held.persistenz.HeldXML;
import helden.framework.oooo.a_0;
import helden.gui.allgemein.Utils;
import helden.gui.super.B.E;
import helden.gui.super.B.O0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.B.OO0O;
import helden.gui.super.B.P;
import helden.gui.super.B.null;
import helden.gui.super.b.oo0o_1;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class R
implements ActionListener,
ListSelectionListener {
    private O0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO super;
    private oooo_1 \u00d200000;

    public R(O0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO) {
        this.super = o0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        F[] fArray;
        Serializable serializable;
        Object object2;
        if (((JButton)actionEvent.getSource()).equals(this.super.void())) {
            if (this.super.OO0000().getSelectedRow() >= 0) {
                object2 = new OO0O(this.super.\u00d200000().o00000(this.super.OO0000().getSelectedRow()), this.\u00d200000);
                serializable = new JDialog(Utils.getFrame(this.super), "Gegenst\u00e4nde des Inventars bearbeiten", true);
                ((OO0O)object2).\u00d800000().o00000((JDialog)serializable);
                ((JDialog)serializable).getContentPane().add((Component)object2);
                ((Window)serializable).setSize(500, 600);
                Utils.zentriere((Window)serializable);
                ((Dialog)serializable).setVisible(true);
                this.super.o00000();
            } else {
                JOptionPane.showMessageDialog(this.super, "Es wurde kein Gegenstand aus der Liste gew\u00e4hlt.\nBitte einen Gegenstand w\u00e4hlen!", "Gegenstand w\u00e4hlen", 0);
            }
        }
        if (((JButton)actionEvent.getSource()).equals(this.super.Object())) {
            if (this.super.OO0000().getSelectedRow() >= 0) {
                try {
                    object2 = new JFileChooser(Einstellungen.getInstance().getLetzterPfad());
                    serializable = new File("Gegenst\u00e4nde.xml");
                    ((JFileChooser)object2).setSelectedFile((File)serializable);
                    if (((JFileChooser)object2).showSaveDialog(Utils.getFrame(this.super)) != 0) {
                        return;
                    }
                    fArray = ((JFileChooser)object2).getSelectedFile();
                    Einstellungen.getInstance().setLetzterPfad(((JFileChooser)object2).getSelectedFile().getParentFile().toString());
                    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                    documentBuilderFactory.setNamespaceAware(true);
                    Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
                    HeldXML heldXML = new HeldXML(null, document);
                    object = document.createElement("eigenegegenstaende");
                    document.appendChild((Node)object);
                    for (int n : this.super.OO0000().getSelectedRows()) {
                        F f2 = this.super.\u00d200000().o00000(n);
                        object.appendChild(heldXML.getGegenstandselement(f2, 0));
                        a_0.o00000(document, (File)fArray);
                    }
                }
                catch (ParserConfigurationException parserConfigurationException) {
                    parserConfigurationException.printStackTrace();
                }
                catch (TransformerException transformerException) {
                    transformerException.printStackTrace();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this.super, "Es wurde kein Gegenstand aus der Liste gew\u00e4hlt.\nBitte einen Gegenstand w\u00e4hlen!", "Gegenstand w\u00e4hlen", 0);
            }
        }
        if (((JButton)actionEvent.getSource()).equals(this.super.\u00d600000())) {
            object2 = new E(this.\u00d200000.\u00d800000().\u00d8o0000().\u00d300000(), this.\u00d200000);
            serializable = new JDialog(Utils.getFrame(this.super), "Gegenst\u00e4nde zum Inventar hinzuf\u00fcgen", true);
            ((E)object2).publicString().o00000((JDialog)serializable);
            ((JDialog)serializable).getContentPane().add((Component)object2);
            ((Window)serializable).setSize(800, 600);
            Utils.zentriere((Window)serializable);
            ((Dialog)serializable).setVisible(true);
            this.super.o00000();
        }
        if (((JButton)actionEvent.getSource()).equals(this.super.float())) {
            object2 = new oo0o_1(this.\u00d200000);
            serializable = new JDialog(Utils.getFrame(this.super), "Geldb\u00f6rse editieren", true);
            ((oo0o_1)object2).class().super((JDialog)serializable);
            ((JDialog)serializable).getContentPane().add((Component)object2);
            ((Window)serializable).setSize(500, 600);
            Utils.zentriere((Window)serializable);
            ((Dialog)serializable).setVisible(true);
        }
        if (((JButton)actionEvent.getSource()).equals(this.super.oO0000())) {
            object2 = new null(this.\u00d200000.\u00d800000().\u00d8o0000(), (F)this.super.OO0000().getValueAt(this.super.OO0000().getSelectedRow(), 4));
            serializable = new JDialog(Utils.getFrame(this.super), "Gegenst\u00e4nde teilen", true);
            ((null)object2).String().o00000((JDialog)serializable);
            ((JDialog)serializable).getContentPane().add((Component)object2);
            ((Window)serializable).setSize(230, 180);
            Utils.zentriere((Window)serializable);
            ((Dialog)serializable).setVisible(true);
            this.super.o00000();
        }
        if (((JButton)actionEvent.getSource()).equals(this.super.\u00d500000())) {
            object2 = this.super.OO0000().getSelectedRows();
            int n = 0;
            for (Object object3 : object2) {
                object = (F)this.super.OO0000().getValueAt((int)object3, 4);
                if (!this.\u00d200000.\u00d800000().o00000(0).\u00d200000((F)object) && !this.\u00d200000.\u00d800000().o00000(1).\u00d200000((F)object) && !this.\u00d200000.\u00d800000().o00000(2).\u00d200000((F)object)) continue;
                ++n;
            }
            if (n > 1) {
                JOptionPane.showMessageDialog(this.super, "Man kann nicht mehrere ausger\u00fcstete Gegenst\u00e4nde verschmelzen.\nBitte Auswahl dem entsprechend anpassen!", "Gegenstand w\u00e4hlen", 0);
                return;
            }
            fArray = new F[((Object)object2).length];
            for (int i2 = 0; i2 < ((Object)object2).length; ++i2) {
                fArray[i2] = (F)this.super.OO0000().getValueAt((int)object2[i2], 4);
            }
            P p2 = new P(this.\u00d200000.\u00d800000().\u00d8o0000(), this.\u00d200000.\u00d800000(), fArray);
            JDialog jDialog = new JDialog(Utils.getFrame(this.super), "Gegenst\u00e4nde verbinden", true);
            p2.\u00d200000().o00000(jDialog);
            jDialog.getContentPane().add(p2);
            jDialog.setSize(400, 300);
            Utils.zentriere(jDialog);
            jDialog.setVisible(true);
            this.super.o00000();
        }
    }

    public void o00000(oooo_1 oooo_12) {
        if (oooo_12 == null) {
            return;
        }
        this.\u00d200000 = oooo_12;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (listSelectionEvent.getSource().equals(this.super.OO0000().getSelectionModel())) {
            int[] nArray = this.super.OO0000().getSelectedRows();
            if (nArray.length > 0) {
                boolean bl;
                Object object;
                this.super.\u00d500000().setEnabled(false);
                F f2 = (F)this.super.OO0000().getValueAt(this.super.OO0000().getSelectedRow(), 4);
                if (f2.\u00f500000() > 1) {
                    object = this.\u00d200000.\u00d800000().\u00d8o0000().\u00d300000(f2.toString());
                    bl = false;
                    for (F f4 : object) {
                        if (f4 != null) continue;
                        bl = true;
                    }
                    if (bl) {
                        this.super.oO0000().setEnabled(true);
                    } else {
                        this.super.oO0000().setEnabled(false);
                    }
                } else {
                    this.super.oO0000().setEnabled(false);
                }
                if (nArray.length > 1) {
                    object = f2.toString();
                    bl = true;
                    for (int n : nArray) {
                        f2 = (F)this.super.OO0000().getValueAt(n, 4);
                        if (!f2.toString().equals(object)) {
                            bl = false;
                        }
                        if (!f2.\u00d200000()) continue;
                        bl = false;
                    }
                    if (bl) {
                        this.super.\u00d500000().setEnabled(true);
                    } else {
                        this.super.\u00d500000().setEnabled(false);
                    }
                }
            } else {
                this.super.oO0000().setEnabled(false);
                this.super.\u00d500000().setEnabled(false);
            }
        }
    }
}

