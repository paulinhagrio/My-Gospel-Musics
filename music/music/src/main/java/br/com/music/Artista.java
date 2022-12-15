package br.com.music;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "Artistas")
public class Artista {

    private String Id;

    private String nome;
}
