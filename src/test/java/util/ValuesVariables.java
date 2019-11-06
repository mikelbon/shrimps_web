package util;

import org.apache.commons.math3.util.Precision;

import java.util.Random;

public class ValuesVariables {

    public static int alimentoDiario_Min=0;
    public static int alimentoDiario_Max=2000;

    public static int getAlimentoDiario(){
        if (alimentoDiario_Min >= alimentoDiario_Max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((alimentoDiario_Max - alimentoDiario_Min) + 1) + alimentoDiario_Min;
    }
    public static void main(String[] args){
        System.out.println("Alimento Diario: "+ValuesVariables.getAlimentoDiario());
        System.out.println("Alimento Por Ha: "+ValuesVariables.getAlimentoHa());
        System.out.println("Peso Vivo: "+ValuesVariables.getPesoVivo());
        System.out.println("Supervivencia: "+ValuesVariables.getSupervivencia());
    }

    public static double alimentoHa_Min=0.0;
    public static double alimentoHa_Max=200.00;

    public static double getAlimentoHa(){
        if (alimentoHa_Min >= alimentoHa_Max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        double random = new Random().nextDouble();
        double result = alimentoHa_Min + (random * (alimentoHa_Max - alimentoHa_Min));
        return Precision.round(result,2);

    }

    public static double pesoVivo_Min=0.0;
    public static double pesoVivo_Max=40.00;

    public static double getPesoVivo(){
        if (alimentoHa_Min >= alimentoHa_Max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        double random = new Random().nextDouble();
        double result = pesoVivo_Min + (random * (pesoVivo_Max - pesoVivo_Min));
        return Precision.round(result,2);

    }

    public static double supervivencia_Min=0.0;
    public static double supervivencia_Max=120.00;

    public static double getSupervivencia(){
        if (alimentoHa_Min >= alimentoHa_Max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        double random = new Random().nextDouble();
        double result = supervivencia_Min + (random * (supervivencia_Max - supervivencia_Min));
        return Precision.round(result,2);

    }
}
