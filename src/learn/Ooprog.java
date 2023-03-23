package learn;

public class Ooprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndividualCustomer individualCustomer1 = new IndividualCustomer();
		
		individualCustomer1.setCustomerNumber("8024");
		individualCustomer1.setPhone("05456567805");
		individualCustomer1.setId(12);
		individualCustomer1.setName("Emir");
		individualCustomer1.setSurName("Yılmaz");
		
IndividualCustomer individualCustomer2 = new IndividualCustomer();
		
		individualCustomer2.setCustomerNumber("19328");
		individualCustomer2.setPhone("05453567495");
		individualCustomer2.setId(132);
		individualCustomer2.setName("Mustafa");
		individualCustomer2.setSurName("Keskin");
		
IndividualCustomer individualCustomer3 = new IndividualCustomer();
		
		individualCustomer3.setCustomerNumber("32526");
		individualCustomer3.setPhone("05353527435");
		individualCustomer3.setId(542);
		individualCustomer3.setName("Muhammed");
		individualCustomer3.setSurName("Sen");
		
		System.out.println("Müsteri listesi");
		System.out.println();
		IndividualCustomer[] individualCustomers = {individualCustomer1,individualCustomer2,individualCustomer3};
		for (IndividualCustomer individualCustomer : individualCustomers) {
			System.out.println("Müşteri Numara: "+individualCustomer.getCustomerNumber());
			System.out.println("Telefon Numarası: "+individualCustomer.getPhone());
			System.out.println("id: "+individualCustomer.getId());
			System.out.println("İsim: "+individualCustomer.getName());
			System.out.println("Soyisim: "+individualCustomer.getSurName());
			
			
		}
		
		 

	}
}
