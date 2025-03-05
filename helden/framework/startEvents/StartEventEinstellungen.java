/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.startEvents;

import helden.framework.startEvents.StartEvent;
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class StartEventEinstellungen {
    private Map<String, StartEvent> super = new HashMap<String, StartEvent>();

    public StartEventEinstellungen() {
        this.super();
    }

    public boolean checkEvent(String string) {
        return this.getEvent(string).istAktive();
    }

    public StartEvent getEvent(String string) {
        return this.super.get(string);
    }

    public Map<String, StartEvent> getMap() {
        return this.super;
    }

    private void super() {
        StartEvent startEvent = new StartEvent("einmalig", 2, 0L);
        this.super(startEvent);
        startEvent = new StartEvent("einmaligmessage", 2, 0L);
        this.super(startEvent);
        startEvent = new StartEvent("dayly", 0, 65000L);
        this.super(startEvent);
        startEvent = new StartEvent("weekly", 0, 600000L);
        this.super(startEvent);
        startEvent = new StartEvent("mounth", 0, 2500000L);
        this.super(startEvent);
        startEvent = new StartEvent("alle20starts", 1, 20L);
        this.super(startEvent);
    }

    private void super(StartEvent startEvent) {
        this.super.put(startEvent.getKey(), startEvent);
    }
}

