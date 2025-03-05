/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2.oOOO;

import helden.gui.allgemein.new.I;
import helden.plugin.werteplugin2.PluginTreeNode;
import java.util.ArrayList;

public class B
implements PluginTreeNode {
    private I o00000;

    public B(I i2) {
        this.o00000 = i2;
    }

    @Override
    public ArrayList<PluginTreeNode> getChilds() {
        ArrayList<PluginTreeNode> arrayList = new ArrayList<PluginTreeNode>();
        for (int i2 = 0; i2 < this.o00000.getChildCount(); ++i2) {
            arrayList.add(new B((I)this.o00000.getChildAt(i2)));
        }
        return arrayList;
    }

    @Override
    public String getID() {
        return this.o00000.\u00d200000();
    }

    @Override
    public String getName() {
        return this.o00000.o00000();
    }

    @Override
    public boolean isLeaf() {
        return this.o00000.isLeaf();
    }
}

