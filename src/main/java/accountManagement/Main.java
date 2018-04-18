package accountManagement;

public class Main {

	public static void main(String[] args) {
		Service accService = new Service();
		Account GodwinAdeleke = new Account(1234,"Godwin","Adeleke");
		Account AbdiDire = new Account(2234,"Abdi","Dire");
		Account AbdiGani = new Account(4234,"Abdi","Gani");
		accService.addAccount(GodwinAdeleke);
		accService.addAccount(AbdiDire);
		accService.addAccount(AbdiGani);
		
		
		
	

	}

}
