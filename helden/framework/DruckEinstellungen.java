/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

import helden.framework.DruckSeitenEintrag;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DruckEinstellungen
implements Cloneable {
    private Set<DruckSeitenEintrag> OO0000 = new HashSet<DruckSeitenEintrag>();
    private boolean \u00f800000 = false;
    private String if = "#";
    private boolean \u00d3O0000 = true;
    private boolean \u00d400000 = false;
    private boolean o00000 = false;
    private boolean \u00d500000 = false;
    private boolean oO0000 = false;
    private boolean while = false;
    private boolean return = false;
    private int new = 20;
    private Color \u00f500000 = new Color(255, 255, 255, 140);
    private boolean \u00f400000 = true;
    private boolean \u00d300000 = false;
    private String \u00d800000 = "";

    public Object clone() {
        DruckEinstellungen druckEinstellungen = new DruckEinstellungen();
        for (DruckSeitenEintrag druckSeitenEintrag : this.OO0000) {
            druckEinstellungen.getSet().add(druckSeitenEintrag.clone());
        }
        druckEinstellungen.setBuchdruck(this.\u00f800000);
        druckEinstellungen.setZonenruestung(this.\u00d3O0000);
        druckEinstellungen.setBackgroudPath(this.if);
        druckEinstellungen.setDsa40stufe(this.\u00d400000);
        druckEinstellungen.setMetatalentedrucken(this.o00000);
        druckEinstellungen.setMetatalentedrucken(this.isMetatalentedrucken());
        druckEinstellungen.setZauberkommentar(this.\u00d500000);
        druckEinstellungen.setZonenRSTeiler(this.new);
        druckEinstellungen.setASPLeiste(this.\u00f400000);
        druckEinstellungen.setWundmaennchenPfad(this.\u00d800000);
        return druckEinstellungen;
    }

    public String getBackgroudPath() {
        return this.if;
    }

    public Color getBlockfarbe() {
        return this.\u00f500000;
    }

    public DruckEinstellungen getClone() {
        return (DruckEinstellungen)this.clone();
    }

    public DruckSeitenEintrag getSeitenEinstellungen(String string) {
        for (DruckSeitenEintrag druckSeitenEintrag : this.OO0000) {
            if (!druckSeitenEintrag.getBezeichner().equals(string)) continue;
            return druckSeitenEintrag;
        }
        return null;
    }

    public Set<DruckSeitenEintrag> getSet() {
        return this.OO0000;
    }

    public String getWundmaennchenPfad() {
        return this.\u00d800000;
    }

    public int getZonenRSTeiler() {
        return this.new;
    }

    public boolean isAspLeiste() {
        return this.\u00f400000;
    }

    public boolean isBuchdruck() {
        return this.\u00f800000;
    }

    public boolean isDrucken(String string) {
        for (DruckSeitenEintrag druckSeitenEintrag : this.OO0000) {
            if (!druckSeitenEintrag.getBezeichner().equals(string)) continue;
            return druckSeitenEintrag.isDrucken();
        }
        return true;
    }

    public boolean isDsa40stufe() {
        return this.\u00d400000;
    }

    public boolean isGeldkreise() {
        return this.while;
    }

    public boolean isMetatalentedrucken() {
        return this.o00000;
    }

    public boolean isMetaWDEdrucken() {
        return this.\u00d300000;
    }

    public boolean isSignieren() {
        return this.oO0000;
    }

    public boolean isTierfeld() {
        return this.return;
    }

    public boolean isZauberkommentar() {
        return this.\u00d500000;
    }

    public boolean isZonenRuestung() {
        return this.\u00d3O0000;
    }

    public void setASPLeiste(boolean bl) {
        this.\u00f400000 = bl;
    }

    public void setBackgroudPath(String string) {
        this.if = string;
    }

    public void setBlockfarbe(Color color) {
        this.\u00f500000 = color;
    }

    public void setBuchdruck(boolean bl) {
        this.\u00f800000 = bl;
    }

    public void setDsa40stufe(boolean bl) {
        this.\u00d400000 = bl;
    }

    public void setGeldkreise(boolean bl) {
        this.while = bl;
    }

    public void setMetatalentedrucken(boolean bl) {
        this.o00000 = bl;
    }

    public void setMetaWDEdrucken(boolean bl) {
        this.\u00d300000 = bl;
    }

    public void setSignieren(boolean bl) {
        this.oO0000 = bl;
    }

    public void setTierfeld(boolean bl) {
        this.return = bl;
    }

    public void setWundmaennchenPfad(String string) {
        this.\u00d800000 = string;
    }

    public void setZauberkommentar(boolean bl) {
        this.\u00d500000 = bl;
    }

    public void setZonenRSTeiler(int n) {
        this.new = n;
    }

    public void setZonenruestung(boolean bl) {
        this.\u00d3O0000 = bl;
    }

    public void uebernehme(DruckEinstellungen druckEinstellungen) {
        this.getSet().clear();
        for (DruckSeitenEintrag druckSeitenEintrag : druckEinstellungen.getSet()) {
            this.getSet().add(druckSeitenEintrag.clone());
        }
        this.setBuchdruck(druckEinstellungen.isBuchdruck());
        this.setZonenruestung(druckEinstellungen.isZonenRuestung());
        this.setBackgroudPath(druckEinstellungen.getBackgroudPath());
        this.setDsa40stufe(druckEinstellungen.isDsa40stufe());
        this.setMetatalentedrucken(druckEinstellungen.isMetatalentedrucken());
        this.setMetaWDEdrucken(druckEinstellungen.isMetaWDEdrucken());
        this.setZauberkommentar(druckEinstellungen.isZauberkommentar());
        this.setZonenRSTeiler(druckEinstellungen.getZonenRSTeiler());
        this.setWundmaennchenPfad(druckEinstellungen.getWundmaennchenPfad());
    }
}

