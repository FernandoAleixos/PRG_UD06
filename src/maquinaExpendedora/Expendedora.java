package maquinaExpendedora;

public class Expendedora {

    private double credito;
    private int stock;
    private double precio;
    private double cambio;
    private double recaudacion;

    public Expendedora(double cambio, int stock, double precio) {
        this.credito = 0;
        this.stock = stock;
        this.precio = precio;
        this.cambio = cambio;
        this.recaudacion = 0;
    }

    public double getCredito() {
        return credito;
    }

    public double getCambio() {
        return cambio;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    //TODO acabar método
    public int getStock(int producto) {
        return stock;
    }

    //TODO acabar método
    public double getPrecio(int producto) {
        return precio;
    }

    private void setCredito(double credito) {
        this.credito = credito;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    private void setCambio(double cambio) {
        this.cambio = cambio;
    }

    private void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "Credito: " + credito + " euros" +
                "\nCambio: " + cambio + " euros" +
                "\nStock: " + stock + " unidades" +
                "\nRecaudación: " + recaudacion + " euros";
    }
}
