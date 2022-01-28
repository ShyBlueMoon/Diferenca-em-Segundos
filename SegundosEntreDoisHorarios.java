import java.util.Scanner;

public class SegundosEntreDoisHorarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaManha = scanner.nextInt();
        int minutoManha = scanner.nextInt();
        int segundoManha = scanner.nextInt();

        int horaTarde = scanner.nextInt();
        int minutoTarde = scanner.nextInt();
        int segundoTarde = scanner.nextInt();

        //Manha
        int horaManhaEmSegundos = horaManha * 3600;
        int minutoManhaEmSegundos = minutoManha * 60;
        int somaSegundosManha = horaManhaEmSegundos + minutoManhaEmSegundos + segundoManha;

        //Tarde
        int horaTardeEmSegundos = horaTarde * 3600;
        int minutoTardeEmSegundos = minutoTarde * 60;
        int somaSegundosTarde = horaTardeEmSegundos + minutoTardeEmSegundos + segundoTarde;

        //Resultado
        System.out.println(somaSegundosTarde - somaSegundosManha);

    }
}