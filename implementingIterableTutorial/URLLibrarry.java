package implementingIterableTutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class URLLibrarry implements Iterable<String> {
	private LinkedList<String> urlList = new LinkedList<String>();

	private class urlIterator implements Iterator<String> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < urlList.size();
		}

		@Override
		public String next() {
			StringBuilder sb1 = new StringBuilder();

			try {
				URL url = new URL(urlList.get(index));

				BufferedReader br1 = new BufferedReader(new InputStreamReader(url.openStream()));

				String line = null;
				while ((line = br1.readLine()) != null) {
					sb1.append(line);
					sb1.append("\n");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			index++;
			return sb1.toString();
		}

		@Override
		public void remove() {
			urlList.remove(index);
		}

	}

	public URLLibrarry() {

		urlList.add("https://stackoverflow.com/questions/1053467/how-do-i-save-a-string-to-a-text-file-using-java");

	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new urlIterator();
	}

	/*
	 * @Override public Iterator<String> iterator() { // TODO Auto-generated
	 * method stub return urlList.iterator(); }
	 */

}
