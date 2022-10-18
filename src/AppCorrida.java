public class AppCorrida {
    public static void main(String[] args) {
        Piloto pilotoCarol = new Piloto(
                "Caroline",
                26,
                Sexo.FEMININO,
                "Bowser Cart");
        CarroCorrida carroCarol = new CarroCorrida(17, pilotoCarol);

//        System.out.println(pilotoCarol);
//        System.out.println(carroCarol);

        carroCarol.frear(64.0f);    // uso incorreto (para teste)
        carroCarol.parar();                         // uso incorreto (para teste)
        carroCarol.desligar();                      // uso incorreto (para teste)

        carroCarol.ligar();
        carroCarol.acelerar(180.5f); // uso incorreto (para teste)

        carroCarol.frear(5.0f);
        carroCarol.acelerar(32.0f);  // uso incorreto (para teste)
        carroCarol.frear(carroCarol.getVelocidadeAtual());
        carroCarol.acelerar(carroCarol.getVelocidadeMaxima());

        carroCarol.desligar();  // uso incorreto (para teste)
        carroCarol.parar();
        carroCarol.desligar();
    }
}
