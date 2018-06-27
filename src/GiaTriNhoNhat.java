public class GiaTriNhoNhat {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
        int index = minValue(array);
        System.out.println("Gia tri nho nhat trong day la: " + array[index]);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
