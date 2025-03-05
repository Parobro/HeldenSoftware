/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.oOOO;

import helden.gui.A;
import helden.gui.E.oOOO.C;
import helden.gui.E.oOOO.D;
import helden.gui.E.oOOO.new;
import helden.gui.allgemein.Utils;
import javax.swing.JDialog;
import javax.swing.JSplitPane;

public class o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends JDialog {
    public o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(A a2, D d2) {
        C c = new C(a2, d2);
        new new_ = new new(a2, d2);
        JSplitPane jSplitPane = new JSplitPane(1, new_, c.getPanel());
        jSplitPane.setOneTouchExpandable(true);
        this.getContentPane().add(jSplitPane);
        this.setSize(750, 600);
        Utils.zentriere(this);
        this.setVisible(true);
    }
}

