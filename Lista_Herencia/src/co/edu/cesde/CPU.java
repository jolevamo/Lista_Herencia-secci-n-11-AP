package co.edu.cesde;

public class CPU extends Product{
    private String ram;
    private String hardDisK;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisK() {
        return hardDisK;
    }

    public void setHardDisK(String hardDisK) {
        this.hardDisK = hardDisK;
    }

    public String mostrarCpu(){
        return "Marca = " + this.getBrand() + "\n"+
                "Nombre = " + this.getName() + "\n"+
                "Referencia = " + this.getReference() + "\n"+
                "Ram = " + this.getRam() + "\n"+
                "Disco duro = " + this.getHardDisK() + "\n";
    }
}
