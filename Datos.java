public class Datos {
    private  float valor;
   
    public Datos(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public float sumaValor(float valor,float valor1){
        
        return valor+valor1;
    }
  
     public float restarValor(float valor,float valor1){
        
        return valor-valor1;
    }

     public float multiplicarValor(float valor,float valor1){
        
        return valor*valor1;
    }
      public float dividirValor(float valor,float valor1){
        
        return valor/valor1;
    }

}