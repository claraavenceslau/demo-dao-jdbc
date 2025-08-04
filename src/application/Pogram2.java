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

        System.out.println("\n==== TEST 2 FindByDepartment ====");
        List<Department> departments = departmentDao.findAll();
        for (Department d : departments) {
            System.out.println(d);
        }
    }
}
