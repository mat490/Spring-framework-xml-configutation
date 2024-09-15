package dgtic.modulo.siete.modelo;

public class Direccion {
    private String pais;
    private String estado;
    private String municipio;
    private String calle;
    private String codigoPostal;
    private Integer numeroCasa;

    public Direccion(String pais, String estado, String municipio, String calle, String codigoPostal, Integer numeroCasa) {
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.numeroCasa = numeroCasa;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                ", municipio='" + municipio + '\'' +
                ", calle='" + calle + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", numeroCasa=" + numeroCasa +
                '}';
    }
}
