/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.comm.hilfeTexte.HilfsTexteUpdater;
import helden.gui.A;
import helden.gui.allgemein.Utils;
import helden.gui.components.JScrollPaneFast;
import helden.gui.components.TextAreaWithHyperlinkSupport;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public final class ifsuper
extends AbstractAction {
    private static ifsuper[] \u00d200000;
    private static HilfsTexteUpdater \u00d600000;
    private JButton \u00d500000;
    private A \u00d300000;
    private int o00000;
    private JDialog String;

    public static ifsuper o00000(A a2, int n) {
        if (\u00d200000 == null) {
            \u00d200000 = new ifsuper[10];
        }
        if (\u00d200000[n] == null) {
            ifsuper.\u00d200000[n] = new ifsuper(a2, n);
        }
        return \u00d200000[n];
    }

    private static String o00000(int n) {
        switch (n) {
            case 0: {
                return "Regelbasis ...";
            }
            case 1: {
                return "Fehler melden ...";
            }
            case 2: {
                return "Versionshinweise ...";
            }
            case 3: {
                return "Updaterinfos ...";
            }
            case 4: {
                return "Bekannte Fehler und fehlende Features ...";
            }
        }
        return "xxx";
    }

    private ifsuper(A a2, int n) {
        super(ifsuper.o00000(n), null);
        this.o00000 = n;
        this.\u00d300000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent != null && actionEvent.getSource().equals(this.o00000())) {
            this.String.setVisible(false);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        switch (this.o00000) {
            case 0: {
                stringBuffer.append(\u00d600000.getAktuellenHilfsText("Regelbasis"));
                break;
            }
            case 1: {
                stringBuffer.append(\u00d600000.getAktuellenHilfsText("Fehler"));
                break;
            }
            case 2: {
                stringBuffer.append(\u00d600000.getAktuellenHilfsText("Versionshinweise"));
                break;
            }
            case 3: {
                stringBuffer.append(\u00d600000.getAktuellenHilfsText("Updaterinfos"));
                break;
            }
            case 4: {
                stringBuffer.append(\u00d600000.getAktuellenHilfsText("Buginfo"));
                break;
            }
        }
        TextAreaWithHyperlinkSupport textAreaWithHyperlinkSupport = new TextAreaWithHyperlinkSupport(stringBuffer.toString());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add((Component)textAreaWithHyperlinkSupport, "North");
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        this.String = new JDialog(Utils.getFrame(this.\u00d300000), ifsuper.o00000(this.o00000), true);
        this.String.setLayout(new BorderLayout());
        this.String.add((Component)jScrollPaneFast, "Center");
        JPanel jPanel2 = new JPanel();
        jPanel2.add(this.o00000());
        this.String.add((Component)jPanel2, "South");
        this.String.setSize(600, 600);
        Utils.zentriere(this.String);
        this.String.setVisible(true);
    }

    public JButton o00000() {
        if (this.\u00d500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d500000 = new JButton("OK", imageIcon);
            this.\u00d500000.setName("OK");
            this.\u00d500000.addActionListener(this);
        }
        return this.\u00d500000;
    }

    static {
        \u00d600000 = new HilfsTexteUpdater();
    }
}

