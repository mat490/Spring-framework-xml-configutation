package dgtic.modulo.siete.modelo;

public class LugarNacimiento {
    private String pais;
    private String estado;
    private String municipio;

    public LugarNacimiento(String pais, String estado, String municipio) {
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "LugarNacimiento{" +
                "pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                ", municipio='" + municipio + '\'' +
                '}';
    }
}
