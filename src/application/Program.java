package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("------------------- TEST FINDBYID --------------------");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller);
		
		System.out.println("---------------------TEST 2 --------------------------");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------TEST 3 --------------------------");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------------TEST 4 -------------------------");
		Seller newSeller = new Seller(null, "Greg", "greg.g@gmail.com", new Date(), 4000.00, dep);
		sellerDao.insert(newSeller);
		System.out.println("New seller added. Id = " + newSeller.getId());
	}

}
