package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n=== TESTE 3: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("\n=== TESTE 4: department insert ===");
		Department newDepartment = new Department(null, "Fast Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		System.out.println("\n=== TESTE 5: department update ===");
		department = departmentDao.findById(6);
		department.setName("Health Care");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TESTE 6: department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
		
	}

}
