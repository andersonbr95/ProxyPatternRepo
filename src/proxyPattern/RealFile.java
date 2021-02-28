package proxyPattern;

public class RealFile implements FileManagement{

	private String fileType, fileName;
	private int fileSize;
	
	
	public RealFile(String fileName, String fileType, int fileSize) {
		
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileSize = fileSize;
		
		
	}
	public void getFileType() {
		System.out.print("Your file type is ..." + fileType);
	}
	
	public void getFileSize() {
		// TODO Auto-generated method stub
		System.out.println("Your file size is " + fileSize);
	}
	@Override
	public void getFileName() {
		System.out.println("Your file name is" + fileName + "\n");// TODO Auto-generated method stub
	}
}
