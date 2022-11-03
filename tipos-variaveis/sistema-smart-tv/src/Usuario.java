public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);

        smartTv.ligar();
        System.out.println(smartTv.ligada);

        smartTv.desligar();
        System.out.println(smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);


    }
}
