/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3.Main;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Servidor {
    
    public static Usuario MeuUsuario = null;
    
    public static boolean Login (String usuario, String senha)
    {
        //codigo abaixo deve ser removido pois ele é apenas um codigo teste
        
        MeuUsuario = new Usuario(0, 1, "mam", "mam", "mam", "mam");
        return true;
    }
    
    public static boolean Registrar (String nomeReal, String nomeUsuario, String email, String telefone)
    {
        //codigo abaixo deve ser removido pois ele é apenas um codigo teste
        
        return true;
    }
    
    //Retorna projetos que estão guardados no servidor.
    //retorna 'null' se não pode executar a operação.
    public static Projeto[] GetProjetos()
    {
        
        //codigo abaixo deve ser removido pois ele é apenas um codigo teste
        
        ArrayList<Projeto> pjs = new ArrayList<Projeto>();
        
        Random rand = new Random();
        
        for (int i = 0; i < 50; ++i)
        {
            pjs.add(new Projeto(i, 2, "ataaaaaaaaaaaa " + rand.nextInt(), "iqueeeeeeeeeeeeeeeee \n aaaaaaaaa", "yoshaaaa"));
        }
        
        pjs.get(2).IDProprietario = 0;
        
        return pjs.toArray(new Projeto[0]);
    }
    
    public static Projeto EditarProjeto (int ID, String nome, String descricao)
    {
        //codigo abaixo deve ser removido pois ele é apenas um codigo teste
        
        return new Projeto(ID, -1, nome, descricao, "");
    }
    
    public static void CriarProjeto (String nome, String descricao)
    {
        
    }
    
    public static void RemoverProjeto(int ID)
    {
        
    }
    
    public static int[] PesquisarProjetos (String[] tags)
    {
        //codigo abaixo deve ser removido pois ele é apenas um codigo teste
        
        return null;
    }
    
    public static Requisito[] GetRequisitos (int IDProjeto)
    {
        //codigo abaixo deve ser removido pois ele é apenas um codigo teste
        
        ArrayList<Requisito> rqsts = new ArrayList<Requisito>();
        
        Random rand = new Random();
        
        for (int i = 0; i<10; ++i)
        {
            rqsts.add(new Requisito(rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt(), "" + rand.nextInt()));
        }
        
        return rqsts.toArray(new Requisito[0]);
    }
    
    public static void CriarRequisito(
            String nome, String modulo, String funcionalidades,
            String versao, String prioridade,
            String complexidade, String estimativaEsforco,
            String estado, String fase, String descricao)
    {
        
    }
    
    public static void EditarRequisito(
            int id, String nome, String modulo,
            String funcionalidades,String versao, String prioridade,
            String complexidade, String estimativaEsforco,
            String estado, String fase, String descricao)
    {
        
    }
    
    public static void RemoverRequisito(int ID)
    {
        
    }
    
    public static Usuario[] GetUsuarios ()
    {
        //codigo abaixo deve ser removido pois ele é apenas um codigo teste
        
        var usuarios = new ArrayList<Usuario>();
        
        Random rand = new Random();
        
        for (int i = 0; i<6; ++i)
        {
            usuarios.add(new Usuario(rand.nextInt(), rand.nextInt(), Integer.toString(rand.nextInt()), Integer.toString(rand.nextInt()), Integer.toString(rand.nextInt()), Integer.toString(rand.nextInt())));
        }
        
        return usuarios.toArray(new Usuario[0]);
    }
    
    public static void PromoverUsuario (int ID)
    {
        
    }
    
    public static void RemoverUsuario (int ID)
    {
        
    }
    
}
