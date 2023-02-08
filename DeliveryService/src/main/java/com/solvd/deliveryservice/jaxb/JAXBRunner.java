package com.solvd.deliveryservice.jaxb;

import com.solvd.deliveryservice.models.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class JAXBRunner {

    private DeliveryService deliveryService;

    Logger logger = Logger.getLogger(JAXBRunner.class.getName());

    public JAXBRunner() {
        try {
            File file = new File("delivery-service.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(DeliveryService.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            deliveryService = (DeliveryService) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            logger.info("an error has occured");
        }

        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("John Doe");
        user1.setEmail("john.doe@example.com");
        users.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("Jane Doe");
        user2.setEmail("jane.doe@example.com");
        users.add(user2);

        deliveryService.setUsers(users);

        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setId(1);
        order1.setUserId(1);
        order1.setStoreId(1);
        order1.setTotalCost(10.99);
        orders.add(order1);

        Order order2 = new Order();
        order2.setId(2);
        order2.setUserId(2);
        order2.setStoreId(2);
        order2.setTotalCost(12.49);
        orders.add(order2);

        deliveryService.setOrders(orders);

        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.setId(1);
        store1.setName("Supermarket A");
        store1.setLocation("New York");
        stores.add(store1);

        Store store2 = new Store();
        store2.setId(2);
        store2.setName("Supermarket B");
        store2.setLocation("Los Angeles");
        stores.add(store2);

        deliveryService.setStores(stores);

        List<Item> items = new ArrayList<>();
        Item item1 = new Item();
        item1.setId(1);
        item1.setName("Bread");
        item1.setPrice(4);
        items.add(item1);

        Item item2 = new Item();
        item2.setId(2);
        item2.setName("Milk");
        item2.setPrice(2);
        items.add(item2);

        deliveryService.setItems(items);

        App app = new App();
        app.setVersion("1.0.0");
        app.setAuthor("John Doe");
        deliveryService.setApp(app);
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }
}

