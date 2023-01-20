package com.solvd.deliveryservice.XML;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    
    public static List<DeliveryService> parseXML(String fileName) {
        List<DeliveryService> deliveryServices = new ArrayList<>();
        DeliveryService deliveryService = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(fileName));
            while(reader.hasNext()) {
                int event = reader.next();
                switch(event) {
                    case XMLStreamConstants.START_ELEMENT:
                        if("deliveryService".equals(reader.getLocalName())) {
                            deliveryService = new DeliveryService();
                            deliveryService.setId(Integer.parseInt(reader.getAttributeValue(0)));
                        } else if("name".equals(reader.getLocalName())) {
                            deliveryService.setName(reader.getElementText());
                        } else if("address".equals(reader.getLocalName())) {
                            deliveryService.setAddress(reader.getElementText());
                        } else if("phoneNumber".equals(reader.getLocalName())) {
                            deliveryService.setPhoneNumber(reader.getElementText());
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        if("deliveryService".equals(reader.getLocalName())) {
                            deliveryServices.add(deliveryService);
                        }
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deliveryServices;
    }

    private void setPhoneNumber(String elementText) {
    }

    private void setAddress(String elementText) {
    }

    private void setName(String elementText) {
    }

    private void setId(int parseInt) {
    }
}

