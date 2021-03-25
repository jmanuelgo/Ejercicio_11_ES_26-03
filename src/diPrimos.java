import java.util.Scanner;
public class diPrimos {
    public static void main(String[] args)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int contador=0,i,numero,resto,num=0;
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
        while (numero>0){
            resto=numero%10;
            for(i = 1; i <= resto; i++)
            {
             if((resto % i) == 0)
                {
                contador++;
                }
             if(contador <= 2)
                {
                    num=num*10+resto;

                //}else{
                  //  System.out.println("El numero no es primo");
                }
            }
            numero/=10;
        }
        System.out.println("El nuevo numero es: "+num);


    }
}
