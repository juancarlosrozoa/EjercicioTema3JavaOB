package com.company;

public class Main {

    public static void main(String[] args) {
    String[] nombres={"Juan", "Carlos", "Pepe", "Antonio"};

    String nombresConcatenados = "";
    for (String nombre : nombres){
        nombresConcatenados +=nombre + " ";

    }
        System.out.println(nombresConcatenados);

    }
}
