package practice;
//interface Printable{
//	public void print(String doc);
//}
//class SPrinterDriver implements Printable{
//	@Override
//	public void print(String doc) {
//		System.out.println("From Samsng printer");
//		System.out.println(doc);
//	}
//}
//class LPrinterDriver implements Printable{
//	@Override
//	public void print(String doc) {
//		System.out.println("From LG printer");
//		System.out.println(doc);
//	}
//}
//class Prn204Drv implements Printable{
//	@Override
//	public void print(String doc) {
//		System.out.println("From MD-204 printer");
//		System.out.println(doc);
//	}
//}
//class Prn731Drv implements Printable{
//	@Override
//	public void print(String doc) {
//		System.out.println("From MD-731 printer");
//		System.out.println(doc);
//	}
//}
public class PrintDriver {
	public static void main(String[] args) {
		String myDoc = "This is a report about....";
		// 삼성 프린터로 출력 
		
//		Printable prn = new SPrinterDriver();
//		prn.print(myDoc);
//		System.out.println();
		
		//LG프린터로 출력 
		
//		Printable prn2 = new LPrinterDriver();
//		prn2.print(myDoc);
		
		Printable prn = new Prn204Drv();
		prn.print(myDoc);
	
		Printable prn2 = new Prn731Drv();
		prn2.print(myDoc);
	}

}
