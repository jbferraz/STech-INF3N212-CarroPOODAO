/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author jbferraz
 */
public class ServicosFactory {
    private static PessoaServicos pessoaS = new PessoaServicos();
    
    public static PessoaServicos getPessoaServicos(){
        return pessoaS;
    }
}
