package inheritance2;

public class Main {

	public static void main(String[] args) {//birbirinin alternatifi olan kodlar i�in if yaz�lmaz
		// TODO Auto-generated method stub

			CustomerManager customerManager = new CustomerManager();
			customerManager.add(new EmailLogger());
	}

}
