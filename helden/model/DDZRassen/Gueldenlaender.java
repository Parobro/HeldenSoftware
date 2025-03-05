/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZRassen;

import helden.framework.Geschlecht;
import helden.framework.int.OooO;
import helden.model.DDZKulturen.AlMada;
import helden.model.DDZKulturen.Alhanien;
import helden.model.DDZKulturen.AndergastNostria;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.Cyclopea;
import helden.model.DDZKulturen.Haranija;
import helden.model.DDZKulturen.Nordprovinzen;
import helden.model.DDZKulturen.Nortreisch;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.DDZKulturen.Tulamidenlande;
import helden.model.kultur.SvellttalOkkupanten;
import helden.model.rasse.Mittellaender;
import java.util.ArrayList;

public class Gueldenlaender
extends Mittellaender {
    public Gueldenlaender() {
    }

    public Gueldenlaender(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "R19";
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        ArrayList<OooO> arrayList = new ArrayList<OooO>();
        arrayList.add(new BosparanischesReich(this.getGeschlecht()));
        arrayList.add(new Cyclopea(this.getGeschlecht()));
        arrayList.add(new Nordprovinzen(this.getGeschlecht()));
        arrayList.add(new AndergastNostria(this.getGeschlecht()));
        arrayList.add(new Suedaventurien(this.getGeschlecht()));
        arrayList.add(new AlMada(this.getGeschlecht()));
        if (!bl) {
            arrayList.add(new Alhanien(this.getGeschlecht()));
            arrayList.add(new Haranija(this.getGeschlecht()));
            arrayList.add(new Tulamidenlande(this.getGeschlecht()));
            Nortreisch nortreisch = new Nortreisch(this.getGeschlecht());
            nortreisch.clearMoeglicheVarianten();
            nortreisch.addMoeglicheVariante(SvellttalOkkupanten.returnStringreturn);
            arrayList.add(nortreisch);
        }
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "G\u00fcldenl\u00e4nder";
        }
        return "G\u00fcldenl\u00e4nderin";
    }
}

