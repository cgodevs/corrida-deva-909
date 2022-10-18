public class CarroCorrida {
    private Integer numeroCarro;

    private final float VELOCIDADE_MAXIMA = 180.0f;

    private float velocidadeAtual;
    private boolean ligado;
    private Piloto piloto;
    public CarroCorrida(Integer numeroCarro,Piloto piloto) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.ligado = false;
        this.velocidadeAtual = 0f;
    }

    public float getVelocidadeMaxima() {
        return VELOCIDADE_MAXIMA;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void acelerar(float acrescimoVelocidade){
        if (!ligado){
            System.out.println("O carro não está ligado ainda! Ligue antes de acelerar.");
            return;
        }
        if (velocidadeAtual + acrescimoVelocidade <= VELOCIDADE_MAXIMA){
            velocidadeAtual += acrescimoVelocidade;
            System.out.printf("O carro está acelerando, a velocidade agora é de %.2f km/h\n", velocidadeAtual);
        } else {
            velocidadeAtual = VELOCIDADE_MAXIMA;
            System.out.printf("Não é possível acelerar mais que a velocidade máxima. " +
                    "A velocidade atual do carro é de %.2f km/h\n", VELOCIDADE_MAXIMA);
        }
    }

    public void frear(float decrescimoVelocidade){
        if (!ligado){
            System.out.println("O carro não está ligado ainda! Ligue antes de frear.");
            return;
        }
        if (velocidadeAtual > 0){
            if (decrescimoVelocidade <= velocidadeAtual)
                velocidadeAtual -= decrescimoVelocidade;
            else
                velocidadeAtual = 0;
           System.out.printf("O carro está freando, a velocidade agora é de %.2f km/h\n", velocidadeAtual);
        } else {
            System.out.println("Inicie o movimento do carro antes de usar o freio.");
        }
    }

    public void parar(){
        frear(velocidadeAtual);
        System.out.println("O carro parou.");
    }

    public void ligar(){
        if (!ligado){
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já estava ligado.");
        }
    }

    public void desligar(){
        if (!ligado) {
            System.out.println("O carro já está desligado");
        } else if (velocidadeAtual == 0 && ligado){
            ligado = false;
            System.out.println("O carro agora está desligado");
        } else
            System.out.println("É preciso parar o carro antes de desligá-lo.");
    }

    @Override
    public String toString() {
        return "CarroCorrida{" +
                "numeroCarro=" + numeroCarro +
                ", VELOCIDADE_MAXIMA=" + VELOCIDADE_MAXIMA +
                ", velocidadeAtual=" + velocidadeAtual +
                ", ligado=" + ligado +
                ", piloto=" + piloto +
                '}';
    }
}
