public class DefensoriaPublica {
    private String nome;
    private String numeroOAB;
    private String telefone;
    private String emailcorporativo;

    public String getNome (){
        return this.nome;
    }

    public String getNumeroOAB(){
        return this.numeroOAB;
    }

    public String getTelefone (){
        return this.telefone;
    }

    public String getEmailcorporativo (){
        return this.emailcorporativo;
    }


    public void setNome (String nome){
        this.nome = nome;
    }

    public void setNumeroOAB (String numeroOAB){
        this.numeroOAB = numeroOAB;
    }
    
    public void setTelefone (String telefone){
        this.telefone = telefone;
    }

    public void setEmailcorporativo (String emailcorporativo){
        this.emailcorporativo = emailcorporativo;
    }
}