import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] A = {{ 1, 0, 12, -1 }, {7, -2, 2, 1}, {-5, -2, 2, -9}};
    int[] B = {1, 3, 5};
    int[][] C = {{ 1, 0, 12}, {6, 4, -1}, {7, 5, 4}, {-2, 2, 1}, {-5, 2, -9}};

    System.out.println(ArrayOps.sum(B));
    System.out.println();
    System.out.println(ArrayOps.largest(B));
    System.out.println();
    System.out.println(Arrays.toString(ArrayOps.sumRows(C)));
    System.out.println();
    System.out.println(Arrays.toString(ArrayOps.largestInRows(C)));
  }
}
