package br.gov.tcu.bbt.outro.zzz;

public class VariaveisDiferentes {

    public static void main(String[] args) {
        int yadda = 99;
        int qualquerNome = 101;
        String fredFlintstone = "";
        int nomeGrandeBemDescritivo = yadda - qualquerNome;
        if (nomeGrandeBemDescritivo == 1) fredFlintstone = "Advantage player1";
        else if (nomeGrandeBemDescritivo == -1) fredFlintstone = "Advantage player2";
        else if (nomeGrandeBemDescritivo >= 2) fredFlintstone = "Win for player1";
        else fredFlintstone = "Win for player2";

        System.out.println(fredFlintstone);
    }

}
