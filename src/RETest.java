import java.util.regex.Pattern;
import java.util.regex.Matcher;;

public class RETest {

	private static final String Matcher = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("abc".matches("..."));
		
		p("a7589h".replaceAll("\\d", "-"));
		
		Pattern pattern = Pattern.compile("[a-z]{3}");
		
		Matcher matcher = pattern.matcher("jhg");
		
		p(matcher.matches());*/
		
//		p("125.125.125.125".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		
		/*p("jichangfeng67@gmail.com".matches(".+@.+\\..+"));
		p("jichan-gfeng67@gmail.com".matches("[0-9a-z_.]*@.+\\..+"));*/
		
		//p(" \t\n\r".matches("\\s{4}"));
		
//		p("jichangfeng67@gmail.com".matches("[0-9a-zA-Z._]+@[\\w[._]]+\\..{1,10}"));
		
		/*String s = "123-1234-12345-12";
		
		Pattern pattern = Pattern.compile("\\d{3,5}");
		
		Matcher matcher1 = pattern.matcher(s);
		
		p(matcher1.find());
		p(matcher1.find());
		p(matcher1.find());
		p(matcher1.find());*/
		
		String s = "Java JAVA bdhsjad java";
		
//		Pattern pattern = Pattern.compile("[jJ]{1}[aA]{1}[vV]{1}[aA]{1}");
		Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(s);
		
		p(matcher.replaceAll("JaVa"));
		
		matcher.reset();
		
		StringBuffer sb = new StringBuffer();
		
		int cnt = 0;
		
		while(matcher.find()){
			cnt++;
			if(cnt % 2 == 0){
				matcher.appendReplacement(sb, "JAva");
			}else{
				matcher.appendReplacement(sb, "jaVA");
			}
		}
		
		//matcher.appendTail(sb);
		
		p(sb);
	}
	
	public static void p(Object o){
		System.out.println(o);
	}

}
