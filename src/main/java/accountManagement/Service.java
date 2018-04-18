package accountManagement;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	private HashMap<Integer,Account> accounts = new HashMap<Integer,Account>();
	
	public HashMap<Integer, Account> getAccountsMap() {
		return accounts;
	}

	public Account getAccount(int accountNumber) {
		return accounts.get(accountNumber);
	}
	
	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(),account);
	}
	
	public void removeAccount(int accountNumber) {
		boolean accountExists = accounts.containsKey(accountNumber);
		if (accountExists) {
			accounts.remove(accountNumber);
		}
	}
	
	public String mapToJSON() {
		ObjectMapper jsonMaker = new ObjectMapper();
		try {
			return jsonMaker.writeValueAsString(accounts);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "Error";
		}
	}
	
}