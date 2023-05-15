 public class ClasseC extends ClasseA {
        private String Morada;
        public int tempoContrato;
        protected boolean contratoAssinado;

        public ClasseC(int tempoContrato, String Morada, boolean contratoAssinado, String Nome, int Idade, double Dinheiro) {
            super(Nome, Idade, Dinheiro);
            this.tempoContrato = tempoContrato;
            this.Morada = Morada;
            this.contratoAssinado = contratoAssinado;

        }

        public boolean getContratoAssinado() {
            return contratoAssinado;
        }

        public int getTempoContrato() {
            return tempoContrato;
        }

        public void setTempoContrato(int tempoContrato) {
            this.tempoContrato = tempoContrato;
        }

        public String getMorada() {
            return Morada;
        }

        public void setMorada(String Morada) {
            this.Morada = Morada;
        }

        @Override
        public String toString() {
            return "ClasseC { " +
                    "Morada = " + Morada +
                    ", Tempo de Contrado em Meses = " + tempoContrato +
                    ", Contrato assinado = " + contratoAssinado +
                    ", Nome = " + Nome +
                    ", Idade = " + Idade +
                    " }";
        }
    }