/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginTreeNode {
    public ArrayList<DatenPluginTreeNode> getChilds();

    public String getID();

    public String getName();

    public boolean isLeaf();
}

