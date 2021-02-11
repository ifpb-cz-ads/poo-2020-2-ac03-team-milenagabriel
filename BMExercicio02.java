class BMExercicio02 {
  public static void main (String[] args) {
    int i = 1;
    long j = 2;
    float p = 20.0f;
    double q = 30.0;
    boolean b = true;
    char c = 'k';

    System.out.println("int: "+i+"| long: "+j+"| float: " +p+"| double: "+q+"| boolean: "+b+"| char: "+c+".");
// Não funcionou:    System.out.println("int: %d, long: %l, float: %f, double: %d, boolean: %b, char: %c ", new Object[] {i, j, p, q, b, c});
  }
}