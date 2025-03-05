/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class return
extends DefaultTableCellRenderer {
    public static final Color public = new Color(255, 67, 0);
    public static final Color \u00d2O0000 = new Color(255, 153, 0);
    public static final Color oO0000 = new Color(255, 198, 0);
    public static final Color OO0000 = new Color(245, 245, 0);
    public static final Color float = new Color(185, 255, 0);
    public static final Color \u00f600000 = new Color(115, 255, 0);
    public static final Color \u00f400000 = new Color(45, 255, 0);
    public static final Color void = new Color(0, 240, 0);
    public static final Color \u00d500000 = new Color(0, 221, 0);
    public static final Color Object = new Color(0, 179, 0);
    public static final Color \u00d600000 = new Color(255, 0, 0);
    public static final Color \u00d400000 = new Color(255, 50, 0);
    public static final Color \u00d200000 = new Color(255, 100, 0);
    public static final Color o00000 = new Color(255, 150, 0);
    public static final Color \u00f5O0000 = new Color(255, 225, 0);
    public static final Color \u00f4O0000 = new Color(245, 245, 0);
    public static final Color supersuper = new Color(185, 255, 0);
    public static final Color \u00d6O0000 = new Color(115, 255, 0);
    public static final Color \u00d5O0000 = new Color(45, 255, 0);
    public static final Color \u00d4O0000 = new Color(0, 240, 0);
    public static final Color \u00f500000 = new Color(0, 179, 0);

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        Component component = null;
        Object object2 = object;
        boolean bl3 = false;
        boolean bl4 = false;
        if (object2 == null) {
            object2 = jTable.getValueAt(n, n2);
        }
        if (object2.toString().equals("--LEER--")) {
            object2 = "";
            component = super.getTableCellRendererComponent(jTable, "", bl, bl2, n, n2);
            if (bl) {
                this.setBackground(Color.DARK_GRAY);
            } else {
                this.setBackground(Color.LIGHT_GRAY);
            }
        } else if (object2.toString().startsWith("--AKTIVIERT--")) {
            if (object2.toString().length() > "--AKTIVIERT--".length()) {
                object2 = object2.toString().substring("--AKTIVIERT--".length());
                component = super.getTableCellRendererComponent(jTable, object2, bl, bl2, n, n2);
            } else {
                component = super.getTableCellRendererComponent(jTable, "", bl, bl2, n, n2);
                object2 = "";
            }
            if (bl) {
                this.setBackground(Color.CYAN);
            } else {
                this.setBackground(void);
            }
        } else if (object2.toString().startsWith("--TALENT--")) {
            object2 = object2.toString().substring("--TALENT--".length());
            component = super.getTableCellRendererComponent(jTable, object2, bl, bl2, n, n2);
            bl3 = true;
        } else if (object2.toString().startsWith("--ZAUBER--")) {
            object2 = object2.toString().substring("--ZAUBER--".length());
            component = super.getTableCellRendererComponent(jTable, object2, bl, bl2, n, n2);
            object2 = object2.toString().substring(0, object2.toString().indexOf(" "));
            bl3 = true;
        } else if (object2.toString().startsWith("--PROZENT--")) {
            object2 = object2.toString().substring("--PROZENT--".length());
            component = super.getTableCellRendererComponent(jTable, object2, bl, bl2, n, n2);
            bl4 = true;
            object2 = object2.toString().substring(object2.toString().indexOf("=") + 2, object2.toString().indexOf("."));
        } else {
            component = super.getTableCellRendererComponent(jTable, object, bl, bl2, n, n2);
            this.setBackground(jTable.getSelectionBackground());
            if (bl) {
                this.setBackground(jTable.getSelectionBackground());
            } else {
                this.setBackground(jTable.getBackground());
            }
        }
        try {
            if (bl3) {
                int n3 = Integer.parseInt(object2.toString());
                component.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                Color color = public;
                if (n3 > -5) {
                    switch (n3) {
                        case -4: 
                        case -3: {
                            color = \u00d2O0000;
                            break;
                        }
                        case -2: 
                        case -1: {
                            color = oO0000;
                            break;
                        }
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: {
                            color = OO0000;
                            break;
                        }
                        case 4: 
                        case 5: 
                        case 6: {
                            color = float;
                            break;
                        }
                        case 7: 
                        case 8: 
                        case 9: {
                            color = \u00f600000;
                            break;
                        }
                        case 10: 
                        case 11: 
                        case 12: {
                            color = \u00f400000;
                            break;
                        }
                        case 13: 
                        case 14: 
                        case 15: {
                            color = void;
                            break;
                        }
                        case 16: 
                        case 17: 
                        case 18: {
                            color = \u00d500000;
                            break;
                        }
                        default: {
                            color = Object;
                        }
                    }
                }
                if (bl) {
                    color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
                    this.setBackground(color);
                } else {
                    this.setBackground(color);
                }
            } else if (bl4) {
                int n4 = Integer.parseInt(object2.toString());
                component.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                Color color = public;
                if (n4 > -5) {
                    color = n4 < 10 ? \u00d400000 : (n4 < 20 ? \u00d200000 : (n4 < 30 ? o00000 : (n4 < 40 ? \u00f5O0000 : (n4 < 50 ? \u00f4O0000 : (n4 < 60 ? supersuper : (n4 < 70 ? \u00d6O0000 : (n4 < 80 ? \u00d5O0000 : (n4 < 90 ? \u00d4O0000 : \u00f500000))))))));
                }
                if (bl) {
                    color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
                    this.setBackground(color);
                } else {
                    this.setBackground(color);
                }
            }
        }
        catch (Exception exception) {
            component.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }
        if (component instanceof JComponent) {
            ((JComponent)component).setToolTipText(object2.toString());
        }
        return component;
    }
}

