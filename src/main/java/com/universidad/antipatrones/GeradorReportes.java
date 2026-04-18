package com.universidad.antipatrones;
// Clase especializada 4: solo genera reportes
public class GeradorReportes {
    private final CatalogodeLibros catalogo;
    private final RegistroSocio registro;
    private final ServicioPrestamos prestamos;

    public GeradorReportes(CatalogodeLibros catalogo, RegistroSocio registro, ServicioPrestamos prestamos) {
        this.catalogo = catalogo;
        this.registro = registro;
        this.prestamos = prestamos;
    }

    public void imprimirReporteCompleto() {
        System.out.println("=== Reporte Completo ===");
        System.out.println("Libros registrados :    " + catalogo.totalLibros());
        System.out.println("Libros Disponibles :    " + catalogo.listarDisponibles().size());
        System.out.println("Socios registrados:     " + registro.totalSocios());
        System.out.println("Prestamos activos:      " + prestamos.totalPrestamosActivos());
        System.out.println("==========================");

    }
}
