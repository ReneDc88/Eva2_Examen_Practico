/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva3_examen_practico;

/**
 *
 * @author rener
 */
public  class Empleado_Por_Contrato extends Empleados {
 
    public Empleado_Por_Contrato(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioAnual() {
        // Salario mensual * 12 meses
        return getSalarioBase() * 12;
    }
}   

