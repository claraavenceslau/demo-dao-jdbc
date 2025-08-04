package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Pogram2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1 FindById ====");
        System.out.print("Enter department id: ");
        int departmentId = sc.nextInt();
        Department department = departmentDao.findById(departmentId);
        System.out.println(department);

        System.out.println("\n==== TEST 2 FindAll ====");
        List<Department> departments = departmentDao.findAll();
        for (Department d : departments) {
            System.out.println(d);
        }

        System.out.println("\n==== TEST 3 Insert ====");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.printf("Department ID: %d\n", newDepartment.getId());

        System.out.println("\n==== TEST 4 Update ====");
        department = departmentDao.findById(1);
        department.setName("Paint");
        departmentDao.update(department);
        System.out.printf("Updated completed! Update department ID: %d\n", department.getId());
    }
}
