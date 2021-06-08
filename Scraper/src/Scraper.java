
import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;

public class Scraper {
	public Scraper(String ime) {

		Document doc = null;
		
		
		for(int i = 2021; i>=1950; i--) {
			String stran =  "https://www.basketball-reference.com/leagues/NBA_" + i + "_per_game.html"; 
			try {
				doc = Jsoup.connect(stran).get();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			Element table = doc.getElementById("div_per_game_stats");
			Elements rows = table.getElementsByTag("TR");
			for (Element row : rows) {
				Elements tds = row.getElementsByTag("TD");
				for (int j = 0; j < tds.size(); j++) {
					if (j == 0 && tds.get(0).text().equals(ime)) System.out.println(/*tds.get(j).text() + " ima " + " v sezoni "+*/i +"-" + (i+1)%100+/* " 3PA: "+*/" "+tds.get(11).text());
				}
			}	
		}
		
	}
	
	public static void main (String args[]) {
		new Scraper(args[0]);

	}
}
