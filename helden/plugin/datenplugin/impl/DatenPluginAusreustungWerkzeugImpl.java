/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.E.F;
import helden.framework.held.O;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.plugin.datenplugin.DatenPluginAusreustungWerkzeug;
import helden.plugin.datenplugin.DatenPluginFernkampfWaffe;
import helden.plugin.datenplugin.DatenPluginGegenstand;
import helden.plugin.datenplugin.DatenPluginNahkampfWaffe;
import helden.plugin.datenplugin.DatenPluginRuestungsTeil;
import helden.plugin.datenplugin.DatenPluginSchildParadewaffe;
import helden.plugin.datenplugin.DatenPluginTalent;
import java.util.ArrayList;

public class DatenPluginAusreustungWerkzeugImpl
implements DatenPluginAusreustungWerkzeug {
    private O o00000;

    public DatenPluginAusreustungWerkzeugImpl(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.o00000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d8o0000();
    }

    @Override
    public boolean addGegenstand(DatenPluginGegenstand datenPluginGegenstand, int n) {
        this.o00000.new((F)datenPluginGegenstand.getObject(), n);
        return true;
    }

    @Override
    public boolean addRuestungsteil(int n, DatenPluginRuestungsTeil datenPluginRuestungsTeil) {
        return false;
    }

    @Override
    public boolean aendereAnzahl(DatenPluginGegenstand datenPluginGegenstand, int n) {
        return false;
    }

    @Override
    public ArrayList<DatenPluginFernkampfWaffe> getFernkampfwaffen(DatenPluginGegenstand datenPluginGegenstand) {
        return null;
    }

    @Override
    public ArrayList<DatenPluginNahkampfWaffe> getNahkampfwaffen(DatenPluginGegenstand datenPluginGegenstand) {
        return null;
    }

    @Override
    public ArrayList<DatenPluginRuestungsTeil> getRuestungsteil(DatenPluginGegenstand datenPluginGegenstand) {
        return null;
    }

    @Override
    public ArrayList<DatenPluginSchildParadewaffe> getSchildParadewaffe(DatenPluginGegenstand datenPluginGegenstand) {
        return null;
    }

    @Override
    public boolean removeGegenstand(DatenPluginGegenstand datenPluginGegenstand, int n) {
        return false;
    }

    @Override
    public boolean removeRuestungsteil(int n, DatenPluginRuestungsTeil datenPluginRuestungsTeil) {
        return false;
    }

    @Override
    public boolean setBeidhaendigerKampfSlot12(int n, boolean bl) {
        return false;
    }

    @Override
    public boolean setBeidhaendigerKampfSlot34(int n, boolean bl) {
        return false;
    }

    @Override
    public boolean setBenutzeHand(int n, int n2, boolean bl) {
        return false;
    }

    @Override
    public boolean setFernkampfWaffe(int n, int n2, DatenPluginFernkampfWaffe datenPluginFernkampfWaffe) {
        return false;
    }

    @Override
    public boolean setKombination(int n, int n2, int n3, boolean bl) {
        return false;
    }

    @Override
    public boolean setNahkampfWaffe(int n, int n2, DatenPluginNahkampfWaffe datenPluginNahkampfWaffe) {
        return false;
    }

    @Override
    public boolean setSchildParadefWaffe(int n, int n2, DatenPluginSchildParadewaffe datenPluginSchildParadewaffe) {
        return false;
    }

    @Override
    public boolean waehleSchildParadewaffeArt(boolean bl) {
        return false;
    }

    @Override
    public boolean weahleNahkampftalent(int n, int n2, DatenPluginTalent datenPluginTalent) {
        return false;
    }

    @Override
    public boolean wirdBenutzt(DatenPluginGegenstand datenPluginGegenstand) {
        return false;
    }
}

