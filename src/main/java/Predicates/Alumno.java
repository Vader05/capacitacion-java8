package Predicates;

public class Alumno { //CARGA CUANDO SE REFERENCIA : CREAMOS UNA NUEVA INSTANCIA Y CUANDO SE USAN MIEMBROS ESTATICOS

    { //DESPUES DE BLOQUES ESTATICOS DE ARRIBA A ABAJO, SE EJECUTAN PARA CADA INSTANCIA DE LA CLASE
        //System.out.println("bloque 1");
    }

    public static String CONST = "VALOR";
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String genero;
    private Integer nota;

    {
        //System.out.println("bloque 2");
        this.nombre = "kevin";
    }

    static { // EJECUTA PRIMERO -> 1 SOLA VEZ, CUANDO SE CARGA LA CLASE EN MEMORIA | EN ORDEN DE ARRIBA A ABAJO
        CONST = "VALOR1";
        //System.out.println("bloque ESTATICO 3");
    }

    static { // EJECUTA PRIMERO -> 1 SOLA VEZ, CUANDO SE CARGA LA CLASE EN MEMORIA
        CONST = "VALOR1";
        //System.out.println("bloque ESTATICO 3");
    }
    public Alumno() {}
    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, String apellidos, Integer edad, String genero, Integer nota) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.nota = nota;
    }

    //sobrecarga de metodos
    public void metodo1(){ //firma : nombre del metodo, configuracion de parametros
        System.out.println("metodo 1");
    }
    public void metodo1(String valor){
        System.out.println("metodo 1 con 1 parametro");
    }
    public void validarAlumno(Alumno alumno){
        //
        //
        //
        System.out.println("logica compleja de validacion");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    {
        //System.out.println("bloque 4");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }

    static { // EJECUTA PRIMERO -> 1 SOLA VEZ, CUANDO SE CARGA LA CLASE EN MEMORIA
        CONST = "VALOR1";
        //System.out.println("bloque ESTATICO 3");
    }
}
