/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.Object;

import helden.cloudinterface.CloudUtils;
import helden.framework.Einstellungen;
import helden.framework.held.object.oooo_0;
import helden.gui.E.Object.A;
import helden.gui.E.Object.C;
import helden.gui.E.Object.OoOO;
import helden.gui.E.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.Utils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class D
implements ActionListener {
    private JDialog o00000;
    private boolean \u00d300000 = false;
    private helden.gui.A return;
    private OoOO new;
    private C \u00d500000;
    private A \u00d800000;
    private JTabbedPane \u00d400000;

    public D(helden.gui.A a2) {
        this.return = a2;
        this.new = new OoOO(this);
        this.\u00d500000 = new C(this);
        this.\u00d800000 = new A(this);
        this.\u00d400000 = new JTabbedPane();
        this.\u00d400000.addTab("Login", this.new);
        this.\u00d400000.addTab("Neu registieren?", this.\u00d800000);
        this.super();
        this.o00000 = new JDialog(Utils.getFrame(a2), "Userdaten eingeben", true);
        this.o00000.getContentPane().add(this.\u00d400000);
        this.o00000.setSize(400, 350);
        Utils.zentriere(this.o00000);
        this.o00000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string;
        if (actionEvent.getSource() == this.new.class()) {
            if (this.new.\u00d400000().getText().equals("")) {
                JOptionPane.showMessageDialog(this.new, "Es muss ein eindeutiger Name eingegeben werden.\n", "Namen eingeben!", 0);
                return;
            }
            if (this.new.\u00d400000().getText().equals("")) {
                JOptionPane.showMessageDialog(this.new, "Es muss ein eindeutiger Name eingegeben werden.\n", "Namen eingeben!", 0);
                return;
            }
            string = (String)this.new.super().getSelectedValue();
            if (string == null) {
                JOptionPane.showMessageDialog(this.return, "Es muss ein Server gew\u00e4hlt werden", "server w\u00e4hlen", 0);
                return;
            }
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00f500000(string);
            Einstellungen.getInstance().setUsername(this.new.\u00d400000().getText());
            Einstellungen.getInstance().setUserpasswort(String.valueOf(this.new.\u00d300000().getPassword()));
            boolean bl = true;
            try {
                OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00d500000();
            }
            catch (Exception exception) {
                oooo_0.o00000(exception);
                bl = false;
            }
            if (bl) {
                this.\u00d300000 = true;
                this.o00000.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this.return, "Keine Internetverbindung oder falsche Angaben", "Fehler beim Anmelden", 0);
            }
        }
        if (actionEvent.getSource() == this.\u00d800000.\u00d500000()) {
            String string2;
            if (this.\u00d800000.String().getText().equals("") || this.\u00d800000.String().getText().length() < 6) {
                JOptionPane.showMessageDialog(this.\u00d800000, "Es muss ein eindeutiger Name eingegeben werden.\nMindestens 6 Zeichen", "Namen eingeben!", 0);
                return;
            }
            if (CloudUtils.pruefeAufUngueltigeName(this.\u00d800000.String().getText())) {
                JOptionPane.showMessageDialog(this.return, "Der Name darf nur die Zeichen A bis Z und a bis z und 0 bis 9\naber kein !\"\u00a7$%&/ ()[]{}\\#'\u00b0 enthalten.\n", "Falscher Name", 0);
                return;
            }
            string = new String(this.\u00d800000.\u00d600000().getPassword());
            if (!string.equals(string2 = new String(this.\u00d800000.\u00d300000().getPassword()))) {
                JOptionPane.showMessageDialog(this.return, "Die beiden Passw\u00f6rter unterscheiden sich.", "Passw\u00f6rter", 0);
                return;
            }
            String string3 = (String)this.\u00d800000.o00000().getSelectedValue();
            if (string3 == null) {
                JOptionPane.showMessageDialog(this.return, "Es muss ein Server gew\u00e4hlt werden", "server w\u00e4hlen", 0);
                return;
            }
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00f500000(string3);
            String string4 = null;
            try {
                string4 = OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().o00000(this.\u00d800000.String().getText(), this.\u00d800000.\u00d800000().getText(), string);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                JOptionPane.showMessageDialog(this.return, "Keine Internetverbindung oder falsche Angaben", "Fehler beim Anmelden", 0);
                return;
            }
            if (string4.startsWith("OK ")) {
                this.\u00d400000.setSelectedIndex(0);
                this.new.\u00d400000().setText(this.\u00d800000.String().getText());
                string4 = string4.substring(3);
            }
            JOptionPane.showMessageDialog(this.return, string4, "Meldung", 1);
        }
    }

    public boolean \u00d200000() {
        return this.\u00d300000;
    }

    private ArrayList<String> \u00d300000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("https://online.helden-software.de");
        if (Einstellungen.getInstance().isTestMode()) {
            arrayList.add("https://localhost:8080");
        }
        return arrayList;
    }

    private void super() {
        DefaultListModel<String> defaultListModel = new DefaultListModel<String>();
        ArrayList<String> arrayList = this.\u00d300000();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            defaultListModel.addElement(arrayList.get(i2));
        }
        this.new.super().setModel(defaultListModel);
        this.new.super().setSelectionMode(0);
        this.new.super().setSelectedIndex(0);
        this.\u00d500000.o00000().setModel(defaultListModel);
        this.\u00d500000.o00000().setSelectionMode(0);
        this.\u00d500000.o00000().setSelectedIndex(0);
        this.\u00d800000.o00000().setModel(defaultListModel);
        this.\u00d800000.o00000().setSelectionMode(0);
        this.\u00d800000.o00000().setSelectedIndex(0);
        if (Einstellungen.getInstance().hatVoreinstellungen()) {
            if (Einstellungen.getInstance().getPreselectServer() != null) {
                this.new.super().setSelectedValue(Einstellungen.getInstance().getPreselectServer(), true);
                this.\u00d500000.o00000().setSelectedValue(Einstellungen.getInstance().getPreselectServer(), true);
                this.\u00d800000.o00000().setSelectedValue(Einstellungen.getInstance().getPreselectServer(), true);
            }
            this.new.\u00d400000().setText(Einstellungen.getInstance().getPreselectUsername());
            this.\u00d500000.\u00d300000().setText(Einstellungen.getInstance().getPreselectUsername());
            this.\u00d800000.String().setText(Einstellungen.getInstance().getPreselectUsername());
        } else {
            this.new.\u00d400000().setText(Einstellungen.getInstance().getUsername());
            this.\u00d500000.\u00d300000().setText(Einstellungen.getInstance().getUsername());
            this.\u00d800000.String().setText(Einstellungen.getInstance().getUsername());
        }
        this.new.\u00d300000().setText(Einstellungen.getInstance().getUserpasswort());
    }
}

