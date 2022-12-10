
public class App {

	public static void main(String[] args) {
		AsteriskLogger aslog = new AsteriskLogger();
		SpacedLogger splog = new SpacedLogger();
		
		String hello = "Hello";
		
		aslog.log(hello);
		aslog.error(hello);
		splog.log(hello);
		splog.error(hello);
		
		String goodbye = "Goodbye";
		
		aslog.log(goodbye);
		aslog.error(goodbye);
		splog.log(goodbye);
		splog.error(goodbye);

	}

}
