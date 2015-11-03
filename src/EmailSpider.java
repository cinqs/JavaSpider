import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSpider {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("EmailSpider.html"));
		String line = "";
		while((line = br.readLine()) != null){
			parseBr(line);
		}
	}

	private static void parseBr(String readLine) {
		Pattern pattern = Pattern.compile("[\\w-]+@[\\w-]+\\.[\\w-]+");
		Matcher matcher = pattern.matcher(readLine);
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		matcher.reset();
	}

}
