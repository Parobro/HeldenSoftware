/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.gui.A;
import helden.gui.allgemein.new.F;
import helden.gui.allgemein.new.I;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * Renamed from helden.framework.OooO.String
 */
public final class string_0 {
    public static void o00000(String string, String string2, String string3) {
        if (!string2.startsWith("\\Helden")) {
            throw new RuntimeException("Fehlerhafter Gruppenname");
        }
        string2 = string2.substring(8);
        String[] stringArray = string2.split("\\\\");
        I i2 = (I)string_0.o00000().getRoot();
        for (String string4 : stringArray) {
            I i3 = null;
            for (int i4 = 0; i4 < i2.getChildCount(); ++i4) {
                I i5 = (I)i2.getChildAt(i4);
                if (i5.isLeaf() || !i5.o00000().equals(string4)) continue;
                i3 = i5;
                break;
            }
            if (i3 == null) {
                i3 = string_0.o00000(i2, string4, true, null);
            }
            i2 = i3;
        }
        string_0.o00000(i2, string3, false, string);
    }

    public static I o00000(DefaultMutableTreeNode defaultMutableTreeNode, String string, boolean bl, String string2) {
        int n;
        F f2 = new F(A.\u00d4O0000().int());
        DefaultTreeModel defaultTreeModel = string_0.o00000();
        I i2 = null;
        i2 = bl ? new I(string, bl) : new I(string, string2);
        if (defaultMutableTreeNode == null) {
            defaultMutableTreeNode = (I)defaultTreeModel.getRoot();
        }
        if (defaultMutableTreeNode.isLeaf()) {
            defaultMutableTreeNode = defaultMutableTreeNode.getParent() == null ? (I)defaultTreeModel.getRoot() : (I)defaultMutableTreeNode.getParent();
        }
        if (defaultMutableTreeNode.getLevel() > 3 && bl) {
            return null;
        }
        for (n = 0; n < defaultMutableTreeNode.getChildCount(); ++n) {
            if (f2.o00000((I)defaultMutableTreeNode.getChildAt(n), i2) < 0) continue;
            if (!((I)defaultMutableTreeNode.getChildAt(n)).isLeaf() || !i2.isLeaf() || !((I)defaultMutableTreeNode.getChildAt(n)).\u00d200000().equals(i2.\u00d200000())) break;
            return null;
        }
        defaultTreeModel.insertNodeInto(i2, defaultMutableTreeNode, n);
        return i2;
    }

    public static ArrayList<String> o00000(String string, A a2) {
        String string2 = "";
        return string_0.o00000(string, (I)string_0.o00000().getRoot(), string2);
    }

    public static void o00000(_o _o2) {
        String string = "";
        string_0.o00000(_o2, (I)string_0.o00000().getRoot(), string);
    }

    public static void o00000(final String string) {
        final ArrayList arrayList = new ArrayList();
        string_0.o00000(new _o(){

            @Override
            public void o00000(I i2, String string2) {
                if (i2.isLeaf() && i2.\u00d200000().equals(string)) {
                    arrayList.add(i2);
                }
            }
        });
        DefaultTreeModel defaultTreeModel = string_0.o00000();
        for (I i2 : arrayList) {
            defaultTreeModel.removeNodeFromParent(i2);
        }
    }

    private static ArrayList<String> o00000(String string, I i2, String string2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (i2.isLeaf()) {
            if (i2.\u00d200000().equals(string)) {
                arrayList.add(string2);
            }
        } else {
            string2 = string2 + "\\" + i2.o00000();
            for (int i3 = 0; i3 < i2.getChildCount(); ++i3) {
                arrayList.addAll(string_0.o00000(string, (I)i2.getChildAt(i3), string2));
            }
        }
        return arrayList;
    }

    private static DefaultTreeModel o00000() {
        return (DefaultTreeModel)A.\u00d4O0000().\u00f6O0000().\u00d200000().getModel();
    }

    private static void o00000(_o _o2, I i2, String string) {
        if (i2.isLeaf()) {
            _o2.o00000(i2, string);
        } else {
            string = string + "\\" + i2.o00000();
            _o2.o00000(i2, string);
            for (int i3 = 0; i3 < i2.getChildCount(); ++i3) {
                string_0.o00000(_o2, (I)i2.getChildAt(i3), string);
            }
        }
    }

    private string_0() {
    }

    private static interface _o {
        public void o00000(I var1, String var2);
    }
}

