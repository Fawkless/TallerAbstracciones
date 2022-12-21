package Practico1;

public class PruebaAbs {
    public static void main(String[] args)
    {
        Empleado e = new Empleado("Martin Miranda","M. Sosa",333);
        System.out.println("LLamada a chequeCorreo usando la "
                + "referencia de la clase Empleado --");
        e.chequeCorreo();
    }
}

