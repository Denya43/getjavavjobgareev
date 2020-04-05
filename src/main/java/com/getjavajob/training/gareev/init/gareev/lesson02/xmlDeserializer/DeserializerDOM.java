package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.xmlDeserializer;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.Organization;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.Person;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.ShareOfBusiness;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.OrganizationType.valueOf;
/**
 * Created by Denis on 01.04.2020.
 */
public class DeserializerDOM extends DeserializerXML{


    public DeserializerDOM(String nameFile) {
        super(nameFile);
    }

    public List<Organization> fromXML() throws IOException, org.xml.sax.SAXException, ParserConfigurationException{
        ValidatorXSD();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(ClassLoader.getSystemResourceAsStream(nameFile));
        List<Organization> orgs = new ArrayList<>();
        Element orgsTag = document.getDocumentElement();
        NodeList nodeList = orgsTag.getChildNodes();
        for (int i = 0;i < nodeList.getLength(); i ++){
            Node node = nodeList.item(i);
            if (node instanceof  Element && node.getNodeName().equals("organization")){
                Organization org = new Organization((node).getAttributes().getNamedItem("name").getNodeValue());
                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++){
                    Node node1 = childNodes.item(j);
                    if (node1 instanceof Element){
                        String content = node1.getLastChild().getTextContent().trim();
                        switch (node1.getNodeName()){
                            case "type":
                                org.setType(valueOf(content));
                                break;
                            case "CEO":
                                Person person = new Person();
                                NodeList ceo = node1.getChildNodes();
                                for (int o = 0; o < ceo.getLength(); o++){
                                    Node node2 = ceo.item(o);
                                    if (node2 instanceof Element){
                                        String cont = node2.getLastChild().getTextContent().trim();
                                        switch (node2.getNodeName()){
                                            case "CEOFirstName":
                                                person.setName(cont);
                                                break;
                                            case "CEOLastName":
                                                person.setSurname(cont);
                                                break;
                                            case "CEOPatronomic":
                                                person.setPatronymic(cont);
                                                break;

                                        }
                                    }
                                }
                                org.setCEO(person);
                                break;
                            case  "shareholder":
                                ShareOfBusiness shareOfBusiness = new ShareOfBusiness();
                                NodeList sh = node1.getChildNodes();
                                for (int o =0;o< sh.getLength();o++){
                                    Node node2 = sh.item(o);
                                    if (node2 instanceof  Element){
                                        String cont = node2.getLastChild().getTextContent().trim();
                                        switch (node2.getNodeName()){
                                            case "lastName":
                                                shareOfBusiness.setSurname(cont);
                                                break;
                                            case "percentage":
                                                shareOfBusiness.addShare(Float.valueOf(cont), org);
                                                break;
                                        }
                                    }
                                }
                                org.addShareHolder(shareOfBusiness);
                                break;
                        }
                    }
                }
                orgs.add(org);
            }
        }
        return orgs;
    }
}
