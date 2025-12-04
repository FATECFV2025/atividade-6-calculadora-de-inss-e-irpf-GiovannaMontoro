public abstract class Contribuinte implements CalculadoraTributo{
    private String nome;
    private String cpf;
    protected double salarioBruto;

    public Contribuinte(String nome, String cpf, double salarioBruto){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public void exibirResumo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("INSS: " + calcularINSS());
        System.out.println("IRPF: " + calcularIRPF());
        System.out.println("Salário Liquido: " + calcularSalarioLiquido());
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    } 
    public double getSalarioBruto(){
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    }
