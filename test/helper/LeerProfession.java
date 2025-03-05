/*
 * Decompiled with CFR 0.152.
 */
package test.helper;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.super;

public class LeerProfession
extends super {
    public LeerProfession() {
    }

    public LeerProfession(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    @Override
    public String getID() {
        return "P00";
    }

    @Override
    public String toString() {
        return "Professionslos";
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }
}

