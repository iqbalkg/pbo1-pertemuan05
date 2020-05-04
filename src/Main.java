public class Main {
    public static void main(String[] args) {
        Kampus mahasiswa1 = new Kampus();
        Kampus mahasiswa2 = new Kampus();

        mahasiswa1.KampusData();
        mahasiswa1.DataPribadi();
        mahasiswa1.userName = "iqbal";
        mahasiswa1.nilai = 100;

        System.out.println(mahasiswa1.nilai);
        mahasiswa1.Punch(mahasiswa2);
        System.out.println(mahasiswa1.nilai);
    }
}