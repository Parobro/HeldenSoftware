/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginSonderfertigkeit;
import helden.plugin.datenplugin.DatenPluginTalent;
import helden.plugin.datenplugin.DatenPluginVerbindungen;
import helden.plugin.datenplugin.DatenPluginVorteil;
import helden.plugin.datenplugin.DatenPluginZauber;
import java.util.ArrayList;

public interface DatenPluginSteigernWerkzeug {
    public boolean addPluginVorteil(DatenPluginVorteil var1);

    public boolean addVerbindung(String var1, int var2, String var3);

    public boolean entferneAP(int var1);

    public boolean erhoeheAP(int var1);

    public boolean erhoeheAttacke(DatenPluginTalent var1);

    public boolean erhoeheEigenschaft(String var1, boolean var2);

    public boolean erhoeheParade(DatenPluginTalent var1);

    public boolean erhoeheTalentWert(DatenPluginTalent var1, boolean var2);

    public boolean erhoeheZauber(DatenPluginZauber var1, boolean var2);

    public boolean erwerbeSonderfetigkeit(DatenPluginSonderfertigkeit var1, boolean var2);

    public int getAnzahlFreiePunkt(DatenPluginTalent var1);

    public int getEigenschaftsKosten(String var1, boolean var2);

    public int getKostenZurueckkaufenAsp(boolean var1);

    public int getMaxLirturgiekenntnisPunkte();

    public int getMaxRitualkenntnisPunkte();

    public int getNachteilRueckkaufKosten(DatenPluginVorteil var1, boolean var2);

    public String getSchutzPlugin();

    public int getSonderfetigkeitsKosten(DatenPluginSonderfertigkeit var1, boolean var2);

    public int getTalentKosten(DatenPluginTalent var1, boolean var2);

    public ArrayList<DatenPluginVerbindungen> getVerbindungen();

    public int getZauberKosten(DatenPluginZauber var1, boolean var2);

    public boolean gibHeldFrei(boolean var1);

    public boolean istEigenschaftsErhoehungMoeglich(String var1);

    public boolean istHeldGeschuetzt();

    public boolean istSonderFertigkeitsErwerbMoeglich(DatenPluginSonderfertigkeit var1);

    public boolean istTalentWertErhoehungMoeglich(DatenPluginTalent var1);

    public boolean istZauberWertErhoehungMoeglich(DatenPluginZauber var1);

    public boolean kaufeAspZurueck();

    public boolean kaufeNachteilZurueck(DatenPluginVorteil var1, boolean var2);

    public boolean macheGrosseMeditation(int var1);

    public boolean macheKarmalQueste(int var1);

    public boolean removeVerbindung(String var1);

    public boolean schuetzeHeld();

    public boolean senkeAspPermanent(int var1);

    public boolean veraendereVorteilNachteilWert(DatenPluginVorteil var1, int var2);
}

