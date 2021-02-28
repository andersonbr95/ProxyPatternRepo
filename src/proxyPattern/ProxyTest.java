package proxyPattern;

public class ProxyTest {
	
	public static void main(String[] args) {
				
		FileManagement file1 = new FileProxy("EmployeeNames",".docx", 10);
		FileManagement file2 = new FileProxy("ClientNames", ".docx", 5);
		FileManagement file3 = new FileProxy("RevenueNumbers", ".xlsx", 50);

		file1.getFileName();
		file2.getFileName();
		file3.getFileName();

	
	}//end psvm
}
