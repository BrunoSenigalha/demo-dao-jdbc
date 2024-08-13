package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1 : seller findAll ===");
        List<Department> listDep = departmentDao.findAll();
        for (Department dep : listDep) {
            System.out.println(dep);
        }
    }
}
