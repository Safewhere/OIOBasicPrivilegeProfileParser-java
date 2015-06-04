package privilegegroupparsertests;

import BasicPrivilegeProfileParser.PrivilegeGroup;
import BasicPrivilegeProfileParser.PrivilegeGroupParser;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * This class is used to test BasicPrivilegeParser
 *
 * @author LXP
 */
public class PrivilegeGroupParserTests {

    /**
     * Parse a bpp xml to a list of PrivilegeGroup successfully
     *
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, Exception {
        String base64XmlBppValue = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4NCjxicHA6UHJpdmlsZWdlTGlzdCB4bWxuczpicHA9Imh0dHA6Ly9pdHN0LmRrL29pb3NhbWwvYmFzaWNfcHJpdmlsZWdlX3Byb2ZpbGUiIHhtbG5zOnhzaT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS9YTUxTY2hlbWEtaW5zdGFuY2UiPg0KICA8UHJpdmlsZWdlR3JvdXAgU2NvcGU9InVybjpkazpnb3Y6c2FtbDpjdnJOdW1iZXJJZGVudGlmaWVyOjEyMzQ1Njc4Ij4NCiAgICA8UHJpdmlsZWdlPmh0dHA6Ly9zYXBhLnRlc3Qta29tYml0LmRrL3JvbGVzL3VzZXJzeXN0ZW1yb2xlL3dpdGhEUi8xPC9Qcml2aWxlZ2U+DQogICAgPENvbnN0cmFpbnQgTmFtZT0iaHR0cDovL29yZ2FuaXNhdGlvbi50ZXN0LWtvbWJpdC5kay9jb25zdHJhaW50cy9LTEUiPjI8L0NvbnN0cmFpbnQ+DQogICAgPENvbnN0cmFpbnQgTmFtZT0iaHR0cDovL29yZ2FuaXNhdGlvbi50ZXN0LWtvbWJpdC5kay9jb25zdHJhaW50cy9TZW5zaXRpdml0eSI+SGlnaDwvQ29uc3RyYWludD4NCiAgPC9Qcml2aWxlZ2VHcm91cD4NCiAgPFByaXZpbGVnZUdyb3VwIFNjb3BlPSJ1cm46ZGs6Z292OnNhbWw6Y3ZyTnVtYmVySWRlbnRpZmllcjoxMjM0NTY3OCI+DQogICAgPFByaXZpbGVnZT5odHRwOi8vc2FwYS50ZXN0LWtvbWJpdC5kay9yb2xlcy91c2Vyc3lzdGVtcm9sZS93aXRoRFIvMjwvUHJpdmlsZWdlPg0KICAgIDxDb25zdHJhaW50IE5hbWU9Imh0dHA6Ly9vcmdhbmlzYXRpb24udGVzdC1rb21iaXQuZGsvY29uc3RyYWludHMvS0xFLU5FVyI+MTwvQ29uc3RyYWludD4NCiAgICA8Q29uc3RyYWludCBOYW1lPSJodHRwOi8vb3JnYW5pc2F0aW9uLnRlc3Qta29tYml0LmRrL2NvbnN0cmFpbnRzL1NlbnNpdGl2aXR5Ij5IaWdoPC9Db25zdHJhaW50Pg0KICA8L1ByaXZpbGVnZUdyb3VwPg0KICA8UHJpdmlsZWdlR3JvdXAgU2NvcGU9InVybjpkazpnb3Y6c2FtbDpjdnJOdW1iZXJJZGVudGlmaWVyOjg3NjU0MzIxIj4NCiAgICA8UHJpdmlsZWdlPmh0dHA6Ly9zYXBhLnRlc3Qta29tYml0LmRrL3JvbGVzL3VzZXJzeXN0ZW1yb2xlL25vRFIvMTwvUHJpdmlsZWdlPg0KICA8L1ByaXZpbGVnZUdyb3VwPg0KICA8UHJpdmlsZWdlR3JvdXAgU2NvcGU9InVybjpkazpnb3Y6c2FtbDpjdnJOdW1iZXJJZGVudGlmaWVyOjg3NjU0MzIxIj4NCiAgICA8UHJpdmlsZWdlPmh0dHA6Ly9zYXBhLnRlc3Qta29tYml0LmRrL3JvbGVzL3VzZXJzeXN0ZW1yb2xlL25vRFIvMjwvUHJpdmlsZWdlPg0KICA8L1ByaXZpbGVnZUdyb3VwPg0KICA8UHJpdmlsZWdlR3JvdXAgU2NvcGU9InVybjpkazpnb3Y6c2FtbDpjdnJOdW1iZXJJZGVudGlmaWVyOjk4NzY1NDMyIj4NCiAgICA8UHJpdmlsZWdlPmh0dHA6Ly9zYXBhLnRlc3Qta29tYml0LmRrL3JvbGVzL3VzZXJzeXN0ZW1yb2xlL25vRFIvMjwvUHJpdmlsZWdlPg0KICA8L1ByaXZpbGVnZUdyb3VwPg0KICA8UHJpdmlsZWdlR3JvdXAgU2NvcGU9InVybjpkazpnb3Y6c2FtbDpjdnJOdW1iZXJJZGVudGlmaWVyOjEyMTIxMjEyIj4NCiAgICA8UHJpdmlsZWdlPmh0dHA6Ly9zYXBhLnRlc3Qta29tYml0LmRrL3JvbGVzL3VzZXJzeXN0ZW1yb2xlL3dpdGhEUi8zPC9Qcml2aWxlZ2U+DQogICAgPENvbnN0cmFpbnQgTmFtZT0iaHR0cDovL29yZ2FuaXNhdGlvbi50ZXN0LWtvbWJpdC5kay9jb25zdHJhaW50cy9Lb3AiPjE8L0NvbnN0cmFpbnQ+DQogICAgPENvbnN0cmFpbnQgTmFtZT0iaHR0cDovL29yZ2FuaXNhdGlvbi50ZXN0LWtvbWJpdC5kay9jb25zdHJhaW50cy9TZW5zaXRpdml0eSI+TWVkaXVtPC9Db25zdHJhaW50Pg0KICA8L1ByaXZpbGVnZUdyb3VwPg0KPC9icHA6UHJpdmlsZWdlTGlzdD4=";
        ArrayList<PrivilegeGroup> bppGroupsList = (ArrayList<PrivilegeGroup>) PrivilegeGroupParser.Parse(base64XmlBppValue);

        System.out.print(String.valueOf(bppGroupsList.size() == 6) + "...Checking: bppGroupsList.Count == 5...\n");
        System.out.print(String.valueOf("urn:dk:gov:saml:cvrNumberIdentifier".equals(bppGroupsList.get(0).getScope())) + "..Checking: bppGroupsList[0].Scope == \"urn:dk:gov:saml:cvrNumberIdentifier\"...\n");
        System.out.print(String.valueOf(bppGroupsList.get(0).getConstraints().size() == 2) + "...Checking: bppGroupsList[0].Constraints.Count == 2...\n");
        System.out.print(String.valueOf("12345678".equals(bppGroupsList.get(0).getPrivilege().getCvr())) + "...Checking: bppGroupsList[0].Privilege.Cvr == \"12345678\"...\n");
        System.out.print(String.valueOf("http://sapa.test-kombit.dk/roles/usersystemrole/withDR/1".equals(bppGroupsList.get(0).getPrivilege().getType())) + "...Checking: bppGroupsList[0].Privilege.Type == \"http://sapa.test-kombit.dk/roles/usersystemrole/withDR/1\"...\n");
        System.out.print(String.valueOf("http://organisation.test-kombit.dk/constraints/KLE".equals(bppGroupsList.get(0).getConstraints().get(0).getName())) + "...Checking: bppGroupsList[0].Constraints[0].Name == \"http://organisation.test-kombit.dk/constraints/KLE\"...\n");
        System.out.print(String.valueOf("2".equals(bppGroupsList.get(0).getConstraints().get(0).getValue())) + "...Checking: bppGroupsList[0].Constraints[0].Value == 2...\n");
        System.out.print(String.valueOf("http://organisation.test-kombit.dk/constraints/Sensitivity".equals(bppGroupsList.get(0).getConstraints().get(1).getName())) + "...Checking: bppGroupsList[0].Constraints[1].Name == \"http://organisation.test-kombit.dk/constraints/KLE\"...\n");
        System.out.print(String.valueOf("High".equals(bppGroupsList.get(0).getConstraints().get(1).getValue())) + "...Checking: bppGroupsList[0].Constraints[1].Value == \"High\"...\n");

        System.out.print(String.valueOf("urn:dk:gov:saml:cvrNumberIdentifier".equals(bppGroupsList.get(1).getScope())) + "...Checking: bppGroupsList[1].Scope == \"urn:dk:gov:saml:cvrNumberIdentifier\"...\n");
        System.out.print(String.valueOf(bppGroupsList.get(1).getConstraints().size() == 2) + "...Checking: bppGroupsList[1].Constraints.Count == 2...\n");
        System.out.print(String.valueOf("12345678".equals(bppGroupsList.get(1).getPrivilege().getCvr())) + "...Checking: bppGroupsList[1].Privilege.Cvr == \"12345678\"...\n");
        System.out.print(String.valueOf("http://sapa.test-kombit.dk/roles/usersystemrole/withDR/2".equals(bppGroupsList.get(1).getPrivilege().getType())) + "...Checking: bppGroupsList[1].Privilege.Type == \"http://sapa.test-kombit.dk/roles/usersystemrole/withDR/2\"...\n");
        System.out.print(String.valueOf("http://organisation.test-kombit.dk/constraints/KLE-NEW".equals(bppGroupsList.get(1).getConstraints().get(0).getName())) + "...Checking: bppGroupsList[1].Constraints[0].Name == \"http://organisation.test-kombit.dk/constraints/KLE-NEW\"...\n");
        System.out.print(String.valueOf("1".equals(bppGroupsList.get(1).getConstraints().get(0).getValue())) + "...Checking: bppGroupsList[1].Constraints[0].Value == 1...\n");
        System.out.print(String.valueOf("http://organisation.test-kombit.dk/constraints/Sensitivity".equals(bppGroupsList.get(1).getConstraints().get(1).getName())) + "...Checking: bppGroupsList[1].Constraints[1].Name == \"http://organisation.test-kombit.dk/constraints/KLE\"...\n");
        System.out.print(String.valueOf("High".equals(bppGroupsList.get(1).getConstraints().get(1).getValue())) + "...Checking: bppGroupsList[1].Constraints[1].Value == \"High\"...\n");

        System.out.print(String.valueOf("urn:dk:gov:saml:cvrNumberIdentifier".equals(bppGroupsList.get(2).getScope())) + "...Checking: bppGroupsList[2].Scope == \"urn:dk:gov:saml:cvrNumberIdentifier\"...\n");
        System.out.print(String.valueOf(bppGroupsList.get(2).getConstraints().isEmpty()) + "...Checking: bppGroupsList[2].Constraints.Count == 0...\n");
        System.out.print(String.valueOf("87654321".equals(bppGroupsList.get(2).getPrivilege().getCvr())) + "...Checking: bppGroupsList[2].Privilege.Cvr == \"87654321\"...\n");
        System.out.print(String.valueOf("http://sapa.test-kombit.dk/roles/usersystemrole/noDR/1".equals(bppGroupsList.get(2).getPrivilege().getType())) + "...Checking: bppGroupsList[2].Privilege.Type == \"http://sapa.test-kombit.dk/roles/usersystemrole/noDR/1\"...\n");

        System.out.print(String.valueOf("urn:dk:gov:saml:cvrNumberIdentifier".equals(bppGroupsList.get(3).getScope())) + "...Checking: bppGroupsList[3].Scope == \"urn:dk:gov:saml:cvrNumberIdentifier\"...\n");
        System.out.print(String.valueOf(bppGroupsList.get(3).getConstraints().isEmpty()) + "...Checking: bppGroupsList[3].Constraints.Count == 0...\n");
        System.out.print(String.valueOf("87654321".equals(bppGroupsList.get(3).getPrivilege().getCvr())) + "...Checking: bppGroupsList[3].Privilege.Cvr == \"87654321\"...\n");
        System.out.print(String.valueOf("http://sapa.test-kombit.dk/roles/usersystemrole/noDR/2".equals(bppGroupsList.get(3).getPrivilege().getType())) + "...Checking: bppGroupsList[3].Privilege.Type == \"http://sapa.test-kombit.dk/roles/usersystemrole/noDR/2\"...\n");

        System.out.print(String.valueOf("urn:dk:gov:saml:cvrNumberIdentifier".equals(bppGroupsList.get(4).getScope())) + "...Checking: bppGroupsList[4].Scope == \"urn:dk:gov:saml:cvrNumberIdentifier\"...\n");
        System.out.print(String.valueOf(bppGroupsList.get(4).getConstraints().isEmpty()) + "...Checking: bppGroupsList[4].Constraints.Count == 0...\n");
        System.out.print(String.valueOf("98765432".equals(bppGroupsList.get(4).getPrivilege().getCvr())) + "...Checking: bppGroupsList[4].Privilege.Cvr == \"98765432\"...\n");
        System.out.print(String.valueOf("http://sapa.test-kombit.dk/roles/usersystemrole/noDR/2".equals(bppGroupsList.get(4).getPrivilege().getType())) + "...Checking: bppGroupsList[4].Privilege.Type == \"http://sapa.test-kombit.dk/roles/usersystemrole/noDR/2\"...\n");

        System.out.print(String.valueOf("urn:dk:gov:saml:cvrNumberIdentifier".equals(bppGroupsList.get(5).getScope())) + "...Checking: bppGroupsList[5].Scope == \"urn:dk:gov:saml:cvrNumberIdentifier\"...\n");
        System.out.print(String.valueOf(bppGroupsList.get(5).getConstraints().size() == 2) + "...Checking: bppGroupsList[5].Constraints.Count == 2...\n");
        System.out.print(String.valueOf("12121212".equals(bppGroupsList.get(5).getPrivilege().getCvr())) + "...Checking: bppGroupsList[5].Privilege.Cvr == \"87654321\"...\n");
        System.out.print(String.valueOf("http://sapa.test-kombit.dk/roles/usersystemrole/withDR/3".equals(bppGroupsList.get(5).getPrivilege().getType())) + "...Checking: bppGroupsList[5].Privilege.Type == \"http://sapa.test-kombit.dk/roles/usersystemrole/withDR/3\"...\n");
        System.out.print(String.valueOf("http://organisation.test-kombit.dk/constraints/Kop".equals(bppGroupsList.get(5).getConstraints().get(0).getName())) + "...Checking: bppGroupsList[5].Constraints[0].Name == \"http://organisation.test-kombit.dk/constraints/Kop\"...");
        System.out.print(String.valueOf("1".equals(bppGroupsList.get(5).getConstraints().get(0).getValue())) + "...Checking: bppGroupsList[5].Constraints[0].Value == 1...");
        System.out.print(String.valueOf("http://organisation.test-kombit.dk/constraints/Sensitivity".equals(bppGroupsList.get(5).getConstraints().get(1).getName())) + "...Checking: bppGroupsList[5].Constraints[1].Name == \"http://organisation.test-kombit.dk/constraints/Sensitivity\"...\n");
        System.out.print(String.valueOf("Medium".equals(bppGroupsList.get(5).getConstraints().get(1).getValue())) + "...Checking: bppGroupsList[5].Constraints[1].Value == \"Medium\"...\n");

        String json = PrivilegeGroupParser.ConvertToJsonString(bppGroupsList);
        System.out.print("json = " + json);
    }

}
