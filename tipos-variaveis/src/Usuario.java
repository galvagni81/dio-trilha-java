public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();
        
        System.out.println("Situação atual da SmartTV:");
        // System.out.println("TV ligada? " + smartTv.ligada);
        // System.out.println("Canal atual: " + smartTv.canal);
        // System.out.println("Volume atual: " + smartTv.volume);
        verificaStatus(smartTv);

        smartTv.ligar();
        verificaStatus(smartTv);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();

        verificaStatus(smartTv);
    }

    public static void verificaStatus (SmartTV tv){
        System.out.println("TV ligada? " + (tv.ligada ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume atual: " + tv.volume);
    }
}
