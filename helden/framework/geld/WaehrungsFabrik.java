/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.MuenzeImpl;
import helden.framework.geld.Waehrung;
import helden.framework.geld.WaehrungImpl;
import helden.framework.geld.WaehrungsCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public final class WaehrungsFabrik
implements WaehrungsCollection {
    private static WaehrungsFabrik \u00d200000;
    private HashMap<String, Waehrung> o00000;

    public static WaehrungsFabrik getInstance() {
        if (\u00d200000 == null) {
            \u00d200000 = new WaehrungsFabrik();
        }
        return \u00d200000;
    }

    private WaehrungsFabrik() {
    }

    @Override
    public Collection<Waehrung> getAllWaehrungen() {
        if (this.o00000 == null) {
            this.o00000();
        }
        return this.o00000.values();
    }

    @Override
    public Collection<String> getAllWaehrungenBezeichner() {
        if (this.o00000 == null) {
            this.o00000();
        }
        ArrayList<String> arrayList = new ArrayList<String>(this.o00000.keySet());
        Collections.sort(arrayList);
        return arrayList;
    }

    @Override
    public Waehrung getWaehrungen(String string) {
        if (this.o00000 == null) {
            this.o00000();
        }
        return this.o00000.get(string);
    }

    private void o00000() {
        this.o00000 = new HashMap();
        WaehrungImpl waehrungImpl = new WaehrungImpl("Mittelreich");
        MuenzeImpl muenzeImpl = new MuenzeImpl("Dukat", "D", 10.0f, 25.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Silbertaler", "S", 1.0f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Heller", "H", 0.1f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Kreuzer", "K", 0.01f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Amazonen");
        muenzeImpl = new MuenzeImpl("Amazonenkronen", "Ak", 12.0f, 30.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Aranien");
        muenzeImpl = new MuenzeImpl("Dinar", "D", 10.0f, 25.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Schekel", "S", 1.0f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Hallah", "H", 0.1f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Kurush", "K", 0.01f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Horasreich");
        muenzeImpl = new MuenzeImpl("Horasdor", "Ho", 200.0f, 500.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Al'Anfa");
        muenzeImpl = new MuenzeImpl("Doublone", "Db", 20.0f, 50.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Oreal", "O", 1.0f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Kleiner Oreal", "o", 0.5f, 2.5f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Dirham", "Di", 0.01f, 3.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Bornland");
        muenzeImpl = new MuenzeImpl("Batzen", "B", 10.0f, 25.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Groschen", "G", 1.0f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Deut", "d", 0.1f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Kalifat");
        muenzeImpl = new MuenzeImpl("Marawedi", "M", 20.0f, 50.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Zechine", "Z", 2.0f, 10.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Muwlat", "m", 0.05f, 2.5f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Trahelien");
        muenzeImpl = new MuenzeImpl("Suvar", "Su", 10.0f, 25.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Hedsch", "He", 1.0f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Ch'ryskl", "Ch", 0.1f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Vallusa");
        muenzeImpl = new MuenzeImpl("Witten", "W", 10.0f, 25.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("St\u00fcber", "St", 1.0f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Flindrich", "f", 0.1f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Zwerge");
        muenzeImpl = new MuenzeImpl("Zwergentaler", "Zt", 12.0f, 25.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
        waehrungImpl = new WaehrungImpl("Xeranien");
        muenzeImpl = new MuenzeImpl("Borbaradstaler", "Bt", 7.0f, 17.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Zholvari", "Zh", 1.0f, 5.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        muenzeImpl = new MuenzeImpl("Splitter", "Sp", 0.14f, 3.0f, waehrungImpl.getBezeichner());
        waehrungImpl.setMuenzen(muenzeImpl.getBezeichner(), muenzeImpl);
        this.o00000.put(waehrungImpl.getBezeichner(), waehrungImpl);
    }
}

