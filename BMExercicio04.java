class BMExercicio04 {
/* Implementação incorreta:
  public static void main (String[] args) {
    long long1 = 100;
    int int1 = 200;
    int int2 = int1 + long1;
    }
*/

// Nova implementação:
  public static void main (String[] args){
    long long1 = 100;
    int int1 = 200;
    long int2 = (long) int1 + long1;
  }
}

/* Error: BMExercicio04.java:5: error: incompatible types: possible lossy conversion from long to int
    int int2 = int1 + long1;
                    ^
1 error 

Como a variável int2 vai armazenar um valor do tipo inteiro, espera-se que a operação feita ocorra entre dois inteiros, mas, na verdade, ocorre entre um inteiro e um long. Como não é possível converter um nível superior (long) para um nível inferior (int), a variável int2 deve ser do tipo long e int1 deve ser convertida por casting para long.
*/