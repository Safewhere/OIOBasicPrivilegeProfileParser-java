package BasicPrivilegeProfileParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * This class represents a privilege group in a basic privilege profile
 *
 * @author LXP
 */
public class PrivilegeGroup {

    private String scope;
    private Privilege privilege;
    private List<Constraint> constraints;

    /**
     * Initializes a new instance of the PrivilegeGroup class by an xml element
     * *
     *
     *
     * @param element
     * @throws java.io.IOException
     */
    public PrivilegeGroup(Element element) throws IOException {
        if (element == null) {
            throw new IOException("nill reference exception: privilege element");
        }

        //Extract Constraints
        this.constraints = new ArrayList<Constraint>();
        NodeList nConstraintList = element.getElementsByTagName("Constraint");
        if (nConstraintList.getLength() > 0) {
            for (int temp = 0; temp < nConstraintList.getLength(); temp++) {
                Node nNode = nConstraintList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eConstraint = (Element) nNode;
                    this.constraints.add(new Constraint(eConstraint));
                }
            }
        }

        //Extract Scope and Privilege's type
        String scopeAndCvr = element.getAttributes().getNamedItem("Scope").getNodeValue();
        int lastIndexOfSemiColon = scopeAndCvr.lastIndexOf(":");
        this.scope = scopeAndCvr.substring(0, lastIndexOfSemiColon);
        String privilegeCvr = scopeAndCvr.substring(lastIndexOfSemiColon + 1);

        //Extract Privilege
        NodeList nPrivilegeList = element.getElementsByTagName("Privilege");
        if (nPrivilegeList.getLength() != 1) {
            throw new IOException("each privilege group must have one and only one privilege element");
        }
        Node nPrivilegeNode = nPrivilegeList.item(0);
        if (nPrivilegeNode.getNodeType() != Node.ELEMENT_NODE) {
            throw new IOException("a privilege in each privilege group must be an xml element node");
        }
        Element ePrivilege = (Element) nPrivilegeNode;

        this.privilege = new Privilege(ePrivilege.getTextContent(), privilegeCvr);
    }

    /**
     * @return Scope of a privilege group
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return Privilege of a privilege group
     */
    public Privilege getPrivilege() {
        return this.privilege;
    }

    /**
     * @return A constraints list of a privilege group
     */
    public List<Constraint> getConstraints() {
        return this.constraints;
    }
}
