package br.gov.tcu.bbt.outro.zzz;

public class ClasseDistante {

    public static void main(String[] args) {
        int m_score1 = 99;
        int m_score2 = 101;
        String score = "";
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";

        System.out.println(score);
    }

}
