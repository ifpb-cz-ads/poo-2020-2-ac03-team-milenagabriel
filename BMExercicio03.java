class BMExercicio03 {
  public static void main (String[] args) {
    float kgBananaMaca = 2.90f;
    float kgBananaPacova = 3.50f;

    System.out.println(" O Quilo da Banana Maçã custa R$" +kgBananaMaca);
    System.out.println(" O Quilo da Banana Pacovã custa R$" +kgBananaPacova);

    float custoTotal = kgBananaMaca + kgBananaPacova;

    System.out.println(" Custo até o momento: "+custoTotal);

    final float TAXA = 0.0825f; 

    float taxaCalculada = custoTotal * (TAXA);

    System.out.println(" Taxa calculada: "+taxaCalculada);

    kgBananaMaca += taxaCalculada;
    kgBananaPacova += taxaCalculada;

    float novoCusto = kgBananaMaca + kgBananaPacova;
    
    System.out.println(" Novo custo total após aplicação da taxa: "+novoCusto);
    
    boolean muitoCaro;

    muitoCaro = (novoCusto>10f);

    System.out.println(" O valor total está muito caro? " +muitoCaro);
  }
}