package consultations.con_20230617.f_xml;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class STAX {
  public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
    XMLInputFactory factory = XMLInputFactory.newFactory();
    XMLStreamReader parser =
            factory.createXMLStreamReader
                    (new FileInputStream("src/main/java/consultations/con_20230617/f_xml/1.xml"));
    while (parser.hasNext()){
      int event = parser.next();
      if (event == XMLStreamConstants.START_ELEMENT){
        System.out.println(parser.getLocalName());
      }
    }
  }
}
