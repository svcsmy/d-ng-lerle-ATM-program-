import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int bakiye = 1000;
	
	System.out.println("***************************");
	String islemler =  " 1.Islem: Bakiye Öğrenme\n "
			+ "2.Islem: Para Cekme\n "
			+ "3.Islem: Para Yatırma\n "
			+ "Cikis: q";
	System.out.println(islemler);
	System.out.println("***************************");
	
	while(true) {
		
		System.out.println("Islemi Seciniz");
		String islem = scanner.nextLine();
		
		if(islem.equals("q")) {
			System.out.println("programdan cikis yapilliyor.");
			break;
		}
		
		else if(islem.equals("1")) {
			
			System.out.println("Bakiyeniz: " + bakiye);
		}
		
        else if(islem.equals("2")) {
        	System.out.println("cekmek istediginiz tutar?");
			int tutar = scanner.nextInt();
			scanner.nextLine();
			
			if(bakiye - tutar < 0) {
				System.out.println("Yeterli bakiye yok. Bakiyeniz : " + bakiye);
			}
			
			else {
				bakiye = bakiye - tutar;
				System.out.println("Yeni bakiyeniz: " + bakiye);
				
			}
			
		}
		
        else if(islem.equals("3")) {
			System.out.println("Yatirmak istediginiz tutar: ");
			int tutar2 = scanner.nextInt();
			scanner.nextLine();
			
			bakiye +=tutar2;
			System.out.println("Yeni bakiyeniz: " + bakiye);
		}
		
        else {
        	System.out.println("gecersiz bir islem");
        }
		
		
		
	}
			
		
		
		
		
	

	}

}
