package funcionario;

public class FuncionarioHorista extends Funcionario {

    private float valorHora;
    private int numDias;
    private int numHorasDia;

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valor) {
        this.valorHora = valor;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public int getNumHorasDia() {
        return numHorasDia;
    }

    public void setNumHorasDia(int numHorasDia) {
        this.numHorasDia = numHorasDia;
    }

    public float calcularSalario() {
        return this.numDias * this.numHorasDia * this.valorHora;
    }

    @Override
    public float calcularValeRefeicao() {
        return 600.0f;
    }

    public float calcularValeRefeicao(float percentual) {
        return 600.0f * (1 + (percentual/100));
    }
}
