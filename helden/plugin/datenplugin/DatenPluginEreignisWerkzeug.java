/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginEreignis;
import java.util.ArrayList;

public interface DatenPluginEreignisWerkzeug {
    public ArrayList<String> getEreignisarten();

    public ArrayList<DatenPluginEreignis> getEreignisse();

    public DatenPluginEreignis getLast();

    public boolean undo();

    public boolean undoMoeglich();
}

