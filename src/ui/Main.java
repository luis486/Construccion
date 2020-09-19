package ui;
import model.*;
import java.util.Scanner;
	
public class Main {
	/** Ubication <br>
	*<b> pre  </b><br>
	*<b> post  register ubication </b><br>
	*@param sc Only u can write 0, 1 or 2
	*/	
	public static int getEnvios(Scanner sc) {
		System.out.println("Seleccionar Ubicacion de su residencia: \n 0 Norte \n 1 Centro \n 2 Sur");
		int location = sc.nextInt();
		return location;
	}
	/** How many materials you will write <br>
	*<b> pre  all must be initialized </b><br>
	*<b> post Numbers materials </b><br>
	*@param sc Should be different "" , only numbers positives and all must be initialized
	*/	
	public static int askNumMaterials (Scanner sc){
		System.out.println("Ingrese el numero de materiales que le pidio el maestro");
		int numMaterials = sc.nextInt(); 
		sc.nextLine();
		return numMaterials;
	}
	/** Name of the materials you will write <br>
	*<b> pre  all must be initialized </b><br>
	*<b> post Name materials </b><br>
	*@param sc Should be different "" , only letters 
	*@param numMaterials must be initialized only integer positive number
	*/	
	public static String[] askProduct (Scanner sc, int numMaterials){
		String[] nameproduct=new String[numMaterials];
			for (int i =0; i<numMaterials; i++){
				System.out.println("Ingrese el nombre del producto "+(i+1));
				nameproduct[i] = sc.nextLine(); //Nombre del producto
			}
	return nameproduct;
	}
	/** Amount of the material <br>
	*<b> pre  all must be initialized </b><br>
	*<b> post Amount materials </b><br>
	*@param sc Should be different "" , only integer positive 
	*@param numMaterials must be initialized only integer positive number
	*/	
	public static int[] askAmount (Scanner sc,int numMaterials){
		int[] amount=new int[numMaterials];
			for (int i =0; i<numMaterials; i++){
			System.out.println("Por favor, ingrese el la cantidad del producto "+(i+1));
			amount[i] = sc.nextInt();  //Cantidad solicitada
		}
	return amount;
	}
	/** Utilization of the material <br>
	*<b> pre  all must be initialized </b><br>
	*<b> post Utilization materials </b><br>
	*@param sc Should be different "" , only u can write 0, 1 or 2
	*@param numMaterials must be initialized
	*/	
	public static int[] askUtilization (Scanner sc, int numMaterials){
		int[] utility=new int[numMaterials];
			for (int i =0; i<numMaterials; i++){
				System.out.println("Por favor, ingrese la utilizacion 0 Si sera usado para obra negra - 1 obra blanca -  2 pintura) para el producto "+(i+1));
				utility[i] = sc.nextInt(); //Utilizacion
		}
	return utility;
	}
	/** Unity price of the material <br>
	*<b> pre  all must be initialized </b><br>
	*<b> post Unity price materials for home center </b><br>
	*@param sc Should be different "" , you only can write integer and positive numbers
	*@param numMaterials must be initialized
	*/	
	public static int[] HomeC(Scanner sc, int numMaterials){
	int[] PriceHomeCenter = new int[numMaterials];
		for (int i=0; i<numMaterials; i++){
			System.out.println("Por favor, ingrese el valor por unidad del producto "+(i+1)+" de HomeCenter ");
				PriceHomeCenter[i] = sc.nextInt(); 
		}
	return PriceHomeCenter;
	}
		/** Unity price of the material <br>
	*<b> pre  all must be initialized </b><br>
	*<b> post Unity price materials for Ferreteria del barrio </b><br>
	*@param sc Should be different "" , you only can write integer and positive numbers
	*@param numMaterials must be initialized only integer positive number
	*/	
	public static int[] FerreteriaB(Scanner sc, int numMaterials){
	int[] PriceFerreteriaBarrio=new int[numMaterials];
		for (int i=0; i<numMaterials; i++){
			System.out.println("Por favor, ingrese el valor por unidad del producto "+(i+1)+" de Ferreteria del barrio");
				PriceFerreteriaBarrio[i] = sc.nextInt(); 
		}
	return PriceFerreteriaBarrio;
	}
	/** Unity price of the material <br>
	*<b> pre  all must be initialized </b><br>
	*<b> post Unity price materials for Ferreteria del centro </b><br>
	*@param sc Should be different "" , you only can write integer and positive numbers
	*@param numMaterials must be initialized
	*/	
	public static int[] FerreteriaC(Scanner sc, int numMaterials){
	int[] PriceFerreteriaCentro = new int[numMaterials];
		for (int i=0; i<numMaterials; i++){
			System.out.println("Por favor, ingrese el valor por unidad del producto "+(i+1)+" de Ferreteria del centro");
				PriceFerreteriaCentro[i] = sc.nextInt(); 
		}
		return PriceFerreteriaCentro;
	}
	
	public static void Showdata (int[] amount, int numMaterials, int location,int[] PriceFB, int[] PriceHC, int[] PriceFC){
	System.out.println("El valor total si realiza la compra en HomeCenter es de "+Construccion.getTotalHomecenter(amount,PriceHC,numMaterials,location));
	System.out.println("El valor total si realiza la compra en Ferreteria del Barrio es de "+Construccion.getTotalFerreteriaBarrio(amount,PriceFB,numMaterials,location));
	System.out.println("El valor total si realiza la compra en Ferreretira del Centro es de "+Construccion.getTotalFerreteriaCentro(amount,PriceFC,numMaterials,location));
	}	
	public static void BestPlace (int numMaterials, int[] PriceFB, int[] PriceFC, int[] PriceHC, int[] amount, int[] Price, String[] nameproduct,int location){	
	String[] Ferre = Construccion.recomendationPlace(numMaterials,PriceFB,PriceFC,PriceHC);
	int[] Newprice = Construccion.recomendationPrice(numMaterials,PriceFB,PriceFC,PriceHC,amount);
		for (int i=0; i<numMaterials; i++){
			System.out.println("EL producto "+nameproduct[i]+" es mejor comprarlo en "+Ferre[i]+" con un precio de "+Newprice[i]);
		}
	System.out.println("EL Subtotal a pagar por todos los mejores precios es: "+(Construccion.printsTotal(Price,numMaterials,amount,location)-4880000)+" incluido el domicilio");
	System.out.println("EL total a pagar es: "+Construccion.printsTotal(Price,numMaterials,amount,location));
	}
	public static void ListProduct (int numMaterials, String[] nameproduct,int[] utility){
		String[] obranegra= Construccion.Workforce(numMaterials, nameproduct,utility);
		String[] obrablanca= Construccion.Workforcetwo(numMaterials, nameproduct,utility);
		String[] pintura= Construccion.Workforcethree(numMaterials, nameproduct, utility);
		System.out.println("La lista segun los productos son: ");
		for( int i =0; i<numMaterials; i++){
			if (utility[i]==0){
				System.out.println("Obra negra: ");
				System.out.println(obranegra[i]);
			}
			else if (utility[i]==1){
				System.out.println("Obra blanca: ");
				System.out.println(obrablanca[i]);
			}
			else if (utility[i]==2){
				System.out.println("Pintura: ");
				System.out.println(pintura[i]);
			}	
		}
	}
		
	public static void main (String[]args){
	Scanner sc= new Scanner(System.in);
	int location=getEnvios(sc);
	int numMaterials =askNumMaterials(sc);
	String[] nameproduct=askProduct(sc,numMaterials);
	int[] amount=askAmount(sc,numMaterials);
	int[] utility=askUtilization(sc,numMaterials);
	int[] PriceHC=HomeC(sc,numMaterials);
	int[] PriceFB=FerreteriaB(sc,numMaterials);
	int[] PriceFC=FerreteriaC(sc,numMaterials);
	int[] Price=Construccion.recomendationPrice(numMaterials,PriceFB,PriceFC,PriceHC,amount);
	Showdata(amount, numMaterials, location, PriceFB, PriceHC,PriceFC);
	BestPlace(numMaterials,PriceFB,PriceFC,PriceHC,amount,Price,nameproduct,location);
	ListProduct(numMaterials, nameproduct, utility);
	
	
	}
	
}