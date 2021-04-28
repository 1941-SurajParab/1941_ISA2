import com.phone.*;

public class FactoryMain {
	
	public static void main(String args[]) {
		
		CarFactory osf = new CarFactory();
		CAR obj = osf.getInstance("abcd");
		obj.specs();
	}

}
