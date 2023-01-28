package com.solvd.deliveryservice.XML;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeliveryService {

    public DeliveryService(String orderId, String customerName, String deliveryAddress, String status) {
    }

    public DeliveryService() {

    }

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

    public void setPhoneNumber(String elementText) {
    }

    private void setAddress(String elementText) {
    }

    public void setName(String elementText) {
    }

    public void setId(int parseInt) {
    }

    public String getOrderId() {
        return null;
    }

    public String getCustomerName() {
        return null;
    }

    public String getDeliveryAddress() {
        return null;
    }

    public String getStatus() {
        return null;
    }
}

