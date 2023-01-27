package com.solvd.deliveryservice;

import dao.IBaseDAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Runner {

    static Logger logger = Logger.getLogger(Runner.class.getName());

public static void main(String[] args) throws Exception {
    Properties prop = new Properties();
    try (InputStream input = new FileInputStream("C:\\Users\\House Games\\eclipse-workspace\\deliveryService\\src\\main\\resources\\properties\\config.properties")) {
        prop.load(input);
    } catch (IOException e) {
        logger.info((Supplier<String>) e);
    }

    String url = prop.getProperty("db.url");
    String username = prop.getProperty("db.username");
    String password = prop.getProperty("db.password");

    DAOFactory daoFactory = DAOFactory.getInstance(url,username,password);
    IBaseDAO<Object> objectDAO = (IBaseDAO<Object>) daoFactory.getDAO("MySQL");

}

    private static class DAOFactory {
        public static DAOFactory getInstance(String url, String username, String password) {
            return null;
        }

        public Object getDAO(String mySQL) {
            return null;
        }
    }
}

