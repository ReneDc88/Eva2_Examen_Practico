/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva3_examen_practico;

/**
 *
 * @author rener
 */
public  class Empleados_Por_Horas extends Empleados {
 private int horasTrabajadas;

    public Empleados_Por_Horas(String nombre, double salarioBase, int horasTrabajadas) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;   
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalarioAnual() {
        // Salario por hora * horas trabajadas al mes * 12 meses
        return getSalarioBase() * horasTrabajadas * 12;
    }
}

