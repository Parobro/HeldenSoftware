/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.wellenkind;

import helden.model.myranor.profession.wellenkind.WellenkindVariante;

public class Wellenkinder
extends WellenkindVariante {
    public Wellenkinder() {
        super("Wellenkind", "Wellenkind", 5, false);
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

