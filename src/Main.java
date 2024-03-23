
public class Main {
    public static void main(String[] args) {

        // Ejemplo de uso de las clases

        CuentaBancaria cuentaAhorro = new CuentaAhorro("ClienteA ", 5); // Tasa de interés anual del 5%
        cuentaAhorro.depositar(500);
        cuentaAhorro.retirar(200);
        cuentaAhorro.calcularIntereses();
        System.out.println("Saldo de cuenta de ahorro: $" + cuentaAhorro.getSaldo());

        CuentaBancaria cuentaInversion = new CuentaInversion("ClienteB");
        cuentaInversion.depositar(15000);
        cuentaInversion.retirar(5000);
        System.out.println("Saldo de cuenta de inversión: $" + cuentaInversion.getSaldo());

        Empleado empleado = new Empleado(1, "Juan", "Gerente", 50000, 3);
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Puesto: " + empleado.getPuesto());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Días de vacaciones: " + empleado.getDiasVacaciones());
    }
}
