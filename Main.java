public class Main {
    public static void main(String[] args) {
        Datos obj1=new Datos(8.5f);
 Datos obj2=new Datos(8.5f);

 float valor1,valor2,resultado;
 valor1=obj1.getValor();
 valor2=obj2.getValor();
 
  resultado=obj1.sumaValor(valor1,valor2);
  System.out.print("la suma es "+resultado);
        
    }
          
    
}