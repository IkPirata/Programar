public class AnArray {
    public static void main(String[]args){
        int[] anArray;
        anArray = new int[20];

        System.out.println(anArray.length);
        //length->anArray = new int[20]; el 20
        for (int i = 0; i < anArray.length; i++){
            anArray[i] = (i + 1) * 100;
        }


        System.out.println("Element at index 0 = " + anArray[0]);
        System.out.println("Element at index 1 = " + anArray[1]);
        System.out.println("Element at index 2 = " + anArray[2]);

    }
}
