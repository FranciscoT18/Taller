public class Cliente {
    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private int edad;

    public void agregarPedido() {
        System.out.println("Agregar el pedido");
    }

    public void eliminarPedido() {
        System.out.println("Eliminar el pedido");
    }

    public void actualizarDatos() {
        System.out.println("Actualizar los datos");
    }

    public void verHistorial() {
        System.out.println("Ver el historial del pedido");
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente(int idCliente, String nombre, String direccion, String telefono, String correo, int edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }
}
