package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.xmlDeserializer;

import com.sun.org.apache.xml.internal.resolver.readers.SAXParserHandler;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.OrganizationType;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.Person;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.ShareOfBusiness;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.Organization;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.helpers.DefaultHandler;


/**
 * Created by Denis on 01.04.2020.
 */
public class DeserializerSAX extends DeserializerXML {
    public DeserializerSAX(String filename){
        super(filename);
    }
    public List<Organization> fromXML() throws IOException, SAXException, ParserConfigurationException {
        ValidatorXSD();
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();
        SAXHandler  handler = new SAXHandler ();
        parser.parse(ClassLoader.getSystemResourceAsStream(nameFile), handler);
        return  handler.orgs;
    }

    class SAXHandler extends DefaultHandler {
        List<Organization> orgs = new ArrayList<>();
        Organization org = null;
        Person person = null;
        ShareOfBusiness sh = null;
        String content = null;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
            switch (qName){
                case "organization":
                    org = new Organization(attributes.getValue("name"));
                    break;

                case  "CEO":
                    person = new Person();
                    break;
                case  "shareholder":
                    sh = new ShareOfBusiness();
                    break;
            }
        }
        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException{
            switch (qName){
                case "organization":
                    orgs.add(org);
                    break;
                case "type":
                    org.setType(OrganizationType.valueOf(content));
                    break;
                case "CEO":
                    org.setCEO(person);
                    break;
                case "CEOPatronymic":
                    person.setPatronymic(content);
                    break;
                case "capital":
                    org.setAuthorizedCapital(Long.valueOf(content));
                    break;
                case "parent":
                    if(content.equals("NONE")){
                        org.setParent(null);

                    }else {
                        for (Organization o : orgs){
                            if (o.getName().equals(content)){
                                org.setParent(o);
                                o.addChildren(org);
                            }
                        }
                    }
                    break;
                case "shareholder":
                    org.addShareHolder(sh);
                    break;
                case "lastName":
                    sh.setSurname(content);
                    break;
                case "percentage":
                    sh.addShare(Float.valueOf(content), org);
                    break;

            }
        }
        @Override
        public void characters(char[] ch, int start, int length) throws  SAXException{
            content = String.copyValueOf(ch, start, length).trim();
        }
    }

}
