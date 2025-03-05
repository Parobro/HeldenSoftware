/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.D.D;
import helden.framework.D.P;
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class return {
    private Map<String, String> super = new HashMap<String, String>();

    public String o00000(public public_) {
        String string = "";
        if (public_ instanceof M) {
            M m = (M)public_;
            for (Object object : m.intsuper().toArray()) {
                if (!string.isEmpty()) {
                    string = string + ", ";
                }
                string = string + this.o00000(public_, object);
            }
        } else {
            string = this.o00000(public_.toString());
        }
        if (string == null) {
            return "";
        }
        return string;
    }

    public String o00000(String string) {
        String string2 = this.super.get(string);
        return string2;
    }

    public Map<String, String> o00000() {
        return this.super;
    }

    public String o00000(P p2) {
        return this.o00000(D.o00000(p2));
    }

    public String o00000(public public_, Object object) {
        String string = this.o00000(public_.toString() + " " + object);
        if (string == null) {
            return "";
        }
        return string;
    }

    public void \u00d200000(String string) {
        if (this.super.get(string) != null) {
            this.super.remove(string);
        }
    }

    public void o00000(String string, String string2) {
        this.super.put(string, string2);
    }
}

