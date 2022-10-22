import java.util.Arrays;
import java.util.Scanner;

public class ProjetoFinal {

    static Scanner sc = new Scanner(System.in);
    static double TemperaturasFinais = 0;

    public static void main(String[] args) {

        System.out.println("Quantas temperaturas quer transformar?");
        int QuantidadeDeTemperaturas = Integer.valueOf(sc.next());
        double TemperaturasIniciais [] = new double [QuantidadeDeTemperaturas];

        System.out.println("Qual a unidade da temperatura a ser transformada? Por favor, responda apenas com a inicial da escala.");
        String UnidadeInicial = sc.next().toUpperCase();


        System.out.println("Para qual unidade de temperatura quer transformar? Por favor, responda apenas com a inicial da escala.");
        String UnidadeFinal = sc.next().toUpperCase();


        System.out.println("Indique os valores a serem transformados, separados somente por vírgula");
        String valin = sc.next();
        String array [] = valin.split(",");

        for (int i = 0; i < array.length; i++) {
            double número = Double.valueOf(array[i]);
            TemperaturasIniciais[i]=número;}

        for (int i = 0; i < QuantidadeDeTemperaturas; i++) {
            Verificação(UnidadeInicial, UnidadeFinal, TemperaturasIniciais[i]);}

        double MédiasInicias=0;
        for (int i = 0; i < TemperaturasIniciais.length; i++) {
            double soma =0 ;
            soma += TemperaturasIniciais[i];
            MédiasInicias = soma/TemperaturasIniciais.length;}

        System.out.printf("A média das temperaturas iniciais foi de %f %n", MédiasInicias);

        double MédiasFinais = (double) (TemperaturasFinais/QuantidadeDeTemperaturas);
        System.out.printf("A média das temperaturas finais foi de %f %n", (MédiasFinais));


        }


    public static void Verificação (String UnidadeInicial, String UnidadeFinal, double TemperaturasIniciais){
        if (UnidadeInicial.equals("C")){
            if (UnidadeFinal.equals("F")){CelsiusParaFahrenheit(TemperaturasIniciais);}
            else if (UnidadeFinal.equals("K")){CelsiusParaKelvin(TemperaturasIniciais);}}
        else if (UnidadeInicial.equals("F")){
            if (UnidadeFinal.equals("K")){FahrenheitParaKelvin(TemperaturasIniciais);}
            else if (UnidadeFinal.equals("C")){FahrenheitParaCelsius(TemperaturasIniciais);}}
        else if (UnidadeInicial=="K"){
            if (UnidadeFinal.equals("C")){KelvinParaCelsius(TemperaturasIniciais);}
            else if (UnidadeFinal.equals("F")){KelvinParaFahrenheit(TemperaturasIniciais);}}
    }
    public static double CelsiusParaFahrenheit (double celsius){
        double ResultadoDeCelsiusParaFahrenheit = (celsius*1.8)+32;
        System.out.printf("%f ºC equivalem a %f ºF %n", celsius, ResultadoDeCelsiusParaFahrenheit);
        TemperaturasFinais += ResultadoDeCelsiusParaFahrenheit;
        return ResultadoDeCelsiusParaFahrenheit;}

    public static double FahrenheitParaCelsius (double fahrenheit){
        double ResultadoDeFahrenheitParaCelsius = (5*fahrenheit-160)/9;
        System.out.printf("%f ºF equivalem a %f ºC %n", fahrenheit, ResultadoDeFahrenheitParaCelsius);
        TemperaturasFinais += ResultadoDeFahrenheitParaCelsius;
        return ResultadoDeFahrenheitParaCelsius;}

    public static double CelsiusParaKelvin (double celsius){
        double ResultadoDeCelsiusParaKelvin = celsius+273;
        System.out.printf("%f ºC equivalem a %f ºK %n", celsius, ResultadoDeCelsiusParaKelvin);
        TemperaturasFinais += ResultadoDeCelsiusParaKelvin;
        return ResultadoDeCelsiusParaKelvin;}

    public static double KelvinParaCelsius (double kelvin){
        double ResultadoDeKelvinParaCelsius = kelvin-273;
        System.out.printf("%f ºK equivalem a %f ºC %n", kelvin, ResultadoDeKelvinParaCelsius);
        TemperaturasFinais += ResultadoDeKelvinParaCelsius;
        return ResultadoDeKelvinParaCelsius;}

    public static double KelvinParaFahrenheit (double kelvin){
        double ResultadoDeKelvinParaFahrenheit = (kelvin-273)*9/5+32;
        System.out.printf("%f ºK equivalem a %f ºF %n", kelvin, ResultadoDeKelvinParaFahrenheit);
        TemperaturasFinais += ResultadoDeKelvinParaFahrenheit;
        return ResultadoDeKelvinParaFahrenheit;}

    public static double FahrenheitParaKelvin (double fahrenheit){
        double ResultadoDeFahrenheitParaKelvin = (fahrenheit-32)*5/9+273;
        System.out.printf("%f ºF equivalem a %f ºK %n", fahrenheit, ResultadoDeFahrenheitParaKelvin);
        TemperaturasFinais += ResultadoDeFahrenheitParaKelvin;
        return ResultadoDeFahrenheitParaKelvin;}
}