public class Aplicativo{

	public static void main(String args[]){

	Datos obj1=new Datos(7f);
	 Datos obj2=new Datos(8f);
 

	 float valor1,valor2,resultado,resR,resM,resD;
	 valor1=obj1.getValor();
 	valor2=obj2.getValor();
 
   	resultado=obj1.sumaValor(valor1,valor2);
   	System.out.println("la suma es : "+resultado);
   	resR=obj1.restarValor(valor1,valor2);
   	System.out.println("la resta es :"+resR); 
    	resM=obj1.multiplicarValor(valor1,valor2);
   	System.out.println("la multiplicacion es : "+resM); 
    	resD=obj1.dividirValor(valor1,valor2);
   	System.out.println("la division es : "+resD); 
   
       
        
	}
	}