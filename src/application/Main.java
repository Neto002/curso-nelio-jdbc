package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("TEST 1: seller findById");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\nTEST 2: seller findByDepartment");
        sellerDao.findByDepartment(new Department(4, null)).forEach(System.out::println);

        System.out.println("\nTEST 3: seller findAll");
        sellerDao.findAll().forEach(System.out::println);

        System.out.println("\nTEST 4: seller insert");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000., new Department(2, null));
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\nTEST 5: seller update");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Updated!");

        System.out.println("\nTEST 6: seller delete");
        sellerDao.deleteById(9);
        System.out.println("Deleted!");

        System.out.println("TEST 7: department findById");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\nTEST 8: department findAll");
        departmentDao.findAll().forEach(System.out::println);

        System.out.println("\nTEST 9: department insert");
        Department newDepartment = new Department(null, "Test");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\nTEST 10: department update");
        department = departmentDao.findById(5);
        department.setName("New Department");
        departmentDao.update(department);
        System.out.println("Updated!");

        System.out.println("\nTEST 11: department delete");
        departmentDao.deleteById(5);
        System.out.println("Deleted!");
    }
}