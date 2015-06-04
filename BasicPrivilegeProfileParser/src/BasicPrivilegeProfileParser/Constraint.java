package BasicPrivilegeProfileParser;

import org.w3c.dom.Element;

/**
 * This class represents a constraint of basic privilege profile.
 *
 * @author LXP
 */
public class Constraint {

    private String name;
    private String value;

    /**
     * Initializes a new instance of the constraint class by an xml element 
     *
     * @param empEl a constraint xml parameter
     */
    public Constraint(Element empEl) {
        this.value = empEl.getFirstChild().getNodeValue();
        this.name = empEl.getAttributes().getNamedItem("Name").getNodeValue();
    }

    /**
     * Name of a constraint
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Value of a constraint
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
