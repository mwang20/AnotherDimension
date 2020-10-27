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
      for ( int j = 0; j < matrix[i].length; j++){
        sum = sum + matrix[i][j];
      }
      newRows[i] = sum;
    }
    return newRows;
  }
  public static int[] largestInRows(int[][] matrix){
    int[] newRows = new int[matrix.length];
    for ( int i = 0; i < matrix.length; i++){
      int largestInt = 0;
      for ( int j = 0; j < matrix[i].length; j++){
        if (matrix[i][j] > largestInt){
          largestInt = matrix[i][j];
        }
      }
      newRows[i] = largestInt;
    }
    return newRows;
  }
  public static int sum(int[][] arr){
    int[] newRows = new int[arr.length];
    for ( int i = 0; i < arr.length; i++){
      int sum = 0;
      for ( int j = 0; j < arr[i].length; j++){
        sum = sum + arr[i][j];
      }
      newRows[i] = sum;
    }
    return sum(newRows);
  }
}
