package exceptionhandling.UserDefinedExceptions;
/*
 * In a banking application, if a user attempts to transfer funds to an account that does not exist,
 *  an AccountNotFoundException should be raised.*/
public class BakingSystem {
	int accno=1234;
	public void trasfer(int input) throws AccountNotFoundException {
		if(accno!=input) {
			throw new AccountNotFoundException("Account Not Found");
		}else {
			System.out.println("Fund transfered successfully");
		}
	}
	public static void main(String[] args) throws AccountNotFoundException {
		BakingSystem b=new BakingSystem();
		b.trasfer(124);
	}

}
