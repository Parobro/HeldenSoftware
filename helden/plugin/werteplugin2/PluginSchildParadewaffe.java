/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2;

import helden.plugin.werteplugin.PluginSchild;

public interface PluginSchildParadewaffe
extends PluginSchild {
    public String getBenutzungsart();

    public String getName();

    public int getParade();

    @Override
    public String toString();
}

