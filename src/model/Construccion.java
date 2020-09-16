//package model;
import java.util.Scanner;

public class Construccion{

		private static final int Roughconstruction 	= 1300000;  //Obra negra
		private static final int Whitework	= 26000000;  //Obra blanca
		private static final int Paint 	= 980000;  //Pintura

	static final String[] tiendas = new String[] {"HomeCenter", "Ferreteria del Barrio", "Ferreteria del centro"};
	
	static final String[] orderproduct = new String[70];  //Producto
	static final int[] orderamount =  new int[70];  //Cantidad solicitada
	static final int[] orderutilization = new int[70];
	static final int[] orderstore = new int[70];  //Ferreteria a comprar
	static final double[][] orderprice = new double[70][3];  //Precio

	
	static final double[] subtotals = new double[3];  //Subtotales
	static final double[] ShippingValue = new double[3]; //Valor envio
	

	public static void addProduct(int index, String nameproduct, int amount, int utility, double price, double price2, double price3) {
		orderproduct[index] 	= nameproduct; //Nombre del producto
		orderamount[index] 		= amount; //Cantidad solicitada
		orderutilization[index] = utility; //Utilizacion

		orderprice[index][0] 		= price; //Utilizacion
		orderprice[index][1] 		= price2; //Utilizacion
		orderprice[index][2] 		= price3; //Utilizacion
	}
 	public static void getInput(){	
		Scanner sc = new Scanner (System.in);

		System.out.println("Hoy resolveremos el problema de mi tio");
		
		int newProduct = 1;  //Nuevo producto
		String nameproduct = "";
		int amount = 0;
		int utility = 0;
		
		double price = 0;
		double price2 = 0;
		double price3 = 0;
		int i = 0;
		while(i < 70) {
			
			if (newProduct == 0) {
				addProduct(i, "", -1, -1, 0, 0, 0);
				break;
			} 
			
			System.out.println("Ingrese Nombre de Producto");
			nameproduct = sc.nextLine(); //Nombre del producto
			System.out.println("Por favor, ingrese el la cantidad del material anterior");
			amount = sc.nextInt();  //Cantidad solicitada
			System.out.println("Por favor, ingrese la utilizacion 0 Si sera usado para obra negra - 1 obra blanca -  2 pintura)");
			utility = sc.nextInt(); //Utilizacion
			
			System.out.println("Por favor, ingrese el valor por unidad del producto de HomeCenter");
			price = sc.nextDouble(); 
			
			System.out.println("Por favor, ingrese el valor por unidad del producto de Ferreteria del Barrio");
			price2 = sc.nextDouble(); 

			System.out.println("Por favor, ingrese el valor por unidad del producto de Ferreteria del centro");
			price3 = sc.nextDouble(); 

			addProduct(i, nameproduct, amount, utility, price, price2, price3);

			System.out.println("Desea agregar un nuevo producto 1 Si  - 0 No");
			newProduct = sc.nextInt(); 
			sc.nextLine();	
			
			i++;
		}		
	}	
	public static int[] getSubtotal() {
		
		for(int i = 0; i < 70; i++) {
			if (orderamount[i] != -1) {
				subtotals[0] = subtotals[0]  + ( orderamount[i] * orderprice[i][0] );
				subtotals[1] = subtotals[1]  + ( orderamount[i] * orderprice[i][1] );
				subtotals[2] = subtotals[2]  + ( orderamount[i] * orderprice[i][2] );
			}
		}
		/*System.out.println("Subtotal si realiza su compra en HomeCenter: " + subtotals[0]);
		System.out.println("Subtotal si realiza su compra en la Ferreteria del Barrio: " + subtotals[1]);
		System.out.println("Subtotal si realiza su compra en la Ferretaria del centro: " + subtotals[2]);*/
		return subtotals;
	}
	
	public static void printTotals() {
		
		
		System.out.println("Total si realiza su compra en HomeCenter con mano de obra y envio incluido es : " + (subtotals[0] > 0 ? (subtotals[0] + ShippingValue[0]+4880000 ) : 0 ) );
		System.out.println("Total si realiza su compra en la Ferreteria del Barrio con mano de obra y envio incluido es : " + (subtotals[1] > 0 ? (subtotals[1] + ShippingValue[1]+4880000 ) : 0 ) );
		System.out.println("Total si realiza su compra en la Ferretaria del centro con mano de obra y envio incluido es : " + (subtotals[2] > 0 ? (subtotals[2] + ShippingValue[2]+4880000 ) : 0 ) );

	}
	public static void recomendationProducts() {
		
		for(int i = 0; i < 70; i++) {
			if (orderamount[i] != -1) {
				if (orderprice[i][0] < orderprice[i][1] && orderprice[i][0] < orderprice[i][2] ) {
					System.out.println("El producto: " + orderproduct[i] + " es mejor en HomeCenter con el precio sin envio: " + orderprice[i][0]);
				}
				if (orderprice[i][1] < orderprice[i][0] && orderprice[i][1] < orderprice[i][2] ) {
					System.out.println("El producto: " + orderproduct[i] + " es mejor en la Ferreteria del Barrio con el precio sin envio: " + orderprice[i][1]);
				}
				if (orderprice[i][2] < orderprice[i][0] && orderprice[i][2] < orderprice[i][1] ) {
					System.out.println("El producto: " + orderproduct[i] + " es mejor en la Ferreteria del centro con el precio sin envio : " + orderprice[i][2]);
				}
			}
		}
	}

	public static void desplegarProductos() {
		Scanner sc = new Scanner (System.in);
		int utility = 0;
		System.out.println("desplegar productos por utilizacion: 0 Si sera usado para obra negra - 1 obra blanca - 2 pintura");
		utility = sc.nextInt(); //Utilizacion
		for(int i = 0; i < 70; i++) {
			if (orderamount[i] != -1) {
				if (orderutilization[i] == utility) {
					System.out.println("La lista por utilizacion es : " + orderproduct[i] );
				}
			} else {
				break;
			}
		}
	}
	
	
	public static void getEnvios() {
		int location = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Seleccionar Ubicacion de su residencia: 0 Norte - 1 Centro - 2 Sur");
		location = sc.nextInt();
		
		for(int i = 0; i < 3; i++) {
			
			if (location == 0) {
				if (subtotals[i] < 80000) {
					ShippingValue[i] = 120000;
				}
				else if (subtotals[i] <300000){
					ShippingValue[i] = 28000;
				}
				else if (subtotals[i]>300000){
					ShippingValue[i] = 0;
				}
			}
			if (location == 1) {
				if (subtotals[i] < 80000) {
					ShippingValue[i] = 50000;
				}
				else if (subtotals[i]<300000){
					ShippingValue[i] = 0;
				}
				else if (subtotals[i]>300000){
					ShippingValue[i] = 0;
				}
			}
			if (location == 2) {
				if (subtotals[i] < 80000) {
					ShippingValue[i] = 120000;
				}
				else if (subtotals[i]<300000){
					ShippingValue[i] = 55000;
				}
				else if (subtotals[i]>300000){
					ShippingValue[i] = 0;
				}
			}
		}
	}	


	public static void main (String[]args){
	
	getInput();
	getSubtotal();
	getEnvios();
	printTotals();
	recomendationProducts();
	desplegarProductos();
	}











}	