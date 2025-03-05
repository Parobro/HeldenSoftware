/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.Einstellungen;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.class;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.K;
import helden.gui.A;
import helden.gui.allgemein.DruckVorschauKomponente;
import helden.gui.allgemein.druckeinstellungen.DruckeinstellungenPanel;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.float;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Renamed from helden.gui.super.o0OO
 */
public class o0oo_0
extends JPanel
implements float,
ActionListener {
    private DruckVorschauKomponente o\u00d50000;
    private JComboBox \u00d6\u00d50000;
    private JScrollPaneFast ObjectString;
    private JTextField \u00f6\u00d50000;
    private JButton voidString;
    private JButton \u00d2\u00d50000;
    private JTextField \u00f4\u00d50000;
    private helden.framework.held.object.oooo_1 \u00d4\u00d50000;
    private JButton \u00f5\u00d50000;
    private int O\u00d50000;
    private JButton interfaceObject;
    private A \u00d5\u00d50000;

    public o0oo_0(A a2) {
        this.\u00d5\u00d50000 = a2;
        this.setLayout(new BorderLayout());
        this.ObjectString = new JScrollPaneFast(this.\u00d6\u00d20000());
        this.add((Component)this.ObjectString, "Center");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 0));
        this.interfaceObject = this.Objectnew();
        jPanel.add(this.interfaceObject);
        this.\u00f6\u00d50000 = new JTextField();
        this.\u00f6\u00d50000.setName("Seitenanzahl");
        this.\u00f6\u00d50000.setEditable(false);
        this.\u00f6\u00d50000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel.add(this.\u00f6\u00d50000);
        this.\u00f4\u00d50000 = new JTextField();
        this.\u00f4\u00d50000.setName("Angezeigte-Seite");
        this.\u00f4\u00d50000.setEditable(false);
        this.\u00f4\u00d50000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel.add(this.\u00f4\u00d50000);
        this.\u00f5\u00d50000 = new JButton("Refresh");
        this.\u00f5\u00d50000.setName("Refresh");
        this.\u00f5\u00d50000.addActionListener(this);
        this.\u00f5\u00d50000.setEnabled(true);
        jPanel.add(this.\u00f5\u00d50000);
        this.\u00d6\u00d50000 = new JComboBox();
        this.\u00d6\u00d50000.setEnabled(false);
        this.\u00d6\u00d50000.addActionListener(this);
        this.\u00d6\u00d50000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel.add(this.\u00d6\u00d50000);
        ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRBack.gif")));
        this.\u00d2\u00d50000 = new JButton(imageIcon);
        this.\u00d2\u00d50000.setName(" < ");
        this.\u00d2\u00d50000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.\u00d2\u00d50000.setBorder(BorderFactory.createEtchedBorder());
        this.\u00d2\u00d50000.addActionListener(this);
        this.\u00d2\u00d50000.setEnabled(false);
        jPanel.add(this.\u00d2\u00d50000);
        ImageIcon imageIcon2 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRForward.gif")));
        this.voidString = new JButton(imageIcon2);
        this.voidString.setName(" > ");
        this.voidString.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.voidString.setBorder(BorderFactory.createEtchedBorder());
        this.voidString.addActionListener(this);
        this.voidString.setEnabled(false);
        jPanel.add(this.voidString);
        this.add((Component)jPanel, "North");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() instanceof JComboBox) {
            int n = ((JComboBox)actionEvent.getSource()).getSelectedIndex();
            this.\u00d6\u00d20000().setSeite(n);
            this.\u00f4\u00d50000.setText("Seite " + (n + 1) + " wird angezeigt");
            this.ObjectString.setViewportView(this.\u00d6\u00d20000());
            this.\u00d4\u00d20000();
        } else {
            int n;
            if (((JButton)actionEvent.getSource()).getName().equals(" > ") && (n = this.\u00d6\u00d50000.getSelectedIndex()) < this.\u00d6\u00d50000.getItemCount() - 1) {
                this.\u00d6\u00d50000.setSelectedIndex(++n);
                this.\u00d6\u00d20000().setSeite(n);
                this.\u00f4\u00d50000.setText("Seite " + (n + 1) + " wird angezeigt");
                this.ObjectString.setViewportView(this.\u00d6\u00d20000());
                this.\u00d5\u00d20000();
            }
            if (((JButton)actionEvent.getSource()).getName().equals(" < ") && (n = this.\u00d6\u00d50000.getSelectedIndex()) > 0) {
                this.\u00d6\u00d50000.setSelectedIndex(--n);
                this.\u00d6\u00d20000().setSeite(n);
                this.\u00f4\u00d50000.setText("Seite " + (n + 1) + " wird angezeigt");
                this.ObjectString.setViewportView(this.\u00d6\u00d20000());
                this.\u00d5\u00d20000();
            }
            if (((JButton)actionEvent.getSource()).getName().equals("Refresh")) {
                this.\u00d5\u00d20000();
            }
            if (((JButton)actionEvent.getSource()).getName().equals("Einstellungen")) {
                DruckeinstellungenPanel druckeinstellungenPanel = new DruckeinstellungenPanel(this.\u00d5\u00d50000, this);
                druckeinstellungenPanel.zeigePanel();
                this.\u00d5\u00d20000();
            }
            this.\u00d4\u00d20000();
        }
    }

    public void \u00d5\u00d20000() {
        if (this.\u00d4\u00d50000 == null) {
            return;
        }
        this.O\u00d50000 = 0;
        oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d500000();
        if (this.\u00d6\u00d50000.getSelectedIndex() > 0) {
            this.O\u00d50000 = this.\u00d6\u00d50000.getSelectedIndex();
        }
        for (int i2 = this.\u00d6\u00d50000.getItemCount(); i2 > 0; --i2) {
            this.\u00d6\u00d50000.removeItemAt(i2 - 1);
        }
        K k2 = this.\u00d4\u00d50000.\u00d800000();
        boolean bl = Einstellungen.getInstance().getSeitenEinstellungen(k2.\u00f4o0000()).isBuchdruck();
        Einstellungen.getInstance().setBuchdruck(bl);
        if (bl) {
            this.\u00d6\u00d20000().setPrintable(class.o00000(k2));
            this.ObjectString.setViewportView(this.\u00d6\u00d20000());
            int n = 0;
            String string = "";
            for (G g2 : oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d400000()) {
                if (string.equals("")) {
                    string = g2.\u00f400000();
                    continue;
                }
                this.\u00d6\u00d50000.insertItemAt(string + ", " + g2.\u00f400000(), n);
                ++n;
                string = "";
            }
            if (!string.equals("")) {
                this.\u00d6\u00d50000.insertItemAt(string, n);
            }
        } else {
            this.\u00d6\u00d20000().setPrintable(class.\u00d200000(k2));
            this.ObjectString.setViewportView(this.\u00d6\u00d20000());
            int n = 0;
            for (G g3 : oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d400000()) {
                this.\u00d6\u00d50000.insertItemAt(g3.\u00f400000(), n);
                ++n;
            }
        }
        this.\u00f4\u00d50000.setText("Seite 1 wird angezeigt");
        this.\u00f6\u00d50000.setText(this.\u00d6\u00d50000.getItemCount() + " Seiten");
        if (this.\u00d6\u00d50000.getItemCount() > 0) {
            this.\u00d6\u00d50000.setEnabled(true);
        }
        if (this.O\u00d50000 > this.\u00d6\u00d50000.getItemCount() - 1) {
            this.\u00d6\u00d50000.setSelectedIndex(this.\u00d6\u00d50000.getItemCount() - 1);
        } else {
            this.\u00d6\u00d50000.setSelectedIndex(this.O\u00d50000);
        }
        this.O\u00d50000 = this.\u00d6\u00d50000.getSelectedIndex();
        this.\u00d4\u00d20000();
    }

    public String voidnew() {
        return this.\u00d6\u00d50000.getSelectedItem().toString();
    }

    public DruckVorschauKomponente \u00d6\u00d20000() {
        if (this.o\u00d50000 == null) {
            this.o\u00d50000 = new DruckVorschauKomponente();
        }
        return this.o\u00d50000;
    }

    @Override
    public void o00000(helden.framework.held.object.oooo_1 oooo_12) {
        if (oooo_12 == null) {
            return;
        }
        if (oooo_12 != this.\u00d4\u00d50000) {
            this.\u00d4\u00d50000 = oooo_12;
            boolean bl = Einstellungen.getInstance().getSeitenEinstellungen(oooo_12.\u00d800000().\u00f4o0000()).isBuchdruck();
            Einstellungen.getInstance().setBuchdruck(bl);
            oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().o00000(oooo_12.\u00d800000());
        }
        this.\u00d5\u00d20000();
    }

    private void \u00d4\u00d20000() {
        int n;
        int n2 = this.\u00d6\u00d50000.getSelectedIndex();
        if (n2 >= (n = this.\u00d6\u00d50000.getItemCount() - 1)) {
            this.voidString.setEnabled(false);
            this.\u00d2\u00d50000.setEnabled(true);
        } else if (n2 <= 0) {
            this.voidString.setEnabled(true);
            this.\u00d2\u00d50000.setEnabled(false);
        } else {
            this.voidString.setEnabled(true);
            this.\u00d2\u00d50000.setEnabled(true);
        }
    }

    private JButton Objectnew() {
        if (this.interfaceObject == null) {
            this.interfaceObject = new JButton();
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/guiuse.gif")));
            this.interfaceObject.setIcon(imageIcon);
            this.interfaceObject.setName("Einstellungen");
            this.interfaceObject.addActionListener(this);
            this.interfaceObject.setEnabled(true);
            this.interfaceObject.setBorder(BorderFactory.createEtchedBorder());
        }
        return this.interfaceObject;
    }
}

