package ejercicio7ficheros;

public class Main {
	import java.io.*;
	import java.util.*;

	class Contacto {
	    private String nombre;
	    private String telefono;

	    public Contacto(String nombre, String telefono) {
	        this.nombre = nombre;
	        this.telefono = telefono;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getTelefono() {
	        return telefono;
	    }
	}

	public class Agenda {
	    private static final int CAPACIDAD_MAXIMA = 20;
	    private static List<Contacto> contactos = new ArrayList<>();

	    public static void main(String[] args) {
	        cargarAgenda();

	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Nuevo contacto");
	            System.out.println("2. Buscar por nombre");
	            System.out.println("3. Mostrar todos");
	            System.out.println("4. Salir");
	            System.out.print("Elija una opción: ");
	            opcion = scanner.nextInt();
	            scanner.nextLine(); // Consumir el salto de línea

	            switch (opcion) {
	                case 1:
	                    nuevoContacto(scanner);
	                    break;
	                case 2:
	                    buscarPorNombre(scanner);
	                    break;
	                case 3:
	                    mostrarTodos();
	                    break;
	                case 4:
	                    guardarAgenda();
	                    break;
	                default:
	                    System.out.println("Opción no válida. Intente nuevamente.");
	                    break;
	            }
	        } while (opcion != 4);
	    }

	    private static void nuevoContacto(Scanner scanner) {
	        if (contactos.size() >= CAPACIDAD_MAXIMA) {
	            System.out.println("La agenda está llena. No se pueden agregar más contactos.");
	            return;
	        }

	        System.out.print("Ingrese el nombre: ");
	        String nombre = scanner.nextLine();

	        if (buscarContacto(nombre) != null) {
	            System.out.println("El nombre ya está en la agenda. No se puede agregar el contacto.");
	            return;
	        }

	        System.out.print("Ingrese el teléfono: ");
	        String telefono = scanner.nextLine();

	        Contacto nuevoContacto = new Contacto(nombre, telefono);
	        contactos.add(nuevoContacto);

	        System.out.println("Contacto agregado exitosamente.");
	    }

	    private static void buscarPorNombre(Scanner scanner) {
	        System.out.print("Ingrese el nombre a buscar: ");
	        String nombre = scanner.nextLine();

	        Contacto contacto = buscarContacto(nombre);

	        if (contacto != null) {
	            System.out.println("Nombre: " + contacto.getNombre());
	            System.out.println("Teléfono: " + contacto.getTelefono());
	        } else {
	            System.out.println("El nombre no se encontró en la agenda.");
	        }
	    }

	    private static void mostrarTodos() {
	        if (contactos.isEmpty()) {
	            System.out.println("No hay contactos en la agenda.");
	            return;
	        }

	        List<Contacto> contactosOrdenados = new ArrayList<>(contactos);
	        Collections.sort(contactosOrdenados, Comparator.comparing(Contacto::getNombre));

	        System.out.println("Listado de contactos:");
	        for (Contacto contacto : contactosOrdenados) {
	            System.out.println("Nombre: " + contacto.getNombre());
	            System.out.println("Teléfono: " + contacto.getTelefono());
	        }
	    }

	    private static Contacto buscarContacto(String nombre) {
	        for (Contacto contacto : contactos) {
	            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
	                return contacto;
	            }
	        }
	        return null;
	    }

	    private static void cargarAgenda() {
	        try (BufferedReader br = new BufferedReader(new FileReader("agenda.txt"))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] datos = linea.split(",");
	                if (datos.length == 2) {
	                    String nombre = datos[0];
	                    String telefono = datos[1];
	                    Contacto contacto = new Contacto(nombre, telefono);
	                    contactos.add(contacto);
	                }
	            }
	            System.out.println("Agenda cargada exitosamente.");
	        } catch (IOException e) {
	            System.out.println("No se pudo cargar la agenda. Se creará una agenda nueva.");
	        }
	    }

	    private static void guardarAgenda() {
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("agenda.txt"))) {
	            for (Contacto contacto : contactos) {
	                bw.write(contacto.getNombre() + "," + contacto.getTelefono());
	                bw.newLine();
	            }
	            System.out.println("Agenda guardada exitosamente.");
	        } catch (IOException e) {
	            System.out.println("No se pudo guardar la agenda.");
	        }
	    }
	}

}
