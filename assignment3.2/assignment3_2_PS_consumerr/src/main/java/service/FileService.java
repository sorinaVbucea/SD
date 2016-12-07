package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.DVD;

public class FileService {
	
    public boolean writeFile(DVD content) {
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			
			String path = "files/" + dateFormat.format(date);
			File filed = new File(path);
		    if(!filed.exists())
		    	filed.mkdir();
			
			PrintWriter writer = new PrintWriter(path + "/" + System.currentTimeMillis() + ".txt", "UTF-8");
			writer.write(content.toString());
	    	writer.close();
	    	System.out.println("File writed.");
	    	return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
    }

}
