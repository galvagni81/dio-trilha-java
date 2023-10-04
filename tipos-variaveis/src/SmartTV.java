public class SmartTV {
    boolean ligada = false;
    int canal = 0;
    int volume = 0;

    // Método para ligar a SmartTV
    public void ligar(){
        if (ligada == false){
            ligada = true;
            canal = 1;
            volume = 10;
        }
    }
    
    // Método para desligar a SmartTV
    public void desligar(){
        if (ligada == true){
            ligada = false;
            canal = 0;
            volume = 0;
        }
    }

    public void aumentarVolume(){
        if (ligada == true){
            volume++;
        }else{
            volume = 0;
        }
    }
    
    public void diminuirVolume(){
        if (ligada == true){
            volume--;
        }else{
            volume = 0;
        }
    }

    public void aumentarCanal(){
        if (ligada == true){
            canal++;
        }else {
            canal = 0;
        }
    }

    public void diminuirCanal(){
        if (ligada == true){
            canal--;
        }else {
            canal = 0;
        }
    }
}
