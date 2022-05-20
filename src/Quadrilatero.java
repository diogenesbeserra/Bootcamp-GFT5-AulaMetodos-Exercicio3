public class Quadrilatero {

    public static float Area(float lado){    
        return lado*lado;
    }

    public static float Area(float largura, float altura ){    
        return (largura * altura);
    }
    
    public static float Area(float ladoMaior, float ladoMenor, float altura){    
        return ((ladoMaior+ladoMenor)*altura)/2;
    }    
}