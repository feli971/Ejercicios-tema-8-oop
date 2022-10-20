public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Felipe");
        persona.setEdad(25);
        persona.setTelefono(4428325);
   
        System.out.println("El nombre de la persona es: "  + persona.getNombre());
        System.out.println("La edad de la persona es: "  + persona.getEdad());
        System.out.println("El nro de Telefono de la persona es: "  + persona.getTelefono());

    
       
}
}

 class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad; 
    }

    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int telefono){
        this.telefono =telefono; 
    }

    public int getTelefono(){
        return this.telefono;
    }
}

