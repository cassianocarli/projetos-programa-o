package Aula20.ExemploAcessoTres;
//Crie a classe conta e seus métodos e a classe banco. Nessa classe crie opç~es para o usuário realizar operações bancárias possíveis usando a classe Conta.
//String titular, String identificador, String senha, Float saldo, depositar(float valor), boolean sacar(float valor), string verificarSaldo().
import java.util.Random;

public class Conta {

    private String titular;
    String id;
    private String senha;
    private float saldo;
    String identificador;
    //criando um atributo estatico
    static String nomeBanco;

    Conta(String titular, String senha, float deposito){
        this.titular = titular;
        this.senha = senha;
        saldo = deposito;
        geraIdentificador();
    }

    public String getTitular(){
        return titular;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void depositar(float valor){
        saldo+=valor;
    }
    void geraIdentificador(){
        Random aleatorio = new Random();
        String identificador = "";
        for(int i=0; i<4; i++){
            identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000,2000);
        this.identificador = identificador;
    }
    public boolean sacar(float valor){
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    String saldo(){
        return String.format("Seu saldo é de R$ %.2f",saldo);
    }

    boolean validarAcesso(String id, String senha){
        return this.id.equals(id) && this.senha.equals(senha);
    }
}
