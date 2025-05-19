package paquete;

public class Persona {
    private String nombre;
    private int edad;
    private String email;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean sosMayor() {
        return this.edad > 18;
    }

    public int repeticionesDeLetra(char letra) {
        int cantidad = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == letra) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + ", getEmail()=" + getEmail() + ", sosMayor()=" + sosMayor() + "]";
    }
}
