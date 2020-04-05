package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.xmlDeserializer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.Organization;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.organization.OrganizationType;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.Person;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person.ShareOfBusiness;

import java.io.Reader;

/**
 * Created by Denis on 01.04.2020.
 */
public class DeserializerXStream {
    final XStream xstream = new XStream(new DomDriver());

    public DeserializerXStream() {
        xstream.processAnnotations(Person.class);
        xstream.processAnnotations(Organization.class);
        xstream.processAnnotations(OrganizationType.class);
        xstream.processAnnotations(ShareOfBusiness.class);
    }

    public String toXML(Object object) {
        return xstream.toXML(object);
    }

    public Object fromXML(Reader reader) {
        return xstream.fromXML(reader);
    }
}
