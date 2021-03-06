package montag;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class JavaDownloader {
	private URL mWebsite;
	private String mFileDestination;

	public JavaDownloader(String site, String fileDestination) throws MalformedURLException {
		this.mWebsite = new URL(site);
		this.mFileDestination = fileDestination;
	}

	public URL getWebsite() {
		return mWebsite;
	}

	public void setWebsite(URL mWebsite) {
		this.mWebsite = mWebsite;
	}

	public String getFileDestination() {
		return mFileDestination;
	}

	public void setFileDestination(String mFileDestination) {
		this.mFileDestination = mFileDestination;
	}

	public void saveToFile() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(mWebsite.openStream()));
		FileWriter fileOutput = new FileWriter(new File(this.mFileDestination));
		String line = "";
		while ((line = input.readLine()) != null) {
			fileOutput.write(line);
		}
		input.close();
		fileOutput.close();
	}

	public void saveImageToFile() throws IOException {
		File outputfile = new File(this.mFileDestination);
		ImageIO.write(ImageIO.read(mWebsite), "jpg", outputfile);

	}
}
