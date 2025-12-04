public class PrestadorServico extends Contribuinte{
    public PrestadorServico(String nome, String cpf, double salarioBruto){
        super(nome,cpf,salarioBruto);
    }
    @Override
    public double calcularINSS(){
        return 0.0;
    }
    @Override
    public double calcularIRPF(){
        return salarioBruto * 0.12;
    }
    @Override
    public double calcularSalarioLiquido(){
        double liquido = salarioBruto - calcularIRPF();
        return Math.round(liquido * 100.0)/100.0;
    }
}