//download lyrics from lyrics com second page extractin lyrics

import java.io.IOException;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class printLyricsWhenLinkIsGiven{

	private String lyricsText;
	private String songName;

	public String getLyrics(){
		return lyricsText;
	}
	public String getSongName(){
		return songName;
	}

	public void printLyrics(String addlink) throws Exception{
		
	//		//String first_url="/watch?v=ih2xubMaZWI";
			String url="http://www.lyrics.com/"+addlink;
	//
	//		//int flagToDifferenciateUrl=0;
			String finalurl="";
			// Document sd=Jsoup.connect( url ).timeout(6000).get();

			// try{
				Document sd=Jsoup.connect( url ).timeout(6000).get();
			

			Elements ele2=sd.select("div.lyric.clearfix");

			String lyrics,songname="";

			for (Element el : ele2.select("hgroup")) {
				//System.out.println("inside for loop");
			
				songname=el.select("h2#lyric-title-text").text();
				
				// System.out.println("the final url is "+finalurl);
				
				// System.out.println(element2.select("a").attr("href"));

			} 

			for (Element element2 : ele2.select("pre#lyric-body-text")) {
				//System.out.println("inside for loop");
			
				finalurl=element2.select("pre#lyric-body-text").text();
				
				// System.out.println("the final url is "+finalurl);
				
				// System.out.println(element2.select("a").attr("href"));

			}

			lyrics=finalurl;

			this.lyricsText=lyrics;
			this.songName=songname;
			// String lyrics=element2.select("a").attr("href");
				// return songname;

	}


	// public static void main(String[] args) throws IOException {
	// 	Scanner in=new Scanner(System.in);
	// 		System.out.println("enter the link /n");
	// 		String addlink=in.next();

	// 		printLyricsWhenLinkIsGiven obj=new printLyricsWhenLinkIsGiven();
	// 		try{
	// 		// System.out.println(obj.printLyrics(addlink));
	// 		// System.out.println(obj.songName);
	// 		String a=obj.printLyrics(addlink);
	// 		System.out.println("Lyrics:\n"+obj.getLyrics());
	// 		System.out.println("\n\n\nSongname:\n"+obj.getSongName());

	// 		}catch(Exception e){
	// 			e.printStackTrace();
	// 		}
	// }

}

