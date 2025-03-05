/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.OooO.A
 */
public final class a_0 {
    public static void o00000(Document document, File file) throws TransformerException, IOException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty("indent", "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty("encoding", "UTF-8");
        StreamResult streamResult = new StreamResult(file);
        DOMSource dOMSource = new DOMSource(document);
        transformer.transform(dOMSource, streamResult);
    }

    public static String o00000(Document document) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("indent", "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            StreamResult streamResult = new StreamResult(new StringWriter());
            DOMSource dOMSource = new DOMSource(document);
            transformer.transform(dOMSource, streamResult);
            return streamResult.getWriter().toString();
        }
        catch (Exception exception) {
            return exception.toString();
        }
    }

    public static String o00000(Document document, String string) {
        XPath xPath = XPathFactory.newInstance().newXPath();
        try {
            XPathExpression xPathExpression = xPath.compile(string);
            Object object = xPathExpression.evaluate(document, XPathConstants.STRING);
            return (String)object;
        }
        catch (Exception exception) {
            System.out.println("Fehlerhafter xpath-Ausdruck: " + string);
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            return null;
        }
    }

    public static NodeList new(Document document, String string) {
        XPath xPath = XPathFactory.newInstance().newXPath();
        try {
            XPathExpression xPathExpression = xPath.compile(string);
            Object object = xPathExpression.evaluate(document, XPathConstants.NODESET);
            NodeList nodeList = (NodeList)object;
            return nodeList;
        }
        catch (Exception exception) {
            System.out.println("Fehlerhafter xpath-Ausdruck: " + string);
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            System.out.println("====");
            return null;
        }
    }

    public static ArrayList<Node> o00000(Node node) {
        ArrayList<Node> arrayList = new ArrayList<Node>();
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeType() != 1) continue;
            arrayList.add(node2);
        }
        return arrayList;
    }

    private a_0() {
    }
}

