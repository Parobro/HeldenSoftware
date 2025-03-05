/*
 * Decompiled with CFR 0.152.
 */
package helden.cloudinterface;

import helden.framework.OOoO.R;
import java.util.List;

public interface HeldenContainer {
    public String getHeldenKey();

    public String getKultur();

    public String getName();

    public String getProfession();

    public String getRasse();

    public List<R> getSteigerungsKostenTalent();

    public long getTime();

    public String getXML() throws Exception;

    public String steigereTalent(String var1, int var2);
}

