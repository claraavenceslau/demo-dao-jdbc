package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.Scanner;

public class Pogram {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1 FINDBYID ===");
        System.out.printf("Digit employee id: ");
        int id = new Scanner(System.in).nextInt();
        Seller seller = sellerDao.findById(id);
        System.out.println(seller);
    }
}
