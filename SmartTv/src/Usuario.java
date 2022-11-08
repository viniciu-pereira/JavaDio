public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);

        smartTv.aumentarVolume();
        //System.out.println("Volume Atual " + smartTv.volume);

        smartTv.diminuirVolume();
        //System.out.println("Volume Atual: " + smartTv.volume);



    }
}
