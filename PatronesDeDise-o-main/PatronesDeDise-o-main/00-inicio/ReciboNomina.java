public class ReciboNomina {
    private Empleado empleado;
    private double horasExtra;
    private double bonificacion;
    private double auxilioTransporte;
    private double descuentoLibranza;

    public ReciboNomina(Empleado empleado, double horasExtra,
            double bonificacion, double auxilioTransporte,
            double descuentoLibranza) {
        this.empleado = empleado;
        this.horasExtra = horasExtra;
        this.bonificacion = bonificacion;
        this.auxilioTransporte = auxilioTransporte;
        this.descuentoLibranza = descuentoLibranza;
    }
      public static class Builder {
        private Empleado empleado;
        private double horasExtra, bonificacion, auxilioTransporte, descuentoLibranza;

        public Builder(Empleado e) {
            this.empleado = e;
        }

        public Builder horasExtra(double horasExtra) {
            this.horasExtra = horasExtra;
            return this;
        }

        public Builder bonificacion(double bonificacion) {
            this.bonificacion = bonificacion;
            return this;
        }

        public Builder auxilioTransporte(double auxilioTransporte) {
            this.auxilioTransporte = auxilioTransporte;
            return this;
        }

        public Builder descuentoLibranza(double descuentoLibranza) {
            this.descuentoLibranza = descuentoLibranza;
            return this;
        }
    }
}

    public double totalPagar() {
        return empleado.calcularSalario() + horasExtra + bonificacion
                + auxilioTransporte - descuentoLibranza;
    }

    public String getNombreEmpleado() {
        return empleado.getNombre();
    }
}
