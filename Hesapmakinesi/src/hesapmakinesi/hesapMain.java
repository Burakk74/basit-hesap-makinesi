package hesapmakinesi;
import java.util.Scanner;
public class hesapMain {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		hesapmakinesi m1 = new hesapmakinesi();
		
		System.out.print("Birinci sayıyı giriniz :");
		int a = input.nextInt();
		
		System.out.println("İkinci sayıyı giriniz :");
		int b = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Yapmak istediğiniz işlemi girin :");
		String islem = input.nextLine();
		
		
		
		 switch (islem) {
		 case "toplama":
			 System.out.print("Sonuc :" + m1.toplama(a,b));
			 break;
			 
		 case "cıkarma":
			 System.out.println("Sonuc :" + m1.cikarma(a, b));
			 break;
			 
		 case "carpma":
			 System.out.println("Sonuc :" + m1.carpma(a, b));
			 break;
			 
		 case "bolme":
			 System.out.println("Sonuc :" + m1.bolme(a,b));
			 break;
			 
		 default:
			 System.out.println("Hatalı işlem");
			 break;
		 }
		 
	  
	}
}
