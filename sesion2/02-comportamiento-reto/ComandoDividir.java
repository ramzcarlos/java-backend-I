public class ComandoDividir extends ComandoCalculadora implements Comando {
  public ComandoDividir(float acumulador, float valor) {
    super(acumulador, valor);
  }

  public float ejecutar() {
    if (valor != 0){
        if (acumulador !=0){
            return acumulador/valor;
        }
        else{
            System.out.println("valores iguales a cero");
            return acumulador;
        }
    }
    else{
        System.out.println("Division no valida");
        return acumulador;
        }
    
}

}