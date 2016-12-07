package controller;

import model.DVD;
import service.FileService;

public class FileController {
	
	private FileService fileService = new FileService();
	
	public void manageService(DVD message){
		fileService.writeFile(message);
	}

}
