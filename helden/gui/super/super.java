/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.A;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.B.O0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.C.return;
import helden.gui.super.D;
import helden.gui.super.E.String;
import helden.gui.super.F.C;
import helden.gui.super.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.B;
import helden.gui.super.null;
import helden.gui.super.o0oo_0;
import helden.gui.super.oOoO;
import helden.plugin.HeldenPlugin;
import helden.plugin.HeldenPluginFactory;
import helden.plugin.HeldenXMLDatenPlugin3;
import helden.plugin.datenxmlplugin.DatenAustausch3Impl;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class super
extends JTabbedPane
implements ChangeListener {
    private static final int \u00d4O0000 = 2;
    private static final int \u00f800000 = 3;
    private static final int \u00d3O0000 = 4;
    private static final int \u00d8O0000 = 5;
    private static final int \u00d5O0000 = 7;
    private static final int \u00f500000 = 0;
    private static final int \u00d300000 = 8;
    private oOoO \u00d800000;
    private null while;
    private String \u00f400000;
    private B thissuper;
    private D \u00f4O0000;
    private o0oo_0 o00000;
    private helden.framework.held.object.oooo_1 \u00d500000;
    private O0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO new;
    private return OO0000;
    private C \u00d400000;
    private Icon oO0000;
    private A \u00f5O0000;
    private HashMap<Integer, DatenAustausch3Impl> if;
    private boolean return;

    public super(A a2) {
        this.\u00f5O0000 = a2;
        this.oO0000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Caution.gif")));
        this.addTab("Allgemein", this.\u00d400000());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00f500000());
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        this.addTab("Eigenschaften", jScrollPaneFast);
        this.addTab("Talente", this.Object());
        this.addTab("Zauber", this.\u00d600000());
        this.setEnabledAt(3, false);
        JScrollPaneFast jScrollPaneFast2 = new JScrollPaneFast(this.\u00d2O0000());
        jScrollPaneFast2.getHorizontalScrollBar().setUnitIncrement(10);
        jScrollPaneFast2.getVerticalScrollBar().setUnitIncrement(10);
        this.addTab("Kampfwerte", jScrollPaneFast2);
        JScrollPaneFast jScrollPaneFast3 = new JScrollPaneFast(this.\u00f600000());
        jScrollPaneFast3.getHorizontalScrollBar().setUnitIncrement(10);
        jScrollPaneFast3.getVerticalScrollBar().setUnitIncrement(10);
        this.addTab("Ausr\u00fcstung", jScrollPaneFast3);
        this.addTab("Inventar / Tiere", this.\u00d200000());
        this.addTab("Druckvorschau", this.\u00f400000());
        this.addTab("Gruppe", this.oO0000());
        this.setEnabledAt(8, false);
        this.setMinimumSize(new Dimension(100, 100));
        this.getModel().addChangeListener(this);
        this.if = new HashMap();
    }

    public void float() {
        for (Map.Entry<HeldenPlugin, DatenAustausch3Impl> entry : HeldenPluginFactory.getPluginsMitTab().entrySet()) {
            this.addTab("Plugin: " + entry.getKey().getMenuName(), ((HeldenXMLDatenPlugin3)entry.getKey()).getPanel());
            this.if.put(new Integer(this.getTabCount() - 1), entry.getValue());
        }
    }

    public void \u00d4O0000() {
        this.\u00f400000().\u00d5\u00d20000();
    }

    public java.lang.String void() {
        java.lang.String string = this.getTitleAt(this.getSelectedIndex());
        if (this.getSelectedIndex() == 7) {
            java.lang.String string2 = this.\u00f400000().voidnew().replace(" ", "");
            char c = string2.charAt(string2.length() - 1);
            if (c >= '0' && c <= '9') {
                string2 = string2.substring(0, string2.length() - 1);
            }
            string = string + "_" + string2;
        }
        return string;
    }

    public o0oo_0 \u00f400000() {
        if (this.o00000 == null) {
            this.o00000 = new o0oo_0(this.\u00f5O0000);
        }
        return this.o00000;
    }

    public C oO0000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new C();
        }
        return this.\u00d400000;
    }

    public void public() {
        this.\u00f5O0000.\u00d800000();
        this.\u00d500000();
    }

    public void OO0000() {
        if (this.\u00d500000.\u00d800000().\u00f4\u00d30000()) {
            this.setIconAt(4, this.oO0000);
        } else {
            this.setIconAt(4, null);
        }
    }

    public void \u00d500000() {
        this.\u00d400000().o00000(this.\u00d500000);
        this.\u00f500000().o00000(this.\u00d500000);
        this.Object().o00000(this.\u00d500000);
        this.\u00d200000().o00000(this.\u00d500000);
        this.\u00d600000().o00000(this.\u00d500000);
        this.\u00d2O0000().o00000(this.\u00d500000);
        this.\u00f400000().o00000(this.\u00d500000);
        this.OO0000();
    }

    public void o00000() {
        this.return = true;
    }

    public void o00000(boolean bl) {
        if (bl) {
            this.setEnabledAt(8, true);
            this.oO0000().o00000(bl);
        } else {
            this.setEnabledAt(8, false);
            this.oO0000().o00000(bl);
            this.setSelectedIndex(0);
        }
    }

    public void o00000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 != null) {
            oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(0).String(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
            oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(1).String(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
            oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(2).String(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
        if (this.\u00d500000 != null && oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 != null && oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000().equals(this.\u00d500000.\u00d800000().\u00f4o0000())) {
            this.\u00d500000();
            return;
        }
        this.\u00d500000 = new helden.framework.held.object.oooo_1(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.\u00d400000().o00000(this.\u00d500000);
        this.\u00f500000().o00000(this.\u00d500000);
        this.Object().o00000(this.\u00d500000);
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f500000()) {
            this.\u00d600000().o00000(this.\u00d500000);
            this.setEnabledAt(3, true);
        } else {
            this.setEnabledAt(3, false);
            if (this.getSelectedIndex() == 3) {
                this.setSelectedIndex(0);
            }
        }
        this.\u00d2O0000().o00000(this.\u00d500000);
        this.\u00d500000.\u00d800000().o00000(0).String(this.\u00d500000.\u00d800000());
        this.\u00d500000.\u00d800000().o00000(1).String(this.\u00d500000.\u00d800000());
        this.\u00d500000.\u00d800000().o00000(2).String(this.\u00d500000.\u00d800000());
        this.\u00f400000().o00000(this.\u00d500000);
        this.return = false;
        this.\u00d200000().o00000(this.\u00d500000);
        this.\u00f600000().o00000(this.\u00d500000);
        HeldenPluginFactory.sendMsg("neuer Held");
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (this.getSelectedIndex() == 4) {
            this.\u00d2O0000().o00000(this.\u00d500000);
        }
        if (this.getSelectedIndex() == 7) {
            this.\u00f400000().o00000(this.\u00d500000);
            if (this.\u00d500000 != null) {
                this.\u00d500000.\u00d800000().o00000(0).String(this.\u00d500000.\u00d800000());
                this.\u00d500000.\u00d800000().o00000(1).String(this.\u00d500000.\u00d800000());
                this.\u00d500000.\u00d800000().o00000(2).String(this.\u00d500000.\u00d800000());
                if (this.return) {
                    this.\u00f400000().\u00d5\u00d20000();
                    this.return = false;
                }
            }
        }
        if (this.getSelectedIndex() == 5) {
            this.\u00f600000().doObject();
        }
        if (this.getSelectedIndex() == 3) {
            this.\u00d600000().\u00d400000(this.\u00d500000);
        }
        if (this.getSelectedIndex() == 2) {
            this.Object().\u00d500000(this.\u00d500000);
        }
        for (Map.Entry<Integer, DatenAustausch3Impl> entry : this.if.entrySet()) {
            if (entry.getKey().equals(this.getSelectedIndex())) {
                entry.getValue().sendMsg("Focus");
                continue;
            }
            entry.getValue().sendMsg("Kein Focus");
        }
    }

    private oOoO \u00d400000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new oOoO(this.\u00f5O0000);
        }
        return this.\u00d800000;
    }

    private return \u00f600000() {
        if (this.OO0000 == null) {
            this.OO0000 = new return(this);
        }
        return this.OO0000;
    }

    private null \u00f500000() {
        if (this.while == null) {
            this.while = new null(this);
        }
        return this.while;
    }

    private O0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d200000() {
        if (this.new == null) {
            this.new = new O0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO();
        }
        return this.new;
    }

    private D \u00d2O0000() {
        if (this.\u00f4O0000 == null) {
            this.\u00f4O0000 = new D(this);
        }
        return this.\u00f4O0000;
    }

    private String Object() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new String(this);
        }
        return this.\u00f400000;
    }

    private B \u00d600000() {
        if (this.thissuper == null) {
            this.thissuper = new B(this);
        }
        return this.thissuper;
    }
}

