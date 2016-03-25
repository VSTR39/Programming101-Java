
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

/**
 * Servlet implementation class GeneralServlet
 */
@WebServlet("/GeneralServlet")
public class GeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String HTML_START = "<html><body>";
	public static final String HTML_END = "</body></html>";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GeneralServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		URL url = new URL("http://dnevnik.bg");
		HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
		// Reading the feed
		SyndFeedInput input = new SyndFeedInput();
		SyndFeed feed = null;
		StringBuilder build = new StringBuilder();
		build.append(HTML_START);
		try {
			feed = input.build(new XmlReader(httpcon));
		} catch (IllegalArgumentException | FeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List entries = feed.getEntries();
		Iterator itEntries = entries.iterator();
		int i = 0;
		PrintWriter out = response.getWriter();
		while (itEntries.hasNext()) {
			SyndEntry entry = (SyndEntry) itEntries.next();
			build.append("<h" + i + ">" + entry.getTitle() + "<h" + i + ">");
			// System.out.println("Link: " + entry.getLink());
			// System.out.println("Author: " + entry.getAuthor());
			// System.out.println("Publish Date: " + entry.getPublishedDate());
			// System.out.println("Description: " +
			// entry.getDescription().getValue());
			// System.out.println();

		}
		build.append(HTML_END);
		out.println(build);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
