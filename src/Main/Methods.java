package Main;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class Methods {

    private final Random RD = new Random();
    private int ganaPlayer = 0;
    private int ganaComputer=0;
    
    //0 - PIEDRA
    //1 - PAPEL
    //2 - TIJERA
    public int turnoMaquina() {
        return RD.nextInt(2);
    }

    //0 - GANA LA MAQUINA
    //1 - GANA EL USUARIO
    //2 - EMPATE
    public String versus(int valorUsuario, int valorMaquina) {
        //SI MAQUINA SACA 0 Y USUARIO 1 = 1
        //SI MAQUINA SACA 1 Y USUARIO 2 = 1
        //SI MAQUINA SACA 2 Y USUARIO 0 = 1
        if (valorMaquina == valorUsuario) {
            //EMPATE
            return "- Tie -";
        } else {
            //GANA USUARIO
            switch (valorMaquina) {
                case 0: {
                    if (valorUsuario == 1) {
                        return "Win Player";
                    }
                }
                break;
                case 1: {
                    if (valorUsuario == 2) {
                        return "Win Player";
                    }
                }
                break;
                case 2: {
                    if (valorUsuario == 0) {
                        return "Win Player";
                    }
                }
                break;
            }
        }
        //GANA MAQUINA
        return "Win Computer";
    }

    public ImageIcon traductorTurnero(int val) {
        String resImg = "";
        switch(val){
            case 0:{ resImg = "/Image/piedra.png"; }break;
            case 1:{ resImg = "/Image/papel.png"; }break;
            case 2:{ resImg = "/Image/tijera.png"; }break;
        }
        ImageIcon imgCon = new ImageIcon(getClass().getResource(resImg));
        ImageIcon imgJlb = new ImageIcon(imgCon.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        return imgJlb;
    }
    
    public void contadorDeVictorias(String valor) {
        switch (valor) {
            case "Win Player": {
                ganaPlayer++;
            }
            break;
            case "Win Computer": {
                 ganaComputer++;
            }
            break;
        }
    }

    public int getGanaPlayer() {
        return ganaPlayer;
    }

    public int getGanaComputer() {
        return ganaComputer;
    }
    
    

}
