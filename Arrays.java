/**
 * Created by Felix on 12/15/2015.
 */
import java.lang.StringBuilder;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = {10,4,5,6,7};
        int[] nArr = addN(arr, 2);
        int[] rArr = reverse(arr);
        int[] sArr = sort(arr);
        int[] sub = {5,4,7};

        System.out.println(sum(arr));           //control method sum
        System.out.println(toString(arr));      //control method toString
        System.out.println(toString(nArr));     //control method addN
        System.out.println(toString(rArr));     //control method reverse
        System.out.println(hasN(arr, -4));      //control method hasN
        replaceAll(arr, 4, 99);
        System.out.println(toString(arr));      //control method replaceAll
        System.out.println(toString(sArr));     //control method sort
        hasSubsequence(arr, sub);               //control method hasSubsequence
    }


private static int sum(int[] arr){              //adds all of index together
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
    }
            return sum;
}

private static String toString(int[] arr){      //prints out the array index as a string
  StringBuilder str = new StringBuilder();
        str.append("{");
    for (int i = 0; i < arr.length; i++){
        str.append(arr[i]);
        str.append(",");
    }
        str.setLength(str.length() - 1);
        str.append("}");
    return str.toString();
}

private static int[] addN(int[] arr, int n){  // creating new array from the first one and adds n value to all index
    int[] nArr = new int[arr.length];
    for (int i  = 0; i < arr.length; i++){
        nArr[i] = arr[i] + n;
    }
    return nArr;
}

private static int[] reverse(int[] arr){    // making a new array that is reversed from the original
    int[] rArr = new int[arr.length];
    for(int i = arr.length - 1; i>=0; i--){
        rArr[arr.length-1-i] = arr[i];
    }
    return rArr;
}

private static boolean hasN(int[] arr, int n){  // controls if value n is in the array
    for(int i = 0; i < arr.length; i++){
        if (arr[i] == n){
            return true;
        }
    }
            return false;
}
private static void replaceAll(int[] arr, int old, int nw){    // switches all occurrences of old to nw
    for (int i = 0; i < arr.length; i++){
        if (arr[i] == old){
            System.out.println("byter ut " + arr[i] + " mot " + nw );
            arr[i] = nw;
        }
    }

}

private static int[] sort(int[] arr){           // copying existing array then bubble sorting it.
    int[] sArr = new int[arr.length];
    for (int i = 0; i<arr.length; i++){
        sArr[i] = arr[i];
    }
    int temp;
    boolean check = true;
    while(check) {
        for (int j = 0; j < arr.length - 1; j++) {
            check = false;
            if (sArr[j] > sArr[j + 1]){
                temp = sArr[j];
                sArr[j] = sArr[j+1];
                sArr[j+1] = temp;
                check = true;
            }
        }
    }
    return sArr;
}

public static boolean hasSubsequence(int[] arr, int[] sub){ // checks if subArray is a Sub sequence of the original array
    int subLength = sub.length;
    int counter = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == sub[counter]){
            counter++;
            }
        }
    if (counter == subLength){
        System.out.println("true");
        return true;

    }
    else{
        System.out.println("falskt");
        return false;
    }
}



}


