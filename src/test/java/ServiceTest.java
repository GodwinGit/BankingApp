import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import accountManagement.Account;
import accountManagement.Service;

public class ServiceTest {

	@Test
	public void test() {

		Account abdi = new Account(1, "Abdihakim", "Dirie");
		Account gani = new Account(1, "Abdilgani", "Abdullah");
		
		Service service = new Service();
		
		service.addAccount(abdi);
		service.addAccount(gani);
		
		Assert.assertEquals("{\"1\":{\"firstName\":\"Abdihakim\",\"lastName\":\"Dirie\",\"accountNumber\":1},\"2\":{\"firstName\":\"Abdilgani\",\"lastName\":\"Abdullah\",\"accountNumber\":2}}",service.mapToJSON());
		
		
		
		
	}

}