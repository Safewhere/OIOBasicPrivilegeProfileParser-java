package BasicPrivilegeProfileParser;

import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This class represents a parser that parses a valid xml to a list of
 * PrivilegeGroup objects
 *
 * @author LXP
 */
public class PrivilegeGroupParser {

    /**
     * Parse a bpp xml string to a list of PrivilegeGroup *
     *
     *
     * @param based64Xml
     * @return list of PrivilegeGroup
     * @throws java.io.UnsupportedEncodingException
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static List<PrivilegeGroup> Parse(String based64Xml) throws UnsupportedEncodingException, SAXException, IOException, ParserConfigurationException {
        String bppString = new String(Base64.decodeBase64(based64Xml.getBytes()), "UTF-8");
        List<PrivilegeGroup> result = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(bppString)));
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {

            //We have encountered an <employee> tag.
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Element pElement = (Element) node;
                result.add(new PrivilegeGroup(pElement));
            }
        }
        return result;
    }

    /**
     * Convert a list of PrivilegeGroup to a json string
     *
     * @param privilegeGroups
     * @return
     */
    public static String ConvertToJsonString(List<PrivilegeGroup> privilegeGroups) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.toJson(privilegeGroups);
    }
}
