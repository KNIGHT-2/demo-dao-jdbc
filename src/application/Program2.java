package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("--------- TEST 1: Department insert ---------");
        Department department;
        department = new Department(5, "Cell");
        departmentDao.insert(department);
        System.out.println("Inserted!");

        System.out.println("--------- TEST 2: Department update ---------");
        department = new Department(5, "Cell phones");
        departmentDao.update(department);
        System.out.println("Updated!");

        System.out.println("--------- TEST 3: Department delete ---------");
        departmentDao.deleteById(5);
        System.out.println("Department deleted!");

        System.out.println("--------- TEST 4: Department findById ---------");
        System.out.println(departmentDao.findById(1));

        System.out.println("--------- TEST 5: Department findAll ---------");
        List<Department> list = new ArrayList<>();
        list.addAll(departmentDao.findAll());
        list.forEach(System.out::println);
    }
}
