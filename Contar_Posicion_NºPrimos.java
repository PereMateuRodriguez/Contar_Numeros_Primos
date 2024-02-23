
public class Main {
    public static  boolean Esprimo(int i){
        boolean bol = true;
        for (int j = 2 ; j <= Math.sqrt(i) ; j++){
            if (i % j == 0 ){
                bol = false;
                break;
            }
        }
        return bol;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int suma = 0;

        for (int i = 2 ; i < arr.length ; i++){
            boolean bol =  true;


            //Identifica si el numero es primo
            bol = Esprimo(i);


            if(bol == true){
                suma = suma + arr[i];
                System.out.println(i);
            }
        }
        System.out.println(suma);

    }
}
