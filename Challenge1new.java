package ARRAY;

public class Challenge1new {

    String hp[][]     = {{"082142004434"},    {"085736041408"},       {"000000000000"}, {""},{""},{},{},{},{},{}};
    String nama[][]   = {{"Naisya Najmi"}, {"Memoreza Sabana"}, {"Sabrina Amelia R.P"}, {""},{""}, {""}, {""}, {""}, {""}, {""}};
    String alamat[][] = { {"Tulungagung"},               {"2"},                  {"3"}, {""},{""},{},{},{},{},{}};
    String hoby[][]   = { {"Menyanyi"}   ,          {"Galih "},            {"Baihaqi"}, {""},{""},{},{},{},{},{}};
    String ig[][]     = {  {"naisya.ca"} ,               {"q"},                  {"r"}, {""},{""},{},{},{},{},{}};
 
    public void tampil(String n) {
        System.out.println("=====Identitas Siswa Angkatan 28 RPL_2======="+"\n");
    }

    public void namahp(int n) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("nama     :"+nama[2][j]+"\n" + "nomer hp :"+ hp[2][j]+"\n"+"alamat   :"+alamat [2][j]+"\n"+"Hobby    :"+hoby[2][j]+"\n"+"Ig       :"+ig [2][j]);
                    
               
            }    
        }
    }

    public static void main(String[] args) {
        Challenge1new siswa = new Challenge1new();
        siswa.tampil(null);
        siswa.namahp(0);
        System.out.println();    }
}
