public class AntiClock {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,6};
        int n = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, last;
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println();


        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}