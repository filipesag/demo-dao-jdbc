package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Department dp = new Department(11, "Oven");
		Department dp2 = new Department(11, "Oven");
		
		boolean igual = dp.equals(dp2);
		
		System.out.println(igual);
		
		Seller seller = new Seller(21, "Bob", "bob@hotmail.com", new Date(), 3000.0, dp);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
