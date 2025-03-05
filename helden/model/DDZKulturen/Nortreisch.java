/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Bergmann;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Fuhrmann;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Schiffer;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.DDZprofessionen.Streuner;
import helden.model.DDZprofessionen.Tageloehner;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.Wundarzt;
import helden.model.kultur.SvellttalOkkupanten;
import helden.model.profession.Schamane;
import java.util.ArrayList;
import java.util.Iterator;

public class Nortreisch
extends SvellttalOkkupanten {
    public Nortreisch() {
    }

    public Nortreisch(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K80";
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (this.istVariante(returnStringreturn)) {
            basisDDZProfessionMitGeweihter = new Bauer(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getErntehelfer());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getFeldsklave());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getKnecht());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getLeibeigener());
            arrayList.add(basisDDZProfessionMitGeweihter);
            l2 = new Tageloehner(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Tageloehner)l2).getBauhelfer());
            l2.addMoeglicheVariante(((Tageloehner)l2).getHolzfaeller());
            arrayList.add(l2);
        }
        if (this.istVariante(\u00d3\u00f8\u00f8000)) {
            basisDDZProfessionMitGeweihter = new Bauer(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getFreibauer());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getViehzuechter());
            arrayList.add(basisDDZProfessionMitGeweihter);
            arrayList.add(new Bergmann(this.getGeschlecht(), g2, g3));
            arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
            arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
            l2 = new Prospektor(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Prospektor)l2).getGoldsucher());
            l2.addMoeglicheVariante(((Prospektor)l2).getSammler());
            arrayList.add(l2);
        }
        if (this.istVariante(o\u00f8\u00f8000)) {
            arrayList.add(new Haendler(this.getGeschlecht(), g2, g3));
            arrayList.add(new Fuhrmann(this.getGeschlecht(), g2, g3));
            arrayList.add(new Schiffer(this.getGeschlecht(), g2, g3));
            arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
            arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
            arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
            arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
            basisDDZProfessionMitGeweihter = new Haendler(this.getGeschlecht(), g2, g3);
            arrayList.remove(basisDDZProfessionMitGeweihter);
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Haendler)basisDDZProfessionMitGeweihter).getTauschhaendler());
            arrayList.add(basisDDZProfessionMitGeweihter);
            l2 = new Handwerker(this.getGeschlecht(), g2, g3);
            l2.addMoeglicheVariante(((Handwerker)l2).getArchaischeOrk());
            arrayList.add(l2);
        }
        if (this.istVariante(\u00d4\u00f8\u00f8000)) {
            arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
            arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
            basisDDZProfessionMitGeweihter = new Jaeger(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.removeMoeglicheVariante(((Jaeger)basisDDZProfessionMitGeweihter).getWildhueter());
            arrayList.add(basisDDZProfessionMitGeweihter);
            arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
            arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
            l2 = new Stammeskrieger(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Stammeskrieger)l2).getOrk());
            arrayList.add(l2);
            arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        }
        if (this.istVariante(newStringreturn)) {
            basisDDZProfessionMitGeweihter = new Stammeskrieger(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Stammeskrieger)basisDDZProfessionMitGeweihter).getOrk());
            arrayList.add(basisDDZProfessionMitGeweihter);
            arrayList.add(new Goetterdiener(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            l2 = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Schamane)l2).getTairachPriester());
            l2.addMoeglicheVariante(((Schamane)l2).getGraveshPriester());
            l2.addMoeglicheVariante(((Schamane)l2).getGraveshPriesterGeweiht());
            l2.addMoeglicheVariante(((Schamane)l2).getRakaiPriester());
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for<String>("Nordprovinzen", while.\u00d2o\u00f5000, false));
        arrayList.add(new for(while.nullnewsuper));
        arrayList.add(new for(while.\u00f5\u00d30000));
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Nortreisch");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                P p2 = iterator.next();
                stringBuffer.append(p2.toString());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }
}

