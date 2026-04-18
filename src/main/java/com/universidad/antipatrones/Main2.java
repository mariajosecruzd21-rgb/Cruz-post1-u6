package com.universidad.antipatrones;
public class Main2 {
    public static void main(String[] args) {
// Crear los componentes especializados
        CatalogodeLibros catalogo = new CatalogodeLibros();
        RegistroSocio registro = new RegistroSocio();
        ServicioPrestamos prestamos = new ServicioPrestamos(catalogo,
                registro);
        GeradorReportes reportes = new GeradorReportes(catalogo,
                registro, prestamos);
// Misma funcionalidad que antes, pero con responsabilidades separadas
        catalogo.agregar(new Libro("L01", "Clean Code", "Martin"));
        catalogo.agregar(new Libro("L02", "Design Patterns", "Gang of Four"));
        registro.registrar(new Socio("S01", "Ana Torres", "ana@uni.edu"));

        prestamos.prestar("L01", "S01");
        reportes.imprimirReporteCompleto();

        prestamos.devolver("L01");
        reportes.imprimirReporteCompleto();
    }
}
