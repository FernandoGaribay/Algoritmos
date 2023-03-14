package main;

public class TorresHanoi {
    public static void main(String[] args) {
        int numDiscos = 5;
        int origen = 1;
        int destino = 3;
        int temporal = 2;

        moverDiscos(numDiscos, origen, destino, temporal);
    }

    public static void moverDiscos(int n, int origen, int destino, int temporal) {
        if (n == 1) {
            System.out.println("Mover disco 1 desde el poste " + origen + " hasta el poste " + destino);
        } else {
            moverDiscos(n-1, origen, temporal, destino);
            System.out.println("Mover disco " + n + " desde el poste " + origen + " hasta el poste " + destino);
            moverDiscos(n-1, temporal, destino, origen);
        }
    }
}
