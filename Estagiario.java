public class Estagiario extends Contribuinte{
    public Estagiario(String nome, String cpf, double salarioBruto){
        super(nome,cpf,salarioBruto);
    }
    @Override
    public double calcularINSS(){
        return salarioBruto * 0.06;
    }
    @Override
    public double calcularIRPF(){
        return 0.0;
    }
    @Override
    public double calcularSalarioLiquido(){
        double liquido = salarioBruto - calcularINSS();
        return Math.round(liquido * 100.0)/100.0;
    }
}