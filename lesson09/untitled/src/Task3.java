 class Task3 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,100,200,300,400,500,600,700,800,900,1000};
        System.out.println(max(arr, 0, arr.length-1));
    }
    public static <T extends Comparable<T>> T max(T[] arr, int begin, int end){
        T max = arr[begin];
        for (int i = begin; i <= end; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

}
