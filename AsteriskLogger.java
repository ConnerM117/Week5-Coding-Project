
public class AsteriskLogger implements Logger {

	@Override
	public void log(String arg) {
		System.out.println("***" + arg + "***");
	}

	@Override
	public void error(String arg) {
		System.out.println("*********************");
		System.out.println("***ERROR: " + arg + "***");
		System.out.println("*********************");
	}

}
