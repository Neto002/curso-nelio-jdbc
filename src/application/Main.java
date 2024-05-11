package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TEST 1: seller findById");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\nTEST 2: seller findByDepartment");
        sellerDao.findByDepartment(new Department(4, null)).forEach(System.out::println);
    }
}