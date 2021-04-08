package Test01POO;
import java.util.*;

//import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
//import static jdk.nashorn.internal.objects.NativeString.trim;

public class Cliente {
    private String name;
    private String lastName;
    private int cedulaCL;
    private char zona;
    private char [] producto;
    private int contrato;
    private String codCliente;
    private char tv;
    private char net;

    public Cliente(String name, String lastName, int cedulaCL, char zona, int contrato, char t, char n) {
        this.name = name;
        this.lastName= lastName;
        this.cedulaCL = cedulaCL;
        this.zona = zona;
        this.contrato = contrato;
        codCliente  = codificacion();
        producto = new char[]{'f',t,n} ;//Serv telefono por defecto

    }
    /*public Cliente(){

    }*/
    public String  mostrarProd(){
        String res="";
        for (int i=0;i<3;i++){
            if(Character.toLowerCase(producto[i])=='f'){
                res += producto[i]+" - Telefono. ||";
            }else if(Character.toLowerCase(producto[i])=='t'){
                res += producto[i]+" - TV cable ||";
            }else if(Character.toLowerCase(producto[i])=='n'){
                res += producto[i]+" - Internet ||";
            }
        }
        return res;
    }

    public String getCodCliente(){

        return codCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCedulaCL() {
        return cedulaCL;
    }

    public void setCedulaCL(int cedulaCL) {
        this.cedulaCL = cedulaCL;
    }

    public char getZona() {
        return zona;
    }

    public void setZona(char zona) {
        this.zona = zona;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String codificacion(){
        String t =name.toUpperCase();//trim(toUpperCase(name));
        String f = lastName.toUpperCase();//trim(toUpperCase(lastName));
        return t.charAt(0)+""+f.charAt(0)+"-"+contrato;
    }


    public String mostrarCliente() {
        return "Cliente{" +
                "name=" + name + '\'' +
                "\n, lastName=" + lastName + '\'' +
                "\n, cedulaCL=" + cedulaCL +
                "\n, zona=" + zona +
                "\n, contrato=" + contrato +
                "\n, codCliente=" + codCliente + '\'' +
                "\n, producto="+mostrarProd()+
                " }";
    }
}
