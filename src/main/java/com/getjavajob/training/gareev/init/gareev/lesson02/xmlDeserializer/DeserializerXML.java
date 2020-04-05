package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.xmlDeserializer;

import jdk.internal.org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Denis on 01.04.2020.
 */
public abstract class DeserializerXML {
    String nameFile;

    public DeserializerXML(String nameFile){
        this.nameFile = nameFile;
    }
    public void ValidatorXSD() throws IOException, org.xml.sax.SAXException {
        Source fileXML = new StreamSource(ClassLoader.getSystemResourceAsStream(nameFile));
        List<Source> schemas = new ArrayList<>();
        schemas.add(new StreamSource(ClassLoader.getSystemResourceAsStream("")));
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
        Source[] schemaSources = new Source[schemas.size()];
        schemas.toArray(schemaSources);
        Schema schema = schemaFactory.newSchema(schemaSources);
        Validator validator = schema.newValidator();
        validator.validate(fileXML);

    }
}
