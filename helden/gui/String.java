/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import javax.swing.Action;
import javax.swing.JButton;

class String
extends JButton {
    public String(Action action) {
        this.setAction(action);
        this.setText("");
        this.setToolTipText((java.lang.String)action.getValue("Name"));
    }
}

