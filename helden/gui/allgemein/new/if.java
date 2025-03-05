/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.Einstellungen;
import helden.framework.HeldenMath;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.super;
import helden.gui.allgemein.new.F;
import helden.gui.allgemein.new.I;
import helden.gui.allgemein.new.M;
import helden.gui.allgemein.new.Object;
import helden.gui.return;
import helden.model.KulturFabrik;
import helden.model.ProfessionenFabrik;
import helden.model.RassenFabrik;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class if
implements ActionListener,
ChangeListener {
    public static final String \u00d800000 = "Rasse/Kultur/Profession";
    public static final String \u00d400000 = "Profession/Stufe";
    public static final String int = "Kultur/Profession";
    public static final String class = "Alle M\u00f6glichkeiten";
    public static final String super = "Vorteile/Nachteile";
    public static final String \u00d300000 = "Sonderfertigkeiten";
    private M \u00f400000;
    private Object \u00d200000;
    private F \u00d600000;

    public if(Object object, return return_) {
        this.\u00f400000 = new M(return_.\u00d300000(), object.thissuper());
        this.\u00f400000.return();
        object.o00000().o00000(this.\u00f400000.\u00d400000());
        this.\u00d200000 = object;
        this.\u00d600000 = new F(return_);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        java.lang.Object object;
        java.lang.Object object2;
        if (actionEvent.getSource() == this.\u00d200000.return()) {
            this.\u00f400000.new((String)this.\u00d200000.return().getSelectedItem());
            this.\u00f400000.return();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
        if (actionEvent.getSource() == this.\u00d200000.\u00d300000()) {
            this.\u00f400000.\u00d300000((String)this.\u00d200000.\u00d300000().getSelectedItem());
            this.\u00f400000.return();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
        if (actionEvent.getSource() == this.\u00d200000.\u00f500000()) {
            this.\u00f400000.o00000((String)this.\u00d200000.\u00f500000().getSelectedItem());
            this.\u00f400000.return();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
        if (actionEvent.getSource() == this.\u00d200000.while()) {
            this.\u00f400000.o00000(this.\u00d200000.while().isSelected());
            this.\u00f400000.return();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
        if (actionEvent.getSource() == this.\u00d200000.\u00d800000()) {
            object = object2 = this.\u00d200000.o00000().getSelectedRows();
            int n = ((int[])object).length;
            for (int i2 = 0; i2 < n; ++i2) {
                int n2 = object[i2];
                java.lang.Object object3 = (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)this.\u00d200000.o00000().o00000().getValueAt(n2, 0);
                this.o00000(object3.\u00f5o0000(), object3.\u00f4o0000(), false);
            }
            this.\u00f400000.\u00d500000();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
        if (actionEvent.getSource() == this.\u00d200000.\u00d500000()) {
            this.o00000((String)this.\u00d200000.\u00d400000().getSelectedItem());
            this.\u00f400000.\u00d500000();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
        if (actionEvent.getSource() == this.\u00d200000.\u00f800000()) {
            object2 = JOptionPane.showInputDialog(this.\u00d200000, "Gruppenname", "W\u00e4hle einen Gruppen Name", 3, null, null, "Heldengruppe");
            if (object2 == null) {
                return;
            }
            try {
                object = (String)object2;
                if (((String)object).equals("Neu")) {
                    JOptionPane.showMessageDialog(this.\u00d200000, "\"Neu\" ist eine gesch\u00fctzte Gruppe\nDer Name darf nicht verwendet werden ", "Fehlerhafte Eingabe", 2);
                    return;
                }
                if (((String)object).length() < 3) {
                    JOptionPane.showMessageDialog(this.\u00d200000, "Der Name ist zu kurz!\nmin 3 Zeichen", "Fehlerhafte Eingabe", 2);
                    return;
                }
                this.o00000((String)object, null, true);
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this.\u00d200000, "Ung\u00fcltiger Wert", "Fehlerhafte Eingabe", 2);
            }
        }
        if (actionEvent.getSource() == this.\u00d200000.\u00d4O0000()) {
            object2 = (I)this.\u00d200000.thissuper().getLastSelectedPathComponent();
            if (object2 != null) {
                if (Einstellungen.getInstance().getTreeSelectionPath() != null) {
                    for (java.lang.Object object3 : object = Einstellungen.getInstance().getTreeSelectionPath().getPath()) {
                        if (!object2.equals(object3)) continue;
                        Einstellungen.getInstance().setTreeSelectionPath(null);
                    }
                }
                if (((DefaultMutableTreeNode)object2).getChildCount() > 0) {
                    if (JOptionPane.showConfirmDialog(this.\u00d200000, "Soll diese Gruppe und der Inhalt wirklich gel\u00f6scht werden?", "Gruppe L\u00f6schen?", 0) == 0) {
                        this.o00000((I)object2);
                    }
                } else {
                    this.o00000((I)object2);
                }
            }
            this.\u00f400000.\u00d500000();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
    }

    public I o00000(DefaultMutableTreeNode defaultMutableTreeNode, String string, boolean bl, boolean bl2, String string2) {
        int n;
        I i2 = null;
        i2 = bl2 ? new I(string, bl2) : new I(string, string2);
        if (defaultMutableTreeNode == null) {
            defaultMutableTreeNode = (I)((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).getRoot();
        }
        if (defaultMutableTreeNode.isLeaf()) {
            defaultMutableTreeNode = defaultMutableTreeNode.getParent() == null ? (I)((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).getRoot() : (I)defaultMutableTreeNode.getParent();
        }
        if (defaultMutableTreeNode.getLevel() > 3 && bl2) {
            return null;
        }
        for (n = 0; n < defaultMutableTreeNode.getChildCount(); ++n) {
            if (this.\u00d600000.o00000((I)defaultMutableTreeNode.getChildAt(n), i2) < 0) continue;
            if (!((I)defaultMutableTreeNode.getChildAt(n)).isLeaf() || !i2.isLeaf() || !((I)defaultMutableTreeNode.getChildAt(n)).\u00d200000().equals(i2.\u00d200000())) break;
            return null;
        }
        ((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).insertNodeInto(i2, defaultMutableTreeNode, n);
        if (bl) {
            this.\u00d200000.thissuper().scrollPathToVisible(new TreePath(i2.getPath()));
        }
        return i2;
    }

    public void o00000(String string, String string2, boolean bl) {
        I i2 = null;
        TreePath treePath = this.\u00d200000.thissuper().getSelectionPath();
        i2 = treePath == null ? (I)((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).getRoot() : (I)treePath.getLastPathComponent();
        this.o00000(i2, string, true, bl, string2);
    }

    public void o00000() {
        int n;
        this.\u00d200000.return().addItem("Keine Auswahl");
        for (n = 0; n < this.\u00f400000.\u00d300000().size(); ++n) {
            this.\u00d200000.return().addItem(this.\u00f400000.\u00d300000().get(n));
        }
        this.\u00d200000.return().setSelectedItem("Keine Auswahl");
        this.\u00d200000.\u00d300000().addItem("Keine Auswahl");
        for (n = 0; n < this.\u00f400000.new().size(); ++n) {
            this.\u00d200000.\u00d300000().addItem(this.\u00f400000.new().get(n));
        }
        this.\u00d200000.\u00d300000().setSelectedItem("Keine Auswahl");
        this.\u00d200000.\u00f500000().addItem("Keine Auswahl");
        for (n = 0; n < this.\u00f400000.o00000().size(); ++n) {
            this.\u00d200000.\u00f500000().addItem(this.\u00f400000.o00000().get(n));
        }
        this.\u00d200000.\u00f500000().setSelectedItem("Keine Auswahl");
        this.\u00d200000.if().setModel(new SpinnerNumberModel(1, 1, 100, 1));
        this.\u00d200000.oO0000().setModel(new SpinnerNumberModel(100, 1, 100, 1));
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (changeEvent.getSource() == this.\u00d200000.if()) {
            this.\u00f400000.o00000((Integer)this.\u00d200000.if().getValue());
            this.\u00f400000.return();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
        if (changeEvent.getSource() == this.\u00d200000.oO0000()) {
            this.\u00f400000.new((Integer)this.\u00d200000.oO0000().getValue());
            this.\u00f400000.return();
            this.\u00d200000.o00000().o00000().fireTableDataChanged();
        }
    }

    private I \u00d200000(I i2, String string) {
        for (int i3 = 0; i3 < i2.getChildCount(); ++i3) {
            if (i2.getChildAt(i3).isLeaf() || !((I)i2.getChildAt(i3)).getUserObject().equals(string)) continue;
            return (I)i2.getChildAt(i3);
        }
        return null;
    }

    private boolean o00000(I i2, String string) {
        for (int i3 = 0; i3 < i2.getChildCount(); ++i3) {
            if (!i2.getChildAt(i3).isLeaf() || !((I)i2.getChildAt(i3)).\u00d200000().equals(string)) continue;
            return true;
        }
        return false;
    }

    private void o00000(I i2) {
        if (i2.isLeaf()) {
            MutableTreeNode mutableTreeNode = (MutableTreeNode)i2.getParent();
            if (mutableTreeNode != null) {
                ((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).removeNodeFromParent(i2);
                return;
            }
        } else if (i2.getChildCount() < 1 && !i2.isRoot()) {
            MutableTreeNode mutableTreeNode = (MutableTreeNode)i2.getParent();
            if (mutableTreeNode != null) {
                ((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).removeNodeFromParent(i2);
                return;
            }
        } else if (i2.getChildCount() > 0) {
            MutableTreeNode mutableTreeNode;
            for (int i3 = i2.getChildCount() - 1; i3 >= 0; --i3) {
                if (i2.getChildAt(i3).isLeaf()) {
                    ((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).removeNodeFromParent((I)i2.getChildAt(i3));
                    continue;
                }
                this.o00000((I)i2.getChildAt(i3));
            }
            if (!i2.isRoot() && (mutableTreeNode = (MutableTreeNode)i2.getParent()) != null) {
                ((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).removeNodeFromParent(i2);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void o00000(String string) {
        I i2 = (I)((DefaultTreeModel)this.\u00d200000.thissuper().getModel()).getRoot();
        I i3 = this.\u00d200000(i2, super);
        boolean bl = class.equals(string);
        if ((super.equals(string) || bl) && i3 == null) {
            i3 = this.o00000(i2, super, false, true, null);
        }
        I i4 = this.\u00d200000(i2, \u00d300000);
        if ((\u00d300000.equals(string) || bl) && i4 == null) {
            i4 = this.o00000(i2, \u00d300000, false, true, null);
        }
        I i5 = this.\u00d200000(i2, "Professionen");
        if ((\u00d400000.equals(string) || bl) && i5 == null) {
            i5 = this.o00000(i2, "Professionen", false, true, null);
        }
        I i6 = this.\u00d200000(i2, "RKP");
        if ((\u00d800000.equals(string) || bl) && i6 == null) {
            i6 = this.o00000(i2, "RKP", false, true, null);
        }
        I i7 = this.\u00d200000(i2, "Kultur");
        if ((int.equals(string) || bl) && i7 == null) {
            i7 = this.o00000(i2, "Kultur", false, true, null);
        }
        for (int i8 = 0; i8 < this.\u00f400000.\u00d400000().size(); ++i8) {
            java.lang.Object object;
            java.lang.Object object2;
            java.lang.Object object4;
            OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = this.\u00f400000.\u00d400000().get(i8);
            String string2 = RassenFabrik.getNamebyID(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o\u00d20000().getID());
            String string3 = KulturFabrik.getNamebyID(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f800000().getID());
            if (\u00d800000.equals(string) || bl) {
                I i9;
                object4 = this.\u00d200000(i6, string2);
                if (object4 == null) {
                    object4 = this.o00000(i6, string2, false, true, null);
                }
                if ((i9 = this.\u00d200000((I)object4, string3)) == null) {
                    I i10 = this.o00000((DefaultMutableTreeNode)object4, string3, false, true, null);
                }
                object2 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.nullsuper().iterator();
                while (object2.hasNext()) {
                    void var14_17;
                    I i11;
                    object = ProfessionenFabrik.getNamebyID(object2.next().getID());
                    if (((String)object).equals("Hexer")) {
                        object = "Hexe";
                    }
                    if ((i11 = this.\u00d200000((I)var14_17, (String)object)) == null) {
                        i11 = this.o00000((DefaultMutableTreeNode)var14_17, (String)object, false, true, null);
                    }
                    if (this.o00000(i11, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000())) continue;
                    this.o00000(i11, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString(), false, false, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                }
            }
            if (int.equals(string) || bl) {
                object4 = this.\u00d200000(i7, string3);
                if (object4 == null) {
                    object4 = this.o00000(i7, string3, false, true, null);
                }
                Iterator<super> iterator = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.nullsuper().iterator();
                while (iterator.hasNext()) {
                    object2 = ProfessionenFabrik.getNamebyID(iterator.next().getID());
                    if (((String)object2).equals("Hexer")) {
                        object2 = "Hexe";
                    }
                    if ((object = this.\u00d200000((I)object4, (String)object2)) == null) {
                        object = this.o00000((DefaultMutableTreeNode)object4, (String)object2, false, true, null);
                    }
                    if (this.o00000((I)object, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000())) continue;
                    this.o00000((DefaultMutableTreeNode)object, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString(), false, false, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                }
            }
            if (\u00d400000.equals(string) || bl) {
                object4 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.nullsuper().iterator();
                while (object4.hasNext()) {
                    void var14_21;
                    String string4 = ProfessionenFabrik.getNamebyID(((super)object4.next()).getID());
                    if (string4.equals("Hexer")) {
                        String string5 = "Hexe";
                    }
                    if ((object2 = this.\u00d200000(i5, (String)var14_21)) == null) {
                        object2 = this.o00000(i5, (String)var14_21, false, true, null);
                    }
                    object = "Stufe ";
                    int n = HeldenMath.getStufe40(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o\u00d30000());
                    if (n < 10) {
                        object = (String)object + " ";
                    }
                    object = (String)object + n;
                    I i12 = this.\u00d200000((I)object2, "Stufe " + (String)object);
                    if (i12 == null) {
                        i12 = this.o00000((DefaultMutableTreeNode)object2, "Stufe " + (String)object, false, true, null);
                    }
                    if (this.o00000(i12, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000())) continue;
                    this.o00000(i12, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString(), false, false, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                }
            }
            if (super.equals(string) || bl) {
                for (public public_ : oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d500000().o00000().getListe()) {
                    object2 = public_.\u00f4O0000().toString();
                    object = this.\u00d200000(i3, (String)object2);
                    if (object == null) {
                        object = this.o00000(i3, (String)object2, false, true, null);
                    }
                    if (this.o00000((I)object, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000())) continue;
                    this.o00000((DefaultMutableTreeNode)object, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString(), false, false, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                }
            }
            if (\u00d300000.equals(string) || bl) {
                for (P p2 : oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f5O0000().private().getListe()) {
                    object2 = p2.\u00f500000();
                    object = this.\u00d200000(i4, (String)object2);
                    if (object == null) {
                        object = this.o00000(i4, (String)object2, false, true, null);
                    }
                    if (this.o00000((I)object, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000())) continue;
                    this.o00000((DefaultMutableTreeNode)object, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString(), false, false, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                }
            }
            if (!super.equals(string) && !bl) continue;
            for (public public_ : oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d500000().o00000().getListe()) {
                object2 = public_.\u00f4O0000().toString();
                object = this.\u00d200000(i3, (String)object2);
                if (object == null) {
                    object = this.o00000(i3, (String)object2, false, true, null);
                }
                if (this.o00000((I)object, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000())) continue;
                this.o00000((DefaultMutableTreeNode)object, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString(), false, false, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
            }
        }
    }
}

