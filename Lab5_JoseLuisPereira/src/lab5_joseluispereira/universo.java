
package lab5_joseluispereira;


public class universo {
    private String codigo_uni;
    private int edad_uni;
    private int peso;

    public universo() {
    }

    public universo(String codigo_uni, int edad_uni, int peso) {
        this.codigo_uni = codigo_uni;
        this.edad_uni = edad_uni;
        this.peso = peso;
    }

    public String getCodigo_uni() {
        return codigo_uni;
    }

    public void setCodigo_uni(String codigo_uni) {
        this.codigo_uni = codigo_uni;
    }

    public int getEdad_uni() {
        return edad_uni;
    }

    public void setEdad_uni(int edad_uni) {
        this.edad_uni = edad_uni;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "universo{" + "codigo_uni=" + codigo_uni + ", edad_uni=" + edad_uni + ", peso=" + peso + '}';
    }
    
    
    
}
