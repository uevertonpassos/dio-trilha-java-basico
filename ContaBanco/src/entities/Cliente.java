package entities;

public class Cliente {

  public String name;
  public int agencia;
  public int numeroConta;
  public double saldo;

  public Cliente(String name, int agencia, int numeroConta, double saldo) {
    this.name = name;
    this.agencia = agencia;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
  }
  public Cliente(){}

  public String getName () {
    return name;
  }
  public void setName (String name) {
    this.name = name;
  }
  public int getAgencia () {
    return agencia;
  }
  public void setAgencia (int agencia) {
    this.agencia = agencia;
  }
  public int getNumeroConta () {
    return numeroConta;
  }
  public void setNumeroConta (int numeroConta) {
    this.agencia = numeroConta;
  }
  public double getSaldo () {
    return agencia;
  }
  public void setSaldo (double saldo) {
    this.saldo = saldo;
  }
 
}