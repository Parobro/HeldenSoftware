/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.D.P;
import helden.framework.OoOO.E;
import helden.framework.OoOO.X;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.int;
import helden.framework.held.object.oooo_1;
import helden.framework.held.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.gui.super.D;
import helden.gui.super.super;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
implements ActionListener {
    private D super;
    private oooo_1 class;
    private HashMap<E, Integer> \u00d400000;
    private HashMap<E, Integer> \u00d200000;
    private super \u00d300000;

    public C(D d2, super super_) {
        this.super = d2;
        this.\u00d300000 = super_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() instanceof JButton) {
            String string = ((JButton)actionEvent.getSource()).getName();
            boolean bl = string.startsWith("A");
            boolean bl2 = ((JButton)actionEvent.getSource()).getText().equals("+1");
            try {
                int n;
                int n2;
                E e = this.super.Object((JButton)actionEvent.getSource());
                if (bl && bl2) {
                    n2 = this.class.\u00d800000().o00000(e);
                    try {
                        this.class.\u00d200000(e, n2 + 1);
                        n = this.class.\u00d800000().o00000(e);
                        this.super.o00000(e, n);
                        this.super.Object(((JButton)actionEvent.getSource()).getName()).setEnabled(true);
                    }
                    catch (helden.framework.held.D d2) {
                        d2.printStackTrace();
                    }
                    catch (int intVal) {
                    }
                    catch (oooo_0 oooo_02) {
                        // empty catch block
                    }
                }
                if (!bl && bl2) {
                    n2 = this.class.\u00d800000().new(e);
                    try {
                        this.class.o00000(e, n2 + 1);
                        n = this.class.\u00d800000().new(e);
                        this.super.\u00d200000(e, n);
                        this.super.Object(((JButton)actionEvent.getSource()).getName()).setEnabled(true);
                    }
                    catch (int intVal) {
                    }
                    catch (oooo_0 oooo_03) {
                        // empty catch block
                    }
                }
                if (bl && !bl2) {
                    n2 = this.class.\u00d800000().o00000(e);
                    if (this.\u00d200000.get(e) < n2) {
                        try {
                            this.class.\u00d200000(e, n2 - 1);
                            if (this.\u00d200000.get(e) == n2 - 1) {
                                this.super.Object(((JButton)actionEvent.getSource()).getName()).setEnabled(false);
                            }
                        }
                        catch (helden.framework.held.D d3) {
                            d3.printStackTrace();
                        }
                        catch (oooo_0 oooo_04) {
                            oooo_04.printStackTrace();
                        }
                        catch (int intVal) {
                            intVal.printStackTrace();
                        }
                        int n3 = this.class.\u00d800000().o00000(e);
                        this.super.o00000(e, n3);
                    }
                }
                if (!bl && !bl2) {
                    n2 = this.class.\u00d800000().new(e);
                    if (this.\u00d400000.get(e) < n2) {
                        try {
                            this.class.o00000(e, n2 - 1);
                            if (this.\u00d400000.get(e) == n2 - 1) {
                                this.super.Object(((JButton)actionEvent.getSource()).getName()).setEnabled(false);
                            }
                        }
                        catch (int intVal) {
                            intVal.printStackTrace();
                        }
                        catch (oooo_0 oooo_05) {
                            oooo_05.printStackTrace();
                        }
                        int n4 = this.class.\u00d800000().new(e);
                        this.super.\u00d200000(e, n4);
                    }
                }
                this.o00000(e);
            }
            catch (X x) {
                x.printStackTrace();
            }
        } else if (actionEvent.getSource() instanceof JComboBox) {
            JComboBox jComboBox = (JComboBox)actionEvent.getSource();
            P p2 = this.super.\u00d2\u00d20000().get(jComboBox);
            Object object = jComboBox.getSelectedItem();
            if (object instanceof String) {
                this.class.\u00d800000().\u00d5\u00d20000().put(p2, null);
            } else {
                voidsuper voidsuper2 = (voidsuper)object;
                int n = 0;
                for (P p3 : this.class.\u00d800000().\u00d5\u00d20000().keySet()) {
                    voidsuper voidsuper3 = this.class.\u00d800000().\u00d5\u00d20000().get(p3);
                    if (voidsuper3 == null || !voidsuper2.getID().equals(voidsuper3.getID())) continue;
                    ++n;
                }
                if (n < 2) {
                    int n5 = JOptionPane.showConfirmDialog(null, "<html>Soll wirklich " + p2.toString() + " den Bonus f\u00fcr " + voidsuper2.toString() + " bringen?<br>" + "Diese Wahl kann nicht mehr ver\u00e4ndert werden!");
                    if (n5 == 0) {
                        this.class.\u00d800000().\u00d5\u00d20000().put(p2, voidsuper2);
                        jComboBox.setEnabled(false);
                    } else {
                        this.class.\u00d800000().\u00d5\u00d20000().put(p2, null);
                        jComboBox.setSelectedIndex(0);
                    }
                } else {
                    this.class.\u00d800000().\u00d5\u00d20000().put(p2, null);
                    jComboBox.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(this.super, "Es darf maximal ein Bonus von +2/+2 auf " + voidsuper2.toString() + " aktiv sein!");
                }
            }
        }
        this.\u00d300000.OO0000();
    }

    public void o00000(oooo_1 oooo_12) {
        this.class = oooo_12;
        if (oooo_12 == null) {
            return;
        }
        this.\u00d400000 = new HashMap();
        this.\u00d200000 = new HashMap();
        Iterator<voidsuper> iterator = oooo_12.\u00d800000().\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.isKampftalent()) continue;
            try {
                int n;
                Comparable<Object> comparable = (E)voidsuper2;
                if (oooo_12.\u00d800000().\u00d300000((oo0o_0)comparable) < 0) continue;
                this.super.o00000((E)comparable);
                int n2 = oooo_12.\u00d800000().o00000((E)comparable);
                this.super.o00000((voidsuper)comparable, n2);
                this.\u00d200000.put((E)comparable, new Integer(n2));
                if (((E)comparable).o\u00d80000()) {
                    n = oooo_12.\u00d800000().new((E)comparable);
                    this.super.\u00d200000((voidsuper)comparable, n);
                    this.\u00d400000.put((E)comparable, new Integer(n));
                }
                n = oooo_12.\u00d800000().\u00d300000((oo0o_0)comparable);
                int n3 = oooo_12.\u00d800000().o00000((voidsuper)comparable);
                this.super.o00000((voidsuper)comparable, n3, n);
            }
            catch (helden.framework.held.D d2) {
                d2.printStackTrace();
            }
        }
        for (Comparable<Object> comparable : oooo_12.\u00d800000().\u00f5O0000()) {
            if (!((P)comparable).\u00d3\u00d20000()) continue;
            this.super.o00000((P)comparable, oooo_12.\u00d800000());
        }
    }

    private void o00000(voidsuper voidsuper2) {
        try {
            int n = this.class.\u00d800000().\u00d300000((oo0o_0)voidsuper2);
            int n2 = this.class.\u00d800000().o00000(voidsuper2);
            this.super.o00000(voidsuper2, n2, n);
        }
        catch (helden.framework.held.D d2) {
            d2.printStackTrace();
        }
    }
}

