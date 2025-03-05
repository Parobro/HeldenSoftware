/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.plugin.HeldenPlugin;
import javax.swing.JFrame;
import org.w3c.dom.Document;

@Deprecated
public interface HeldenDOMDocumentPlugin
extends HeldenPlugin {
    public static final String DOMDOCUMENT = "dom document execute";

    public Document doWork(JFrame var1, Document var2);
}

