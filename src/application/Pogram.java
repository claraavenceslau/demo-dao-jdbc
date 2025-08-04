package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Pogram {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 1 FindById ====");
        System.out.printf("Digit employee id: ");
        int id;
        Seller seller = sellerDao.findById(id = new Scanner(System.in).nextInt());
        System.out.println(seller);

        System.out.println("\n==== TEST 2 FindByDepartment ====");
        Department dep = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(dep);
        for (Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("\n==== TEST 3 FindAll ====");
        sellers = sellerDao.findAll();
        for (Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("\n==== TEST 4 Insert ====");
        Seller newSeller = new Seller(null, "Grace", "grace@gmail.com", new Date(), 4000.00, dep);
        sellerDao.insert(newSeller);
        System.out.printf("New Seller ID: %d\n", newSeller.getId());

        System.out.println("\n==== TEST 4 Update ====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wine");
        sellerDao.update(seller);
        System.out.printf("Update completed! Updated Seller ID: %d\n", seller.getId());
    }
}
