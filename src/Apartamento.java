public class Apartamento {
    private Long codigo;
    private String end;

    public Apartamento(Long codigo, String endereço) {
        this.codigo = codigo;
        this.end = endereço;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
