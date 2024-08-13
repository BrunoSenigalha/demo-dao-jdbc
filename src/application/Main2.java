package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1 : seller findAll ===");
        List<Department> listDep = departmentDao.findAll();
        for (Department dep : listDep) {
            System.out.println(dep);
        }

        System.out.println("\n=== TEST 2 : seller findById ===");
        System.out.println("Enter for id to find test: ");
        int id = sc.nextInt();
        Department dep = departmentDao.findById(id);
        System.out.println(dep);
    }
}
