/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2;

import java.util.ArrayList;

public interface PluginTreeNode {
    public ArrayList<PluginTreeNode> getChilds();

    public String getID();

    public String getName();

    public boolean isLeaf();
}

