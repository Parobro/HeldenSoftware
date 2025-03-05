/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.framework.OoOO.private;
import helden.framework.int.C;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ModVerwaltung {
    private Document new;
    Map<String, Node> o00000 = new HashMap<String, Node>();

    public ModVerwaltung(Document document) {
        this.new = document;
    }

    public void add(private private_) {
        if (this.o00000.containsKey(private_.getID())) {
            return;
        }
        this.o00000.put(private_.getID(), private_.\u00d2\u00f40000());
    }

    public void add(C c) {
        if (this.o00000.containsKey(c.o\u00f60000())) {
            return;
        }
        this.o00000.put(c.o\u00f60000(), c.\u00d2\u00f60000());
    }

    public Set<Map.Entry<String, Node>> getAll() {
        return this.o00000.entrySet();
    }

    public Document getDoc() {
        return this.new;
    }
}

