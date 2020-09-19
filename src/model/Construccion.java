package model;

public class Construccion{

		private static final int Roughconstruction 	= 1300000;  //Obra negra
		private static final int Whitework	= 2600000;  //Obra blanca
		private static final int Paint 	= 980000;  //Pintura
/**Price including labor for HomeCenter<br>
	*<b> pre Should be different "" positive numbers and all must be initialized </b><br>
	*<b> post returns what i would pay in HomeCenter </b><br>
	*@param amount Should be an integer positive
	*@param PriceHC Should be an integer positive
	*@param numMaterials should be and integer positive
	*@param location only u can write 0, 1 or 2
	*/
	public static int getTotalHomecenter(int[] amount,int[] PriceHC, int numMaterials,int location) {
		int totalHomeCenter=0;
		for(int i=0; i<numMaterials; i++){
		totalHomeCenter += amount[i]*PriceHC[i];
		}
		if (location==0){
			if (totalHomeCenter < 80000) {
				totalHomeCenter = totalHomeCenter+120000;
			}
			else if (totalHomeCenter <300000){
				totalHomeCenter =totalHomeCenter+28000;
			}
			else if (totalHomeCenter>300000){
				totalHomeCenter = totalHomeCenter+0;
			}	
		}
		else if (location==1){
			if (totalHomeCenter < 80000) {
				totalHomeCenter = totalHomeCenter+50000;
			}
			else if (totalHomeCenter <300000){
				totalHomeCenter =totalHomeCenter+0;
			}
			else if (totalHomeCenter>300000){
				totalHomeCenter = totalHomeCenter+0;
			}	
		}
		else if (location==2){
			if (totalHomeCenter < 80000) {
				totalHomeCenter = totalHomeCenter+120000;
			}
			else if (totalHomeCenter <300000){
				totalHomeCenter =totalHomeCenter+55000;
			}
			else if (totalHomeCenter>300000){
				totalHomeCenter = totalHomeCenter+0;
			}	
		}
		totalHomeCenter=totalHomeCenter+Roughconstruction+Whitework+Paint;
		return totalHomeCenter;
	}
		/**Price including labor for Ferreteria del barrio<br>
	*<b> pre Should be different "" only positive numbers and all must be initialized </b><br>
	*<b> post returns what i would pay in Ferreteria del barrio </b><br>
	*@param amount Should be an integer positive
	*@param PriceFB Should be an integer positive
	*@param numMaterials should be and integer positive
	*@param location only u can write 0, 1 or 2
	*/	
	public static int getTotalFerreteriaBarrio(int[] amount,int[] PriceFB, int numMaterials,int location) {
		int totalFerreteriaBarrio=0;
			for(int i=0; i<numMaterials; i++){
			totalFerreteriaBarrio += amount[i]*PriceFB[i];
			}
			if (location==1){
				if (totalFerreteriaBarrio < 80000) {
					totalFerreteriaBarrio = totalFerreteriaBarrio+120000;
				}
				else if (totalFerreteriaBarrio <300000){
					totalFerreteriaBarrio =totalFerreteriaBarrio+50000;
				}
				else if (totalFerreteriaBarrio>300000){
					totalFerreteriaBarrio = totalFerreteriaBarrio+0;
				}
			}
			else if (location==1){
				if (totalFerreteriaBarrio < 80000) {
					totalFerreteriaBarrio = totalFerreteriaBarrio+50000;
				}
				else if (totalFerreteriaBarrio <300000){
					totalFerreteriaBarrio =totalFerreteriaBarrio+0;
				}
				else if (totalFerreteriaBarrio>300000){
					totalFerreteriaBarrio = totalFerreteriaBarrio+0;
				}	
			}
			if (location==2){
				if (totalFerreteriaBarrio < 80000) {
					totalFerreteriaBarrio = totalFerreteriaBarrio+120000;
				}
				else if (totalFerreteriaBarrio <300000){
					totalFerreteriaBarrio =totalFerreteriaBarrio+55000;
				}
				else if (totalFerreteriaBarrio>300000){
					totalFerreteriaBarrio = totalFerreteriaBarrio+0;
				}	
			}	
			totalFerreteriaBarrio=totalFerreteriaBarrio+Roughconstruction+Whitework+Paint;
			return totalFerreteriaBarrio;
		}
	
/**Price including labor for Ferreteria del centro<br>
	*<b> pre Should be different "" and only numbers positives and all must be initialized </b><br>
	*<b> post returns what i would pay in Ferreteria del centro </b><br>
	*@param amount Should be an integer positive
	*@param PriceFC Should be an integer positive
	*@param numMaterials should be and integer positive
	*@param location only u can write 0, 1 or 2
	*/	
	public static int getTotalFerreteriaCentro(int[] amount,int[] PriceFC, int numMaterials,int location) {
		int totalFerreteriaCentro=0;
			for(int i=0; i<numMaterials; i++){
			totalFerreteriaCentro += amount[i]*PriceFC[i];
			}
			if (location==0){
				if (totalFerreteriaCentro < 80000) {
					totalFerreteriaCentro = totalFerreteriaCentro+120000;
				}
				else if (totalFerreteriaCentro <300000){
					totalFerreteriaCentro =totalFerreteriaCentro+50000;
				}
				else if (totalFerreteriaCentro>300000){
					totalFerreteriaCentro = totalFerreteriaCentro+0;
				}	
			}
			else if (location==1){
				if (totalFerreteriaCentro < 80000) {
					totalFerreteriaCentro = totalFerreteriaCentro+50000;
				}
				else if (totalFerreteriaCentro <300000){
					totalFerreteriaCentro =totalFerreteriaCentro+0;
				}
				else if (totalFerreteriaCentro>300000){
					totalFerreteriaCentro = totalFerreteriaCentro+0;
				}	
			}
		
			else if (location==2){
				if (totalFerreteriaCentro < 80000) {
					totalFerreteriaCentro = totalFerreteriaCentro+120000;
				}
				else if (totalFerreteriaCentro <300000){
					totalFerreteriaCentro =totalFerreteriaCentro+55000;
				}
				else if (totalFerreteriaCentro>300000){
					totalFerreteriaCentro = totalFerreteriaCentro+0;
				}	
			}
			totalFerreteriaCentro=totalFerreteriaCentro+Roughconstruction+Whitework+Paint;
			return totalFerreteriaCentro;
	}
/** Recommendation of where to buy a product <br>
	*<b> pre Should be different "" , only numbers positives and all must be initialized </b><br>
	*<b> post what is the best price in one of the 3 hardware stores </b><br>
	*@param numMaterials should be and integer positive
	*@param PriceHC Should be an integer positive
	*@param PriceFC Should be an integer positive
	*@param PriceFB Should be an integer positive
	*@param amount Should be an integer positive
	*/	
	public static int[] recomendationPrice(int numMaterials,int[] PriceFB, int[] PriceFC,int[] PriceHC,int[] amount) {
		int[] Price = new int[numMaterials];
		for (int i=0; i<numMaterials; i++){
			if (PriceFB[i]*amount[i]<PriceHC[i]*amount[i]){
				if (PriceFB[i]<PriceFC[i]){
					Price[i] = PriceFB[i]*amount[i];
				}
				else {
					Price[i]=PriceFC[i]*amount[i];
				}
			}
			else if (PriceHC[i]<PriceFC[i]){
				Price[i] = PriceHC[i]*amount[i];
			}
			else {
				Price[i] = PriceFC[i]*amount[i];
			}
		}
	return Price;		
	}
	/** Recommendation of where to buy a product <br>
	*<b> pre Should be different "" ,only numbers positives and all must be initialized </b><br>
	*<b> post what is the best price in one of the 3 hardware stores </b><br>
	*@param numMaterials should be and integer positive
	*@param PriceHC Should be an integer positive
	*@param PriceFC Should be an integer positive
	*@param PriceFB Should be an integer positive
	*/	
	public static String[] recomendationPlace(int numMaterials,int[] PriceFB, int[] PriceFC,int[] PriceHC){
	String[] Place = new String[numMaterials];
		for (int i=0; i<numMaterials; i++){
			if (PriceFB[i]<PriceHC[i]){
				if (PriceFB[i]<PriceFC[i]){
					Place[i] = "Ferreteria del Barrio";
				}
				else {
					Place[i]= "Ferreteria del centro";
				}
			}
			else if (PriceHC[i]<PriceFC[i]){
				Place[i] = "HomeCenter";
			}
			else {
				Place[i] = "Ferreteria del centro";
			}
		}
		return Place;
	}	
/** Total with shipping and workforce <br>
	*<b> pre Should be different "" only numbers positives and all must be initialized </b><br>
	*<b> post Total </b><br>
	*@param numMaterials should be and integer positive
	*@param Price Should be an integer positive
	*@param location only u can write 0, 1 or 2
	*@param amount Should be an integer positive
	*/		
	public static int printsTotal (int[] Price, int numMaterials, int[] amount, int location){
		int Total = 0;
		for(int i =0; i<numMaterials; i++){
			Total += Price[i]*amount[i];
		}
		if (location==0){
			if (Total < 80000) {
				Total = Total+120000;
			}
			else if (Total <300000){
				Total =Total+50000;
			}
			else if (Total>300000){
				Total = Total+0;
			}	
		}
		else if (location==1){
			if (Total < 80000) {
				Total = Total+50000;
			}
			else if (Total <300000){
				Total =Total+0;
			}
			else if (Total>300000){
				Total = Total+0;
			}	
		}
		else if (location==2){
			if (Total < 80000) {
				Total = Total+120000;
			}
			else if (Total <300000){
				Total =Total+55000;
			}
			else if (Total>300000){
				Total = Total+0;
			}	
		}
		
	Total=Total+Roughconstruction+Whitework+Paint;
	return Total;	
	}
	/** display by list of use <br>
	*<b> pre Should be different "" and only numbers positives and all must be initialized </b><br>
	*<b> post returns the utilization  </b><br>
	*@param nameproduct different "" and only letters
	*@param utility Should be an integer positive
	*@param numMaterials should be and integer positive
	*/	
	public static String[] Workforce (int numMaterials, String[] nameproduct,int[] utility){
		String[] SaveroughConstruction = new String[numMaterials];
		for( int i =0; i<numMaterials; i++){
			if (utility[i]==0){
				SaveroughConstruction[i]=nameproduct[i];
			}	
		}
		return SaveroughConstruction;
	}
	/** display by list of use <br>
	*<b> pre Should be different "" and only numbers positives and all must be initialized </b><br>
	*<b> post returns the utilization  </b><br>
	*@param nameproduct different "" and only letters
	*@param utility Should be an integer positive
	*@param numMaterials should be and integer positive
	*/	
	public static String[] Workforcetwo (int numMaterials, String[] nameproduct,int[] utility){
		String[] Savewhitework = new String[numMaterials];
		for( int i =0; i<numMaterials; i++){
			if (utility[i]==1){
				Savewhitework[i]=nameproduct[i];
			}	
		}
		return Savewhitework;
	}
	/** display by list of use <br>
	*<b> pre Should be different "" and only numbers positives and all must be initialized </b><br>
	*<b> post returns the utilization  </b><br>
	*@param nameproduct different "" and only letters
	*@param utility Should be an integer positive
	*@param numMaterials should be and integer positive
	*/	
	public static String[] Workforcethree (int numMaterials, String[] nameproduct,int[] utility){
		String[] Savepaint = new String[numMaterials];
		for( int i =0; i<numMaterials; i++){
			if (utility[i]==2){
				Savepaint[i]=nameproduct[i];
			}	
		}
		return Savepaint;
	}
}	
			
			
			
			
			
			
			
	
		
		
		
		
		
		
