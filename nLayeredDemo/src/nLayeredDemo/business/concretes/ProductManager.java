package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;


public class ProductManager  implements ProductService {
	private ProductDao productDao;
	
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
		}
		this.p
	

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
