
public class FabricaEmpleado {

    public static Empleado crear (String Linea){
        String[] d = linea.split(";");
            double a = Double.parseDouble(d[2]);
            switch (d) {
                case "FIJO":
                    return new EmpleadoFijo (d[1],a);
                case "Horas":
                    return new EmpleadoPorHoras (d[1],a,Double.parseDouble(d[3]));
                case "Comision"
                    retunr new EmpleadoPorComision (d[1],a,Double.parseDouble(d[3]));
                case "Contratista":
                    return new Contratista (d[1],a);
                    
                default throw new IllegalArgumentException();

    }
}