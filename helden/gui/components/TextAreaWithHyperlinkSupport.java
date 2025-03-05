/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.comm.CommUtilities;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.UIManager;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

public class TextAreaWithHyperlinkSupport
extends JEditorPane {
    public TextAreaWithHyperlinkSupport(String string) {
        super("text/html", string);
        this.setEditable(false);
        this.setOpaque(false);
        Font font = UIManager.getFont("Label.font");
        String string2 = "body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
        ((HTMLDocument)this.getDocument()).getStyleSheet().addRule(string2);
        this.addHyperlinkListener(new HyperlinkListener(){

            @Override
            public void hyperlinkUpdate(HyperlinkEvent hyperlinkEvent) {
                if (hyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED && !(hyperlinkEvent instanceof HTMLFrameHyperlinkEvent)) {
                    CommUtilities.showInBrowser(hyperlinkEvent.getURL().toString());
                }
            }
        });
    }
}

