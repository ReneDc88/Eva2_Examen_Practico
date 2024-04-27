/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_examen_practico;

/**
 *
 * @author rener
 */
public abstract class EVA3_EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleados empleado1 = new Empleados_Tiempo_Completo("René", 3000);
        Empleados empleado2 = new Empleados_Por_Horas("Ana", 10, 160);
        Empleados empleado3 = new Empleado_Por_Contrato("Angel", 4000);

        // Llamar al método imprimirDatos con cada empleado
        imprimirDatos(empleado1);
        imprimirDatos(empleado2);
        imprimirDatos(empleado3);
    }

    // Método para imprimir datos de cualquier tipo de empleado usando polimorfismo
    public static void imprimirDatos(Empleados empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario Anual: " + empleado.calcularSalarioAnual());
        System.out.println("---------------------");
    }
            
    }
    
