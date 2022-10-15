
public class main_interfaceRBI {

	public static void main(String[] args) {
		
		Interface_RBI r=new SBI();
		Interface_RBI B=new ICICI();
		
		r.minintrestRate();
		r.minBalace();
		r.maxWithdrawlimit();
		
		B.minintrestRate();
		B.minBalace();
		B.maxWithdrawlimit();

	}

}
