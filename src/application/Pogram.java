package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Pogram {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(1, "Maria", "maria@gmail.com", new Date(), 3200.00, obj);

        System.out.println(obj);
        System.out.println(seller);
    }
}
