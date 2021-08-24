public class Roupa {
    String marca,modelo;

    public Roupa(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Roupa() {

    }

    @Override
    public String toString() {
        return "Roupa{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
