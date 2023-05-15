public class PC {
        private static Integer count = 0;
        private Integer ID = 0;
        private String Marca;
        private String Modelo;
        private int RAM;
        private int HD;

        public PC(String Marca, String Modelo, int RAM, int HD) {
            this.Marca = Marca;
            this.Modelo = Modelo;
            this.RAM = RAM;
            this.HD = HD;
            this.count++;
            this.ID = count;
        }
        public PC(String Marca, String Modelo, int RAM, int HD,int ID) {
            this.Marca = Marca;
            this.Modelo = Modelo;
            this.RAM = RAM;
            this.HD = HD;
            if(ID>0&&ID<count){
                this.ID = ID;
            }else{
                this.count++;
                this.ID = count;
            }
        }


        public String getMarca() {
            return Marca;
        }

        public void setMarca(String Marca) {
            this.Marca = Marca;
        }

        public String getModelo() {
            return Modelo;
        }

        public void setModelo(String Modelo) {
            this.Modelo = Modelo;
        }

        public int getRam() {
            return RAM;
        }

        public void setRam(int RAM) {
            this.RAM = RAM;
        }

        public int getHd() {
            return HD;
        }

        public void setHd(int HD) {
            this.HD = HD;
        }

        public Integer getId() {
            return this.ID;
        }

        @Override
        public String toString() {
            return "PC [ID = "+ ID +", Marca = " + Marca + ", Modelo = " + Modelo + ", RAM = " + RAM + ", HD = " + HD + "]";
        }
        public static Integer showLastID() {
            return count;
        }

    }
