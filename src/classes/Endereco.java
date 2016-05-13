package classes;

public class Endereco {

  private String rua;
  private String numero;
  private String cep;
  private String bairro;
  private String cidade;

  public Endereco(String rua, String numero, String cep, String bairro, String cidade) {
    this.rua = rua;
    this.numero = numero;
    this.cep = cep;
    this.bairro = bairro;
    this.cidade = cidade;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

}
