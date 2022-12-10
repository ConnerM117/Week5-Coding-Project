
public class SpacedLogger implements Logger{

	public String spaceWord(String arg) {
		String str = "";
		str = str + arg.charAt(0);
		for (int i = 1; i < arg.length(); i++) {
			str = str + " " + arg.charAt(i);
		}
		return str;
	}
	
	@Override
	public void log(String arg) {
		System.out.println(spaceWord(arg));
	}

	@Override
	public void error(String arg) {
		System.out.println("ERROR: " + spaceWord(arg));
	}

}
