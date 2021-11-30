/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3.Main;

/**
 *
 * @author Usuario
 */
public class Projeto {
    //Pk do projeto
    public int ID;
    
    public String Nome;
    public String Descricao;
    public int IDProprietario;
    public String UsuarioProprietario;
    
    public Projeto (int index, int idProprietario, String nome, String descricao, String nomeProprietario)
    {
        ID = index;
        Nome = nome;
        Descricao = descricao;
        IDProprietario = idProprietario;
        UsuarioProprietario = nomeProprietario;
    }
}
