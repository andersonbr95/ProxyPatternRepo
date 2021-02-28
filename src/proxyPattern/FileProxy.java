package proxyPattern;

public class FileProxy implements FileManagement{

	private RealFile file;
	private String fileType, fileName;
	private int fileSize;
	
	
	
	public FileProxy(String fileName, String fileType, int fileSize)
	{
		
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileSize = fileSize;
	}	@Override
	
	//interns should only need file name to get their jobs done
	public void getFileName() {
		if(file == null){
			file = new RealFile(fileName, fileType, fileSize);
		}// TODO Auto-generated method stub
		file.getFileName();
	}
}
