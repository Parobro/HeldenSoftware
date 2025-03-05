/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class I
extends DefaultMutableTreeNode {
    private boolean new;
    private String o00000;
    private String \u00d300000;

    private static String \u00d200000(String string) {
        return string.replace('\\', '/');
    }

    public I(I i2) {
        super(i2.o00000());
        if (i2.isLeaf()) {
            this.\u00d300000 = i2.\u00d200000();
        }
        this.o00000 = i2.o00000();
        this.new = !i2.isLeaf();
    }

    public I(String string, boolean bl) {
        super(I.\u00d200000(string));
        this.o00000 = I.\u00d200000(string);
        this.new = bl;
    }

    public I(String string, String string2) {
        super(I.\u00d200000(string));
        this.\u00d300000 = string2;
        this.o00000 = I.\u00d200000(string);
        this.new = false;
    }

    public String \u00d200000() {
        return this.\u00d300000;
    }

    public String o00000() {
        return this.o00000;
    }

    public void o00000(I i2, int n) {
        int n2 = 0;
        super.insert(i2, n2);
    }

    @Override
    public boolean isLeaf() {
        return !this.new;
    }

    public void o00000(String string) {
        this.o00000 = I.\u00d200000(string);
    }

    @Override
    public void setUserObject(Object object) {
        if (object != null && !object.toString().equals("Neu")) {
            this.userObject = object;
        }
    }
}

