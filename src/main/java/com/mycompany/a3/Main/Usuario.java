/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3.Main;

/**
 *
 * @author Usuario
 */
public class Usuario {
    public int ID;
    public int Permissao;
    public String NomeReal;
    public String NomeUsuario;
    public String Email;
    public String Telefone;
    
    public Usuario (int id, int permissao, String nomeReal, String nomeUsuario, String email, String telefone)
    {
        ID = id;
        Permissao = permissao;
        NomeReal = nomeReal;
        NomeUsuario = nomeUsuario;
        Email = email;
        Telefone = telefone;
    }
}
