package com.example;

public class Cancion {
    
    private String titulo;
    private String artista;
    private int duracion; // en segundos
    private String genero;
    private String album;
    
    private static final int SEGUNDOS_POR_MINUTO = 60;

    //contructor por defecto
    public Cancion() {
        this.titulo = "Desconocido";
        this.artista = "Desconocido";
        this.duracion = 0;
        this.genero = "Desconocido";
        this.album = "Desconocido";
    }
    
    // Constructor con parámetros
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = "Desconocido"; // Inicializado por defecto
        this.album = "Desconocido";  // Inicializado por defecto
    }

    //
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public static int getSegundosPorMinuto() {
        return SEGUNDOS_POR_MINUTO;
    }
    
    private int calcularDuracionMinutos() {
        return duracion / SEGUNDOS_POR_MINUTO;
    }
    
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + calcularDuracionMinutos() + " minutos");
        System.out.println("Género: " + genero);
        System.out.println("Álbum: " + album);
    }
    public void mostrarInformacion(String usuario) {
        mostrarInformacion();
        System.out.println("Escuchado por: " + usuario);
    }
}
