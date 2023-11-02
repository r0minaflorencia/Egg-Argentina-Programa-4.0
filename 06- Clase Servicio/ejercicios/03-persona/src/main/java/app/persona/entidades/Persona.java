package app.persona.entidades;

/**
 *
 * @author Romina
 */
public class Persona {
    
    private String nombre, apellido;
    private char sexo;
    private int edad, peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, String apellido, char sexo, int edad, int peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona {" + apellido + " " + nombre + ", (" + sexo + "), edad: " + edad + " años, peso: " + peso + " kg, altura: " + altura + " mts."+ '}';
    }
    
    
    
}
