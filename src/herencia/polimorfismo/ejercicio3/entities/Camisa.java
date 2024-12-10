package herencia.polimorfismo.ejercicio3.entities;

public class Camisa {
 protected String material;
 protected String marca;
 protected String empresaTextil;

 public Camisa(String material, String marca, String empresaTextil){
     this.material = material;
     this.marca = marca;
     this.empresaTextil = empresaTextil;
 }
    public String getMaterial(){
     return material;
    }
    public String getMarca(){
     return marca;
    }
    public String getEmpresaTextil(){
     return empresaTextil;
    }
    public String detallesCamisa(){
     return "Detalles de la camisa"+
             "\nMaterial: "+material+
             "\nMarca: "+marca+
             "\nEmpresa Textil: "+empresaTextil;
    }
}