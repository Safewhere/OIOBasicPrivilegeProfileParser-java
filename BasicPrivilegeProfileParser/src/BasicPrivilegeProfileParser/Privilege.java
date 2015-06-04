package BasicPrivilegeProfileParser;

/**
 * This class represents the privilege of a privilege group
 *
 * @author LXP
 */
public class Privilege {

    private String type;
    private String cvr;

    /**
     * Initializes a new instance of the privilege class with a type and a cvr
     *
     *
     * @param type a string that represents type of a privilege object
     * @param cvr a string that represents cvr of a privilege object
     */
    public Privilege(String type, String cvr) {
        this.type = type;
        this.cvr = cvr;
    }

    /**
     * Type of a privilege
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    /**
     * Cvr of a privilege
     *
     * @param cvr
     */
    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public String getCvr() {
        return this.cvr;
    }
}
