package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Seller obj = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000., new Department());
        System.out.println(obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}