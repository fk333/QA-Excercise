package test;

import domain.Customer;
import domain.Stock;
import domain.books;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(); //creating customer object
		c1.cusId=1001;
		c1.name="David";
		c1.address="UK";
		c1.email="d@gmail.com";
		c1.show();
		Customer c2=new Customer();
		c2.cusId=1002;
		c2.name="Gordon";
		c2.address="France";
		c2.email="g@gmail.com";
		c2.show();
		
		books b1=new books(); //create book object
		b1.bkId=3001;
		b1.title="Tellme your dreams";
		b1.price=12.51f;
		b1.author="Jack Jack";
		b1.display();
		
		Stock s1=new Stock(); //create stock object
		s1.stockId=5001;
		s1.stockName="Pencil";
		s1.stockPrice=0.22f;
		s1.stockQty=999;
		s1.showStock();
		Stock s2=new Stock();
		s2.stockId=5002;
		s2.stockName="Paper";
		s2.stockPrice=1.05f;
		s2.stockQty=755;
		s2.showStock();
	}

}
