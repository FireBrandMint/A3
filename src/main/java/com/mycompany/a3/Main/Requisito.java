/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a3.Main;

/**
 *
 * @author Usuario
 */
public class Requisito {
    
    public int ID;
    public String Nome;
    public String Modulo;
    public String Funcionalidades;
    public String Data_criacao;
    public String Autor;
    public String DataUltModificacao;
    public String AutorUltModificacao;
    public String Versao;
    public String Prioridade;
    public String Complexidade;
    public String EstimativaEsforcoHoras;
    public String Estado;
    public String Fase;
    public String Descricao;

    public Requisito (
            int identificador, String nome, String modulo, String funcionalidades,
            String data_criacao, String autor, String dataUltMod,
            String autorUltMod, String versao, String prioridade,
            String complexidade, String estimativaEsforco,
            String estado, String fase, String descricao
    )
    {
        identificador = ID;
        Nome = nome;
        Modulo = modulo;
        Funcionalidades = funcionalidades;
        Data_criacao = data_criacao;
        Autor = autor;
        DataUltModificacao = dataUltMod;
        AutorUltModificacao = autorUltMod;
        Versao = versao;
        Prioridade = prioridade;
        Complexidade = complexidade;
        EstimativaEsforcoHoras = estimativaEsforco;
        Estado = estado;
        Fase = fase;
        Descricao = descricao;
    }
}
