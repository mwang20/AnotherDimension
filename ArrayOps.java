public class ArrayOps{
  public static int sum(int[] arr){
    int sumArray = 0;
    for (int i = 0; i < arr.length; i ++){
      sumArray += arr[i];
    }
    return sumArray;
  }
  public static int largest(int[] arr){
    int largestArray = 0;
    for (int i = 0; i < arr.length; i ++){
      if (arr[i] > largestArray){
        largestArray = arr[i];
      }
    }
    return largestArray;
  }
  public static int[] sumRows(int[][] matrix){
    int[] newRows = new int[matrix.length];
    for ( int i = 0; i < matrix.length; i++){
      int sum = 0;
      for ( int j = 0; j < matrix[i].length; i++){
        sum = sum + matrix[i][j];
      }
      newRows[i] = sum;
    }
    return newRows;
  }
}
