package ooplntro;



public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"Lenovo V14",1500,"16 GB Ram",10);//�rnek olu�turma,referans olu�turma, intance
		
		
		
		Product product2= new Product();//�rnek olu�turma,referans olu�turma, intance
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1= new Category();
		category1.setId(1);
		category1.setName("i�ecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("i�ecek");
		
		System.out.println(category1.getName+"!");//okuma
		System.out.println(category2.getName+"!");
				
		
	
	}

}
