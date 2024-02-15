package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //System.out.println("--------- TEST 1: Department insert ---------");
        Department department;
        /*department = new Department(5, "Cell");
        departmentDao.insert(department);
        System.out.println("Inserted!");
        */
        System.out.println("--------- TEST 2: Department update ---------");
        department = new Department(5, "Cell phones");
        departmentDao.update(department);
        System.out.println("Updated!");
    }
}
