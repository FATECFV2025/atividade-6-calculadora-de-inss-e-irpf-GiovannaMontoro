public class FuncionarioCLT extends Contribuinte{
    public FuncionarioCLT(String nome, String cpf, double salarioBruto){
    super(nome,cpf,salarioBruto);
  }
    @Override 
    public double calcularINSS(){
        return salarioBruto * 0.11;
  }
    @Override
    public double calcularIRPF(){
        if(salarioBruto <= 2000){
        return 0.0;
      }
        
      return salarioBruto *0.15;
  }
    @Override
    public double calcularSalarioLiquido(){
        double liquido = salarioBruto - calcularINSS() - calcularIRPF();
        return Math.round(liquido * 100.0)/100.0;
  }
}





