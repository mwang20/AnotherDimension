public class ArrayOps{
  public static int sum(int[] arr){
    int sumArray = 0;
    for (int i = 0; i < arr.length; i ++){
      sumArray += arr[i];
    }
    return sumArray;
  }
}
