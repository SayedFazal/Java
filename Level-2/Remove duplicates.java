public class RemoveDuplicates {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 2, 4, 1, 5};
        int n = a.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] == a[j]) {
                    for (int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;   
                    j--;   
                }
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
