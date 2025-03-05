/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.handwerker.HandwerklicheSpezialisierung;

public class Seiler
extends HandwerklicheSpezialisierung {
    public Seiler() {
        super("Seiler");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Seiler";
        }
        return "Seilerin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.\u00f5\u00f6\u00d5000;
    }
}

