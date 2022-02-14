public class Ex56_8 {
  public static void main(String[] args) {
    int[][] x = generaArrayBiInt(10, 10, 100, 200);
    int fila, columna;
    for (fila = 0; fila < x.length; fila++) {
      System.out.print("Fila: " + fila);
      for (columna = 0; columna < x[0].length; columna++) {
        System.out.printf("%10d ", x[fila][columna]);
      }
      System.out.println();
    }
  }

  public static int[] corteza(int[][] n) {
    int[] result = new int[n.length * n[0].length];
    return result;
  }

  // GENERA ARRAY BIDIMENSIONAL
  public static int[][] generaArrayBiInt(int xlength, int ylength, int min, int max) {
    int[][] x = new int[xlength][ylength];
    for (int i = 0; i < xlength; i++) {
      for (int j = 0; j < ylength; j++) {
        x[i][j] = (int) (Math.random() * (max - min)) + min;
      }
    }
    return x;
  }

}
