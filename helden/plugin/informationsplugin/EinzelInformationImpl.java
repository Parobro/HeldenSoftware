/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.informationsplugin;

import helden.plugin.informationsplugin.EinzelInformation;
import java.util.HashMap;
import java.util.Map;

public class EinzelInformationImpl
implements EinzelInformation {
    private Map<String, String> o00000 = new HashMap<String, String>();

    EinzelInformationImpl() {
    }

    @Override
    public String getInfo(String string) {
        String string2 = this.o00000.get(string.toLowerCase());
        if (string2 == null) {
            return "";
        }
        return string2;
    }

    @Override
    public Map<String, String> getInfos() {
        return this.o00000;
    }
}

