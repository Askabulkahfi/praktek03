package praktek03;
public class indomieAksi {
    public static void main(String[] args) {
        indomie A = new indomie();
        
        A.setMerk("sedaap");
        A.setRasa("ayampanggang");
        A.setHarga(2000);
        A.setJenisgoreng();
        A.cetakinfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(A.getMerk());
        System.out.print("Rasanya \t: ");
        System.out.println(A.getRasa());
        System.out.print("Harganya \t: ");
        System.out.println(A.getHarga());
        
        indomiegoreng dm= new indomiegoreng();
        dm.setMerk("sakura");
        dm.setRasa("ayampedas");
        dm.setHarga(4000);
        dm.setJenisgoreng("goreng");
        dm.cetakinfo();
        System.out.println("Jenis :dm.getJenisgoreng();
        dm.throttle();
    }
    
}
