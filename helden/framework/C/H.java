/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import java.util.HashMap;

public class H {
    private HashMap<String, String> o00000;

    public H() {
        this.o00000();
    }

    public String o00000(String string) {
        if (this.o00000.get(string) != null) {
            return this.o00000.get(string);
        }
        if (string.startsWith("\u00dcbernat\u00fcrliche")) {
            return "\u00dcB " + string.substring("\u00dcbernat\u00fcrliche Begabung".length());
        }
        if (string.startsWith("Unf\u00e4higkeit f\u00fcr [Talentgruppe]")) {
            return "U[TG] " + string.substring("Unf\u00e4higkeit f\u00fcr [Talentgruppe]".length());
        }
        if (string.startsWith("Unf\u00e4higkeit f\u00fcr [Talent]")) {
            return "U[T] " + string.substring("Unf\u00e4higkeit f\u00fcr [Talent]".length());
        }
        if (string.startsWith("Unf\u00e4higkeit f\u00fcr [Merkmal]")) {
            return "U[M] " + string.substring("Unf\u00e4higkeit f\u00fcr [Merkmal]".length());
        }
        if (string.startsWith("Begabung f\u00fcr [Merkmal]")) {
            return "B[M] " + string.substring("Begabung f\u00fcr [Merkmal]".length());
        }
        if (string.startsWith("Begabung f\u00fcr [Ritual]")) {
            return "B[R] " + string.substring("Begabung f\u00fcr [Ritual]".length());
        }
        if (string.startsWith("Begabung f\u00fcr [Talentgruppe]")) {
            return "B[TG] " + string.substring("Begabung f\u00fcr [Talentgruppe]".length());
        }
        if (string.startsWith("Begabung f\u00fcr [Talent]")) {
            return "B[T] " + string.substring("Begabung f\u00fcr [Talent]".length());
        }
        if (string.startsWith("Begabung f\u00fcr [Zauber]")) {
            return "B[Z] " + string.substring("Begabung f\u00fcr [Zauber]".length());
        }
        if (string.startsWith("Akademische Ausbildung (Gelehrter)")) {
            return "AK (Gelehrter) " + string.substring("Akademische Ausbildung (Gelehrter)".length());
        }
        if (string.startsWith("Akademische Ausbildung (Krieger)")) {
            return "AK (Krieger) " + string.substring("Akademische Ausbildung (Krieger)".length());
        }
        if (string.startsWith("Akademische Ausbildung (Magier)")) {
            return "AK (Magier) " + string.substring("Akademische Ausbildung (Magier)".length());
        }
        if (string.startsWith("Breitgef\u00e4cherte Bildung")) {
            return "BgB " + string.substring("Breitgef\u00e4cherte Bildung".length());
        }
        if (string.startsWith("Herausragende Eigenschaft")) {
            return "HE " + string.substring("Herausragende Eigenschaft".length());
        }
        if (string.startsWith("Herausragender Sechster Sinn")) {
            return "H6S " + string.substring("Herausragender Sechster Sinn".length());
        }
        if (string.startsWith("Herausragender Sinn")) {
            return "HS " + string.substring("Herausragender Sinn".length());
        }
        if (string.startsWith("Niedrige Schlechte Eigenschaft")) {
            return "NSE " + string.substring("Niedrige Schlechte Eigenschaft".length());
        }
        if (string.startsWith("Soziale Anpassungsf\u00e4higkeit")) {
            return "Soz. Anpass. " + string.substring("Soziale Anpassungsf\u00e4higkeit".length());
        }
        if (string.startsWith("Meisterhandwerk")) {
            return "MH " + string.substring("Meisterhandwerk".length());
        }
        if (string.startsWith("Miserable Eigenschaft")) {
            return "ME " + string.substring("Miserable Eigenschaft".length());
        }
        if (string.startsWith("Moralkodex ")) {
            return "MK " + string.substring("Moralkodex ".length());
        }
        return string;
    }

    public String o00000(String string, String string2) {
        if (this.o00000.get(string) != null) {
            return this.o00000.get(string);
        }
        return string;
    }

    private void o00000() {
        this.o00000 = new HashMap();
    }
}

