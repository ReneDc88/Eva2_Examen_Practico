/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva3_examen_practico;

/**
 *
 * @author rener
 */
public class Empleados_Tiempo_Completo extends Empleados {
public Empleados_Tiempo_Completo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioAnual() {
        // Salario mensual + bono anual del 10%
        return getSalarioBase() * 12 * 1.10;
    }

}
