package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.xmlDeserializer;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.Organization;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.OrganizationType;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.Person;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.ShareOfBusiness;
import org.xml.sax.SAXException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis on 01.04.2020.
 */
public class DeserializerSTAX extends DeserializerXML{
    public DeserializerSTAX(String nameFile) {
        super(nameFile);
    }

    public List<Organization> fromXML() throws XMLStreamException, IOException, SAXException {
        ValidatorXSD();
        List<Organization> orgs = new ArrayList<>();
        Organization org = null;
        Person person = null;
        ShareOfBusiness sh = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(ClassLoader.getSystemResourceAsStream(nameFile));
        while (reader.hasNext()) {
            int event = reader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    switch (reader.getLocalName()) {
                        case "organisation":
                            org = new Organization(reader.getAttributeValue(0));
                            break;
                        case "type":
                            reader.next();
                            org.setType(OrganizationType.valueOf(reader.getText().trim()));
                            break;
                        case "CEO":
                            person = new Person();
                            break;
                        case "CEOLastName":
                            reader.next();
                            person.setSurname(reader.getText().trim());
                            break;
                        case "CEOFirstName":
                            reader.next();
                            person.setName(reader.getText().trim());
                            break;
                        case "CEOPatronymic":
                            reader.next();
                            person.setSurname(reader.getText().trim());
                            break;
                        case "capital":
                            reader.next();
                            org.setAuthorizedCapital(Long.valueOf(reader.getText().trim()));
                            break;
                        case "parent":
                            reader.next();
                            String parentName = reader.getText().trim();
                            if (parentName.equals("NONE")) {
                                org.setParent(null);
                            } else {
                                for (Organization o : orgs) {
                                    if (o.getName().equals(parentName)) {
                                        org.setParent(o);
                                        o.addChildren(org);
                                    }
                                }
                            }
                            break;
                        case "shareholder":
                            sh = new ShareOfBusiness();
                            break;
                        case "lastName":
                            reader.next();
                            sh.setSurname(reader.getText().trim());
                            break;
                        case "percentage":
                            reader.next();
                            sh.addShare(Float.valueOf(reader.getText().trim()), org);
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    if ("organisation".equals(reader.getLocalName())) {
                        orgs.add(org);
                    }
                    if ("shareholder".equals(reader.getLocalName())) {
                        org.addShareHolder(sh);
                    }
                    if ("CEO".equals(reader.getLocalName())) {
                        org.setCEO(person);
                    }
                    break;
            }
        }
        return orgs;
    }
}
