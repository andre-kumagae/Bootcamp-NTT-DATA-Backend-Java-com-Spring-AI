package m03_abstracao_e_encapsulamento;

public class Carro {
    public static void main(String[] args) {
        Carro carro = new Carro(1, 1, true);
        carro.desacelerar();
        carro.desacelerar();
        carro.desacelerar();
        carro.descerMarcha();

    }

    private boolean ligado, podeAcelerar;
    private int marcha;
    private double velocidade, limiteVelocidade;
    private Double velocidadePermitida;

    public Carro(double velocidade, int marcha, boolean ligado) {
        this.velocidade = velocidade;
        this.marcha = marcha;
        this.ligado = ligado;
        System.out.printf("Carro ligado: %b - Velocidade: %.2f km/h - Marcha: %d\n", ligado, velocidade, marcha);
    }

    public boolean podeTrocarVelocidade(double velocidadeMarcha) {
        if (
                (marcha == 0 && velocidadeMarcha == 0) ||
                        (marcha == 1 && velocidadeMarcha >= 0 && velocidadeMarcha < 21) ||
                        (marcha == 2 && velocidadeMarcha >= 20 && velocidadeMarcha < 41) ||
                        (marcha == 3 && velocidadeMarcha >= 40 && velocidadeMarcha < 61) ||
                        (marcha == 4 && velocidadeMarcha >= 60 && velocidadeMarcha < 81) ||
                        (marcha == 5 && velocidadeMarcha >= 80 && velocidadeMarcha < 101) ||
                        (marcha == 6 && velocidadeMarcha >= 100 && velocidadeMarcha < 121)
        ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean podeSubirMarcha() {
        double velocidadeMarcha = velocidade;
        if (
                (marcha == 0 && velocidadeMarcha == 0) ||
                        (marcha == 1 && velocidadeMarcha >= 20) ||
                        (marcha == 2 && velocidadeMarcha >= 40) ||
                        (marcha == 3 && velocidadeMarcha >= 60) ||
                        (marcha == 4 && velocidadeMarcha >= 80) ||
                        (marcha == 5 && velocidadeMarcha >= 100)
        ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean podeDescerMarcha() {
        double velocidadeMarcha = velocidade;

        if (
                (marcha == 6 && velocidadeMarcha <= 100) ||
                        (marcha == 5 && velocidadeMarcha <= 80) ||
                        (marcha == 4 && velocidadeMarcha <= 60) ||
                        (marcha == 3 && velocidadeMarcha <= 40) ||
                        (marcha == 2 && velocidadeMarcha <= 20) ||
                        (marcha == 1 && velocidadeMarcha <= 1)
        ) {
            return true;
        } else {
            return false;
        }
    }


    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void subirMarcha() {
        if (marcha == 6) {
            System.out.println("Carro já está na última marcha.");
        } else {

            boolean b = podeSubirMarcha();
            if (!b) {
                System.out.println("Favor acelerar para a velocidade da marcha desejada.");
            } else {
                marcha++;
                velocidade++;
                System.out.printf("Marcha subida para %d. velocidade: %.1f%n", marcha, velocidade);
            }
        }
    }

    public void descerMarcha() {
        if (marcha == 0) {
            System.out.println("Carro já está na marcha mínima.");
        } else {
            boolean b = podeDescerMarcha();
            if (!b) {
                System.out.println("Favor desacelerar para a velocidade da marcha desejada.");
            } else {
                marcha--;
                velocidade--;
                System.out.printf("Marcha descida para %d. velocidade: %.1f%n", marcha, velocidade);
            }
        }
    }


    public void acelerar() {
        if (!ligado) {
            System.out.println("Carro desligado não pode acelerar");
        } else if (marcha == 0) {
            System.out.println("Tire a marcha do ponto morto");
        } else if (velocidade == 120) {
            System.out.println("Carro já está na velocidade máxima.");
        } else {
            podeAcelerar = podeTrocarVelocidade(velocidade + 1);
            if (!podeAcelerar) {
                System.out.println("Suba a marcha antes de acelerar");
            } else {
                velocidade += 1;
                System.out.print("Acelerado em 1km. ");
                this.imprime();
            }
        }
    }


    public void desacelerar() {
        if (!ligado) {
            System.out.println("Carro desligado não pode acelerar");
        } else if (marcha == 0) {
            System.out.println("Já está no ponto morto e não pode desacelerar");
        } else {
            podeAcelerar = podeTrocarVelocidade(velocidade - 1);
            if (!podeAcelerar) {
                System.out.println("Desça a marcha antes de acelerar");
            } else {
                velocidade--;
                System.out.print("Desacelerado em 1km. ");
                this.imprime();
            }
        }
    }
    public void imprime() {
        System.out.printf("""
                Carro ligado? %b - Velocidade: %.1f - Marcha: %d
                """, ligado, velocidade, marcha);
    }
}
