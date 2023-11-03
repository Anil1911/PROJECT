public class MinArrayElement {

    public static void main(String[] args) {
        int array[]={8,6,2,7};
        int min =array[0];

        for (int i=0;i< array.length;i++){
            if(array[i]<min){
               min=array[i];
            }
        }
        System.out.println(min);
    }
}
