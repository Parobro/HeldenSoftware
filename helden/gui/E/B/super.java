/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.B;

import helden.gui.A;
import helden.gui.E.B.O0OO;
import helden.gui.E.B.OoOO;
import helden.gui.E.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.Utils;
import javax.swing.JDialog;
import javax.swing.JTabbedPane;

public class super
extends JDialog {
    public super(A a2) {
        O0OO o0OO2 = new O0OO(a2, this);
        OoOO ooOO2 = new OoOO(a2, this);
        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Aktualisieren", null, o0OO2.getPanel(), "Does nothing");
        jTabbedPane.addTab("Zugangsberechtigungen", null, ooOO2.getPanel(), "Does nothing");
        this.setTitle(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00f400000());
        this.getContentPane().add(jTabbedPane);
        this.setSize(880, 600);
        this.setModal(true);
        Utils.zentriere(this);
        this.setVisible(true);
    }
}

