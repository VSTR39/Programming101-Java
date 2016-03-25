package montag;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;


public class JavaDownloaderMain {
	public static void main(String[] args) throws IOException {
		Options options = new Options();
		options.addOption("h", false, "help");
		options.addOption("s", true, "saves picture from a given URL,to a given destination");
		CommandLineParser parser = new DefaultParser();
		try {
			CommandLine line = parser.parse(options, args);
			if (line.hasOption("h")) {
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("ant", options);
			}
			if (line.hasOption("s")) {
				String[] URL = line.getOptionValues("s");
				String[] filename = line.getArgs();
				JavaDownloader jd = new JavaDownloader(URL[0], filename[0]);
				jd.saveImageToFile();
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
