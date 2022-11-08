public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume += 1;
        //volume ++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        //volume -=;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void aumentarCanal(){
        System.out.println("Aumentando canal: " + canal++);
    }

    public void diminuirCanal(){
        System.out.println("Diminuindo canal: " + canal--);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
